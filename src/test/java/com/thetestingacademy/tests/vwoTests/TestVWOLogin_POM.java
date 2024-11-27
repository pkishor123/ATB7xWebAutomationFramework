package com.thetestingacademy.tests.vwoTests;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.pages.pageObjectModel.LoginPage_POM;
import com.thetestingacademy.utilis.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_POM extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_POM.class);

    @Test
    public  void testLoginNegativeVWO(){
        logger.info("Starting the Testcases");

        LoginPage_POM loginPagePom = new LoginPage_POM( DriverManager.getDriver());
        logger.info("Opening the URL");

        String error_msg_alert = loginPagePom.LoginToVWOInvalidCreds(PropertyReader.readKey("invalid_username"),PropertyReader.readKey("invalid_password"));

        logger.info("Verifying the Username is the" + error_msg_alert);
        assertThat(error_msg_alert).isNotBlank().isNotNull().isNotEmpty();

        Assert.assertEquals(error_msg_alert,PropertyReader.readKey("error_message"));


    }


}
