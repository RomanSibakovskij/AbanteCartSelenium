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

    //Test 002o -> invalid user account creation test (too short user address)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short User Address")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountRegisterTooShortAddress1Test(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too short user address - address1)
        invalidUserAccountCreationTooShortAddress1Test(registerPage);
    }

    //Test 002p -> invalid user account creation test (too long user address)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long User Address")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountRegisterTooLongAddress1Test(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too long user address - address1)
        invalidUserAccountCreationTooLongAddress1Test(registerPage);
    }

    //Test 002q -> invalid user account creation test (too short user city)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short User City")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountRegisterTooShortCityTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too short user city)
        invalidUserAccountCreationTooShortCityTest(registerPage);
    }

    //Test 002r -> invalid user account creation test (too long user city)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long User City")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountRegisterTooLongCityTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too long user city)
        invalidUserAccountCreationTooLongCityTest(registerPage);
    }

    //Test 002s -> invalid user account creation test (invalid user city region) (the account gets created)
    @Test
    @DisplayName("Invalid User Account Creation - Invalid User City region")
    @Tag("Invalid_User_Account_Create")
    @Tag("Invalid_Singular_Input")
    void invalidAccountRegisterInvalidCityRegionTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (invalid user city region)
        invalidUserAccountCreationInvalidCityRegionTest(registerPage);
    }

    //Test 002t -> invalid user account creation test (too short user zip code)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short User Zip Code")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountRegisterTooShortZipCodeTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too short user zip code)
        invalidUserAccountCreationTooShortZipCodeTest(registerPage);
    }

    //Test 002u -> invalid user account creation test (too long user zip code) (the account gets created)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long User Zip Code")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountRegisterTooLongZipCodeTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too long user zip code)
        invalidUserAccountCreationTooLongZipCodeTest(registerPage);
    }

    //Test 002v -> invalid user account creation test (too short user login name)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short User Login Name")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountRegisterTooShortLoginNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too short user login name)
        invalidUserAccountCreationTooShortLoginNameTest(registerPage);
    }

    //Test 002w -> invalid user account creation test (too long user login name)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long User Login Name")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountRegisterTooLongLoginNameTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too long user login name)
        invalidUserAccountCreationTooLongLoginNameTest(registerPage);
    }

    //Test 002x -> invalid user account creation test (too short user password)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short User Password")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountRegisterTooShortPasswordTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too short user password)
        invalidUserAccountCreationTooShortPasswordTest(registerPage);
    }

    //Test 002y -> invalid user account creation test (too long user password)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long User Password")
    @Tag("Invalid_User_Account_Create")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountRegisterTooLongPasswordTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (too long user password)
        invalidUserAccountCreationTooLongPasswordTest(registerPage);
    }

    //mismatching singular input test

    //Test 002z -> invalid user account creation test (mismatch user confirm password)
    @Test
    @DisplayName("Invalid User Account Creation - Mismatch User Confirm Password")
    @Tag("Invalid_User_Account_Create")
    @Tag("Mismatch_Singular_Input")
    void invalidAccountRegisterMismatchingConfirmPasswordTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (mismatch user confirm password)
        invalidUserAccountCreationMismatchingConfirmPasswordTest(registerPage);
    }

    //do not click 'privacy policy' checkbox test

    //Test 002aa -> invalid user account creation test (do not click 'privacy policy' checkbox)
    @Test
    @DisplayName("Invalid User Account Creation - Do Not Click 'Privacy Policy' Checkbox")
    @Tag("Invalid_User_Account_Create")
    @Tag("Do_Not_Click_Singular_Required_Input")
    void invalidAccountRegisterDoNotClickPrivacyCheckboxTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignupPageTest(homePage);
        RegisterPage registerPage = new RegisterPage(driver);
        //invalid user account creation test (do not click 'privacy policy' checkbox)
        invalidUserAccountCreationDoNotClickPrivacyCheckboxTest(registerPage);
    }
}
