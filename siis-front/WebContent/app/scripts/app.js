'use strict';

angular.module('siisApp.controller', []);

angular.module('siisApp.service', []);

angular.module('siisApp.directives', []);

angular.module('siisApp.utils', []);

/**
 * @ngdoc overview
 * @name siisApp
 * @description
 * # siisApp
 *
 * Main module of the application.
 */
angular.module('siisApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ngMaterial',
    'ui.router',
    'ngMessages',
    'pascalprecht.translate',
    'siisApp.controller',
    'siisApp.service',
    'siisApp.directives'
  ])
  .constant('siisAppConfig', {
        'urlBackend': 'http://localhost:8080'
  })
  .config(function ($urlRouterProvider, $stateProvider, $httpProvider) {
    $httpProvider.defaults.useXDomain = true;
    $stateProvider
      .state('home', {
        url: '/',
        templateUrl: 'scripts/main.html',
      }).state('createempleado', {
        url: '/employee/createemployee',
        templateUrl: 'scripts/views/employee/createempleado.html',
      });
  })
  .run(function($rootScope){
    $rootScope.urlBackend = 'http://localhost:8080/';
  }).config(['$translateProvider', function ($translateProvider) {

   		$translateProvider.useStaticFilesLoader({
		    prefix: '/resources/locale/locale-',
		    suffix: '.json'
		});
		//$translateProvider.preferredLanguage('en_US');
 }]);
