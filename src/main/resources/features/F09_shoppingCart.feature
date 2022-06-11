#shopping cart
@smoke
  Feature: User could add different products to Shopping cart
    Background:User could log in with valid email and password
      Given  user navigates to login page
      And user click on login
      When user enter his Email
      And user enter valid password
      And user click on login button
      Then user could login successfully
    Scenario: Logged user could add different products to Shopping cart
      Given user navigate to jewelry category
      When user click on Flower Girl Bracelet
      And user click on Add to cart 1
      Then success message 1 appear
      And user press on x button
      And user click on Vintage Style Engagement Ring
      And user click on Add to cart 2
      Then success message 2 appear
