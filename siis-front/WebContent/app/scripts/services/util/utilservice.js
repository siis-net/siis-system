'use strict';

var siisApp = angular.module('siisApp.utils');

siisApp.service('utilService', function ($mdDialog) {

    var showAlert = function showAlert(message){
        $mdDialog.show(
          $mdDialog.alert()
            .parent(angular.element(document.body))
            .title('SIIS System Alert')
            .content(message)
            .ariaLabel('Alert Dialog Demo')
            .ok('Ok')
            .targetEvent(message)
        );
        return true;
    };

    return{
        showAlert: showAlert
    };
});
