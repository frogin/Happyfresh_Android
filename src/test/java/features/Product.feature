Feature: Product Feature
  This feature is to check all functionality regarding with product order

  @Product
  Scenario Outline: Verify product details information
    Given I Navigate to login page
    And   I input <email> <password>
    And   I click login button
    And   I go to product details
    Then  I check product details element

    Examples:
      | email                   | password   |
      | firstlater@yahoo.com     | Test1234  |

  @Product
  Scenario Outline: Verify user able to add to card and see product list
    Given I Navigate to login page
    And   I input <email> <password>
    And   I click login button
    And   I go to product details
    And   I add to card the product
    Then  I check the product list

    Examples:
      | email                   | password   |
      | firstlater@yahoo.com     | Test1234  |

