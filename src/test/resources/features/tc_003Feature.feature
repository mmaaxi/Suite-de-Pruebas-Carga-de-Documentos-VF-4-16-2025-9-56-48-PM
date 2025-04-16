Feature: Validate error message when attempting to upload a corrupt file

  Scenario: Upload a corrupt file
    Given I am on the file upload page
    When I select a corrupt file for upload
    Then I should see an error message indicating the file is corrupt