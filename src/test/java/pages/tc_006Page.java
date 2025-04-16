package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

    WebDriver driver;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/uploadPage");
    }

    public void attemptToUploadWithoutPermission() {
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.click();
    }

    public boolean isOperationDenied() {
        WebElement notification = driver.findElement(By.id("notification"));
        return notification.getText().contains("Operación denegada");
    }

    public boolean isUnauthorizedAccessRecorded() {
        // Implement a method to verify if an unauthorized access attempt is recorded
        // This might involve checking logs or a specific element on the page
        WebElement logEntry = driver.findElement(By.id("logEntry"));
        return logEntry.getText().contains("acceso no autorizado");
    }
}