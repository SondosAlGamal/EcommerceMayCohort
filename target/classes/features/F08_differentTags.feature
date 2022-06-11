#different tags
@smoke
Feature:User could select different tags
  Background:User could log in with valid email and password
    Given  user navigates to login page
    And user click on login
    When user enter his Email
    And user enter valid password
    And user click on login button
    Then user could login successfully
  Scenario: Logged user could select different tags
    Given user navigate to computer category page
    When user select cool from popular tags
    Then cool products appear successfully
    And  user select digital from popular tags
    Then digital products appear successfully
    And user select game from popular tags
    Then game products appear successfully
