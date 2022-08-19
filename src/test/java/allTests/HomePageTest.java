package allTests;

import browser.Browser;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;
@Listeners(value =TestNgListner.class )

public class HomePageTest extends baseTes{
    WebDriver driver= Browser.getDriver();

    @Test
    public  void Test(){
        System.out.println("this is a test");
//        PageFactory.initElements(Browser.getDriver(), HomePage.class).LogIN();
        satrtHomePage().RegisterUser();
        Assert.assertEquals(4,6);



    }
}
