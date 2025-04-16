import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.tc_009Page;
import static org.junit.Assert.assertTrue;

public class tc_009Steps {

    WebDriver driver;
    tc_009Page page;

    @Given("que el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCarga() {
        // Suponiendo que la URL de la página de carga es la misma para todos los navegadores
    }

    @When("el usuario carga un documento desde Chrome")
    public void elUsuarioCargaDocumentoDesdeChrome() {
        driver = new ChromeDriver();
        page = new tc_009Page(driver);
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
        page.uploadDocument("ruta/al/documento.pdf");
    }

    @When("el usuario carga un documento desde Firefox")
    public void elUsuarioCargaDocumentoDesdeFirefox() {
        driver = new FirefoxDriver();
        page = new tc_009Page(driver);
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
        page.uploadDocument("ruta/al/documento.pdf");
    }

    @When("el usuario carga un documento desde Edge")
    public void elUsuarioCargaDocumentoDesdeEdge() {
        driver = new EdgeDriver();
        page = new tc_009Page(driver);
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
        page.uploadDocument("ruta/al/documento.pdf");
    }

    @Then("el sistema debe responder de manera consistente")
    public void elSistemaDebeResponderDeManeraConsistente() {
        boolean resultado = page.isUploadSuccessful();
        assertTrue("La carga del documento falló o no fue consistente", resultado);
        driver.quit();
    }
}