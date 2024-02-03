package lesson18;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework {
    @Test
    public static void main (String args[]) {
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().setPosition(new Point(-1800,0));

        driver.get("https://www.amazon.com/");

    }

}
