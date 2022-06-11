#reset password
@smoke
Feature:Reset password
  Background: click login
    Given user click on login
  Scenario: User could reset his/her password successfully
    And user click on Forgot password
    When user write his e_mail
    And press RECOVER button
    Then a message is displayed to the user
