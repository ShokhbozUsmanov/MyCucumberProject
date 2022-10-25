package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before(order = 1)
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before each scenario");
    }
    @Before (value = "@Login", order = 2)
    public void setupForLogin(){

    }
    @Before (value = "db", order = 3)
    public void setupDatabaseScenario(){

    }
    @After
    public void teardownScenario(){
        System.out.println("It will be closing browser using cucumber @After each scenario");
    }
    @BeforeStep
    public void setupScenarioStep(){

    }

}