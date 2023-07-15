Feature: Employee Membership Management

  #As an employee
  #I want to be able to add and edit my membership details
  #So that I can keep my membership information up to date

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application
    When user clicks on PIM option

  @datatable
  Scenario: Display and edit membership details
    And user clicks specific id on Employee List
    And user clicks Memberships button
    And user clicks on Add button
    Then the following fields should be displayed and be editable:
      | Field                 | Type     |         Value
      | Membership            | Dropdown |         Home Depot
      | Subscription Paid By  | Dropdown |         Company
      | Subscription Amount   | Text     |         100
      | Currency              | Dropdown |         United States Dollar
      | Subscription Commence Date | Calendar |    2023-07-15
      | Subscription Renewal Date  | Calendar |    2024-07-15
    When the employee enters their membership details
    And the employee clicks the save button
    Then the system should validate that mandatory fields are filled in
    And the system should store the membership details in the employee's profile


  Scenario: Edit or delete previously saved membership details

    Given the employee has previously saved membership details
    When the employee edits or deletes their membership details
    And the employee clicks the save button
    Then the system should update the employee's membership details