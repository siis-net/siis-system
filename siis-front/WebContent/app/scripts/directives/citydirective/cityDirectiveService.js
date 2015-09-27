'use strict';

var directives = angular.module('siisApp.directives');

directives.directive('cityDirective', function () {
    return {
      restrict: 'A',
      scope: {
        cityList: '=cityList'
      },
      link: function postLink(scope, element, attrs) {
          var riskDetails = RiskService.getRiskById(attrs['riskid']);
          riskDetails.then(function (response){
                if (response !== undefined){
                    scope.risk = response;
                }else{
                    utilService.showAlert('An error was found lookign for risk details.');
                }
            }, function(err){
                    utilService.showAlert('An error was found lookign for risk details.' + err);
            });
        },
        controller: "RiskdetailsCtrl"
    };
  });
