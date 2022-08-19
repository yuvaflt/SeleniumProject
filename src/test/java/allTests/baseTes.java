package allTests;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.time.Duration;

public class baseTes {
    WebDriver driver;
    @BeforeTest
    public  void SetUp(){
        Browser.setDriver();
        driver=Browser.getDriver();
        driver.navigate().to(Browser.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public HomePage satrtHomePage(){
        return PageFactory.initElements(driver,HomePage.class);
    }
}
