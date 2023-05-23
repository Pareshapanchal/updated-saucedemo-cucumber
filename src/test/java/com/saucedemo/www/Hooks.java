package com.saucedemo.www;

import com.cucumber.listener.Reporter;
import com.saucedemo.www.propertyreader.PropertyReader;
import com.saucedemo.www.utilities.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utility {

@Before
public void setUp(){
    selectBrowser(PropertyReader.getInstance().getProperty("browser"));
}
@After
    public void tearDown(Scenario scenario){
    if(scenario.isFailed()){
        String screenShotPath= Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
        try {
            Reporter.addScreenCaptureFromPath(screenShotPath);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    closeBrowser();
    }
}
