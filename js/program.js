var modelsApp = angular.module("models-app", []);

modelsApp.controller("ProgramController", function($scope) {

    $scope.data = data;

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
        day.sessions.forEach(function(session) {
            session.talkGroups.forEach(function (talkGroup, roomIndex) {
                talkGroup.forEach(function(talk) {
                    talk.selected = $scope.favoriteTalks[talk.title];
                });
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
    
    $scope.exportToCal = function(favoritesOnly) {
        var calendar = [];
        calendar.push("BEGIN:VCALENDAR");
        calendar.push("VERSION:2.0");

        $scope.data.forEach(function(day) {
           day.sessions.forEach(function(session) {
               session.talkGroups.forEach(function (talkGroup, roomIndex) {
                   talkGroup.forEach(function(talk) {
                       if (!favoritesOnly || ((typeof talk.selected !== "undefined") && talk.selected === true)) {
                           calendar.push("BEGIN:VEVENT");
                           calendar.push("DTSTAMP:" + "20161002T080000Z");
                           calendar.push("ORGANIZER:CN=Models");
                           calendar.push("DTSTART:" + "20161002T080000Z");
                           calendar.push("DTEND:" + "20161002T103000Z");
                           calendar.push("SUMMARY:" + talk.title);
                           calendar.push("DESCRIPTION:" + talk.title);
                           calendar.push("LOCATION:" + day.rooms[roomIndex]);
                           calendar.push("END:VEVENT");
                       }
                   });
               });
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