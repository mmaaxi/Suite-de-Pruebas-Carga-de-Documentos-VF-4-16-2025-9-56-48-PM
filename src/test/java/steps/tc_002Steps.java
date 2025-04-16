package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;
import static org.junit.Assert.*;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page = new tc_002Page(driver);

    @Given("the user is on the document upload page")
    public void the_user_is_on_the_document_upload_page() {
        page.navigateToUploadPage();
    }

    @When("the user tries to upload a file with the format \".exe\"")
    public void the_user_tries_to_upload_a_file_with_the_format_exe() {
        page.uploadFile("path/to/invalid-file.exe");
    }

    @Then("the system displays an error message indicating invalid format")
    public void the_system_displays_an_error_message_indicating_invalid_format() {
        assertTrue(page.isInvalidFormatErrorDisplayed());
    }
}