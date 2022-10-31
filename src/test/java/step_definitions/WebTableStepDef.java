package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my_utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.WebTablePages;

public class WebTableStepDef {
    WebTablePages webTable = new WebTablePages();
    @Given("user is on the login page of web table app")
    public void userIsOnTheLoginPageOfWebTableApp() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters username {string}")
    public void userEntersUsername(String string) {
        webTable.inputUsername.sendKeys("Test");
    }

    @And("user enter password {string}")
    public void userEnterPassword(String string) {
        webTable.inputPassword.sendKeys("Tester");
    }

    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        webTable.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void userShouldSeeUrlContainsOrders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }
}
