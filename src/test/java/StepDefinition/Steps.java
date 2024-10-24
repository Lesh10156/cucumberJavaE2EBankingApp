package StepDefinition;

import Pages.AccountsPage;
import Utils.Base;
import io.cucumber.java.en.*;


public class Steps extends Base {

    @Given("the user is on homepage")
    public void the_user_is_on_homepage() {
        loginpage.verifyCustomerLogin();
    }

    @When("user clicks customer login button")
    public void user_clicks_customer_login_button() {
        loginpage.clickCustomerLoginButton();
    }

    @Then("user clicks dropdown arrow")
    public void user_clicks_dropdown_arrow() {
        customerPage.clickCustomerDropDown();
    }

    @And("user selects a user name {string}")
    public void user_selects_a_user_name(String string) {
        customerPage.selectNameOnDropDown();
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        customerPage.clickLoginButton();
    }


    @Then("user is on welcome page")
    public void user_is_on_welcome_page() {
        accountPage.verifyUserIsOnWelcomePage();
    }


    @Then("user click on deposit button")
    public void user_click_on_deposit_button() {
        accountPage.clickFirstDepositButton();
    }

    @And("user deposits an amount(.*)$")
    public void user_deposits_an_amount(String depositAmount) {
        accountPage.UserDepositAmount();


    }

    @And("user clicks on deposit button")
    public void user_clicks_on_deposit_button() {
        accountPage.clickSecondDepositButton();
    }

    @Then("user validate that the deposit was successful")
    public void user_validate_that_the_deposit_was_successful() {
        accountPage.validateThatDepositWasSuccessful();
    }


    @Then("User logout")
    public void user_logout() {
        accountPage.clickLogOutButton();
    }


    //Scenario 2
    @Given("User is on homepage")
    public void user_is_on_homepage() {
        loginpage.verifyCustomerLogin();
    }

    @When("the user clicks customer login button")
    public void the_user_clicks_customer_login_button() {
        loginpage.clickCustomerLoginButton();
    }

    @Then("the user clicks dropdown arrow")
    public void the_user_clicks_dropdown_arrow() {
        customerPage.clickCustomerDropDown();
    }

    @And("the user selects a user name {string}")
    public void the_user_selects_a_user_name(String string) {
        customerPage.selectLastNameOnDropDown();
    }

    @Then("the user clicks on login button")
    public void the_user_clicks_on_login_button() {
        customerPage.clickLoginButton();
    }

    @Then("the user is on welcome page")
    public void the_user_is_on_welcome_page() {
        accountPage.welcomeMessage();
    }

    @Then("user click on first deposit button")
    public void user_click_on_first_deposit_button() {
        accountPage.clickFirstDepositButton();
    }

    @And("user deposits first amount {int}")
    public void user_deposits_first_amount(Integer int1) {
        accountPage.UserDepositAmount();
    }

    @And("user clicks on Second deposit button")
    public void user_clicks_on_second_deposit_button() {
        accountPage.clickSecondDepositButton();
    }

    @And("the user validate that the deposit was successful")
    public void the_user_validate_that_the_deposit_was_successful() {
        accountPage.validateThatDepositWasSuccessful();
    }

    @Then("user clicks account dropdown")
    public void user_clicks_account_dropdown() {
        accountPage.clickAccountDropDown();
    }

    @And("user select second account")
    public void user_select_second_account() {
        accountPage.userSelectSecondAccount();
    }

    @Then("the user click on first deposit button")
    public void the_user_click_on_first_deposit_button() {
        accountPage.clickFirstDepositButton();
    }

    @And("user deposits second amount {int}")
    public void user_deposits_second_amount(Integer int1) {
        accountPage.UserDepositAmount();
    }

    @And("the user clicks on second deposit button")
    public void the_user_clicks_on_second_deposit_button() {
        accountPage.clickSecondDepositButton();
    }

    @And("the user validates that the deposit was successful")
    public void the_user_validates_that_the_deposit_was_successful() {
        accountPage.validateThatDepositWasSuccessful();
    }

    @Then("user clicks accounts dropdown")
    public void user_clicks_accounts_dropdown() {
        accountPage.clickAccountDropDown();
    }

    @And("user select third account")
    public void user_select_third_account() {
        accountPage.userSelectThirdAccount();
    }

    @Then("user click on first deposits button")
    public void user_click_on_first_deposits_button() {
        accountPage.clickFirstDepositButton();
    }

    @And("user deposits third amount {int}")
    public void user_deposits_third_amount(Integer int1) {
        accountPage.UserDepositAmount();
    }

    @And("the user clicks second deposit button")
    public void the_user_clicks_second_deposit_button() {
        accountPage.clickSecondDepositButton();
    }

    @And("the user validate that the deposit is successful")
    public void the_user_validate_that_the_deposit_is_successful() {
        accountPage.validateThatDepositWasSuccessful();
    }

    @Then("the User logout")
    public void the_user_logout() {
        accountPage.clickLogOutButton();
    }


}




