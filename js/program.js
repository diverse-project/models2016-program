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

});