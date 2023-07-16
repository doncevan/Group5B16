Feature: Employee Contact Details Update

  @contactDetails
  Scenario: Update personal information
    Given the employee navigated on HRMS site
    When employee enters valid username and password
    And employee clicks on login button
    Then employee has successfully navigated to HRMS site
    When employee clicks on My Info tab
    And employee clicks on Edit button
    And employee edits firstName
    And employee edits middleName
    And employee edits lastName
    And employee edits gender
    And employee edits nationality
    And employee edits maritalStatus
    And employee clicks on Save button
    Then employees personal information should be saved
