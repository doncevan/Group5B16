Feature:Admin logs into HRMS application
Background:
Given admin is navigated to the HRMS website

  @adminLogin
  Scenario: Valid admin login
    When admin enters valid username and password
    And admin clicks on login button
    Then admin is successfuly logged in the application


