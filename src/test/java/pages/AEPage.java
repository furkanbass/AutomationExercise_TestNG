package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AEPage {

    public AEPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }


    @FindBy(xpath="//*[@href='/login']")
    public WebElement firstSignupLoginButton;

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

    @FindBy(xpath = "//*[@href='/delete_account']")
    public WebElement deleteAccount;

}





