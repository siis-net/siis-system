// Karma configuration
// http://karma-runner.github.io/0.12/config/configuration-file.html
// Generated on 2015-05-05 using
// generator-karma 1.0.0

module.exports = function(config) {
  'use strict';

  config.set({
    // enable / disable watching file and executing tests whenever any file changes
    autoWatch: true,

    // base path, that will be used to resolve files and exclude
    basePath: '../',

    // testing framework to use (jasmine/mocha/qunit/...)
    // as well as any additional frameworks (requirejs/chai/sinon/...)
    frameworks: [
      "jasmine"
    ],

    // list of files / patterns to load in the browser
    files: [
      // bower:js
      'bower_components/jquery/dist/jquery.js',
      'bower_components/angular/angular.js',
      'bower_components/bootstrap/dist/js/bootstrap.js',
      'bower_components/angular-animate/angular-animate.js',
      'bower_components/angular-cookies/angular-cookies.js',
      'bower_components/angular-resource/angular-resource.js',
      'bower_components/angular-route/angular-route.js',
      'bower_components/angular-sanitize/angular-sanitize.js',
      'bower_components/angular-touch/angular-touch.js',
      'bower_components/jquery-ui/jquery-ui.js',
      'bower_components/angular-aria/angular-aria.js',
      'bower_components/angular-material/angular-material.js',
      'bower_components/angular-messages/angular-messages.js',
      'bower_components/angular-ui-router/release/angular-ui-router.js',
      'bower_components/jasmine/lib/jasmine-core/jasmine.js',
      'bower_components/angular-translate/angular-translate.js',
      'bower_components/angular-translate-loader-static-files/angular-translate-loader-static-files.js',
      'bower_components/angular-mocks/angular-mocks.js',
      // endbower
      "app/scripts/**/*.js",
      "test/mock/**/*.js",
      "test/spec/**/*.js",
      'app/scripts/**/*.html',
      'app/locale/**/*.json'
    ],

	// to avoid DISCONNECTED messages when connecting to BrowserStack
	browserDisconnectTimeout : 10000, // default 2000
	browserDisconnectTolerance : 1, // default 0
	browserNoActivityTimeout : 4*60*1000, //default 10000
	captureTimeout : 4*60*1000, //default 60000

    // list of files / patterns to exclude
    exclude: [
    ],

    // web server port
    port: 8080,

    // Start these browsers, currently available:
    // - Chrome
    // - ChromeCanary
    // - Firefox
    // - Opera
    // - Safari (only Mac)
    // - PhantomJS
    // - IE (only Windows)
    browsers: [
      "PhantomJS"
    ],

	// Code coverage report
	reporters: ['progress', 'coverage'],

	preprocessors: {

        //https://github.com/karma-runner/karma-coverage/issues/87
	  'app/scripts/**/!(*.spec)+(.js)': ['coverage'],
	  'app/views/**/*.html':['ng-html2js']
	},

      //https://github.com/karma-runner/karma-coverage
      //https://github.com/karma-runner/karma-coverage/issues/87
	coverageReporter: {
	  type: 'html',
	  dir: 'coverage',
	  watermarks: {
		statements: [ 60, 70 ],
		functions: [ 60, 70 ],
		branches: [ 60, 70 ],
		lines: [ 60, 70 ]
	  }
	},

    // Which plugins to enable
    plugins: [
      "karma-phantomjs-launcher",
      "karma-jasmine",
	  "karma-coverage", // required for coverage
	  'karma-ng-html2js-preprocessor'
    ],

    // Continuous Integration mode
    // if true, it capture browsers, run tests and exit
    singleRun: false,

    colors: true,

    // level of logging
    // possible values: LOG_DISABLE || LOG_ERROR || LOG_WARN || LOG_INFO || LOG_DEBUG
    logLevel: config.LOG_INFO,

    // Uncomment the following lines if you are using grunt's server to run the tests
    // proxies: {
    //   '/': 'http://localhost:9000/'
    // },
    // URL root prevent conflicts with the site root
    // urlRoot: '_karma_'
  });
};
