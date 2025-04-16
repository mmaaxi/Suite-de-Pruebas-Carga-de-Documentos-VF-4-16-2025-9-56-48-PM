package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {

    tc_005Page uploadPage = new tc_005Page();

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        uploadPage.navigateToUploadPage();
    }

    @When("I upload multiple files simultaneously")
    public void i_upload_multiple_files_simultaneously() {
        uploadPage.uploadMultipleFiles();
    }

    @Then("the system should process the upload within a reasonable time without degrading performance")
    public void the_system_should_process_the_upload_within_a_reasonable_time_without_degrading_performance() {
        assertTrue("The system's performance degraded", uploadPage.isPerformanceAdequate());
    }
}