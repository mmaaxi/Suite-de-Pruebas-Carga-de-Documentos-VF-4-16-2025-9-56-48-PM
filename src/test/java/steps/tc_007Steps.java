package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("I have uploaded a document")
    public void i_have_uploaded_a_document() {
        page.uploadDocument();
    }

    @When("I open the uploaded document")
    public void i_open_the_uploaded_document() {
        page.openDocument();
    }

    @Then("The document should open correctly without data loss")
    public void the_document_should_open_correctly_without_data_loss() {
        Assert.assertTrue("Document integrity check failed.", page.isDocumentIntegrityValid());
    }
}