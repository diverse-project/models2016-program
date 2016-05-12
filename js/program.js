var modelsApp = angular.module("models-app", []);

modelsApp.controller("ProgramController", function($scope) {

    $scope.rooms = [
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
                                {
                                    title: "MDE for cows",
                                    speakers: [
                                        "Pierre",
                                        "Pôl",
                                        "Jacques"
                                    ]
                                },
                                {
                                    title: "MDE for cows",
                                    speakers: [
                                        "Pierre",
                                        "Pôl",
                                        "Jacques"
                                    ]
                                },
                                {
                                    title: "MDE for cows",
                                    speakers: [
                                        "Pierre",
                                        "Pôl",
                                        "Jacques"
                                    ]
                                }
                            ]
                        },
                        {
                            name : "Bouvet 2",
                            talks: [
                                {
                                    title: "MDE for bulls",
                                    speakers: [
                                        "Pierre",
                                        "Pôl",
                                        "Jacques"
                                    ]
                                },
                                {
                                    title: "MDE for bulls",
                                    speakers: [
                                        "Pierre",
                                        "Pôl",
                                        "Jacques"
                                    ]
                                },
                                {
                                    title: "MDE for bulls",
                                    speakers: [
                                        "Pierre",
                                        "Pôl",
                                        "Jacques"
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