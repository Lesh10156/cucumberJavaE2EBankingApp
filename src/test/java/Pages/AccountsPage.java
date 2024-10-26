package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

    @FindBy(xpath = "//span[@class='fontBig ng-binding'][contains(.,'Ron Weasly')]")
    WebElement verifyWelcomeMessage_xpath;


    @FindBy(xpath = "//button[contains(.,'Transactions')]")
    WebElement transactionsButton_xpath;

    @FindBy(xpath = "(//td[@class='ng-binding'][contains(.,'31459')])[1]")
    WebElement depositedAmount_xpath;

    @FindBy(xpath = "//button[@class='btn'][contains(.,'Back')]")
    WebElement backButton_xpath;

    @FindBy(xpath = "//button[@ng-class='btnClass3'][contains(.,'Withdrawl')]")
    WebElement withdrawalButton_xpath;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Withdraw')]")
    WebElement withdrawSubmitButton_xpath;

    @FindBy(xpath = "(//td[@class='ng-binding'][contains(.,'31459')])[2]")
    WebElement withdrawnAmount_xpath;

    @FindBy(xpath = "(//strong[contains(.,'0')])[2]")
    WebElement originalBalance_xpath;




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

    public void welcomeMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(getWelcomeMessage_xpath));
        getWelcomeMessage_xpath.isDisplayed();
    }


    public void clickAccountDropDown() {
        accountDropdown_xpath.getText();
    }

    public void userSelectSecondAccount() {
        Select dropdown1 = new Select(accountDropdown_xpath);
        dropdown1.selectByIndex(1);
    }

    public void userSelectThirdAccount() {
        Select dropdown2 = new Select(accountDropdown_xpath);
        dropdown2.selectByIndex(2);
    }

    public void verifyWelcomeMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(verifyWelcomeMessage_xpath));
        verifyWelcomeMessage_xpath.getText();
    }


    public void UserDepositsAnAmount() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(captureAmountField_xpath));
        captureAmountField_xpath.sendKeys("31459");
    }

    public void userClicksTransactionButton() {
        transactionsButton_xpath.click();


    }

    public void verifyDepositedAmount() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(depositedAmount_xpath));
        depositedAmount_xpath.isDisplayed();

    }

    public void clickBackButton() {
        backButton_xpath.click();

    }

    public void clickWithdrawalButton() {
        withdrawalButton_xpath.click();

    }

    public void userWithdrawsAnAmount() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(captureAmountField_xpath));
        captureAmountField_xpath.sendKeys("31459");

    }

    public void clickWithdrawSubmitButton() {
        withdrawSubmitButton_xpath.click();

    }

    public void compareOriginalBalanceAndCurrentBalance() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(originalBalance_xpath));
        originalBalance_xpath.isDisplayed();
       /* new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(originalBalance_xpath));
        String original = originalBalance_xpath.getText();

        String replaceFrontText = original.replace("Account Number : 1007 , 	Balance : ", "");

        String replaceBackText = replaceFrontText.replace(" 	Currency : Dollar", "");

        double originalBalance = Double.parseDouble(replaceBackText);

        Assert.assertTrue(originalBalance == 0);*/



    }

    public void verifyWithdrawnAmount() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(withdrawnAmount_xpath));
        withdrawnAmount_xpath.isDisplayed();

    }

}

