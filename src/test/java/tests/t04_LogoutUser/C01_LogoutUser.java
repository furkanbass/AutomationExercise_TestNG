package tests.t04_LogoutUser;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_LogoutUser {
    AEPage aePage = new AEPage();

    @Test
    public void test01() {

        //  1. Launch browser
        //  2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //  3. Verify that home page is visible successfully
        String URL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(URL,ConfigReader.getProperty("automationUrl"));
        //  4. Click on 'Signup / Login' button
        aePage.firstSignupLoginButton.click();
        //  5. Verify 'Login to your account' is visible
        Assert.assertTrue(aePage.loginToYourAccountText.isDisplayed());
        //  6. Enter correct email address and password
        aePage.loginEmail.sendKeys(ConfigReader.getProperty("email"));
        aePage.loginPassword.sendKeys(ConfigReader.getProperty("password"));
        //  7. Click 'login' button
        aePage.loginButton.click();
        //  8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(aePage.loggedInName.isDisplayed());
        //  9. Click 'Logout' button
        aePage.logoutButton.click();
        //  10. Verify that user is navigated to login page
        Assert.assertTrue(aePage.loginToYourAccountText.isDisplayed());

    }
}
