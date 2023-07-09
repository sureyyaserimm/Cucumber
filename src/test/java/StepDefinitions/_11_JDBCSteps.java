package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _11_JDBCSteps {
    @Then("Send the query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        //DBden gerekli bilgileri alalım
        ArrayList<ArrayList<String>> dbList = DBUtility.getListData(sorgu);

        DialogContent dc = new DialogContent();
        List<WebElement> UIList = dc.nameList;
        //UI'dan gerekli bilgileri alalım


        for (int i = 0; i < dbList.size(); i++) {
            System.out.print(dbList.get(i).get(1).trim());
            System.out.println("\t" + UIList.get(i).getText().trim());

            Assert.assertEquals(dbList.get(i).get(1).trim(),
                    UIList.get(i).getText().trim());
        }


    }
}
