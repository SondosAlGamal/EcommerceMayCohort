#different categories
@smoke
  Feature:User could select different categories
    Background:User could log in with valid email and password
      Given  user navigates to login page
      And user click on login
      When user enter his Email
      And user enter valid password
      And user click on login button
      Then user could login successfully

    Scenario: Logged user could select different Categories
    When user select on Computers Categories
      And user select on Electronics Categories
      And hover to Cell phones subcategory
      Then Cell phones appears successfully

