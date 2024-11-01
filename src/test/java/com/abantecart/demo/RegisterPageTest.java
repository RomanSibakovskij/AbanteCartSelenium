package com.abantecart.demo;

import org.junit.jupiter.api.*;

public class RegisterPageTest extends TestMethods{

    //Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation")
    @Tag("Valid_User_Account_Create")
    void validAccountRegisterTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
    }

    //no singular input user account creation test

    //Test 002a -> invalid user account creation test (no first name)
    @Test
    @DisplayName("Invalid User Account Creation - No First Name")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no first name)
        invalidUserAccountCreationNoFirstNameTest(registerPage);
    }

    //Test 002b -> invalid user account creation test (no last name)
    @Test
    @DisplayName("Invalid User Account Creation - No Last Name")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoLastNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no last name)
        invalidUserAccountCreationNoLastNameTest(registerPage);
    }

    //Test 002c -> invalid user account creation test (no email address)
    @Test
    @DisplayName("Invalid User Account Creation - No Email Address")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no email address)
        invalidUserAccountCreationNoEmailTest(registerPage);
    }

    //Test 002d -> invalid user account creation test (no user address)
    @Test
    @DisplayName("Invalid User Account Creation - No User Address")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoAddress1Test(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no user address - address1)
        invalidUserAccountCreationNoAddress1Test(registerPage);
    }

    //Test 002e -> invalid user account creation test (no user city)
    @Test
    @DisplayName("Invalid User Account Creation - No User City")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoCityTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no user city)
        invalidUserAccountCreationNoCityTest(registerPage);
    }
}
