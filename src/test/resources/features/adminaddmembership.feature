Feature: Admin add membership

  Background:
    Given user is navigated to HRMS application

  @admin @Daniel2
  Scenario Outline:
    When admin navigates to Qualifications Page
    And selects memberships
    Then admin user can add any "<memberships>"
    Examples:
      | memberships |
      | 0Amazon     |
      | 0Binance    |
      | 0Craft      |