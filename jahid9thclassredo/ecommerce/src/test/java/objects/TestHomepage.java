package objects;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHomepage extends CommonAPI {

   /* WebDriver driver = null;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/salmaalam/webautomationjahidclass/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

    }*/
    @Test
    public void searchTest () {


        driver.findElement(By.id("search_query_top")).sendKeys("Shoes", Keys.ENTER);
        String actualText = driver.findElement(By.partialLinkText("Printed Chiffon Dress")).getText();
        System.out.println(actualText);


        Assert.assertEquals(actualText, "Printed Chiffon Dress");

    }
    @Test
        public void contactUs(){
        driver.findElement(By.partialLinkText("Contact us")).click();
        String actualTest= driver.findElement(By.className("page-heading")).getText();
        Assert.assertEquals(actualTest,"CUSTOMER SERVICE - CONTACT US");
        System.out.println("Test Passed");

        }

        @AfterMethod
        public void tearDown(){
        driver.close();
        System.out.println("End of the test");

        }
    }




