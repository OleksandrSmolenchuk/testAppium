package com.saucelabs.appium;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AndroidTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
//        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File("D:\\SAVED\\workspace\\Mentoring\\bin\\");
        File app = new File(appDir, "Mentoring.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformVersion", "4.2");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.example.mentoring");
        capabilities.setCapability("appActivity", ".MainActivity");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void apiDemo(){
    	driver.findElement(By.className("android.widget.Spinner")).click();        

    }

}