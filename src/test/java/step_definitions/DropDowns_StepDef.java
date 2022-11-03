package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import my_utils.BrowserUtils;
import my_utils.Driver;
import org.junit.Assert;
import pages.DropdownsPage;

import java.util.List;

public class DropDowns_StepDef {

    DropdownsPage dropdownsPage = new DropdownsPage();
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {

        List<String> actualDropdownOptionsAsString = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonth,actualDropdownOptionsAsString);
    }

}