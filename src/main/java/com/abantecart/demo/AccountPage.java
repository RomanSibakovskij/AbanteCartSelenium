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

    //account page web element assert methods
    public boolean isLogOffLinkDisplayed() {return logOffLink.isDisplayed();}


}
