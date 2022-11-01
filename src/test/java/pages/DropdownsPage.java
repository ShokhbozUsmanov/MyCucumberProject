package pages;

import my_utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownsPage {
    public DropdownsPage(){
        PageFactory.initElements(Driver.getDriverpool(), this);
    }

    @FindBy(id="month")
    public WebElement monthDropdown;

}
