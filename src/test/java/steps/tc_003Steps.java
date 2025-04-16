package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_003Page;

public class tc_003Steps {

    private WebDriver driver = new ChromeDriver();
    private tc_003Page uploadPage = new tc_003Page(driver);

    @Given("I am on the file upload page")
    public void iAmOnTheFileUploadPage() {
        uploadPage.openUploadPage();
    }

    @When("I select a corrupt file for upload")
    public void iSelectACorruptFileForUpload() {
        uploadPage.uploadCorruptFile();
    }

    @Then("I should see an error message indicating the file is corrupt")
    public void iShouldSeeAnErrorMessageIndicatingTheFileIsCorrupt() {
        Assert.assertTrue(uploadPage.isErrorMessageDisplayed());
        driver.quit();
    }
}