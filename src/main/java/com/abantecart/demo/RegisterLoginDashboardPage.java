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

    public RegisterLoginDashboardPage(WebDriver driver) {
        super(driver);
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

    //register/login page web element assert methods
    public boolean isRegisterLoginDashboardPageTitleDisplayed() {return registerLoginDashboardPageTitle.isDisplayed();}
    public boolean isRegisterCardSectionTitleDisplayed() {return registerCardSectionTitle.isDisplayed();}
    public boolean isRegisterCardButtonDisplayed() {return registerCardButton.isDisplayed();}

}
