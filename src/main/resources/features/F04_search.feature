#search
@smoke
Feature:User search for any product
  Background:User could log in with valid email and password
    Given  user navigates to login page
    And user click on login
    When user enter his Email
    And user enter valid password
    And user click on login button
    Then user could login successfully

  Scenario: Logged User could search for any product
    When user click on search field and write product name
    And click on search button
    Then user`s product will found
