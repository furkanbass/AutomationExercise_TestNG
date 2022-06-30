package tests.t02_LoginUserPositiveTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_LoginUser {
AEPage aePage = new AEPage();

    @Test
    public void testName() {

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
//3. Verify that home page is visible successfully
        String URL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(URL,ConfigReader.getProperty("automationUrl"));
//4. Click on 'Signup / Login' button
        aePage.firstSignupLoginButton.click();
//5. Verify 'Login to your account' is visible
        Assert.assertTrue(aePage.loginToYourAccountText.isDisplayed());
//6. Enter correct email address and password
        aePage.loginEmail.sendKeys(ConfigReader.getProperty("email"));
        aePage.loginPassword.sendKeys(ConfigReader.getProperty("password"));
//7. Click 'login' button
        aePage.loginButton.click();
//8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(aePage.loggedInName.isDisplayed());
//9. Click 'Delete Account' button
        aePage.deleteAccount.click();
        aePage.secondDeleteButton.click();
//10. Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertTrue(aePage.DeleteAccountText.isDisplayed());

        //Close Driver
        Driver.closeDriver();
    }
}
