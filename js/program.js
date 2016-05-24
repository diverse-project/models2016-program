var modelsApp = angular.module("models-app", []);

modelsApp.controller("ProgramController", function($scope) {

    // Utils
    $scope.getStartOfSessionGroup = function(sessionGroup) {
        // var start = "";
        // sessionGroup.forEach(function(session) {
        //     if (typeof session.start !== "undefined") {
        //         start = session.start;
        //     }
        // });
        // return start;
        return sessionGroup[0].start;
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
                    session.events.forEach(function(event) {
                        if (typeof event.papers === "undefined") {
                            event.selected = $scope.favoriteTalks[event.title + session.icalStart];
                        } else {
                            event.papers.forEach(function(talk) {
                                talk.selected = $scope.favoriteTalks[talk.title + talk.icalStart];
                            });
                        }
                    });
                }
            });
        });
    });

    $scope.toggleFavorites = function() {
        localStorage.setItem("showFavorites", $scope.showFavorites);
    };

    $scope.toggleFavoriteTalk = function(talk, date) {
        talk.selected=!talk.selected;
        $scope.favoriteTalks[talk.title + date] = talk.selected;

        if(typeof(Storage) !== "undefined") {
            localStorage.setItem("favoriteTalks", JSON.stringify($scope.favoriteTalks));
        }
    };



    ///// Export to iCal /////
    function hash(string) {
        var hash = 0;
        if (string.length == 0) return hash;
        for (i = 0; i < string.length; i++) {
            var charI = string.charCodeAt(i);
            hash = ((hash<<5)-hash)+charI;
            hash = hash & hash;
        }
        return hash;
    }


    function createEvent(calendar, start, end, title, description, location) {
        calendar.push("BEGIN:VEVENT");
        calendar.push("DTSTART:" + start);
        calendar.push("DTEND:" + end);
        calendar.push("DTSTAMP:" + start);
        calendar.push("ORGANIZER;CN=models2016-gc@inria.fr:mailto:models2016-gc@inria.fr");
        calendar.push("UID:" + start + "-"  + hash(title) + "@models.irisa.fr");
        calendar.push("DESCRIPTION:" + description); // TODO : max line is 75 characters
        calendar.push("LOCATION:" + location);
        calendar.push("SUMMARY:" + title); // TODO : max line is 75 characters
        calendar.push("END:VEVENT");
    }

    $scope.exportToCal = function(favoritesOnly) {

        // Create calendar
        var calendar = [];
        calendar.push("BEGIN:VCALENDAR");
        calendar.push("VERSION:2.0");
        calendar.push("PRODID:-//MODELS2016//Program");

        $scope.data.forEach(function(day) {

           day.sessionGroups.forEach(function(sessionGroup) {
               if (sessionGroup.length > 0) {
                   sessionGroup.forEach(function (session, roomIndex) {
                       var location = day.rooms[roomIndex].name;
                       if (typeof session.events !== "undefined") {

                           session.events.forEach(function (event, eventIndex) {

                               if (typeof event.papers === "undefined") {

                                   if (!favoritesOnly || ((typeof event.selected !== "undefined") && event.selected === true)) {
                                        createEvent(calendar, session.icalStart, session.icalEnd, event.title, event.title, location);
                                   }
                               } else {
                                   event.papers.forEach(function(talk, talkIndex) {
                                       if (!favoritesOnly || ((typeof talk.selected !== "undefined") && talk.selected === true)) {
                                           createEvent(calendar, talk.icalStart, talk.icalEnd, talk.title, talk.title, location);
                                       }
                                   });
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