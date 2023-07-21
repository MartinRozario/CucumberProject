Feature: Add Customer
  @Smoke
  Scenario Outline:Adding Customer
    Given User goto XYZ Bank Home page page
    When User click on the Bank Manager Login
    And User click Add Customer button
    And User input '<firstName>' and '<lastName>' and '<postCode>'
    And User click on the Add Customer button
    Then User click on on notification

    Examples:
      |firstName  |lastName |postCode|
      |Martin     |Rozario  |1234    |