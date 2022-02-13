Feature: Login Feature
  This feature deals with all login functionality in application

  @Login
  Scenario Outline: I do login with valid credentials
    Given I Navigate to login page
    And   I input <email> <password>
    And   I click login button
    Then  I should entering landing page

    Examples:
      | email                   | password   |
      | firstlater@yahoo.com     | Test1234  |

  @Login
  Scenario Outline: I do login with invalid credentials
    Given I Navigate to login page
    And   I input <email> <password>
    And   I click login button
    Then  I should see error alert

    Examples:
      | email                    | password   |  Scenario                        |
      | firstlater@yahoo.com     | Test123    | Email correct,Password incorrect |
      | firstlater@yahoo.co      | Test1234   | Password correct,email incorrect |
