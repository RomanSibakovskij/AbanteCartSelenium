package com.abantecart.demo;


import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //Test 001 -> navigate to signup page test
    @Test
    @DisplayName("Navigate To Signup Page (as a guest)")
    @Tag("Navigate_To_SignUp_Page")
    void navigateToSignUpPageTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
    }

    //Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation")
    @Tag("Valid_User_Account_Create")
    void validAccountRegisterTest(){
        navigateToSignUpPageTest();
        RegisterPage registerPage = new RegisterPage(driver);
        validUserAccountCreationTest(registerPage);
    }
}
