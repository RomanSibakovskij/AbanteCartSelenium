package com.abantecart.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class RegisterPage extends BasePage{

    //register page title web element
    @FindBy(xpath = "//div[@class='content-main-section']//h1")
    private WebElement createAccountTitle;

    //input fields web elements
    @FindBy(xpath = "//div[@class='card-body']//input[@name='firstname']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span")
    private WebElement inputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='lastname']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='email']")
    private WebElement emailAddressInputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='telephone']")
    private WebElement phoneNumberInputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='company']")
    private WebElement companyInputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='address_1']")
    private WebElement address1InputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='address_2']")
    private WebElement address2InputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='city']")
    private WebElement cityInputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='postcode']")
    private WebElement zipCodeInputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='loginname']")
    private WebElement loginNameInputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//div[@class='card-body']//input[@name='confirm']")
    private WebElement confirmPasswordInputField;

    //dropdown menu web elements
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_zone_id']")
    private WebElement regionDropdownMenu;
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_country_id']")
    private WebElement countryDropdownMenu;

    //checkbox web elements
    @FindBy(xpath = "//div[@class='card-body']//input[@id='AccountFrm_newsletter1']")
    private WebElement subscribeToNewsletterCheckbox;
    @FindBy(xpath = "//div[@class='card-body']//input[@id='AccountFrm_newsletter0']")
    private WebElement doNotSubscribeToNewsletterCheckbox;
    @FindBy(xpath = "//div[@class='prod-option']//input[@id='AccountFrm_agree']")
    private WebElement privacyPolicyCheckbox;

    //continue button web element (activates after privacy policy checkbox activation on click)
    @FindBy(xpath = "//div[@class='ps-4 p-3 col-12 d-flex flex-wrap']//button[@type='submit']")
    private WebElement continueButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    //register page title getter
    public String getCreateAccountTitle() {return createAccountTitle.getText();}

    //register page web element asser methods
    public boolean isFirstNameInputFieldDisplayed(){return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed(){return lastNameInputField.isDisplayed();}
    public boolean isEmailAddressInputFieldDisplayed(){return emailAddressInputField.isDisplayed();}
    public boolean isPhoneInputFieldDisplayed(){return phoneNumberInputField.isDisplayed();}
    public boolean isCompanyInputFieldDisplayed(){return companyInputField.isDisplayed();}
    public boolean isAddress1InputFieldDisplayed(){return address1InputField.isDisplayed();}
    public boolean isAddress2InputFieldDisplayed(){return address2InputField.isDisplayed();}
    public boolean isCityInputFieldDisplayed(){return cityInputField.isDisplayed();}
    public boolean isZipCodeInputFieldDisplayed(){return zipCodeInputField.isDisplayed();}
    public boolean isLoginNameInputFieldDisplayed(){return loginNameInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isConfirmPasswordInputFieldDisplayed(){return confirmPasswordInputField.isDisplayed();}
    public boolean isRegionDropdownMenuDisplayed(){return regionDropdownMenu.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed(){return countryDropdownMenu.isDisplayed();}
    public boolean isSubscribeToNewsletterCheckboxDisplayed(){return subscribeToNewsletterCheckbox.isDisplayed();}
    public boolean isDoNotSubscribeToNewsletterCheckboxDisplayed(){return doNotSubscribeToNewsletterCheckbox.isDisplayed();}
    public boolean isPrivacyPolicyCheckboxDisplayed(){return privacyPolicyCheckbox.isDisplayed();}
    public boolean isContinueButtonDisplayed(){return continueButton.isDisplayed();}

}
