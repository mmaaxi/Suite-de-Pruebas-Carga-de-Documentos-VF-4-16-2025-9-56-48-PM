Feature: Handle network interruptions during loading

  Scenario: Validate retry option on network error
    Given I am on the loading page
    When I simulate a network interruption
    Then I should see an option to retry the loading or a connectivity error message