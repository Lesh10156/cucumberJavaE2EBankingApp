package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountsPage {

    WebDriver driver;

    @FindBy(xpath = "//strong[contains(.,'Welcome Harry Potter !!')]")
    WebElement welcomeMessage_xpath;


    @FindBy(xpath = "//button[@ng-class='btnClass2'][contains(.,'Deposit')]")
    WebElement firstDepositButton_xpath;

    @FindBy(xpath = "//input[contains(@ng-model,'amount')]")
    WebElement captureAmountField_xpath;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Deposit')]")
    WebElement secondDepositButton_xpath;

    @FindBy(xpath = "//span[contains(.,'Deposit Successful')]")
    WebElement successfulDeposit_xpath;

    @FindBy(xpath = "//button[contains(.,'Logout')]")
    WebElement logOutButton_xpath;

    @FindBy(xpath = "//select[contains(@id,'accountSelect')]")
    WebElement accountDropdown_xpath;

    @FindBy(xpath = "//strong[contains(.,'Welcome Neville Longbottom !!')]")
    WebElement getWelcomeMessage_xpath;


    public AccountsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyUserIsOnWelcomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(welcomeMessage_xpath));
        welcomeMessage_xpath.isDisplayed();
    }

    public void clickFirstDepositButton() {
        firstDepositButton_xpath.click();
    }

    public void UserDepositAmount() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(captureAmountField_xpath));
        captureAmountField_xpath.sendKeys("1500");
    }

    public void clickSecondDepositButton() {
        secondDepositButton_xpath.click();
    }

    public void validateThatDepositWasSuccessful() {
        successfulDeposit_xpath.isDisplayed();
    }

    public void clickLogOutButton() {
        logOutButton_xpath.click();
    }
    public void welcomeMessage(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(getWelcomeMessage_xpath));
        getWelcomeMessage_xpath.isDisplayed();
    }


    public void clickAccountDropDown() {
        accountDropdown_xpath.click();
    }

    public void userSelectSecondAccount() {
        Select dropdown1 = new Select(accountDropdown_xpath);
        dropdown1.selectByIndex(1);
    }

    public void userSelectThirdAccount() {
        Select dropdown2 = new Select(accountDropdown_xpath);
        dropdown2.selectByIndex(2);
    }


}
