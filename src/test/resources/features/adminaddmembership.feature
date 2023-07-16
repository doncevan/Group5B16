Feature: Admin add membership

  @admin
 Scenario Outline:
   Given admin user has navigated to hrms application and is logged in
   When admin navigates to Qualifications Page
   And selects Memberships
   Then admin user can add any Memberships
    Examples:
      |  |
