package pages;

import my_utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage() {

        PageFactory.initElements(Driver.getDriverpool(), this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;


}

