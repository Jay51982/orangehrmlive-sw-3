package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //find Username field and insert value
        getTextFromElement(By.id("txtUsername"));
        sendTextToElement(By.id("txtUsername"),"Admin");

        //find password field and insert value
        getTextFromElement(By.id("txtPassword"));
        sendTextToElement(By.id("txtPassword"),"admin123");


        //find login button and click login button
            clickOnElement(By.id("btnLogin"));

        //this is from requirement
        String expectedMessage = "Welcome Paul";

        // find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.id("welcome"));

        //validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
       closeBrowser();
    }

}
