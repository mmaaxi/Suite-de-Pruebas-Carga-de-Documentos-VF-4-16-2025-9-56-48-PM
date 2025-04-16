package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    WebDriver driver;
    private By retryButton = By.id("retryButton");
    private By errorMessage = By.id("errorMessage");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void simulateNetworkInterruption() {
        // Logic to simulate network interruption
        // This may involve using browser developer tools or specific browser plugins
        // For the sake of the example, this is left abstract.
    }

    public boolean isRetryOrErrorMessageDisplayed() {
        return driver.findElement(retryButton).isDisplayed() || driver.findElement(errorMessage).isDisplayed();
    }
}