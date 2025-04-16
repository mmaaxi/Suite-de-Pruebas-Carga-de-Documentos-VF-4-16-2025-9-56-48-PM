package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario intenta cargar un documento sin permisos")
    public void el_usuario_intenta_cargar_documento_sin_permisos() {
        page.attemptToUploadWithoutPermission();
    }

    @Then("el sistema deniega la operación")
    public void el_sistema_deniega_la_operacion() {
        Assert.assertTrue(page.isOperationDenied());
    }

    @Then("registra el intento de acceso no autorizado")
    public void registra_el_intento_de_acceso_no_autorizado() {
        Assert.assertTrue(page.isUnauthorizedAccessRecorded());
    }
}