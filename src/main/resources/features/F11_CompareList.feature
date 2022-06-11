#compare list
@smoke
  Feature: User could add different products to compare list
    Background:User could log in with valid email and password and navigates to jewelry then click on Flower Girl Bracelet
      Given  user navigates to login page
      And user click on login
      When user enter his Email
      And user enter valid password
      And user click on login button
      Then user could login successfully

    Scenario: Logged user could add different products to compare list
      When user add Apple MacBook to compare list
      And user click on add to compare list button
      Then success message1
      When user add Laptop Samsung to compare list
      And user click on add to compare list button_2
      Then success message2
