var modelsApp = angular.module("models-app", []);

modelsApp.controller("ProgramController", function($scope, $window, $http) {

    // Utils
    function parseTime(time) {
        var splittedTime = time.split(":");
        return {
            hour: parseInt(splittedTime[0]),
            minutes: parseInt(splittedTime[1])
        }
    }

    $scope.getStartOfSessionGroup = function(sessionGroup) {
        return sessionGroup[0].start;
    };

    $scope.getEndOfSessionGroup = function(sessionGroup) {
        return sessionGroup[0].end;
    };


    var hiddenTypes = ["Poster", "SRC", "DoctoralSymposium", "Clinic", "EducatorSymposium", "Reception", "Opening"];

    $scope.hideType = function(talkType) {
        return typeof talkType === "undefined" || hiddenTypes.indexOf(talkType) !== -1
    };

    var hiddenModalsAndStars = ["Lunch", "CoffeeBreak", "Reception"];
    $scope.showModalAndStar = function(talkType) {
        return typeof talkType !== "undefined" && hiddenModalsAndStars.indexOf(talkType) === -1
    };

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

    $scope.showColor = function(event) {
        var atLeastOneSelected = false;
        if (typeof event.papers !== 'undefined') {
            event.papers.forEach(function(talk) {
                atLeastOneSelected = atLeastOneSelected || talk.selected;
            });
        } else {
            atLeastOneSelected = event.selected;
        }

        return !$scope.showFavorites || ($scope.showFavorites && atLeastOneSelected);
    };



    ///// Export to iCal /////
    $scope.generateIcal = function() {
        $http.post("/generateIcal", $scope.favoriteTalks).then(function(response) {
            var elem = window.document.createElement('a');
            // elem.href = "/testmodels.ics?id=" + response.data;
            elem.href="/" + response.data + "/models.ics";
            elem.download = "models.ics";
            console.log(elem.href);
            document.body.appendChild(elem);
            elem.click();
            document.body.removeChild(elem);
        })
    };

    ///// Info on talk /////
    $scope.getInfo = function(talk, date) {
        $scope.selectedTalk = talk;
        $scope.selectedTalkDate = date;
    }
});

