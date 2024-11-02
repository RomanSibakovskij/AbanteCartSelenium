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
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Email Address does not appear to be valid!']")
    private WebElement emailInputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Address 1 must be between 3 and 128 characters!']")
    private WebElement address1InputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='City must be between 3 and 128 characters!']")
    private WebElement cityInputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Please select a region / state!']")
    private WebElement regionInputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Zip/postal code must be between 3 and 10 characters!']")
    private WebElement zipCodeInputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Please select a country!']")
    private WebElement countryInputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Login name must be alphanumeric only and between 5 and 64 characters!']")
    private WebElement loginNameInputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Password must be between 4 and 20 characters!']")
    private WebElement passwordInputErrorMessage;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='col-sm-9 h-100']/span[.='Password confirmation does not match password!']")
    private WebElement confirmPasswordInputErrorMessage;
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
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_zone_id']/option[@value='3616']")
    private WebElement arizonaOption;
    //'Please Select' region option web element
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_zone_id']/option[1]")
    private WebElement pleaseSelectRegionOption;
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_country_id']")
    private WebElement countryDropdownMenu;
    //US country option dropdown menu
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_country_id']/option[@value='223']")
    private WebElement usCountryOption;
    //'Please Select' country option web element
    @FindBy(xpath = "//div[@class='card-body']//select[@id='AccountFrm_country_id']/option[1]")
    private WebElement pleaseSelectCountryRegionOption;

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
    private String noEmailAddress;
    private String noAddress1;
    private String noCity;
    private String noZipCode;
    private String noLoginName;
    private String noPassword;
    private String noConfirmPassword;

    //too short / too long singular input
    private String tooLongFirstName;
    private String tooLongLastName;
    private String tooShortAddress1;
    private String tooLongAddress1;
    private String tooShortCity;
    private String tooLongCity;
    private String tooShortZipCode;
    private String tooLongZipCode;
    private String tooShortLoginName;
    private String tooLongLoginName;
    private String tooShortPassword;
    private String tooLongPassword;
    private String tooShortConfirmPassword;
    private String tooLongConfirmPassword;

    //mismatching confirm password
    private String mismatchingConfirmPassword;

    //invalid email format input
    private String invalidEmail;


    public RegisterPage(WebDriver driver) {super(driver);}

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
    //invalid user creation input data getter (no email)
    public void invalidUserInputDataNoEmailGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        noEmailAddress = "";
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with no email address): " + "\n");
        logger.info("First name (for user creation with no email address): " + firstName);
        logger.info("Last name (for user creation with no email address): " + lastName);
        logger.info("No email address (for user creation with no email address): " + noEmailAddress);
        logger.info("Address1 (for user creation with no email address): " + address1);
        logger.info("City (for user creation with no email address): " + city);
        logger.info("Zip code (for user creation with no email address): " + zipCode);
        logger.info("Login name (for user creation with no email address): " + loginName);
        logger.info("Password (for user creation with no email address): " + password);
        logger.info("Confirm password (for user creation with no email address): " + confirmPassword);
    }
    //invalid user creation input data getter (no address1)
    public void invalidUserInputDataNoUserAddressGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        noAddress1 = "";
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with no user address): " + "\n");
        logger.info("First name (for user creation with no user address): " + firstName);
        logger.info("Last name (for user creation with no user address): " + lastName);
        logger.info("Email address (for user creation with no user address): " + emailAddress);
        logger.info("No address1 (for user creation with no user address): " + noAddress1);
        logger.info("City (for user creation with no user address): " + city);
        logger.info("Zip code (for user creation with no user address): " + zipCode);
        logger.info("Login name (for user creation with no user address): " + loginName);
        logger.info("Password (for user creation with no user address): " + password);
        logger.info("Confirm password (for user creation with no user address): " + confirmPassword);
    }
    //invalid user creation input data getter (no user city)
    public void invalidUserInputDataNoUserCityGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        noCity = "";
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with no user city): " + "\n");
        logger.info("First name (for user creation with no user city): " + firstName);
        logger.info("Last name (for user creation with no user city): " + lastName);
        logger.info("Email address (for user creation with no user city): " + emailAddress);
        logger.info("Address1 (for user creation with no user city): " + address1);
        logger.info("No user city (for user creation with no user city): " + city);
        logger.info("Zip code (for user creation with no user city): " + zipCode);
        logger.info("Login name (for user creation with no user city): " + loginName);
        logger.info("Password (for user creation with no user city): " + password);
        logger.info("Confirm password (for user creation with no user city): " + confirmPassword);
    }
    //invalid user creation input data getter (no user zip code)
    public void invalidUserInputDataNoUserZipCodeGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        noZipCode = "";
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with no user zip code): " + "\n");
        logger.info("First name (for user creation with no user zip code): " + firstName);
        logger.info("Last name (for user creation with no user zip code): " + lastName);
        logger.info("Email address (for user creation with no user zip code): " + emailAddress);
        logger.info("Address1 (for user creation with no user zip code): " + address1);
        logger.info("User city (for user creation with no user zip code): " + city);
        logger.info("No zip code (for user creation with no user zip code): " + noZipCode);
        logger.info("Login name (for user creation with no user zip code): " + loginName);
        logger.info("Password (for user creation with no user zip code): " + password);
        logger.info("Confirm password (for user creation with no user zip code): " + confirmPassword);
    }
    //invalid user creation input data getter (no login name)
    public void invalidUserInputDataNoLoginNameGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        noLoginName = "";
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with no login name): " + "\n");
        logger.info("First name (for user creation with no login name): " + firstName);
        logger.info("Last name (for user creation with no login name): " + lastName);
        logger.info("Email address (for user creation with no login name): " + emailAddress);
        logger.info("Address1 (for user creation with no login name): " + address1);
        logger.info("User city (for user creation with no login name): " + city);
        logger.info("Zip code (for user creation with no login name): " + zipCode);
        logger.info("No login name (for user creation with no login name): " + noLoginName);
        logger.info("Password (for user creation with no login name): " + password);
        logger.info("Confirm password (for user creation with no login name): " + confirmPassword);
    }
    //invalid user creation input data getter (no password input)
    public void invalidUserInputDataNoPasswordGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        noPassword = "";
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with no password): " + "\n");
        logger.info("First name (for user creation with no password): " + firstName);
        logger.info("Last name (for user creation with no password): " + lastName);
        logger.info("Email address (for user creation with no password): " + emailAddress);
        logger.info("Address1 (for user creation with no password): " + address1);
        logger.info("User city (for user creation with no password): " + city);
        logger.info("Zip code (for user creation with no password): " + zipCode);
        logger.info("Login name (for user creation with no password): " + loginName);
        logger.info("No password (for user creation with no password): " + noPassword);
        logger.info("No confirm password (for user creation with no password): " + confirmPassword);
    }
    //invalid user creation input data getter (no confirm password input)
    public void invalidUserInputDataNoConfirmPasswordGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        noConfirmPassword = "";

        System.out.println("Data generated for invalid user account creation  (for user creation with no confirm password): " + "\n");
        logger.info("First name (for user creation with no confirm password): " + firstName);
        logger.info("Last name (for user creation with no confirm password): " + lastName);
        logger.info("Email address (for user creation with no confirm password): " + emailAddress);
        logger.info("Address1 (for user creation with no confirm password): " + address1);
        logger.info("User city (for user creation with no confirm password): " + city);
        logger.info("Zip code (for user creation with no confirm password): " + zipCode);
        logger.info("Login name (for user creation with no confirm password): " + loginName);
        logger.info("Password (for user creation with no confirm password): " + password);
        logger.info("No confirm password (for user creation with no confirm password): " + noConfirmPassword);
    }

    //invalid singular input (too short/too long)
    //invalid user creation input data getter (too long first name)
    public void invalidUserInputDataTooLongFirstNameGetter(){
        tooLongFirstName = TestDataGenerator.generateRandomUsername(33);
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too long first name): " + "\n");
        logger.info("Too long first name (for user creation with too long first name): " + tooLongFirstName);
        logger.info("Last name (for user creation with too long first name): " + lastName);
        logger.info("Email address (for user creation with too long first name): " + emailAddress);
        logger.info("Address1 (for user creation with too long first name): " + address1);
        logger.info("City (for user creation with too long first name): " + city);
        logger.info("Zip code (for user creation with too long first name): " + zipCode);
        logger.info("Login name (for user creation with too long first name): " + loginName);
        logger.info("Password (for user creation with too long first name): " + password);
        logger.info("Confirm password (for user creation with too long first name): " + confirmPassword);
    }
    //invalid user creation input data getter (too long last name)
    public void invalidUserInputDataTooLongLastNameGetter(){
        firstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = TestDataGenerator.generateRandomUsername(33);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too long last name): " + "\n");
        logger.info("First name (for user creation with too long last name): " + firstName);
        logger.info("Too long last name (for user creation with too long last name): " + tooLongLastName);
        logger.info("Email address (for user creation with too long last name): " + emailAddress);
        logger.info("Address1 (for user creation with too long last name): " + address1);
        logger.info("City (for user creation with too long last name): " + city);
        logger.info("Zip code (for user creation with too long last name): " + zipCode);
        logger.info("Login name (for user creation with too long last name): " + loginName);
        logger.info("Password (for user creation with too long last name): " + password);
        logger.info("Confirm password (for user creation with too long last name): " + confirmPassword);
    }
    //invalid user creation input data getter (invalid email format)
    public void invalidUserInputDataInvalidEmailGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        invalidEmail = "m12345example.com";
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with invalid email address): " + "\n");
        logger.info("First name (for user creation with invalid email address): " + firstName);
        logger.info("Last name (for user creation with invalid email address): " + lastName);
        logger.info("Invalid email address (for user creation with invalid email address): " + invalidEmail);
        logger.info("Address1 (for user creation with invalid email address): " + address1);
        logger.info("City (for user creation with invalid email address): " + city);
        logger.info("Zip code (for user creation with invalid email address): " + zipCode);
        logger.info("Login name (for user creation with invalid email address): " + loginName);
        logger.info("Password (for user creation with invalid email address): " + password);
        logger.info("Confirm password (for user creation with invalid email address): " + confirmPassword);
    }
    //invalid user creation input data getter (too short address1)
    public void invalidUserInputDataTooShortUserAddressGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        tooShortAddress1 = TestDataGenerator.generateRandomInvalidAddress(2);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too short user address): " + "\n");
        logger.info("First name (for user creation with too short user address): " + firstName);
        logger.info("Last name (for user creation with too short user address): " + lastName);
        logger.info("Email address (for user creation with too short user address): " + emailAddress);
        logger.info("Too short address1 (for user creation with too short user address): " + tooShortAddress1);
        logger.info("City (for user creation with too short user address): " + city);
        logger.info("Zip code (for user creation with too short user address): " + zipCode);
        logger.info("Login name (for user creation with too short user address): " + loginName);
        logger.info("Password (for user creation with too short user address): " + password);
        logger.info("Confirm password (for user creation with too short user address): " + confirmPassword);
    }
    //invalid user creation input data getter (too long address1)
    public void invalidUserInputDataTooLongUserAddressGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        tooLongAddress1 = TestDataGenerator.generateRandomInvalidAddress(129);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too long user address): " + "\n");
        logger.info("First name (for user creation with too long user address): " + firstName);
        logger.info("Last name (for user creation with too long user address): " + lastName);
        logger.info("Email address (for user creation with too long user address): " + emailAddress);
        logger.info("Too long address1 (for user creation with too long user address): " + tooLongAddress1);
        logger.info("City (for user creation with too long user address): " + city);
        logger.info("Zip code (for user creation with too long user address): " + zipCode);
        logger.info("Login name (for user creation with too long user address): " + loginName);
        logger.info("Password (for user creation with too long user address): " + password);
        logger.info("Confirm password (for user creation with too long user address): " + confirmPassword);
    }
    //invalid user creation input data getter (too short user city)
    public void invalidUserInputDataTooShortUserCityGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        tooShortCity = TestDataGenerator.generateRandomUsername(2);
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too short user city): " + "\n");
        logger.info("First name (for user creation with too short user city): " + firstName);
        logger.info("Last name (for user creation with too short user city): " + lastName);
        logger.info("Email address (for user creation with too short user city): " + emailAddress);
        logger.info("Address1 (for user creation with too short user city): " + address1);
        logger.info("Too short user city (for user creation with too short user city): " + tooShortCity);
        logger.info("Zip code (for user creation with too short user city): " + zipCode);
        logger.info("Login name (for user creation with too short user city): " + loginName);
        logger.info("Password (for user creation with too short user city): " + password);
        logger.info("Confirm password (for user creation with too short user city): " + confirmPassword);
    }
    //invalid user creation input data getter (too long user city)
    public void invalidUserInputDataTooLongUserCityGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        tooLongCity = TestDataGenerator.generateRandomUsername(129);
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too long user city): " + "\n");
        logger.info("First name (for user creation with too long user city): " + firstName);
        logger.info("Last name (for user creation with too long user city): " + lastName);
        logger.info("Email address (for user creation with too long user city): " + emailAddress);
        logger.info("Address1 (for user creation with too long user city): " + address1);
        logger.info("Too long user city (for user creation with too long user city): " + tooLongCity);
        logger.info("Zip code (for user creation with too long user city): " + zipCode);
        logger.info("Login name (for user creation with too long user city): " + loginName);
        logger.info("Password (for user creation with too long user city): " + password);
        logger.info("Confirm password (for user creation with too long user city): " + confirmPassword);
    }
    //invalid user creation input data getter (too short user zip code)
    public void invalidUserInputDataTooShortUserZipCodeGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        tooShortZipCode = String.valueOf(32);
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too short user zip code): " + "\n");
        logger.info("First name (for user creation with too short user zip code): " + firstName);
        logger.info("Last name (for user creation with too short user zip code): " + lastName);
        logger.info("Email address (for user creation with too short user zip code): " + emailAddress);
        logger.info("Address1 (for user creation with too short user zip code): " + address1);
        logger.info("User city (for user creation with too short user zip code): " + city);
        logger.info("Too short zip code (for user creation with too short user zip code): " + tooShortZipCode);
        logger.info("Login name (for user creation with too short user zip code): " + loginName);
        logger.info("Password (for user creation with too short user zip code): " + password);
        logger.info("Confirm password (for user creation with too short user zip code): " + confirmPassword);
    }
    //invalid user creation input data getter (too long user zip code)
    public void invalidUserInputDataTooLongUserZipCodeGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        tooLongZipCode = "32435432342";
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too long user zip code): " + "\n");
        logger.info("First name (for user creation with too long user zip code): " + firstName);
        logger.info("Last name (for user creation with too long user zip code): " + lastName);
        logger.info("Email address (for user creation with too long user zip code): " + emailAddress);
        logger.info("Address1 (for user creation with too long user zip code): " + address1);
        logger.info("User city (for user creation with too long user zip code): " + city);
        logger.info("Too long zip code (for user creation with too long user zip code): " + tooLongZipCode);
        logger.info("Login name (for user creation with too long user zip code): " + loginName);
        logger.info("Password (for user creation with too long user zip code): " + password);
        logger.info("Confirm password (for user creation with too long user zip code): " + confirmPassword);
    }
    //invalid user creation input data getter (too short login name)
    public void invalidUserInputDataTooShortLoginNameGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        tooShortLoginName = TestDataGenerator.generateRandomUsername(4);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too short login name): " + "\n");
        logger.info("First name (for user creation with too short login name): " + firstName);
        logger.info("Last name (for user creation with too short login name): " + lastName);
        logger.info("Email address (for user creation with too short login name): " + emailAddress);
        logger.info("Address1 (for user creation with too short login name): " + address1);
        logger.info("User city (for user creation with too short login name): " + city);
        logger.info("Zip code (for user creation with too short login name): " + zipCode);
        logger.info("Too short login name (for user creation with too short login name): " + tooShortLoginName);
        logger.info("Password (for user creation with too short login name): " + password);
        logger.info("Confirm password (for user creation with too short login name): " + confirmPassword);
    }
    //invalid user creation input data getter (too long login name)
    public void invalidUserInputDataTooLongLoginNameGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        tooLongLoginName = TestDataGenerator.generateRandomUsername(65);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Data generated for invalid user account creation  (for user creation with too long login name): " + "\n");
        logger.info("First name (for user creation with too long login name): " + firstName);
        logger.info("Last name (for user creation with too long login name): " + lastName);
        logger.info("Email address (for user creation with too long login name): " + emailAddress);
        logger.info("Address1 (for user creation with too long login name): " + address1);
        logger.info("User city (for user creation with too long login name): " + city);
        logger.info("Zip code (for user creation with too long login name): " + zipCode);
        logger.info("Too long login name (for user creation with too long login name): " + tooLongLoginName);
        logger.info("Password (for user creation with too long login name): " + password);
        logger.info("Confirm password (for user creation with too long login name): " + confirmPassword);
    }
    //invalid user creation input data getter (too short password input)
    public void invalidUserInputDataTooShortPasswordGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        tooShortPassword = "TfR";
        tooShortConfirmPassword = tooShortPassword;

        System.out.println("Data generated for invalid user account creation  (for user creation with too short password (3 chars)): " + "\n");
        logger.info("First name (for user creation with too short password): " + firstName);
        logger.info("Last name (for user creation with too short password): " + lastName);
        logger.info("Email address (for user creation with too short password): " + emailAddress);
        logger.info("Address1 (for user creation with too short password): " + address1);
        logger.info("User city (for user creation with too short password): " + city);
        logger.info("Zip code (for user creation with too short password): " + zipCode);
        logger.info("Login name (for user creation with too short password): " + loginName);
        logger.info("Too short password (for user creation with too short password): " + tooShortPassword);
        logger.info("Too short confirm password (for user creation with too short password): " + tooShortConfirmPassword);
    }
    //invalid user creation input data getter (too long password input)
    public void invalidUserInputDataTooLongPasswordGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        tooLongPassword = "Asdf_rgftr%55GfdtreT$";
        tooLongConfirmPassword = tooLongPassword;

        System.out.println("Data generated for invalid user account creation  (for user creation with too long password (21 chars)): " + "\n");
        logger.info("First name (for user creation with too long password): " + firstName);
        logger.info("Last name (for user creation with too long password): " + lastName);
        logger.info("Email address (for user creation with too long password): " + emailAddress);
        logger.info("Address1 (for user creation with too long password): " + address1);
        logger.info("User city (for user creation with too long password): " + city);
        logger.info("Zip code (for user creation with too long password): " + zipCode);
        logger.info("Login name (for user creation with too long password): " + loginName);
        logger.info("Too long password (for user creation with too long password): " + tooShortPassword);
        logger.info("Too long confirm password (for user creation with too long password): " + tooShortConfirmPassword);
    }
    //invalid user creation input data getter (mismatch confirm password input)
    public void invalidUserInputDataMismatchConfirmPasswordGetter(){
        firstName = TestDataGenerator.getRandomFirstName();;
        lastName = TestDataGenerator.getRandomLastName();;
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginName = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();
        mismatchingConfirmPassword = "Stacker112$#";

        System.out.println("Data generated for invalid user account creation  (for user creation with mismatching confirm password): " + "\n");
        logger.info("First name (for user creation with mismatching confirm password): " + firstName);
        logger.info("Last name (for user creation with mismatching confirm password): " + lastName);
        logger.info("Email address (for user creation with mismatching confirm password): " + emailAddress);
        logger.info("Address1 (for user creation with mismatching confirm password): " + address1);
        logger.info("User city (for user creation with mismatching confirm password): " + city);
        logger.info("Zip code (for user creation with mismatching confirm password): " + zipCode);
        logger.info("Login name (for user creation with mismatching confirm password): " + loginName);
        logger.info("Too long password (for user creation with mismatching confirm password): " + password);
        logger.info("Too long confirm password (for user creation with mismatching confirm password): " + mismatchingConfirmPassword);
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
    //select 'Arizona' option
    public void selectArizonaOption(){arizonaOption.click();}
    //select 'Please Select' option - for no region input test
    public void selectPleaseSelectRegionOption(){pleaseSelectRegionOption.click();}

    //click country dropdown menu
    public void clickCountryDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(445));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        countryDropdownMenu.click();
    }
    //select 'United States' option
    public void selectUsOption(){usCountryOption.click();}
    //select 'Please Select' option - for no country input test
    public void selectPleaseSelectCountryOption(){pleaseSelectCountryRegionOption.click();}

    //no singular data input methods
    //invalid user data input method (no first name)
    public void inputNoFirstNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(noFirstName);
    }
    //invalid user data input method (no last name)
    public void inputNoLastNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(noLastName);
    }
    //invalid user data input method (no email address)
    public void inputNoEmailAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(noEmailAddress);
    }
    //invalid user data input method (no user address (address1))
    public void inputNoUserAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(noAddress1);
    }
    //invalid user data input method (no user city)
    public void inputNoUserCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(noCity);
    }
    //invalid user data input method (no user zip code)
    public void inputNoZipCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys(noZipCode);
    }
    //invalid user data input method (no user login name)
    public void inputNoLoginNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginNameInputField));
        loginNameInputField.sendKeys(noLoginName);
    }
    //invalid user data input method (no user password)
    public void inputNoPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(noPassword);
    }
    //invalid user data input method (no user confirm password)
    public void inputNoConfirmPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(noConfirmPassword);
    }

    //invalid user data input method  (too long first name)
    public void inputTooLongFirstNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooLongFirstName);
    }
    //invalid user data input method  (too long last name)
    public void inputTooLongLastNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooLongLastName);
    }
    //invalid user data input method  (invalid email address)
    public void inputInvalidEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(invalidEmail);
    }
    //invalid user data input method (too short user address (address1))
    public void inputTooShortUserAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(tooShortAddress1);
    }
    //invalid user data input method (too long user address (address1))
    public void inputTooLongUserAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(tooLongAddress1);
    }
    //invalid user data input method (too short user city)
    public void inputTooShortUserCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooShortCity);
    }
    //invalid user data input method (too long user city)
    public void inputTooLongUserCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooLongCity);
    }
    //invalid user data input method (too short user zip code)
    public void inputTooShortZipCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys(tooShortZipCode);
    }
    //invalid user data input method (too long user zip code)
    public void inputTooLongZipCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys(tooLongZipCode);
    }
    //invalid user data input method (too short user login name)
    public void inputTooShortLoginNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginNameInputField));
        loginNameInputField.sendKeys(tooShortLoginName);
    }
    //invalid user data input method (too long user login name)
    public void inputTooLongLoginNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginNameInputField));
        loginNameInputField.sendKeys(tooLongLoginName);
    }
    //invalid user data input method (too short user password)
    public void inputTooShortPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(tooShortPassword);
    }
    //invalid user data input method (too short user confirm password)
    public void inputTooShortConfirmPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(tooShortConfirmPassword);
    }
    //invalid user data input method (too long user password)
    public void inputTooLongPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(tooLongPassword);
    }
    //invalid user data input method (too long user confirm password)
    public void inputTooLongConfirmPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(tooLongConfirmPassword);
    }
    //invalid user data input method (mismatching confirm password)
    public void inputMismatchingConfirmPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(mismatchingConfirmPassword);
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
    public String getInvalidEmailInputErrorMessage(){return  emailInputErrorMessage.getText();}
    public String getInvalidAddress1InputErrorMessage(){return  address1InputErrorMessage.getText();}
    public String getInvalidCityInputErrorMessage(){return  cityInputErrorMessage.getText();}
    public String getInvalidRegionInputErrorMessage(){return  regionInputErrorMessage.getText();}
    public String getInvalidZipCodeInputErrorMessage(){return  zipCodeInputErrorMessage.getText();}
    public String getInvalidCountryInputErrorMessage(){return  countryInputErrorMessage.getText();}
    public String getInvalidLoginNameInputErrorMessage(){return  loginNameInputErrorMessage.getText();}
    public String getInvalidPasswordInputErrorMessage(){return  passwordInputErrorMessage.getText();}
    public String getInvalidConfirmPasswordInputErrorMessage(){return  confirmPasswordInputErrorMessage.getText();}

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
    public boolean isContinueButtonDisplayed(){return continueButton.isDisplayed();}

}
