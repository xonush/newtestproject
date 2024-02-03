package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.Base;

public class Expedia extends Base {

    @Test
    public void testExpedia() throws InterruptedException {
        driver.get("https://www.expedia.com/");
        String myUrl = driver.getCurrentUrl();
        System.out.println(myUrl);
        Thread.sleep(1000);
        WebElement cityName  = driver.findElement(By.xpath("//button[@aria-label='Going to']"));
        cityName.click();
        Thread.sleep(2000);
        driver.findElement(By.id("destination_form_field")).sendKeys("Myrtle Beach");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//button[@class='uitk-button uitk-button-medium uitk-button-fullWidth has-subtext destination_form_field-result-item-button result-item-button'])[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.name("EGDSDateRange-date-selector-trigger")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='uitk-day-button uitk-day-selectable uitk-day-clickable']")).click();

        driver.findElement(By.xpath("(//div[@class='uitk-date-number uitk-date-number-default uitk-type-300 uitk-type-regular'])[4]")).click();
       Thread.sleep(500);
         //driver.findElement(By.xpath("//div[@aria-label='Sunday, January 28, 2024, Selected end date']")).click();
       // driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item']")).click();
        //Thread.sleep(500);
       // driver.findElement(By.xpath("//button[@aria-label='Travelers, 2 travelers, 1 room']")).click();
       // driver.findElement(By.xpath("(//span[@class='uitk-step-input-button'])[4]")).click();
        //driver.findElement(By.id("age-traveler_selector_children_age_selector-0-0")).click();
        //driver.findElement(By.id("traveler_selector_done_button")).click();

       // for(int i=0;i<3;i++){
         //   cityName.sendKeys(Keys.ARROW_DOWN);
       // }
        //cityName.sendKeys(Keys.ENTER);





}}
