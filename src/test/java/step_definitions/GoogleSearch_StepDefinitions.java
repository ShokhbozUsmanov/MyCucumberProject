package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my_utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleSearchPage;

public class GoogleSearch_StepDefinitions {

    GoogleSearchPage google = new GoogleSearchPage();

    @Given ("user is on Google search page")
    public void user_is_on_google_search_page(){
        Driver.getDriver().get("https://www.google.com");
    }


    @When("user types apple in the google search box and click enter")
    public void userTypesAppleInTheGoogleSearchBoxAndClickEnter() {
        google.searchBox.sendKeys("apple"+ Keys.ENTER);
    }


    @Then("user sees apple - Google Search is in the google title")
    public void userSeesAppleGoogleSearchIsInTheGoogleTitle() {
        String expectedTitle = "apple - Поиск в Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification is failed!",expectedTitle, actualTitle);
    }

}
