package com.abantecart.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class RegisterPage extends BasePage{

    //register page title web element
    @FindBy(xpath = "//div[@class='content-main-section']//h1")
    private WebElement createAccountTitle;

    //input fields web elements
    @FindBy(xpath = "//div[@class='card-body']//input[@name='firstname']")
    private WebElement firstNameInputField;
    //invalid input error message web elements
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span")
    private WebElement firstNameInputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Last Name must be between 1 and 32 characters!']")
    private WebElement lastNameInputErrorMessage;
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
    //Illinois state option web element
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_zone_id']/option[@value='3635']")
    private WebElement illinoisOption;
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_country_id']")
    private WebElement countryDropdownMenu;
    //US country option dropdown menu
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_country_id']/option[@value='223']")
    private WebElement usCountryOption;

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

    //account creation confirmation message web element
    @FindBy(xpath = "//div[@class='content-main-section']/h1")
    private WebElement accountConfirmationMessage;

    //valid input data (required input)
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address1;
    private String city;
    private int zipCode;
    private String loginName;
    private String password;
    private String confirmPassword;

    //no singular data input
    private String noFirstName;
    private String noLastName;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //valid user creation input data getter
    public void validUserInputDataGetter(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for valid user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address1: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login name: " + loginName);
        logger.info("Password: " + password);
        logger.info("Confirm password: " + confirmPassword);
    }
    //no singular data input
    //invalid user creation input data getter (no first name)
    public void invalidUserInputDataNoFirstNameGetter(){
        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with no first name): " + "\n");
        logger.info("No first name (for user creation with no first name): " + firstName);
        logger.info("Last name (for user creation with no first name): " + lastName);
        logger.info("Email address (for user creation with no first name): " + emailAddress);
        logger.info("Address1 (for user creation with no first name): " + address1);
        logger.info("City (for user creation with no first name): " + city);
        logger.info("Zip code (for user creation with no first name): " + zipCode);
        logger.info("Login name (for user creation with no first name): " + loginName);
        logger.info("Password (for user creation with no first name): " + password);
        logger.info("Confirm password (for user creation with no first name): " + confirmPassword);
    }
    //invalid user creation input data getter (no last name)
    public void invalidUserInputDataNoLastNameGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        noLastName = "";
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with no last name): " + "\n");
        logger.info("First name (for user creation with no last name): " + firstName);
        logger.info("No last name (for user creation with no last name): " + noLastName);
        logger.info("Email address (for user creation with no last name): " + emailAddress);
        logger.info("Address1 (for user creation with no last name): " + address1);
        logger.info("City (for user creation with no last name): " + city);
        logger.info("Zip code (for user creation with no last name): " + zipCode);
        logger.info("Login name (for user creation with no last name): " + loginName);
        logger.info("Password (for user creation with no last name): " + password);
        logger.info("Confirm password (for user creation with no last name): " + confirmPassword);
    }

    //valid user data input methods
    public void inputValidFirstNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(firstName);
    }
    public void inputValidLastNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(lastName);
    }
    public void inputValidEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(emailAddress);
    }
    public void inputValidAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(address1);
    }
    public void inputValidCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(city);
    }
    public void inputValidZipCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys(String.valueOf(zipCode));
    }
    public void inputValidLoginNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginNameInputField));
        loginNameInputField.sendKeys(loginName);
    }
    public void inputValidPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }
    public void inputValidConfirmPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(password);
    }

    //click region dropdown menu method
    public void clickRegionDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(445));
        wait.until(ExpectedConditions.elementToBeClickable(regionDropdownMenu));
        regionDropdownMenu.click();
    }
    //select 'Illinois' option
    public void selectIllinoisOption(){illinoisOption.click();}

    //click country dropdown menu
    public void clickCountryDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(445));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        countryDropdownMenu.click();
    }
    //select 'United States' option
    public void selectUsOption(){usCountryOption.click();}

    //no singular data input methods
    //invalid user data input methods (no first name)
    public void inputNoFirstNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(noFirstName);
    }
    //invalid user data input methods (no last name)
    public void inputNoLastNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(noLastName);
    }

    //click 'Privacy policy' checkbox method
    public void clickPrivacyPolicyCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(445));
        wait.until(ExpectedConditions.elementToBeClickable(privacyPolicyCheckbox));
        privacyPolicyCheckbox.click();
    }

    //click 'Continue' button method
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(445));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }


    //register page title getter
    public String getCreateAccountTitle() {return createAccountTitle.getText();}

    //account confirmation message getter
    public String getAccountCreationMessage(){return accountConfirmationMessage.getText();}

    //input length error message getters
    public String getInvalidFirstNameInputErrorMessage(){return firstNameInputErrorMessage.getText();}
    public String getInvalidLastNameInputErrorMessage(){return  lastNameInputErrorMessage.getText();}

    //login name / password getters
    public String getLoginName() {return loginName;}
    public String getPassword() {return password;}

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

}
