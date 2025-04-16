Feature: Validate performance when uploading documents

  Scenario: Upload multiple files simultaneously
    Given I am on the document upload page
    When I upload multiple files simultaneously
    Then the system should process the upload within a reasonable time without degrading performance