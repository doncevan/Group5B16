Feature: Admin terminates employment

  Background:
      Given user is navigated to HRMS application

    @admin
    Scenario Outline: admin can terminate employee by username
      And admin navigates to admin user management page
      When admin enters "<username>" and searches employee
<<<<<<< HEAD
      Then admin checks "<username>" checkbox and deletes employee record
=======
      Then admin checks username checkbox and deletes employee record
>>>>>>> origin/fekadu

      Examples:
      |username      |
      |aaa12345      |
      |Aaaandrooo1234|
      |aaandrooo123  |

