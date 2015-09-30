'use strict';

var directives = angular.module('siisApp.directives');

directives.directive('cityDirective', ['geoLocationService', function (geoLocationService) {
    return {
      restrict: 'A',
      scope: {
        cityList: '=cityList'
      },
      link: function postLink(scope, element, attrs) {
          var cityList = geoLocationService.getAllCities();
          cityList.then(function (response){
                if (response !== undefined){
                    scope.cityList = response;
                }else{
                    //utilService.showAlert('An error was found lookign for risk details.');
                }
            }, function(err){
                    //utilService.showAlert('An error was found lookign for risk details.' + err);
            });
        }
    };
  }]);
