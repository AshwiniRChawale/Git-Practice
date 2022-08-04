@test
Feature: Application Login
  I want to use this to verify if Login page is working

 Scenario: Home page default login
    Given User is on Netbanking landing page
    When User login into application with username and password
    Then Home page is populated
    And Cards are displayed

    
  
    