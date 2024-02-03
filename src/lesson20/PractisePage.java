package lesson20;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.Base;

import java.util.Set;

public class PractisePage extends Base {

    @Test
    public void testPractisePage() throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");

        driver.findElement(By.id("alertbtn")).click();
        //alert pupped up:
        Alert alertPopup = driver.switchTo().alert();
        String test = alertPopup.getText();
        System.out.println(test);
        alertPopup.accept();


        //dismiss confirmbtn
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();

        //Write into search box of iframe
        driver.switchTo().frame(0);
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys("test");

        //Click on checkbox
        driver.findElement(By.id("bmwcheck")).click();
    }
        @Test
    public void testIframe(){
        driver.get("https://www.letskodeit.com/practice");
            //Click on checkbox
            driver.findElement(By.id("bmwcheck")).click();
            //Write into search box of iframe
            //driver.switchTo().frame("courses-iframe");
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://www.letskodeit.com/courses']")));
            driver.findElement(By.xpath("//a[text()='Sign In']")).click();

            driver.switchTo().defaultContent();
            driver.findElement(By.id("benzcheck")).click();

        }

        //handling child windows:
    @Test
    public void handlingChildWindows (){
        driver.get("https://www.letskodeit.com/practice");

        String parentWindId= driver.getWindowHandle();
        System.out.println("Parent Id:" + parentWindId);

        //Open the child window
        driver.findElement(By.id("openwindow")).click();

        Set<String> winHandles = driver.getWindowHandles();
        System.out.println(winHandles);
        driver.findElement(By.xpath("(//a[text()='Sign In'])[2]")).click();
    }

}
