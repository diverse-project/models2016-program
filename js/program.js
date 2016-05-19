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

    function getSessionGroupsPerQuarter(day) {
        var sessionGroupsPerQuarter = [];
        var previousStart = {
            hour: 24,
            minutes: 00
        };

        // Get first start
        day.sessionGroups.forEach(function(sessionGroup) {
            var startOfSessionGroup = parseTime($scope.getStartOfSessionGroup(sessionGroup));
            if (startOfSessionGroup.hour < previousStart.hour
                || (startOfSessionGroup.hour == previousStart.hour && startOfSessionGroup.minutes < previousStart.minutes)) {
                previousStart = startOfSessionGroup;
            }
        });

        // Get session groups per quarter
        day.sessionGroups.forEach(function(sessionGroup) {
            var startOfSessionGroup = parseTime($scope.getStartOfSessionGroup(sessionGroup));
            var quartersSincePreviousStart = (startOfSessionGroup.hour - previousStart.hour) * 4 + (startOfSessionGroup.minutes / 4) - (previousStart.minutes / 4);

            // Offset
            for (var i = 0; i < quartersSincePreviousStart; i++) {
                sessionGroupsPerQuarter.push([]);
            }

            // Add session group
            sessionGroupsPerQuarter.push(sessionGroup);

            previousStart = startOfSessionGroup;
        });

        return sessionGroupsPerQuarter;
    }


    ////// Preprocess data //////

    $scope.data = data;
    $scope.data.forEach(function(day) {
        day.sessionGroups = getSessionGroupsPerQuarter(day);
    });


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
        $scope.favoriteTalks[talk.title] = talk.selected;

        if(typeof(Storage) !== "undefined") {
            localStorage.setItem("favoriteTalks", JSON.stringify($scope.favoriteTalks));

        }
    };



    ///// Export to iCal /////

    $scope.exportToCal = function(favoritesOnly) {
        var calendar = [];
        calendar.push("BEGIN:VCALENDAR");
        calendar.push("VERSION:2.0");

        $scope.data.forEach(function(day) {

            var dayDate = day.date;

           day.sessionGroups.forEach(function(sessionGroup) {
               if (sessionGroup.length > 0) {
                   sessionGroup.forEach(function (session, roomIndex) {
                       if (typeof session.events !== "undefined") {

                           var durationOfTalk = session.length / session.events.length;
                           var startTime = parseTime(session.start);
                           var endTime = parseTime(session.end);

                           console.log(durationOfTalk);

                           session.events.forEach(function (talk, talkIndex) {
                               if (!favoritesOnly || ((typeof talk.selected !== "undefined") && talk.selected === true)) {
                                   // Compute date of event
                                   var startHour = Math.floor(startTime.hour + (durationOfTalk / 4) * talkIndex) - 2;
                                   var endHour =  Math.floor(startHour + (durationOfTalk / 4));
                                   var startMinutes = Math.floor(startTime.minutes + (durationOfTalk % 4) * talkIndex) * 15;
                                   var endMinutes =  Math.floor(startMinutes + (durationOfTalk % 4)) * 15;

                                   // TODO : hour < 10 must have two digits

                                   var startDate = dayDate + "T" + startHour + startMinutes + "00Z";
                                   var endDate = dayDate + "T" + endHour + endMinutes + "00Z";
                                   // Generate event
                                   calendar.push("BEGIN:VEVENT");
                                   calendar.push("DTSTAMP:" + startDate);
                                   calendar.push("ORGANIZER:CN=Models");
                                   calendar.push("DTSTART:" + startDate);
                                   calendar.push("DTEND:" + endDate);
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

        var blob = new Blob([file], {type: 'text/plain'});
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
            document.body.removeChild(elem);
        }
    }

});