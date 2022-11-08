package pages;

import my_utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePages {
    public WebTablePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement inputUsername;
    @FindBy(name = "password")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[.]")
    public WebElement loginButton;

}
