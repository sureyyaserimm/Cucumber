package TestingProject_6._02_Pages;

import TestingProject_6.Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyRight extends home{

    public BodyRight(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(css = "[name='customer.firstName']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@name='customer.lastName']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@name='customer.address.street']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='customer.address.city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='customer.address.state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='customer.phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='customer.ssn']")
    public WebElement snn;

    @FindBy(xpath = "//input[@name='customer.username']")
    public WebElement customerUsername;

    @FindBy(xpath = "//input[@name='customer.password']")
    public WebElement customerPassword;

    @FindBy(css = "[name='repeatedPassword']")
    public WebElement customerConfirmPassword;

    @FindBy(xpath= "//input[@value='Register']")
    public WebElement registerButton;

    @FindBy(xpath= "//div[@id='rightPanel']/p")
    public WebElement messageLocater;

    @FindBy(css= "[name='payee.name']")
    public WebElement invoicePayeeName;
    @FindBy(css= "[name='payee.address.street']")
    public WebElement invoiceAddress;
    @FindBy(css= "[name='payee.address.city']")
    public WebElement invoiceCity;
    @FindBy(css= "[name='payee.address.state']")
    public WebElement invoiceState;
    @FindBy(xpath= "//*[@name='payee.address.zipCode']")
    public WebElement invoicezipCode;
    @FindBy(xpath= "//*[@name='payee.phoneNumber']")
    public WebElement invoicephoneNumber;
    @FindBy(xpath= "//*[@name='payee.accountNumber']")
    public WebElement invoiceaccountNumber;
    @FindBy(xpath= "//*[@name='verifyAccount']")
    public WebElement invoiceverifyAccount;
    @FindBy(xpath= "//*[@name='amount']")
    public WebElement invoiceAmount;
    @FindBy(xpath= "//*[@value='Send Payment']")
    public WebElement invoicePaymentBtn;
    @FindBy(xpath= "(//*[@ng-show='showResult']/p)[1]")
    public WebElement invoiceSuccessMessage;














}
