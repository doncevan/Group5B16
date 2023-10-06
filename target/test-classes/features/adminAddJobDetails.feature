
Feature: Admin can access the employee's profile and add current job details
  Background:
    #Given admin user is navigated to HRMS website
    When admin enters valid username and password
    And admin clicks on login button
    Then admin is successfuly logged in the application
    #Given admin is navigated to employee information
    When  admin clicks on PIM and employee list option
    And admin enter valid employee id
    And admin clicks on search button
    And admin clicks on employee's profile
    Then admin is able to see employee information
    #Given admin is navigated to current job details section
    When admin clicks on Job
    And admin clicks on edit button
    Then admin is able to edit Job information

  @adminEdit
  Scenario: edit Job Title field
    When admin clicks on Job Title dropdown
    And admin can select job title of the employee
    Then admin is able to save the changes
  @adminEdit
  Scenario: edit Employment Status field
    When admin clicks on Employment status dropdown
    And admin can select employment status of the employee
    Then admin is able to save the changes

  @adminEdit
  Scenario: edit Job Category field
    When admin clicks on Job Category dropdown
    And admin can select job category of the employee
    Then admin is able to save the changes
  @adminEdit
  Scenario: edit Joined Date field
    When admin clicks on Joined Date calendar
    And admin can select the date when the employee joined the organization
    And admin can select the month when employee joined the organization
    And admin can select the year when employee joined the organization
    Then admin is able to save the changes
  @adminEdit
  Scenario: edit Sub Unit field
    When admin clicks on Sub Unit dropdown
    And admin can select the sub unit where the employee is currently working
    Then admin is able to save the changes
  @adminEdit
  Scenario: edit Location field
    When admin clicks on Location dropdown
    And admin can select the location where employee is currently working
    Then admin is able to save the changes
  @adminEdit
  Scenario: edit Start date field
    When admin clicks on Start date calender
    And admin can select the starting date of employee's current job
    Then admin is able to save the changes
  @adminEdit
  Scenario: edit End date field
    When admin clicks on End date calender
    And admin can select the end date of employee's current job
    Then admin is able to save the changes
  @adminEdit
  Scenario: edit Contract details field
    When admin clicks on Choose file button and uploads information
    And admin clicks on Save button
    Then admin is able to save the changes





