'use strict';

var siisApp = angular.module('siisApp.service');

siisApp.factory('employeeService', ['$http', '$q',
  function($http, $q){

    var employeeService = this;

    employeeService.savePersonalData = function(personalDataInfo){
      var deferred = $q.defer();

      var requestSavePersonalData = $http.post('http://localhost:8080/employee', personalDataInfo,
          { headers: {'Content-Type': 'application/json; charset=utf-8'}});

      requestSavePersonalData.success(function(data, status, headers, config) {
          deferred.resolve(data);
      });

      requestSavePersonalData.error(function(data, status, headers, config) {
          deferred.reject();
      });

      return deferred.promise;
    };

    return employeeService;
  }
]);
