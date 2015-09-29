/**
 * Created by admin on 9/27/15.
 */

var siisApp = angular.module('siisApp.service');

siisApp.factory('geoLocationService', ['$http', '$q', function($http, $q){

    var geolocationService = this;

    geolocationService.getCityGeo = function(cityId){
      var deferred = $q.defer();
      var cityRequest = $http.get('http://localhost:8080/geoLocation/'+cityId);
      cityRequest.success(function(data, status, headers, config) {
        deferred.resolve(data);
      });

      cityRequest.error(function(data, status, headers, config) {
        deferred.reject();
      });
      return deferred.promise;
    };

    geolocationService.getAllCities = function(){
      var deferred = $q.defer();
      var cityRequest = $http.get('http://localhost:8080/geoLocation/');
      cityRequest.success(function(data, status, headers, config) {
        deferred.resolve(data);
      });

      cityRequest.error(function(data, status, headers, config) {
        deferred.reject();
      });
      return deferred.promise;
    };

    return geolocationService;
  }
]);
