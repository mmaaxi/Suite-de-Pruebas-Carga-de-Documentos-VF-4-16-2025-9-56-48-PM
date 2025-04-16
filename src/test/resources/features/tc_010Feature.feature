Feature: Validate logout does not interfere with ongoing uploads

  Scenario: Validate document upload continues on active session despite logout on another browser
    Given I start a document upload in the active session
    When I log out from another browser session
    Then the document upload should continue without interruption