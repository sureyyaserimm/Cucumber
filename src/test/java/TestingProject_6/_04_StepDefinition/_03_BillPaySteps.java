package TestingProject_6._04_StepDefinition;

import TestingProject_6.Utilities.BaseDriver;
import TestingProject_6._02_Pages.BodyRight;
import TestingProject_6._02_Pages.SideBarLeft;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaySteps {
    BodyRight bd   =   new BodyRight();
    SideBarLeft sb  =   new SideBarLeft();

    @Then("Click to Bill Pay Button")
    public void clickToBillPayButton() {
        sb.clickFunction(sb.billPayBtn);
    }

    @And("Add invoice {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void addInvoiceAndAndAndAndAndAndAndAnd(String PayeeName, String Address, String City, String State, String ZipCode, String Phone, String Account, String VerifyAccount, String Amount) {
        bd.sendKeysEnter(bd.invoicePayeeName,PayeeName);
        bd.sendKeysEnter(bd.invoiceAddress,Address);
        bd.sendKeysEnter(bd.invoiceCity,City);
        bd.sendKeysEnter(bd.invoiceState,State);
        bd.sendKeysEnter(bd.invoicezipCode,ZipCode);
        bd.sendKeysEnter(bd.invoicephoneNumber,Phone);
        bd.sendKeysEnter(bd.invoiceaccountNumber,Account);
        bd.sendKeysEnter(bd.invoiceverifyAccount,VerifyAccount);
        bd.sendKeysEnter(bd.invoiceAmount,Amount);
        bd.clickFunction(bd.invoicePaymentBtn);
    }

    @When("Verify that invoice have been added")
    public void verifyThatInvoiceHaveBeenAdded() {
        bd.verifyMessage(bd.invoiceSuccessMessage,"successful");
    }
}
