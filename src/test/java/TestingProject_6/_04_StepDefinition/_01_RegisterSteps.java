package TestingProject_6._04_StepDefinition;

import TestingProject_6.Utilities.BaseDriver;
import TestingProject_6._02_Pages.BodyRight;
import TestingProject_6._02_Pages.SideBarLeft;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps {
    BodyRight bd = new BodyRight();
    SideBarLeft sb=new SideBarLeft();

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {

        BaseDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Register username and password")
    public void registerUsernameAndPassword() {
        sb.clickFunction(sb.regButton);
        bd.sendKeysEnter(bd.firstname, "Talhaaa");
        bd.sendKeysEnter(bd.lastname,"Balabanbnn");
        bd.sendKeysEnter(bd.address,"Anamur");
        bd.sendKeysEnter(bd.city,"Mersin");
        bd.sendKeysEnter(bd.state,"Akdeniz");
        bd.sendKeysEnter(bd.zipCode,"33000");
        bd.sendKeysEnter(bd.phoneNumber,"123456789");
        bd.sendKeysEnter(bd.snn,"555555");
        bd.sendKeysEnter(bd.customerUsername,"talha723sas");
        bd.sendKeysEnter(bd.customerPassword,"bbn23zxz");
        bd.sendKeysEnter(bd.customerConfirmPassword,"bbn23zxz");
        bd.clickFunction(bd.registerButton);

    }

    @Then("User should register succesfully")
    public void userShouldRegisterSuccesfully() {

        bd.verifyMessage(bd.messageLocater,"Your account was created successfully. You are now logged in");

    }
}
