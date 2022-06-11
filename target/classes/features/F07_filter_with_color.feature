#filter with color
@smoke

  Feature:user could filter with color
    Background:User could log in with valid email and password
      Given  user navigates to login page
      And user click on login
      When user enter his Email
      And user enter valid password
      And user click on login button
      Then user could login successfully
    Scenario: Logged user could filter with color
      Given user select a Apparel category then hover to Shoes subcategory
      And user select shoes subCategory
      Then filter by Red color