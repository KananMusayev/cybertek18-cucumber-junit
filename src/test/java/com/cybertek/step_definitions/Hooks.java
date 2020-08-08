package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 2)
    public void setUpScenario(){
        System.out.println( "-----> Before annotation: Setting up browser");
    }

    @Before(value = "@db",order = 1)
    public void setUpDataBaseConnection(){
        System.out.println("---------->Before Annotation: DB connection created<---------");
    }


    @After(order = 1)
    public void tearDownScenario(Scenario scenario){
        //System.out.println( "-----> After annotation: Closing browser");
        //System.out.println("scenario.getName() = " + scenario.getName());
        //System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        //System.out.println("scenario.isFailed() = " + scenario.isFailed());

        //#1 taking Screenshot
        //#2 Attach it into our project

        if (scenario.isFailed()){

        byte[]screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());    }


    }

    @After(value = "@db",order = 4)
    public void tearDownDBconnection(){
        System.out.println("---------->After Annotation: DB connection created<---------");

    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("=======>Before Step: TAKING SCREENSHOT");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("=======>After Step: TAKING SCREENSHOT");
    }
}
