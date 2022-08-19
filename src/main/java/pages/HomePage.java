package pages;

import browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

import static browser.Browser.getPropertyValue;

public class HomePage {
    WebDriver driver= Browser.getDriver();
    @FindBy(linkText = "Register") private WebElement registerLink;
    @FindBy(id ="customer.firstName")private WebElement userName;
    @FindBy(id ="customer.lastName")private WebElement lastNAme;
    @FindBy(id ="customer.address.street")private WebElement adress;
    @FindBy(id ="customer.address.city")private WebElement City;
    @FindBy(id ="customer.address.state")private WebElement State;
    @FindBy(id ="customer.address.zipCode")private WebElement ZipCode;
    @FindBy(id ="customer.phoneNumber")private WebElement Phone;
    @FindBy(id ="customer.ssn")private WebElement SSN;
    @FindBy(id ="customer.username")private WebElement customerUserNAme;
    @FindBy(id ="customer.password")private WebElement password;
    @FindBy(id ="repeatedPassword")private WebElement condirm;
    @FindBy(css="input[value='Register']")private WebElement registerButton;
    public OverviewPage RegisterUser(){
        String info= getPropertyValue("Info");
        registerLink.click();
        userName.sendKeys(info);
        lastNAme.sendKeys(info);
        adress.sendKeys(info);
        City.sendKeys(info);
        State.sendKeys(info);
        ZipCode.sendKeys(info);
        Phone.sendKeys(info);
        SSN.sendKeys(info);
        customerUserNAme.sendKeys(info);
        password.sendKeys(info);
        condirm.sendKeys(info);
        registerButton.click();
        return PageFactory.initElements(Browser.getDriver(),OverviewPage.class);
    }
//    public void TakeScreenShot(){
//
//
//    }
}
