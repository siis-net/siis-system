/**
 * Created by admin on 9/17/15.
 */

var createEmployeeController = function($scope, employeeService){
  'use strict';

  $scope.savePersonalData = function(){

    this.typeDocuments = ('CC CE').split(' ').map(function (typeDocument) { return { name: typeDocument }; });
    $scope.expeditionDate = new Date();

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
}

angular.module('siisApp.controller')
  .controller('createEmployeeController', ['$scope', 'employeeService', createEmployeeController]);
