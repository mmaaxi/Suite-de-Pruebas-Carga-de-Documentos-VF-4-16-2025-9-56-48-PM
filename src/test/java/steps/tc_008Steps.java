package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_008Page;
import static org.junit.Assert.assertTrue;

public class tc_008Steps {
    WebDriver driver = new ChromeDriver();
    tc_008Page loadingPage = new tc_008Page(driver);

    @Given("I am on the loading page")
    public void iAmOnLoadingPage() {
        driver.get("http://example.com/loading");
    }

    @When("I simulate a network interruption")
    public void iSimulateANetworkInterruption() {
        loadingPage.simulateNetworkInterruption();
    }

    @Then("I should see an option to retry the loading or a connectivity error message")
    public void iShouldSeeRetryOptionOrErrorMessage() {
        assertTrue("Retry option or error message not displayed", loadingPage.isRetryOrErrorMessageDisplayed());
        driver.quit();
    }
}