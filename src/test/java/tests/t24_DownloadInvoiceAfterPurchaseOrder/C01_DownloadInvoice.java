package tests.t24_DownloadInvoiceAfterPurchaseOrder;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_DownloadInvoice {

    AEPage aePage = new AEPage();
    @Test
    public void test01(){
        //    1. Launch browser
//    2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
//    3. Verify that home page is visible successfully
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

//    4. Add products to cart
        aePage.viewProduct.click();
        aePage.addToCart.click();
        aePage.viewCart.click();
        aePage.proceedToCheckout.click();
        aePage.registerLogin.click();

//    5. Click 'Cart' button

//    6. Verify that cart page is displayed

//    7. Click Proceed To Checkout

//    8. Click 'Register / Login' button
//    9. Fill all details in Signup and create account

//5. Verify 'Login to your account' is visible
        Assert.assertTrue(aePage.loginToYourAccountText.isDisplayed());
//6. Enter correct email address and password
        aePage.loginEmail.sendKeys(ConfigReader.getProperty("email"));
        aePage.loginPassword.sendKeys(ConfigReader.getProperty("password"));
//7. Click 'login' button
        aePage.loginButton.click();
//8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(aePage.loggedInName.isDisplayed());
//    10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//    11. Verify ' Logged in as username' at top
//    12.Click 'Cart' button
        aePage.cart.click();
        aePage.proceedToCheckout.click();
        aePage.placeOrder.click();
        aePage.nameOnCard.sendKeys("aaa"+ Keys.TAB+"12345678901"+Keys.TAB+"311"+Keys.TAB+"11"+Keys.TAB+"2024");
//        Actions actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN);
//        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true);",aePage.payAndConfirm);
        aePage.payAndConfirm.click();
        String expected1 = "Congratulations! Your order has been confirmed!";
        Assert.assertEquals(aePage.orderSuccessfully.getText(),expected1);
        aePage.downloadInvoice.click();

     File f = new File("C:\\Users\\FURKAN\\Downloads\\invoice.txt");
      Assert.assertTrue(f.exists());
//        String path = "C:\\Users\\FURKAN\\Downloads\\invoice";
//        boolean isFileExist = Files.exists(Paths.get(path));


//    13. Click 'Proceed To Checkout' button
//    14. Verify Address Details and Review Your Order
//    15. Enter description in comment text area and click 'Place Order'
//    16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//    17. Click 'Pay and Confirm Order' button
//    18. Verify success message 'Your order has been placed successfully!'
//    19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
//    20. Click 'Continue' button
//    21. Click 'Delete Account' button
//    22. Verify 'ACCOUNT DELETED!' and click 'Continue' button

    }


}
