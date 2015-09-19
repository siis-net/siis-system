describe('Protractor Demo App', function() {
  
    var firstNumber = element(by.model('first'));
    var secondNumber = element(by.model('second'));
    var goButton = element(by.id('gobutton'));
    var latestResult = element(by.binding('latest'));
    
    beforeEach(function() {
        browser.get('http://juliemr.github.io/protractor-demo/');
    });
    
    it('should have a title', function() {        
        expect(browser.getTitle()).toEqual('Super Calculator');
    });
    
     it('should add one and two', function() {        
        element(by.model('first')).sendKeys(1);
        element(by.model('second')).sendKeys(2);

        element(by.id('gobutton')).click();

        expect(element(by.binding('latest')).getText()).
            toEqual('3'); // This is wrong!
      });
    
    it('should have a title', function() {
        expect(browser.getTitle()).toEqual('Super Calculator');
      });

      it('should add one and two', function() {
        firstNumber.sendKeys(1);
        secondNumber.sendKeys(2);

        goButton.click();

        expect(latestResult.getText()).toEqual('3');
      });

      it('should add four and six', function() {
        // Fill this in.
        expect(latestResult.getText()).toEqual('0');
      });
});