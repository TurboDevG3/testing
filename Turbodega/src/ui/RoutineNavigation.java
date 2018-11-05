package ui;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoutineNavigation {

  private static ChromeDriver driver;

  @BeforeClass
  public static void openBrowser() {
    System.setProperty(
        "webdriver.chrome.driver",
        ""); //insert chromedriver absolute path here
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  // Note that the order of tests can't be guaranteed. We need to make sure that we access the right
  // page at the start of each test method.
  
  // Note2: Delays are added for demonstration purposes. Will be removed after.

  @Test
  public void testLandingPage() {
    driver.get(""); //insert index.html path here
    driver.findElementById("loggedOutAboutID").click();
    pause(1000);
    driver.navigate().back();
    pause(1000);
    driver.findElementById("servicesID").click();
    pause(1000);
    driver.navigate().back();
    pause(1000);
    driver.findElementById("contactID").click();
    pause(1000);
    driver.navigate().back();
    pause(1000);
    driver.findElementById("registrationID").click();
    pause(1000);
    driver.navigate().back();
    pause(1000);
    assert (true);
  }

  @Test
  public void testLoginLogout() {
    driver.get(""); //insert index.html path here
    pause(1000);
    driver.findElementById("registrationID").click();
    pause(1000);
    driver.findElementById("inputUsernameID").sendKeys("TestAccount");
    pause(1000);
    driver.findElementById("inputPasswordID").sendKeys("hunter2");
    pause(1000);
    driver.findElementById("inputConfirmPasswordID").sendKeys("hunter2");
    pause(1000);
    driver.findElementById("signInID").click();
    pause(1000);
    driver.findElementById("logoutID").click();
    pause(1000);
    assert (true);
    
  }

  @AfterClass
  public static void closeBrowser() {
    driver.quit();
  }
  
  public static void pause(Integer milliseconds){
	    try {
	        TimeUnit.MILLISECONDS.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}
