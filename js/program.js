var modelsApp = angular.module("models-app", []);

modelsApp.controller("ProgramController", function($scope) {

    // Utils
    $scope.getStartOfSessionGroup = function(sessionGroup) {
        var start = "";
        sessionGroup.forEach(function(session) {
            if (typeof session.start !== "undefined") {
                start = session.start;
            }
        });
        return start;
    };

    function parseTime(time) {
        var splittedTime = time.split(":");
        return {
            hour: parseInt(splittedTime[0]),
            minutes: parseInt(splittedTime[1])
        }
    }

    ////// Preprocess data //////

    $scope.data = data;

    ////// Favorites /////

    $scope.showFavorites = localStorage.getItem("showFavorites") === "true";

    // Retrieve favorite talks from local storage
    if(typeof(Storage) !== "undefined") {
        $scope.favoriteTalks = JSON.parse(localStorage.getItem("favoriteTalks"));
        if ($scope.favoriteTalks === null) {
            $scope.favoriteTalks = {};
        }
    } else {
        $scope.favoriteTalks = {};
    }

    $scope.data.forEach(function(day) {
        day.sessionGroups.forEach(function(sessionGroup) {
            sessionGroup.forEach(function (session, roomIndex) {
                if (typeof session.events !== "undefined") {
                    session.events.forEach(function(talk) {
                        talk.selected = $scope.favoriteTalks[talk.title];
                    });
                }
            });
        });
    });

    $scope.toggleFavorites = function() {
        localStorage.setItem("showFavorites", $scope.showFavorites);
    };

    $scope.toggleFavoriteTalk = function(talk) {
        talk.selected=!talk.selected;
        $scope.favoriteTalks[talk.title] = talk.selected; // FIXME : duplicated titles

        if(typeof(Storage) !== "undefined") {
            localStorage.setItem("favoriteTalks", JSON.stringify($scope.favoriteTalks));

        }
    };



    ///// Export to iCal /////

    $scope.exportToCal = function(favoritesOnly) {

        // Create calendar
        var calendar = [];
        calendar.push("BEGIN:VCALENDAR");
        calendar.push("VERSION:2.0");

        $scope.data.forEach(function(day) {

           day.sessionGroups.forEach(function(sessionGroup) {
               if (sessionGroup.length > 0) {
                   sessionGroup.forEach(function (session, roomIndex) {
                       if (typeof session.events !== "undefined") {

                           session.events.forEach(function (talk, talkIndex) {
                               if (!favoritesOnly || ((typeof talk.selected !== "undefined") && talk.selected === true)) {
                                   // Generate event
                                   calendar.push("BEGIN:VEVENT");
                                   // calendar.push("UID:" + formatDate(startDate) + "-"  + roomIndex + "-" +  talkIndex + "@models.irisa.fr"); // FIXME : experimental
                                   calendar.push("DTSTAMP:" + session.icalStart);
                                   calendar.push("ORGANIZER;CN=Models");
                                   calendar.push("DTSTART:" + session.icalStart);
                                   calendar.push("DTEND:" + session.icalEnd);
                                   calendar.push("SUMMARY:" + talk.title);
                                   calendar.push("DESCRIPTION:" + talk.title);
                                   calendar.push("LOCATION:" + day.rooms[roomIndex].name);
                                   calendar.push("END:VEVENT");
                               }
                           });
                       }
                   });
               }
           });
        });

        calendar.push("END:VCALENDAR");
        var file = calendar.join("\n");

        // Download file
        var blob = new Blob([file], {type: 'text/calendar'});
        var filename = "models.ics";
        if(window.navigator.msSaveOrOpenBlob) {
            window.navigator.msSaveBlob(blob, filename);
        }
        else{
            var elem = window.document.createElement('a');
            elem.href = window.URL.createObjectURL(blob);
            elem.download = filename;
            document.body.appendChild(elem);
            elem.click();
            console.log(elem);
            document.body.removeChild(elem);
        }
    };

    ///// Info on talk /////
    $scope.getInfo = function(talk) {
        $scope.selectedTalk = talk;
    }
});