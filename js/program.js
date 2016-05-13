var modelsApp = angular.module("models-app", []);

modelsApp.controller("ProgramController", function($scope) {

    $scope.saved = "titi";

    $scope.saveSession = function () {
        if(typeof(Storage) !== "undefined") {
            localStorage.setItem("room", "toto");
            $scope.saved = localStorage.getItem("room");
            console.log($scope.saved);
        }
    }

    $scope.roomsWorkshop = [
        {
            name: "Bouvet 1"
        },
        {
            name: "Bouvet 2"
        },
        {
            name: "Charcot"
        },
        {
            name: "Vauban 1"
        },
        {
            name: "Vauban 2"
        },
        {
            name: "Lamannais 1"
        },
        {
            name: "Lamannais 2"
        },
        {
            name: "Lamannais 3"
        },
        {
            name: "Rotonde Surcouf"
        },
        {
            name: "Rotonde J. Cartier"
        }
    ];

    $scope.roomsConference = [
            {
                name: "Chateaubriand"
            },
            {
                name: "Lamannais 1+2"
            },
            {
                name: "Lamannais 4+5"
            },
            {
                name: "Grand large"
            },
            {
                name: "Rotonde J. Cartier"
            }
        ];

    $scope.days = [
        {
            name: "Sunday",
            sessions: [
                {
                    start: "9h",
                    end: "10h45",
                    rooms: [
                        {
                            name : "Bouvet 1",
                            talks: [

                            ]
                        },
                        {
                            name : "Bouvet 2",
                            talks: [

                            ]
                        },

                    ]
                },
                {
                    start: "11h15",
                    end: "13h",
                    rooms: [
                        {
                            name : "Bouvet 1",
                            talks: [

                            ]
                        },
                        {
                            name : "Bouvet 2",
                            talks: [
                                {
                                    title: "International Models and Evolution Workshop",
                                    speakers: [
                                        "Dalila Tamzalit",
                                        "Alfonso Pierantonio",
                                        "Bernhard Schaetz",
                                        "Tanja Mayerhofer"
                                    ]
                                }
                            ]
                        }
                    ]
                }
            ]
        }

    ]
});