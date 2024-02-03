package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import selenium.Base;

public class CalendarDropdowns extends Base {

    @Test
    public void testCheapOair() throws InterruptedException {
        driver.get("https://www.cheapoair.com/");
        String myUrl = driver.getCurrentUrl();
        System.out.println(myUrl);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='suggestion-box__clear icon'])[1]")).click();
        Thread.sleep(1000);
        WebElement box1= driver.findElement(By.xpath("//div[@class='widget__input is-active']//input[@id='from0']"));
        box1.sendKeys("Washington");
        Thread.sleep(1000);
        box1.sendKeys(Keys.ENTER);

        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//a[@class='suggestion-box__clear icon'])[2]")).click();
        driver.findElement(By.xpath("(//a[@aria-label='clear field'])[2]")).click();
        Thread.sleep(1000);
        WebElement box2 = driver.findElement(By.xpath("//input[@id='to0']"));
        box2.click();
        box2.sendKeys("Uzbekistan");

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class=' month-date is--today'])")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//a[@class=' month-date'])[7]")).click();

        //Select travellers
        driver.findElement(By.id("travellerButton")).click();
        Thread.sleep(500);

        //add child
        driver.findElement(By.id("addchild")).click();

        Select childAgeDropdowns = new Select(driver.findElement(By.name("ChildrenAge")));
        childAgeDropdowns.selectByIndex(4);

        Thread.sleep(500);
        driver.findElement(By.id("closeDialog")).click();
        Thread.sleep(500);
        driver.findElement(By.id("searchNow")).click();


    }





}
