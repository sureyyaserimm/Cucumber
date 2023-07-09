package TestingProject_6._02_Pages;

import TestingProject_6.Utilities.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class home {
    WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),Duration.ofSeconds(30));

    public void sendKeysEnter(WebElement item, String text)
    {
        waitUntilVisible(item);
        scrollToItem(item);
        item.clear();
        item.sendKeys(text);
    }
    public void clickFunction(WebElement item) {
        waitUntilClickable(item);
        scrollToItem(item);
        item.click();
    }

    public void verifyMessage(WebElement item, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(item, value));
        Assert.assertTrue(item.getText().toLowerCase().contains(value.toLowerCase()), "no such TEXT");
        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void scrollToItem(WebElement item){
        JavascriptExecutor js=(JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", item);
    }

    public void waitUntilVisible(WebElement item){
        wait.until(ExpectedConditions.visibilityOf(item));
    }

    public void waitUntilClickable(WebElement item){
        wait.until(ExpectedConditions.elementToBeClickable(item));
    }
}
