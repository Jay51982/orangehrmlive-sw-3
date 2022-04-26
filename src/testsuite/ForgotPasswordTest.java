package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        // Verify the text ‘Forgot Your Password?’
        String expectedMessage = "Forgot your password?";

        String actualMessage = getTextFromElement(By.xpath("//a[@href = '/index.php/auth/requestPasswordResetCode']"));

        System.out.println("actual msg = " + actualMessage);
        //compare message
        Assert.assertEquals("Can not verify Forgot Your Password Message : ", expectedMessage, actualMessage);

        //varify navigate to forgot password reset page
        getTextFromElement(By.xpath("//a[text() = 'Forgot your password?']"));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

