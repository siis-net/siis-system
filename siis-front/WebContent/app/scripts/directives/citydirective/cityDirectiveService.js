'use strict';

var directives = angular.module('siisApp.directives');

directives.directive('cityDirective', ['geolocationService', 'utilService', function () {
    return {
      restrict: 'A',
      scope: {
        cityList: '=cityList'
      },
      link: function postLink(scope, element, attrs) {
          var cityList = geolocationService.getAllCities();
          cityList.then(function (response){
                if (response !== undefined){
                    scope.cityList = response;
                }else{
                    utilService.showAlert('An error was found lookign for risk details.');
                }
            }, function(err){
                    utilService.showAlert('An error was found lookign for risk details.' + err);
            });
        }
    };
  }]);
