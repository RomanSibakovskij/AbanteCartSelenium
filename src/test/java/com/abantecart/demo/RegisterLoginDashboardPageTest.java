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
        navigateToRegisterLoginDashboardPageTest(homePage);
        //valid user login test
        validUserLoginTest(registerPage);
    }


    //Test 004a -> invalid user account login - no login name
    @Test
    @DisplayName("Invalid User Account Login - No Login Name")
    @Tag("Invalid_User_Account_Login")
    @Tag("No_Singular_Input")
    void invalidAccountLoginNoLoginNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        AccountPage accountPage = new AccountPage(driver);
        //logout from user account test
        logOutFromAccountTest(accountPage);
        //navigate to register/login dashboard page
        navigateToRegisterLoginDashboardPageTest(homePage);
        //invalid user login test (no login name)
        invalidUserLoginNoLoginNameTest(registerPage);
    }

    //Test 004b -> invalid user account login - no password
    @Test
    @DisplayName("Invalid User Account Login - No Password")
    @Tag("Invalid_User_Account_Login")
    @Tag("No_Singular_Input")
    void invalidAccountLoginNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        AccountPage accountPage = new AccountPage(driver);
        //logout from user account test
        logOutFromAccountTest(accountPage);
        //navigate to register/login dashboard page
        navigateToRegisterLoginDashboardPageTest(homePage);
        //invalid user login test (no password)
        invalidUserLoginNoPasswordTest(registerPage);
    }

    //Test 004c -> invalid user account login - invalid login name
    @Test
    @DisplayName("Invalid User Account Login - Invalid Login Name")
    @Tag("Invalid_User_Account_Login")
    @Tag("Invalid_Singular_Input")
    void invalidAccountLoginInvalidLoginNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        AccountPage accountPage = new AccountPage(driver);
        //logout from user account test
        logOutFromAccountTest(accountPage);
        //navigate to register/login dashboard page
        navigateToRegisterLoginDashboardPageTest(homePage);
        //invalid user login test (invalid login name)
        invalidUserLoginInvalidLoginNameTest(registerPage);
    }
}
