@Smoke
Feature: Navigate to Contact Us and populate the fields
 

  Scenario Outline: Navigate to Contact Us and populate the fields 
    Given Scroll down and go to ‘Contact Us’
    When Fill all required fields "<name>" "<mobile>" "<subject>" "<message>" except email
    And Under email field enter string with wrong email format "<email>"
    And Click Send button
    Then Verify that error message ‘The e-mail address entered is invalid.’ appears
    
    
    Examples:  
      | name   | mobile     | subject    | message      |email       |
      | Test   | 078 123456 | TestMusala | MessageMusala|Test@Test   |
      | Test   | 078 123456 | TestMusala | MessageMusala|Test@.com   |
      | Test   | 078 123456 | TestMusala | MessageMusala|Test@gmail. |
      | Test   | 078 123456 | TestMusala | MessageMusala|@gmail.com  |
      | Test   | 078 123456 | TestMusala | MessageMusala|Test@Test123|