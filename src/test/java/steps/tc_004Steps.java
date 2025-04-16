import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver = new ChromeDriver();
    tc_004Page uploadPage = new tc_004Page(driver);

    @Given("que el usuario está en la página de carga de archivos")
    public void que_el_usuario_está_en_la_página_de_carga_de_archivos() {
        uploadPage.navigateToUploadPage();
    }

    @When("selecciona un archivo que excede el límite permitido")
    public void selecciona_un_archivo_que_excede_el_limite_permitido() {
        uploadPage.uploadFile("path/to/largefile");
    }

    @Then("el sistema rechaza la carga")
    public void el_sistema_rechaza_la_carga() {
        assertFalse(uploadPage.isUploadSuccessful());
    }

    @Then("muestra un mensaje de error de tamaño")
    public void muestra_un_mensaje_de_error_de_tamaño() {
        assertEquals("El archivo excede el tamaño permitido", uploadPage.getErrorMessage());
    }
}