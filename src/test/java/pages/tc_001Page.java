package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    
    WebDriver driver;
    
    By seleccionarArchivoInput = By.id("uploadInput");
    By vistaPrevia = By.id("filePreview");
    By cargarBoton = By.id("uploadButton");
    By mensajeExito = By.id("successMessage");
    
    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void abrirPaginaCarga() {
        driver.get("http://ejemplo.com/carga-documento");
    }
    
    public void seleccionarArchivo(String rutaArchivo) {
        driver.findElement(seleccionarArchivoInput).sendKeys(rutaArchivo);
    }
    
    public boolean esVistaPreviaMostrada() {
        return driver.findElement(vistaPrevia).isDisplayed();
    }
    
    public void cargarDocumento() {
        driver.findElement(cargarBoton).click();
    }
    
    public boolean esCargaExitosa() {
        return driver.findElement(mensajeExito).isDisplayed();
    }
}