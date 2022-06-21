package tests.t01_registeruser;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_RegisterUser {
    /*
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'New User Signup!' is visible
    6. Enter name and email address
    7. Click 'Signup' button
    8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    9. Fill details: Title, Name, Email, Password, Date of birth
    10. Select checkbox 'Sign up for our newsletter!'
    11. Select checkbox 'Receive special offers from our partners!'
    12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    13. Click 'Create Account button'
    14. Verify that 'ACCOUNT CREATED!' is visible
    15. Click 'Continue' button
    16. Verify that 'Logged in as username' is visible
    17. Click 'Delete Account' button
    18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */


    @Test
    public void test01(){
        AEPage aePage = new AEPage();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
        //4. Click on 'Signup / Login' button
         aePage.firstSignupLoginButton.click();
       //String expectedResult01 = "New User Signup!";
       //Assert.assertEquals();
        //6. Enter name and email address
        aePage.name.sendKeys(ConfigReader.getProperty("name"));
        aePage.emailAddress.sendKeys(ConfigReader.getProperty("email"));
        // 7. Click 'Signup' button
        aePage.signupButton.click();
//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

//        9. Fill details: Title, Name, Email, Password, Date of birth
        aePage.title.click();
        aePage.password.sendKeys(ConfigReader.getProperty("password"));
        aePage.day.sendKeys(ConfigReader.getProperty("day"));
        aePage.month.sendKeys(ConfigReader.getProperty("month"));
        aePage.year.sendKeys(ConfigReader.getProperty("year"));
//        10. Select checkbox 'Sign up for our newsletter!'
        aePage.newsletter.click();
//        11. Select checkbox 'Receive special offers from our partners!'
        aePage.optin.click();
//        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        aePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        aePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        aePage.company.sendKeys(ConfigReader.getProperty("company"));
        aePage.address1.sendKeys(ConfigReader.getProperty("address1"));
        aePage.address2.sendKeys(ConfigReader.getProperty("address2"));
        aePage.country.sendKeys(ConfigReader.getProperty("country"));
        aePage.state.sendKeys(ConfigReader.getProperty("state"));
        aePage.city.sendKeys(ConfigReader.getProperty("city"));
        aePage.zipcode.sendKeys(ConfigReader.getProperty("zipcode"));
        aePage.mobileNumber.sendKeys(ConfigReader.getProperty("mobileNumber"));
//        13. Click 'Create Account button'
        aePage.createAccountButton.click();
//  14. Verify that 'ACCOUNT CREATED!' is visible

//        15. Click 'Continue' button
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        aePage.continueButton.click();
//        16. Verify that 'Logged in as username' is visible

//        17. Click 'Delete Account' button
        aePage.deleteAccount.click();
//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        //             String expected = "ACCOUNT DELETED";


    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}
