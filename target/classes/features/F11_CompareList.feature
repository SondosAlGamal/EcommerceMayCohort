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
#      Given user navigate to jewelry category2
#      When user click on Flower Girl Bracelet2
#      And click on Add to compare list button
#      Then success msg 1 appears
#      And user press on Vintage Style Engagement Ring
#      And click on Add to compare list button2
#      Then success msg 2 appears
      When user add Apple MacBook to compare list
      And user click on add to compare list button
      Then success message1
      When user add Laptop Samsung to compare list
      And user click on add to compare list button_2
      Then success message2
