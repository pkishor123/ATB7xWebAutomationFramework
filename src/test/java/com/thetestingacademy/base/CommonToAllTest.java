package com.thetestingacademy.base;

import com.thetestingacademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {

    // we will start the browser
    @BeforeMethod
    public void setUp(){
        DriverManager.init();
    }


    // we will close the browser
    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }
}
