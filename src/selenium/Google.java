package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google extends Base {

    @Parameters({"googleUrl"})
    @Test
    public  void testProductSearchAndAddToCart(String url) throws InterruptedException {
        driver.get(url);
        String myUrl = driver.getCurrentUrl();
        driver.navigate().to("https://www.amazon.com/");
        myUrl = driver.getCurrentUrl();
        System.out.println(myUrl);
        Thread.sleep(2000);
        driver.findElement(By.id("nav-link-groceries")).click();
        driver.findElement(By.className("a-button-text")).click();
        driver.findElement(By.xpath("(//div[@id='anonCarousel1']//input[@class='a-button-input'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='nav-subnav']//a[@class='nav-a nav-hasArrow'][3]")).click();
        driver.findElement(By.xpath("(//div[@id='anonCarousel1']//span[@class='a-button-inner'])[7]")).click();
        driver.findElement(By.xpath("(//div[@id='nav-tools']//span[@class='nav-line-2'])[3]")).click();
        Select firstItemNumDropDown = new Select(driver.findElement(By.xpath("(//select[@name='quantity'])[1]")));
        firstItemNumDropDown.selectByIndex(3);
//        driver.findElement(By.xpath("//span[@class='a-button-inner']//span[@class='a-button-text a-declarative'])[1]")).click();
    }

//    @Test
    public  void test1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        String myUrl = driver.getCurrentUrl();
        driver.navigate().to("https://www.amazon.com/");
        myUrl = driver.getCurrentUrl();
        System.out.println(myUrl);
        Thread.sleep(2000);
        driver.findElement(By.id("nav-link-groceries")).click();
        driver.findElement(By.className("a-button-text")).click();
        driver.findElement(By.xpath("(//div[@id='anonCarousel1']//input[@class='a-button-input'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='nav-subnav']//a[@class='nav-a nav-hasArrow'][3]")).click();
        driver.findElement(By.xpath("(//div[@id='anonCarousel1']//span[@class='a-button-inner'])[7]")).click();
        driver.findElement(By.xpath("(//div[@id='nav-tools']//span[@class='nav-line-2'])[3]")).click();
        Select firstItemNumDropDown = new Select(driver.findElement(By.xpath("(//select[@name='quantity'])[1]")));
        firstItemNumDropDown.selectByIndex(3);
//        driver.findElement(By.xpath("//span[@class='a-button-inner']//span[@class='a-button-text a-declarative'])[1]")).click();
    }

}

