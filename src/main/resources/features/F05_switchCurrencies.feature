#switch currencies
@smoke
  Feature:User could switch between different currencies
    Background:User could log in with valid email and password
      Given  user navigates to login page
      And user click on login
      When user enter his Email
      And user enter valid password
      And user click on login button
      Then user could login successfully

    Scenario:Logged User could switch between currencies US-Euro
      Given user press on dropdown menu and choose Euro
      Then user choose Euro successfully
      And user press on dropdown menu and choose US Dollar
      Then user choose US Dollar successfully
