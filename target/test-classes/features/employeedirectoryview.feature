Feature: Employee Directory View in the HRMS Application

  Background:
    Given user is navigated to HRMS application

    @directory
    Scenario: admin can access and view a comprehensive employee directory
      Given admin is on the PIM page
      And admin clicks on Employment Status and selected active
      And admin clicks on search button
      When admin stores active employees on a list or a table
      Then admin is successfully able to view all employees on the active list