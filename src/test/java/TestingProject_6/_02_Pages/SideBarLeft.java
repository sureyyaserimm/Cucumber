package TestingProject_6._02_Pages;


import TestingProject_6.Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBarLeft extends home {

    public SideBarLeft(){
        PageFactory.initElements(BaseDriver.getDriver(),this);

    }
    @FindBy(xpath ="//a[text()='Register']")
    public WebElement regButton;

    @FindBy(xpath ="//input[@name='username']")
    public WebElement loginInput;

    @FindBy(xpath ="//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(css ="[value='Log In']")
    public WebElement loginBtn;

    @FindBy(xpath= "//*[text()='Log Out']")
    public WebElement logOutBtn;

    @FindBy(xpath= "//a[text()='Bill Pay']")
    public WebElement billPayBtn;





}
