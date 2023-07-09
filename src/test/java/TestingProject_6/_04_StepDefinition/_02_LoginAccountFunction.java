package TestingProject_6._04_StepDefinition;

import TestingProject_6.Utilities.BaseDriver;
import TestingProject_6._02_Pages.BodyRight;
import TestingProject_6._02_Pages.SideBarLeft;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginAccountFunction {
    BodyRight bd   =   new BodyRight();
    SideBarLeft sb  =   new SideBarLeft();
    @Given("Login to Parabank")
    public void loginToParabank() {
        BaseDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Login username and password")
    public void loginUsernameAndPassword() {
        sb.sendKeysEnter(sb.loginInput, "talha723sas");
        sb.sendKeysEnter(sb.passwordInput,"bbn23zxz");
        sb.clickFunction(sb.loginBtn);
    }

    @Then("User should register succesfully and logout")
    public void userShouldRegisterSuccesfullyAndLogout() {
        sb.verifyMessage(sb.logOutBtn,"Log Out");
        sb.clickFunction(sb.logOutBtn);
    }

    @Then("User should username login mistake and verify")
    public void userShouldUsernameLoginMistakeAndVerify() {
        sb.sendKeysEnter(sb.loginInput, "mistakeUser1s");
        sb.sendKeysEnter(sb.passwordInput,"bbn23zxz");
        sb.clickFunction(sb.loginBtn);
        sb.verifyMessage(bd.messageLocater,"The username and password could not be verified.");
    }

    @Then("User should password login mistake and verify")
    public void userShouldPasswordLoginMistakeAndVerify() {
        sb.sendKeysEnter(sb.loginInput, "talha723sas");
        sb.sendKeysEnter(sb.passwordInput,"asadgsvsd54");
        sb.clickFunction(sb.loginBtn);
        sb.verifyMessage(bd.messageLocater,"The username and password could not be verified.");
    }
}
