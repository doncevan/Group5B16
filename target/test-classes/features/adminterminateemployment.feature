Feature: Admin terminates employment

  Background:
      Given user is navigated to HRMS application

    @admin @Daniel1
    Scenario Outline: admin can terminate employee by username
      And admin navigates to admin user management page
      When admin enters "<username>" and searches employee
      Then admin checks "<username>" checkbox and deletes employee record

      Examples:
      |username      |
      |aaa12345      |
      |Aaaandrooo1234|
      |aaandrooo123  |

