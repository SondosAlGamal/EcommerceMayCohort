 #Login
 @smoke
Feature:user should be able to login to the system
  Scenario:User could log in with valid email and password
    Given  user navigates to login page
    And user click on login
    When user enter his Email
    And user enter valid password
    And user click on login button
    Then user could login successfully
