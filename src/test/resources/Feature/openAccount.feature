Feature: Open Account
  @Smoke
  Scenario Outline: Opening Account
    Given User goto Open Account tab
    When User click Customer dropdown
    And Select created account
    And User click Currency dropdown
    And Select a Currency
    Then User click on Process button
    Examples:
      |Customer| Currency |
      |Martin Rozario| Dollar |
