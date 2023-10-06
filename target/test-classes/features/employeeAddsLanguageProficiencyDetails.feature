Feature: Employee adds details
 #As an employee I want to add my language proficiency details
  #I also what to be able to edit or delete my previously saved language proficiency details


Background:
    #Given employee is navigated to HRMS application
    When employee  enters valid employee username and password
    And employee  clicks on login button
    Then employee  is successfully logged in the application
    When employee clicks on My Info tab1
    And employee clicks on Qualifications option


  @language
  Scenario:Adding language proficiency information

    And employee clicks on add button
    And employee selects language dropdown
    And employee selects fluency dropdown
    And employee selects competency dropdown
    And employee adds text in comment text box
    Then system should validate that mandatory fields are filled in
    Then employee clicks on save button
    And the system stores the language proficiency details in the employee profile

  @language
  Scenario: Deleting previously saved language details

    When employee checks a check box
    And employee clicks on delete button
    Then employee successfully deletes his language details
