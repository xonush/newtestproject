package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XCartWebsite extends Base {

    @Test
    public void testSearchBox() throws InterruptedException {

        driver.get("https://demostore.x-cart.com/");
        String myUrl = driver.getCurrentUrl();
        System.out.println(myUrl);
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.xpath("(//input[@class='validate[maxSize[255]]  form-text'])[1]"));
        searchBox.click();
        searchBox.sendKeys("Watches for women");

        Thread.sleep(2000);
        searchBox.sendKeys(Keys.ENTER);
        WebElement item =driver.findElement(By.xpath("//article[@class='product productid-32 low-stock']"));
        item.click();
         driver.findElement(By.xpath("//button[@class='btn  regular-button regular-main-button add2cart submit']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[@class='item-buttons']//a[@class='regular-main-button checkout']")).click();
        Thread.sleep(3000);
         WebElement sendEmail = driver.findElement(By.xpath("//span[@class='input-field-wrapper input input-text-email']//input[@id='login-email']"));
        sendEmail.click();
        sendEmail.sendKeys("lola12@gmail.com");
        WebElement enterPassword = driver.findElement(By.xpath("//span[@class='input-field-wrapper input input-passwordvisible']//input[@id='login-password']"));
        enterPassword.click();
        enterPassword.sendKeys("lolajon1220");
        driver.findElement(By.xpath("//button[@class='btn  regular-button  submit']")).click();


    }
}
