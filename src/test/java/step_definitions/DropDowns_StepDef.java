package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import my_utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DropdownsPage;

import java.util.List;

public class DropDowns_StepDef {

    DropdownsPage dp = new DropdownsPage();
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User shoud see below info in month dropdown")
    public void user_shoud_see_below_info_in_month_dropdown(List<String> dataTable) {

        Select select = new Select(dp.monthDropdown);
         List<WebElement> elements = select.getOptions();

    }

}