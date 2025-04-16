package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.Paths;

public class tc_003Page {
    private WebDriver driver;

    private By fileInput = By.id("file-upload-input");
    private By uploadButton = By.id("upload-button");
    private By errorMessage = By.id("error-message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadCorruptFile() {
        WebElement uploadElement = driver.findElement(fileInput);
        String absolutePath = Paths.get("path/to/corrupt_file.txt").toAbsolutePath().toString();
        uploadElement.sendKeys(absolutePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}