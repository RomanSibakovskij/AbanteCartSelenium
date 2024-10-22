package com.abantecart.demo;


import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //Test 001 -> navigate to signup page test
    @Test
    @DisplayName("Navigate To Signup Page (as a guest)")
    @Tag("Navigate_To_SignUp_Page")
    void navigateToSignUpPage(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
    }
}
