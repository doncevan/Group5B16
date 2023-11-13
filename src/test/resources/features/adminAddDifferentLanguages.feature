Feature: Admin add languages

  @languages
  Scenario: Admin add different languages to employees
    Given Admin logged in
    When Admin navigates to qualification
    And Select languages
    Then Admin can add any language
