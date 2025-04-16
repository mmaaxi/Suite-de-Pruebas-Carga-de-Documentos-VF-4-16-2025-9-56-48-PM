package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    private WebDriver driver;
    private By uploadButton = By.id("uploadButtonId");
    private By successMessage = By.id("successMessageId");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocument(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath);
        // Aquí podrías necesitar más pasos como hacer clic en un botón de "Cargar" si existiera
    }

    public boolean isUploadSuccessful() {
        try {
            WebElement messageElement = driver.findElement(successMessage);
            return messageElement.isDisplayed() && messageElement.getText().contains("Carga exitosa");
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}