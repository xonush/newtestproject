package lesson22;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.Base;

import java.time.Duration;


public class ExpliciyWaitDemo extends Base {

   // @Test
    public void testAlert(){
         driver.get("file:///C:/Users/xonus/Downloads/Telegram%20Desktop/waits.html");
//        driver.get("https://google.com");


        driver.findElement(By.id("alert")).click();//alert will pop up

        wait.until(ExpectedConditions.alertIsPresent());
        //accept to alert
        driver.switchTo().alert().accept();

    }
    @Test
    public void testTextChanges(){
        driver.get("file:///C:/Users/xonus/Downloads/Telegram%20Desktop/waits.html");
        driver.findElement(By.id("populate-text")).click();


        wait.until(ExpectedConditions.textToBe(By.id("h2"), "Selenium Webdriver"));
        String text = driver.findElement(By.id("h2")).getText();
        Assert.assertEquals(text,"Selenium Webdriver", "Text massage did not match");




    }





}

