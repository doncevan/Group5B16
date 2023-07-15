Feature: Admin terminates employment

  Background:
      Given user is navigated to HRMS application

    @admin
    Scenario Outline: admin can terminate employee by username
      And admin navigates to admin user management page
      When admin enters "<username>" and searches employee
<<<<<<< HEAD
      Then admin checks username checkbox and deletes employee record
=======
      Then admin checks "<username>" checkbox and deletes employee record
>>>>>>> fde51b1049a6a97e5d3b6d55bcf728fc3aeb18c1

      Examples:
      |username      |
      |aaa12345      |
      |Aaaandrooo1234|
      |aaandrooo123  |

