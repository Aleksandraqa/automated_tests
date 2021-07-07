@Smoke

Feature: Navigate to Company page and navigate to Musala facebook page
  
  Scenario: Navigate to Company page and navigate to Musala facebook page
    Given Click ‘Company’ tap from the top
    And Verify that the correct URL (http://www.musala.com/company/) loads
    And Verify that there is ‘Leadership’ section
    Then Click the Facebook link from the footer
    Then Verify that the correct URL (https://www.facebook.com/MusalaSoft?fref=ts) loads and verify if the Musala Soft profile picture appears on the new page
 

 
