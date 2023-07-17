Feature: Ess changes profile picture

  Background:
    Given ess is navigated to HRMS application

  @picture
  Scenario: ess can change profile picture
    Given ess is on the My Info page
    When ess clicks on the Change Photo button
    And ess selects a profile picture from their computer
    And ess clicks on the Upload button
    Then ess's profile picture is updated