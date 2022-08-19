package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage {
    @FindBy(linkText = "Open New Account")private WebElement openNewAccount;

    public void ClickOpenAccountLink(){
        openNewAccount.click();
    }
}
