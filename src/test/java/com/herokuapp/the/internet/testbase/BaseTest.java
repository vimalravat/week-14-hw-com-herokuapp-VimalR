package com.herokuapp.the.internet.testbase;

import com.herokuapp.the.internet.propertyreader.PropertyReader;
import com.herokuapp.the.internet.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    //  String browser = "chrome";

    @BeforeMethod
    public void setUP() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
