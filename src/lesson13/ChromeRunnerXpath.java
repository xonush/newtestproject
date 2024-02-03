package lesson13;

import org.junit.Before;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeRunnerXpath {

    @Before //it runs before each test method
    public void setup(){

    }


    @Test
    public  void  test1(){
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();//opens chrome browser
        //Move the window to left screen:(do not do it)
        driver.manage().window().setPosition(new Point(-1800,0));
        //Interacting with chrome browser:
        //1]Open certain URL:
        driver.get("https://www.amazon.com/");
    }
    public  void  test2(){

        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().setPosition(new Point(-1800,0));

        driver.get("https://www.google.com/");


    }


}
