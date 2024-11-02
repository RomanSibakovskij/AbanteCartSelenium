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

    //Test 002f -> invalid user account creation test (no user region)
    @Test
    @DisplayName("Invalid User Account Creation - No User Region")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoRegionTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no user region)
        invalidUserAccountCreationNoRegionTest(registerPage);
    }

    //Test 002g -> invalid user account creation test (no user zip code)
    @Test
    @DisplayName("Invalid User Account Creation - No User Zip Code")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoZipCodeTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no user zip code)
        invalidUserAccountCreationNoZipCodeTest(registerPage);
    }

    //Test 002h -> invalid user account creation test (no user country)
    @Test
    @DisplayName("Invalid User Account Creation - No User Country")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoCountryTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no user country)
        invalidUserAccountCreationNoUserCountryTest(registerPage);
    }

    //Test 002i -> invalid user account creation test (no user login name)
    @Test
    @DisplayName("Invalid User Account Creation - No User Login Name")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoLoginNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no user login name)
        invalidUserAccountCreationNoLoginNameTest(registerPage);
    }

    //Test 002j -> invalid user account creation test (no user password)
    @Test
    @DisplayName("Invalid User Account Creation - No User Password")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no user password)
        invalidUserAccountCreationNoPasswordTest(registerPage);
    }

    //Test 002k -> invalid user account creation test (no user confirm password)
    @Test
    @DisplayName("Invalid User Account Creation - No User Confirm Password")
    @Tag("Invalid_User_Account_Create")
    @Tag("No_Singular_Input")
    void invalidAccountRegisterNoConfirmPasswordTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (no user confirm password)
        invalidUserAccountCreationNoConfirmPasswordTest(registerPage);
    }

    //too short / too long singular input tests

    //Test 002l -> invalid user account creation test (too long first name)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long First Name")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountRegisterTooLongFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too long first name)
        invalidUserAccountCreationTooLongFirstNameTest(registerPage);
    }

    //Test 002m -> invalid user account creation test (too long last name)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long Last Name")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountRegisterTooLongLastNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too long last name)
        invalidUserAccountCreationTooLongLastNameTest(registerPage);
    }

    //Test 002n -> invalid user account creation test (invalid email address)
    @Test
    @DisplayName("Invalid User Account Creation - Invalid Email Address")
    @Tag("Invalid_User_Account_Create")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountRegisterInvalidEmailTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (invalid email address)
        invalidUserAccountCreationInvalidEmailTest(registerPage);
    }
}
