package com.abantecart.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage extends BasePage{

    //logoff link web element
    @FindBy(xpath = "//ul[@class='list-group']/li[10]/a")
    private WebElement logOffLink;
    //'Continue' button web element
    @FindBy(xpath = "//a[@title='Continue']")
    private WebElement continueButton;

    //my account title web element
    @FindBy(xpath = "//div[@class='col-xl-8']/h1")
    private WebElement myAccountTitle;
    //user account name web element
    @FindBy(xpath = "//div[@class='content-main-section']//h4")
    private WebElement userAccountFirstName;

    public AccountPage(WebDriver driver) {super(driver);}

    //logoff link click method
    public void clickLogOffLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(logOffLink));
        logOffLink.click();
    }
    //'Continue' button click method
    public void clickContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    //my account title getter
    public String getMyAccountTitle() {return myAccountTitle.getText();}
    //user first name getter
    public String getUserFirstName() {return userAccountFirstName.getText();}

    //account page web element assert methods
    public boolean isLogOffLinkDisplayed() {return logOffLink.isDisplayed();}
}
