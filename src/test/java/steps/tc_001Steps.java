package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    
    WebDriver driver;
    tc_001Page tcPage;
    
    @Given("que el usuario tiene la página de carga de documentos abierta")
    public void abrirPaginaCargaDocumentos() {
        driver = new WebDriver(); // Inicializar el WebDriver apropiado
        tcPage = new tc_001Page(driver);
        tcPage.abrirPaginaCarga();
    }
    
    @When("el usuario selecciona un archivo en formato permitido")
    public void seleccionarArchivoPermitido() {
        tcPage.seleccionarArchivo("ruta/del/archivo/documento.pdf");
    }
    
    @Then("el sistema muestra la vista previa del archivo")
    public void validarVistaPreviaArchivo() {
        Assert.assertTrue(tcPage.esVistaPreviaMostrada());
    }
    
    @When("el usuario hace clic en 'Cargar documento'")
    public void hacerClicCargarDocumento() {
        tcPage.cargarDocumento();
    }
    
    @Then("el archivo se carga exitosamente")
    public void validarCargaExitosa() {
        Assert.assertTrue(tcPage.esCargaExitosa());
    }
}