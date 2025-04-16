package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_005Page {
    
    WebDriver driver;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "performanceIndicator")
    private WebElement performanceIndicator;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadMultipleFiles() {
        // Implement the logic to upload multiple files
        uploadButton.sendKeys("/path/to/file1,/path/to/file2,/path/to/file3");
    }

    public boolean isPerformanceAdequate() {
        // Logic to check if the performance is adequate; e.g., based on time or server response
        String performanceText = performanceIndicator.getText();
        // Assuming the indicator returns "Optimal" when performance is good
        return performanceText.equals("Optimal");
    }
}