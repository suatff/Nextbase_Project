package com.nextbase.pages;

import com.nextbase.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    public LoginPage(){PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy (xpath = "//input[@name='USER_LOGIN']")
    public WebElement inputLogin;

        @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

        @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

        @FindBy(xpath = "//span[.='Message']")
    public WebElement messageButton;

        @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement messageField;

        @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;
        @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMoreButton;
        @FindBy(xpath = "//div[.='Hello World']")
    public WebElement verifyMessage;

        @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement recipientAllEmployees;

        @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement closeButtonInRecipient;

        @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addPersonsGroupsOrDepartment;

        @FindBy(xpath = "//a[@class='bx-finder-box-item-t7 bx-finder-element bx-finder-box-item-t7-hover bx-lm-element-groups']")
    public WebElement allEmployeesAsRecipient;

        @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

        @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement theMessageError;

        @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement theRecipientErrorMessage;

        @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement recipientField;

        @FindBy(xpath= "//a[@href='#switchTab']")
    public List<WebElement> recipientsGroup;




    }

