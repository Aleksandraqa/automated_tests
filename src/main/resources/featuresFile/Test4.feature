@Smoke
Feature: Available positions by City
  

   Scenario: Available positions by City
  	Given Go to Careers
    And Click ‘Check our open positions’
    And Filter the available positions by available cities in the dropdown ‘Select location’ (Sofia)
    And Get the open positions by city Sofia
    And Filter the available positions by available cities in the dropdown ‘Select location’ (Skopje)
    Then Get the open positions by city Skopje
    
