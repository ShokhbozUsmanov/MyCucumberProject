package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my_utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WikiFunctionality {

    @Given ("user is on the Wikipedia home page")
    public void user_is_on_the_Wikipedia_home_page(){
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user types {string} in the wiki search box")
    public void userTypesSteveJobsInTheWikiSearchBox(String searchValue) {
        WebElement search = Driver.getDriver().findElement(By.xpath("//input[@id='searchInput']"));
        search.sendKeys(searchValue, Keys.ENTER);
    }

    @And("user click wiki search button")
    public void userClickWikiSearchButton() {

    }

    @Then("user sees {string} is in the wiki title")
    public void userSeesSteveJobsIsInTheWikiTitle(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }
}
