#successful order
@smoke
  Feature: User could create successful order
    Background:User could log in with valid email and password
      Given  user navigates to login page
      And user click on login
      When user enter his Email
      And user enter valid password
      And user click on login button
      Then user could login successfully

    Scenario: Create successful Order
      Given user click on shopping cart link
      And user choose to wrapped his order as a gift
      And user check on the agreement checkBox
      When user click on checkout button
      And user select his country
      And user write his city
      And user write Address1
      And user write Address2
      And user write postalZip code
      And user write his phone number
      And user write his fax number
      And user press continue button
      And user check Ground
      And user press continue button2
      And user check money order
      And user press continue button3
      And user press continue button4
      And user press confirm button
#     Then order of the user will successfully processed


