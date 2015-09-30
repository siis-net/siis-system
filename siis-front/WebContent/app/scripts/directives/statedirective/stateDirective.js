/**
 * Created by admin on 9/29/15.
 */


var siisApp = angular.module('siisApp.directives');

siisApp.directive('stateDirective', ['geoLocationService', function (geoLocationService) {
  return {
    templateUrl: 'scripts/views/directives/statedirective/stateDirective.html',
    restrict: 'E',
    scope: {
      cityId: '@cityId'
    },
    link: function postLink(scope, element, attrs) {
      var city = geoLocationService.getCityGeo(attrs['cityid']);
      city.then(function (response){
        if (response !== undefined){
          scope.city = response;
        }else{
          //utilService.showAlert('An error was found lookign for City information.');
        }
      }, function(err){
        //utilService.showAlert('An error was found lookign for City information.' + err);
      });
    }
  };
}]);
