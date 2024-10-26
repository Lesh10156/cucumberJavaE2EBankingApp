package Pages;

import freemarker.template.utility.NullArgumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utils.Base;

import java.time.Duration;
import java.util.List;

public class CustomerPage {

    static WebDriver driver;

    @FindBy(xpath = "//label[contains(.,'Your Name :')]")
    WebElement yourName_xpath;

    @FindBy(xpath = "//select[contains(@id,'userSelect')]")
    WebElement customerDropDown_xpath;


    @FindBy(xpath = "//button[@class='btn btn-default'][contains(.,'Login')]")
    WebElement loginButton_xpath;

    public CustomerPage(WebDriver driver) {
        CustomerPage.driver = driver;
    }


    public void verifyYourNameText() {
        yourName_xpath.isDisplayed();


    }



    public void clickCustomerDropDown() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(customerDropDown_xpath));
        customerDropDown_xpath.click();
    }


    public void selectNameOnDropDown(){

        Select dropdown = new Select(customerDropDown_xpath);
        dropdown.selectByIndex(2);

    }

    public void selectLastNameOnDropDown(){

        Select dropdown = new Select(customerDropDown_xpath);
        dropdown.selectByIndex(5);

    }

    public void selectThirdNameOnDropDown(){

        Select dropdown = new Select(customerDropDown_xpath);
        dropdown.selectByIndex(3);

    }


    public void clickLoginButton(){
        loginButton_xpath.click();
    }
}
