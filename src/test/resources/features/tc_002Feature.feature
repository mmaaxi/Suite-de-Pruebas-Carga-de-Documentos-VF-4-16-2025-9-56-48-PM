Feature: Validate rejection of document with disallowed format

  Scenario: Upload a document with an invalid format
    Given the user is on the document upload page
    When the user tries to upload a file with the format ".exe"
    Then the system displays an error message indicating invalid format