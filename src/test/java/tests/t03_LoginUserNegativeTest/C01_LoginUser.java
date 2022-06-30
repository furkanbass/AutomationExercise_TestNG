package tests.t03_LoginUserNegativeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_LoginUser {
    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter incorrect email address and password
7. Click 'login' button
8. Verify error 'Your email or password is incorrect!' is visible
     */
    AEPage aePage = new AEPage();
    @Test
    public void test01(){
        //Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //Verify that home page is visible successfully
        String Url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(Url,ConfigReader.getProperty("automationUrl"));
        //Click on 'Signup / Login' button
        aePage.firstSignupLoginButton.click();
        //Verify 'Login to your account' is visible
        Assert.assertTrue(aePage.loginToYourAccountText.isDisplayed());
        //Enter incorrect email address and password
        aePage.loginEmail.sendKeys(ConfigReader.getProperty("incorrect_email_address"));
        aePage.loginPassword.sendKeys(ConfigReader.getProperty("incorrect_password"));
        //Click 'login' button
        aePage.loginButton.click();
        //Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(aePage.loginButton.isDisplayed());
    }
}
