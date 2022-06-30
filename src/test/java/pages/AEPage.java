package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AEPage {

    public AEPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
//For Test Case 24 *****************************************************************************************************
@FindBy(xpath = "//*[@href='/view_cart']")
public WebElement cart;
@FindBy(xpath = "//*[@class='active']")
public WebElement verifyCart;
@FindBy(xpath = "//*[@href='/product_details/1']")
public WebElement viewProduct;
    @FindBy(xpath = "//*[@class='btn btn-default cart']")
    public WebElement addToCart;
    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;
    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLogin;
    @FindBy(xpath = "//*[@href='/payment']")
    public WebElement placeOrder;
    @FindBy(xpath = "//*[@name='name_on_card']")
    public WebElement nameOnCard;
    @FindBy(id = "submit")
    public WebElement payAndConfirm;
    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement orderSuccessfully;
    @FindBy(xpath = "//*[@href='/download_invoice/500']")
    public WebElement downloadInvoice;
    @FindBy(xpath = "//*[text()='Invoice.txt']")
    public WebElement invoiceName;
//**********************************************************************************************************************

//Login Page
    @FindBy(xpath="//*[@href='/login']")
    public WebElement firstSignupLoginButton;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "(//*[@type='email'])[1]")
    public WebElement loginEmail;

    @FindBy(xpath = "(//*[@type='password'])[1]")
    public WebElement loginPassword;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()=\" Logged in as \"]/b")
    public WebElement loggedInName;

//Sign Up Page

    @FindBy(xpath ="//*[@data-qa='signup-name']")
    public WebElement name;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement emailAddress;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement title;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='days']")
    public WebElement day;

    @FindBy(xpath = "//*[@id='months']")
    public WebElement month;

    @FindBy(xpath = "//*[@id='years']")
    public WebElement year;

    @FindBy(xpath = "//*[@id='newsletter']")
    public WebElement newsletter;

    @FindBy(xpath = "//*[@id='optin']")
    public WebElement optin;

    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//*[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//*[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//*[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//*[@id='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@id='mobile_number']")
    public WebElement mobileNumber;

    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(className = "//*[@data-qa='continue-button']")
    public WebElement continueButton;





//Delete Account
    @FindBy(xpath = "//*[@href='/delete_account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()=\"Delete\"]")
    public WebElement secondDeleteButton;

    @FindBy(xpath = "(//*[text()=\"Delete Account\"])[2]")
    public WebElement DeleteAccountText;

//Logout Button
    @FindBy (xpath = "//*[(text()=' Logout')]")
    public WebElement logoutButton;



}





