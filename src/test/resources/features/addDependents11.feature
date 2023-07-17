Feature: Employee can manage the dependents in the HRMS application

  Background:
    Given user is logged into the HRMS system application
    Then user clicks on PIM option and Employee list option
    And user enters valid employee id
    And user clicks on search button
    And user selects the employee file
    And user navigates to the dependents section


@datatable
  Scenario: Employee adds dependents
  Then user click on Add button
  Then the user enters Name and Relationship and DateofBirth in data driven format
      | Name         | Relationship | DateofBirth   |
      | John Doe     | Spouse       | 1990-05-15    |
      | Jane Smith   | Child        | 2010-10-08    |
      | John Doe Jr. | Child        | 2015-02-20    |




@invalid
 Scenario Outline: the HRMS system should show error message in case of invalid inserts
  Then user click on Add button
  Then the HRMS application displays error messages
  When user enters invalid information "<Name>" and "<Relationship>" and "<DateofBirth>" and verifying the "<Error>"
  Examples:
      | Name         | Relationship | DateofBirth   | Error|
      | Helene       |              | 1990-05-15    | *Required field|


  @removal
  Scenario: Employee should be able to remove dependents
    When user removes the second dependent from the list
    Then the HRMS application should no longer display the second dependent in the list of dependents
