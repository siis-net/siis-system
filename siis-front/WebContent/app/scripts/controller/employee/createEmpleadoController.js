/**
 * Created by admin on 9/17/15.
 */

var createEmployeeController = function($scope, employeeService){
  'use strict';

  $scope.cities        = loadAllCities();
  $scope.selectedCity  = null;
  $scope.searchCity    = null;
  $scope.querySearch   = querySearch;

  $scope.typeIdentifications = [
    "CC",
    "CE",
    "TI",
    "PASAPORTE"
  ];

  $scope.documentExpeditionDate = new Date();

  $scope.minDate = new Date(
    $scope.documentExpeditionDate.getFullYear() - 80,
    $scope.documentExpeditionDate.getMonth(),
    $scope.documentExpeditionDate.getDate());

  $scope.maxDate = new Date(
    $scope.documentExpeditionDate.getFullYear() - 18,
    $scope.documentExpeditionDate.getMonth(),
    $scope.documentExpeditionDate.getDate());

  $scope.savePersonalData = function(){

    var personalDataJson;

    personalDataJson = {
      "employeeId": $scope.codeEmployee,
      "numberPlaque": $scope.plateEmployee,
      "firstName": $scope.employeeFirstName,
      "secondName": $scope.employeeSecondName,
      "firstSurname": $scope.employeeFirstSurname,
      "secondSurname": $scope.employeeSecondSurname,
      "identificationNumber": $scope.employeeIdentificationNumber,
      "typeDocument": $scope.employeeTypeDocument
    };

    employeeService.savePersonalData(personalDataJson)
      .then(
        function(data){
          window.alert("SUCCESSSS")
        }, function(err){
          window.alert("ERROR")
        })

  }

  $scope.findStateAndCountry = function(){

    window.alert($scope.selectedCity);

  }


  function querySearch (query) {
    var results = query ? $scope.cities.filter( createFilterFor(query) ) : [];
    return results;
  }


  function loadAllCities() {
    var allCities = 'Medellin, Cucuta, Santa Marta, Bogota';
    return allCities.split(/, +/g).map( function (city) {
      return {
        value: city.toLowerCase(),
        display: city
      };
    });
  }
  /**
   * Create filter function for a query string
   */
  function createFilterFor(query) {
    var lowercaseQuery = angular.lowercase(query);
    return function filterFn(city) {
      return (city.value.indexOf(lowercaseQuery) === 0);
    };
  }
}

angular.module('siisApp.controller')
  .controller('createEmployeeController', ['$scope', 'employeeService', createEmployeeController]);
