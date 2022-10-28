package com.nextbase.step_definitions;

import com.github.javafaker.Faker;
import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.ConfigurationReaders;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Message_Functionality_StepDefinition {

    LoginPage loginPage=new LoginPage();
    Faker faker = new Faker();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReaders.getProperty("env"));
    }

    @When("user enters {string},{string}")
    public void userEnters(String username, String pw) {
        loginPage.inputLogin.sendKeys(username);
        loginPage.inputPassword.sendKeys(pw);
    }

    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        loginPage.loginButton.click();
    }


    @When("user click on the message")
    public void user_click_on_the_message() {
        loginPage.messageButton.click();

    }
    @Then("user enters something in the field")
    public void user_enters_something_in_the_field() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        loginPage.messageField.sendKeys(faker.chuckNorris().fact().replaceAll("Chuck Norris", "Kamuran"));
        Driver.getDriver().switchTo().parentFrame();

    }

    @Then("user send to message")
    public void user_send_to_message() {
        loginPage.sendButton.click();
    }




    @Then("user se {string} is default")
    public void userSeIsDefault(String string) {
        String defaultRecipient=loginPage.recipientAllEmployees.getText();
        Assert.assertTrue(defaultRecipient.contains(string));
    }

    @And("user can delete {string} from recipients")
    public void userCanDeleteFromRecipients(String string) {
        loginPage.closeButtonInRecipient.click();

    }

    @And("user add a recipient")
    public void userAddaRecipient() {
        loginPage.addPersonsGroupsOrDepartment.click();
        loginPage.allEmployeesAsRecipient.click();
    }


    @Then("user click to cancel button")
    public void userClickToCancelButton() {
        loginPage.cancelButton.click();
    }

    @Then("user se the blank message field")
    public void userSeTheBlankMessageField() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        Assert.assertTrue(null, Boolean.parseBoolean(loginPage.messageField.getText()));
        Driver.getDriver().switchTo().parentFrame();


    }

    @Then("user se the error message on the screen")
    public void userSeTheMessageOnTheScreen() {
        Assert.assertTrue(loginPage.theMessageError.isDisplayed());
    }

    @Then("user se the recipient error message on the screen")
    public void userSeTheRecipientErrorMessageOnTheScreen() {
        Assert.assertTrue(loginPage.theRecipientErrorMessage.isDisplayed());
    }

    @And("user click add more button in the recipients field")
    public void userClickAddMoreButtonInTheRecipientsField() {
        loginPage.addMoreButton.click();
    }

    @Then("user can se recipient groups")
    public void userCanSeRecipientGroups() {
        List<WebElement>allRecipient=Driver.getDriver().findElements(By.xpath("//a[@href='#switchTab']"));

        for (WebElement each:allRecipient){
            Assert.assertTrue(each.isDisplayed());
        }

    }


    @And("user add a new recipient")
    public void userAddANewRecipient() {
        loginPage.recipientField.sendKeys(faker.internet().emailAddress());
    }


}
