#wishList
@smoke
  Feature: User could add different products to Wishlist
    Background:User could log in with valid email and password and navigates to jewelry then click on Flower Girl Bracelet
      Given  user navigates to login page
      And user click on login
      When user enter his Email
      And user enter valid password
      And user click on login button
      Then user could login successfully
    Scenario: Logged user could add different products to Wishlist
#      Given User navigate to jewelry category
#      And user clicks on Flower Girl Bracelet
#      And click on Add to wishlist button
#      Then success message 1 appears
#      And user clicks on Vintage Style Engagement Ring
#      And click on Add to wishlist button2
#      Then success message 2 appears
    When user add Apple MacBook to wishlist
    And user click on add to wishlist button
    Then success message_1
    When user add Laptop Samsung to wishlist
    And user click on add to wishlist button_2
    Then success message_2