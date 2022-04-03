Feature: menu selection

  @menu
  Scenario: hoover over menu option

    Given I am on the home page "https://www.next.co.uk/"
    When I hoover on the menu option "women"
    And I click the women link
    Then I should navigate to the women screen
