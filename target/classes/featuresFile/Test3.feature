
@Smoke
Feature: Navigate toCareers page and ‘Check our open positions'
  
  Scenario Outline: Navigate toCareers page and ‘Check our open positions'
    Given Navigate to Careers menu (from the top)
    And Click ‘Check our open positions’ button
    And Verify that  ‘Join Us’ page is opened (can verify that URL is correct: http://www.musala.com/careers/join-us/
    Then From the dropdown ‘Select location’ select ‘Anywhere’
    And Choose open position by name (e.g. Experienced Automation QA Engineer)
    And Verify that 4 main sections are shown: General Description, Requirements, Responsibilities, What we offer
    And Verify that ‘Apply’ button is present at the bottom
    Then Click ‘Apply’ button
    And Prepare a few sets of negative data (e.g. leave required field(s) empty, enter "<emailInvalid>" "<name>" "<mobile>" "<uploadPDF>" e-mail with invalid format etc)
    And Upload a "<uploadPDF>" CV document, and click ‘Send’ button
    Then Verify shown error messages (e.g. The field is required, The e-mail address entered is invalid etc.)
    
 Examples:  
     | emailInvalid   | uploadPDF                        | name | mobile     | 
     | test@test      | ../MusalaTestCucumber/Musala.pdf | Test | 078 123456 |
     