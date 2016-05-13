var modelsApp = angular.module("models-app", []);

modelsApp.controller("ProgramController", function($scope) {

    $scope.data = data;

    $scope.showFavorites = localStorage.getItem("showFavorites") === "true";

    $scope.saveSession = function () {
        if(typeof(Storage) !== "undefined") {
            localStorage.setItem("myCalendar", JSON.stringify($scope.days));
            var myCalendar = JSON.parse(localStorage.getItem("myCalendar"));
            console.log(myCalendar);
        }
    };

    $scope.toggleFavorites = function() {
        localStorage.setItem("showFavorites", $scope.showFavorites);
    };

    $scope.toggleFavoriteTalk = function(talk) {
        talk.selected=!talk.selected;
    };
    
    $scope.exportToCal = function(favoritesOnly) {
        var cal = ics();

        // USAGE : cal.addEvent("subject", "description", "location", "2/10/2016 8:30 am", "2/10/2016 10:00 am");

        $scope.data.forEach(function(day) {
           day.sessions.forEach(function(session) {
               session.talkGroups.forEach(function (talkGroup, roomIndex) {
                   talkGroup.forEach(function(talk) {
                       if (!favoritesOnly || ((typeof talk.selected !== "undefined") && talk.selected === true))
                        cal.addEvent(talk.title, "", day.rooms[roomIndex], "2/10/2016 8:30 am", "2/10/2016 10:00 am");
                   });
               });
           });
        });

        cal.download("calendar");
    }

});