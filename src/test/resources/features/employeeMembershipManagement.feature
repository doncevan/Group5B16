Feature: Employee Membership Management

  #As an employee
  #I want to be able to add, edit and delete my membership details
  #So that I can keep my membership information up to date

  Background:
    #Given the employee is navigated to HRMS application
    When the employee enters valid ess username and password
    And the employee clicks on login button
    Then the employee is successfully logged in the application
    When the employee clicks on My Info tab
    And the employee clicks Memberships option

  @membership
  Scenario Outline: Display and add membership details
    And the employee clicks Add button
    And the employee enters "<Membership>" and "<SubscriptionPaidBy>" and "<SubscriptionAmount>" and "<Currency>" and "<SubscriptionCommenceDate>" and "<SubscriptionRenewalDate>" in data driven format
    And the employee clicks the save button
    Then the system should validate that mandatory fields are filled in
    And the system should store the membership details in the employee's profile
    Examples:
      | Membership | SubscriptionPaidBy | SubscriptionAmount | Currency             | SubscriptionCommenceDate | SubscriptionRenewalDate |
      | Spotify    | Company            | 50                 | United States Dollar | 2023-07-15               | 2024-07-15              |

  @membership
  Scenario Outline: Edit previously saved membership details
    Given the employee has previously saved membership details
    When the employee clicks on specific membership account
    And the employee edits "<Membership>" and "<SubscriptionPaidBy>" and "<SubscriptionAmount>" and "<Currency>" and "<SubscriptionCommenceDate>" and "<SubscriptionRenewalDate>" in data driven format
    And the employee clicks the save button
    Then the system should update the employee's membership details
    Examples:
      | Membership | SubscriptionPaidBy | SubscriptionAmount | Currency             | SubscriptionCommenceDate | SubscriptionRenewalDate |
      | Amazon     | Individual         | 150                | United States Dollar | 2023-08-10               | 2024-08-10              |

  @membership
  Scenario: Delete previously saved membership details
    Given the employee has previously saved membership details
    When the employee clicks on checkbox
    And the employee clicks on Delete button
    Then given membership account has been deleted