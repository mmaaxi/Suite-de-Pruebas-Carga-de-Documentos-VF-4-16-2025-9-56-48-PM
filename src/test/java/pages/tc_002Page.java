package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        WebElement uploadInput = driver.findElement(By.id("uploadInput"));
        uploadInput.sendKeys(filePath);
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.click();
    }

    public boolean isInvalidFormatErrorDisplayed() {
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        return errorMessage.isDisplayed() && errorMessage.getText().contains("invalid format");
    }
}