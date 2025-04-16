package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    WebDriver driver;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("fileUpload"));
        fileInput.sendKeys(filePath);
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.click();
    }

    public boolean isUploadSuccessful() {
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        return successMessage.isDisplayed();
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        return errorMessage.getText();
    }
}