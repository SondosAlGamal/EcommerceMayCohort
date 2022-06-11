#Register
@smoke
  Feature: user should be able to sign up with new account only once
    Scenario: User could register with valid data
      Given user click on Register
      When user write his first name
      And user write his last name
      And user write his Email
      And user write his password
      And user confirm his password
      And user click on register button
      Then user sign up successfully and success message is displayed
