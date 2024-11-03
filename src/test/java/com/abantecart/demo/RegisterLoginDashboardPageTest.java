package com.abantecart.demo;

import org.junit.jupiter.api.*;

public class RegisterLoginDashboardPageTest extends TestMethods{

    //Test 003 -> valid user account logout test
    @Test
    @DisplayName("Valid User Account Logout")
    @Tag("Valid_User_Account_Logout")
    void validAccountLogoutTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        AccountPage accountPage = new AccountPage(driver);
        //logout from user account test
        logOutFromAccountTest(accountPage);
    }

    //Test 004 -> valid user account login
    //Test 003 -> valid user account logout test
    @Test
    @DisplayName("Valid User Account Login")
    @Tag("Valid_User_Account_Login")
    void validAccountLoginTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        AccountPage accountPage = new AccountPage(driver);
        //logout from user account test
        logOutFromAccountTest(accountPage);
        //navigate to register/login dashboard page
        navigateToUserSignupPageTest(homePage);

    }
}
