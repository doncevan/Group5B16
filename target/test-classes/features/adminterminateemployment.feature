Feature: Admin terminates employment

  Background:
      Given user is navigated to HRMS application

<<<<<<< HEAD
    @admin
    Scenario Outline: admin can terminate employee by username
      And admin navigates to admin user management page
      When admin enters "<username>" and searches employee
      Then admin checks username checkbox and deletes employee record
=======
    @admin @Daniel1
    Scenario Outline: admin can terminate employee by username
      And admin navigates to admin user management page
      When admin enters "<username>" and searches employee
      Then admin checks "<username>" checkbox and deletes employee record
>>>>>>> efa57f33b163e6657f0c9b57100a23b09e17633a

      Examples:
      |username      |
      |aaa12345      |
      |Aaaandrooo1234|
      |aaandrooo123  |

