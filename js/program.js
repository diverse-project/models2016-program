var modelsApp = angular.module("models-app", []);

modelsApp.controller("ProgramController", function($scope) {


    $scope.showFavorites = false;

    $scope.saveSession = function () {
        if(typeof(Storage) !== "undefined") {
            localStorage.setItem("myCalendar", JSON.stringify($scope.days));
            var myCalendar = JSON.parse(localStorage.getItem("myCalendar"));
            console.log(myCalendar);
        }
    };


    $scope.data = [
        {
            name : "Monday",
            rooms : ["Bouvet 1", "Bouvet 2"],
            sessions : [
                {
                    name : "Farming session",
                    start: "9h",
                    end: "10h30",
                    talkGroups : [
                        [
                            { title: "MDE for cows"}, { title: "MDE for bulls"}
                        ], [
                            { title: "MDE for pigs"}, { title: "MDE or not MDE?"}
                        ]
                    ]
                }
            ]
        }
    ];


    $scope.toggleFavorites = function() {

    };


    $scope.toggleFavoriteTalk = function(talk) {
        // if (typeof talk.selected === "undefined") {
        //     talk.selected = true;
        // } else {
            talk.selected=!talk.selected;
        // }
    }

});