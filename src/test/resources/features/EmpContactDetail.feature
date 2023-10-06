Feature: employee changes contact details scenario

  Background:
    #Given user is navigated to HRMS application
    When user enters valid ess username and password
    And user clicks on login button
    Then user is successfully logged in the application
    When user clicks on My Info tab

@smoke @fatima
Scenario: editing employee contact details using excel file
  When user clicks on contact detail
  Then user is on contact detail page
  When user edits contact details using excel file "EmployeeContactDetail" and save it
  Then user contact details should be updated successfully