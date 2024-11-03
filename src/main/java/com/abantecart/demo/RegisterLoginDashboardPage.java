package com.abantecart.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class RegisterLoginDashboardPage extends BasePage {

    //main content section web elements
    @FindBy(xpath = "//div[@class='content-main-section']//h1")
    private WebElement registerLoginDashboardPageTitle;
    @FindBy(xpath = "//div[@class='row']/div[1]/div/div[@class='card-body']/h4")
    private WebElement registerCardSectionTitle;
    @FindBy(xpath = "//div[@class='row']/div[1]/div/div[@class='card-body']/form//button")
    private WebElement registerCardButton;

    //login section web elements
    @FindBy(xpath = "//div[@class='row']/div[2]/div/div[@class='card-body']/h4")
    private WebElement loginCardSectionTitle;
    @FindBy(xpath = "//div[@class='row']/div[2]/div/div[@class='card-body']//fieldset//input[@id='loginFrm_loginname']")
    private WebElement loginCardLoginNameInputField;
    @FindBy(xpath = "//div[@class='row']/div[2]/div/div[@class='card-body']//fieldset//input[@id='loginFrm_password']")
    private WebElement loginCardPasswordInputField;
    @FindBy(xpath = "//div[@id='rescue_links me-2 d-flex align-items-start']/a[2]")
    private WebElement loginCardForgotLoginLink;
    @FindBy(xpath = "//div[@id='rescue_links me-2 d-flex align-items-start']/a[1]")
    private WebElement loginCardForgotPasswordLink;
    @FindBy(xpath = "//div[@class='row']/div[2]/div/div[@class='card-body']//fieldset//button[@type='submit']")
    private WebElement loginCardButton;

    //login input error message web element
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement loginInputErrorMessage;

    //valid login data
    private String loginName;
    private String password;

    //no singular input
    private String noLoginName;
    private String noPassword;

    //invalid singular input
    private String invalidLoginName;
    private String invalidPassword;

    public RegisterLoginDashboardPage(WebDriver driver) {super(driver);}

    //valid login user input data getter
    public void validLoginUserDataGetter(RegisterPage registerPage){
        loginName = registerPage.getLoginName();
        password = registerPage.getPassword();

        System.out.println("Valid login data ; " + "\n");
        logger.info("Valid login name: " + loginName);
        logger.info("Valid login password: " + password);
    }

    //valid input data methods
    public void inputValidLoginIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(475));
        wait.until(ExpectedConditions.visibilityOf(loginCardLoginNameInputField));
        loginCardLoginNameInputField.sendKeys(loginName);
    }
    public void inputValidPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(475));
        wait.until(ExpectedConditions.visibilityOf(loginCardPasswordInputField));
        loginCardPasswordInputField.sendKeys(password);
    }

    //no singular input
    //invalid login user input data getter - no login name
    public void invalidLoginUserDataNoLoginNameGetter(RegisterPage registerPage){
        noLoginName = "";
        password = registerPage.getPassword();

        System.out.println("Invalid login data (no login name); " + "\n");
        logger.info("No login name (no login name): " + noLoginName);
        logger.info("Valid login password (no login name): " + password);
    }
    //invalid input data method - no login name
    public void inputNoLoginNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(475));
        wait.until(ExpectedConditions.visibilityOf(loginCardLoginNameInputField));
        loginCardLoginNameInputField.sendKeys(noLoginName);
    }

    //invalid login user input data getter - no password
    public void invalidLoginUserDataNoPasswordGetter(RegisterPage registerPage){
        loginName = registerPage.getLoginName();
        noPassword = "";

        System.out.println("Invalid login data (no password); " + "\n");
        logger.info("Valid login name (no password): " + loginName);
        logger.info("No login password (no password): " + noPassword);
    }
    //invalid input data method - no password
    public void inputNoPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(475));
        wait.until(ExpectedConditions.visibilityOf(loginCardPasswordInputField));
        loginCardPasswordInputField.sendKeys(noPassword);
    }

    //invalid singular input
    //invalid login user input data getter - in login name
    public void invalidLoginUserDataInvalidLoginNameGetter(RegisterPage registerPage){
        invalidLoginName = "Inv_453";
        password = registerPage.getPassword();

        System.out.println("Invalid login data (invalid login name); " + "\n");
        logger.info("Invalid login name (invalid login name): " + invalidLoginName);
        logger.info("Valid login password (invalid login name): " + password);
    }
    //invalid input data method - invalid login name
    public void inputInvalidLoginNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(475));
        wait.until(ExpectedConditions.visibilityOf(loginCardLoginNameInputField));
        loginCardLoginNameInputField.sendKeys(invalidLoginName);
    }
    //invalid login user input data getter - invalid password
    public void invalidLoginUserDataInvalidPasswordGetter(RegisterPage registerPage){
        loginName = registerPage.getLoginName();
        invalidPassword = "Stacker112_#";

        System.out.println("Invalid login data (invalid password); " + "\n");
        logger.info("Valid login name (invalid password): " + loginName);
        logger.info("Invalid login password (invalid password): " + invalidPassword);
    }
    //invalid input data method - no password
    public void inputInvalidPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(475));
        wait.until(ExpectedConditions.visibilityOf(loginCardPasswordInputField));
        loginCardPasswordInputField.sendKeys(invalidPassword);
    }

    //register/login dashboard page title getter
    public String getRegisterLoginDashboardPageTitle() {return registerLoginDashboardPageTitle.getText();}
    //register card section title getter
    public String getRegisterCardSectionTitle() {return registerCardSectionTitle.getText();}

    //register card button click method
    public void clickRegisterCardButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(445));
        wait.until(ExpectedConditions.elementToBeClickable(registerCardButton));
        registerCardButton.click();
    }

    //login card section card title getter
    public String getLoginCardSectionTitle(){return loginCardSectionTitle.getText();}

    //login input error message getter
    public String getLoginInputErrorMessage(){return loginInputErrorMessage.getText();}

    //register card button click method
    public void clickLoginCardButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(445));
        wait.until(ExpectedConditions.elementToBeClickable(loginCardButton));
        loginCardButton.click();
    }

    //register/login page web element assert methods
    public boolean isRegisterLoginDashboardPageTitleDisplayed() {return registerLoginDashboardPageTitle.isDisplayed();}
    public boolean isRegisterCardSectionTitleDisplayed() {return registerCardSectionTitle.isDisplayed();}
    public boolean isRegisterCardButtonDisplayed() {return registerCardButton.isDisplayed();}
    public boolean isLoginCardSectionTitleDisplayed() {return loginCardSectionTitle.isDisplayed();}
    public boolean isLoginCardButtonDisplayed() {return loginCardButton.isDisplayed();}
    public boolean isLoginCardForgotLoginLinkDisplayed() {return loginCardForgotLoginLink.isDisplayed();}
    public boolean isLoginCardForgotPasswordLinkDisplayed() {return loginCardForgotPasswordLink.isDisplayed();}
    public boolean isLoginCardLoginNameInputFieldDisplayed() {return loginCardLoginNameInputField.isDisplayed();}
    public boolean isLoginCardPasswordInputFieldDisplayed() {return loginCardPasswordInputField.isDisplayed();}

}
