Feature: Admin terminates employment

  Background:
    #Given admin user is navigated to HRMS website
    When admin enters valid username and password
    And admin clicks on login button
    Then admin is successfully logged in the application
    #Given admin is navigated to employee information
    When  admin clicks on PIM and employee list option

  @admin @Daniel1
  Scenario Outline: admin can terminate employee by id
    When admin enters "<id>" and searches employee
    And admin clicks on id and navigates to job details
    When admin clicks terminate btn and gives a reason
    Then validate employee terminated

    Examples:
      | id       |
      | 29930950 |
      | 31302531 |
      | 87807A   |