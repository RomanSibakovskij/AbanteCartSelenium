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

    //valid login data
    private String loginName;
    private String password;

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
