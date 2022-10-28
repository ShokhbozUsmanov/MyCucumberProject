package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import my_utils.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before //(order = 1)
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before each scenario");
    }
    @After
    public void teardownScenario(Scenario scenario){

       byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
       scenario.attach(screenshot, "image/png", scenario.getName());

        Driver.getDriver().quit();
    }
    @Before //(value = "@Login", order = 2)
    public void setupForLogin(){
    }
    @Before //(value = "db", order = 3)
    public void setupDatabaseScenario(){

    }
    @BeforeStep
    public void setupScenarioStep(){

    }

}