Feature: Validate document integrity post upload

  Scenario: Verify document opens correctly without data loss
    Given I have uploaded a document
    When I open the uploaded document
    Then The document should open correctly without data loss