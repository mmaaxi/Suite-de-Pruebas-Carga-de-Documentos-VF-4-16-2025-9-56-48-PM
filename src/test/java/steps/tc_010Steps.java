package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_010Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page;

    public tc_010Steps(WebDriver driver) {
        this.driver = driver;
        page = new tc_010Page(driver);
    }

    @Given("I start a document upload in the active session")
    public void i_start_a_document_upload_in_the_active_session() {
        page.startDocumentUpload();
    }

    @When("I log out from another browser session")
    public void i_log_out_from_another_browser_session() {
        page.logOutFromAnotherSession();
    }

    @Then("the document upload should continue without interruption")
    public void the_document_upload_should_continue_without_interruption() {
        assertTrue(page.isUploadContinuing());
    }
}