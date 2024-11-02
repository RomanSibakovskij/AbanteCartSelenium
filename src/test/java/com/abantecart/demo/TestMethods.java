package com.abantecart.demo;

import org.slf4j.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to signup page test method
    protected void navigateToUserSignupPageTest(HomePage homePage){
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text element assert method
        doesHomePageTextElementMatchExpectations(homePage);
        //click on register/login page icon button
        homePage.clickRegisterLoginPageIconButton();
        RegisterLoginDashboardPage registerLoginDashboardPage = new RegisterLoginDashboardPage(driver);
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        doesRegisterLoginDashboardPageTextMatchExpectations(registerLoginDashboardPage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //click 'register' button
        registerLoginDashboardPage.clickRegisterCardButton();
        RegisterPage registerPage = new RegisterPage(driver);
        //assert the user got onto register page
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations / the user is on the wrong page");
    }

    //valid user account registration method
    protected void validUserAccountCreationTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //valid user input data getter
        registerPage.validUserInputDataGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the account has been created
        assertEquals("Your Account Has Been Created!", registerPage.getAccountCreationMessage(), "The confirmation message doesn't match expectations or user account hasn't been created.");
    }
    //invalid user account registration method (no first name input)
    protected void invalidUserAccountCreationNoFirstNameTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no first name)
        registerPage.invalidUserInputDataNoFirstNameGetter();
        //do not input first name
        registerPage.inputNoFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("First Name must be between 1 and 32 characters!", registerPage.getInvalidFirstNameInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (no last name input)
    protected void invalidUserAccountCreationNoLastNameTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no last name)
        registerPage.invalidUserInputDataNoLastNameGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //do not input last name
        registerPage.inputNoLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Last Name must be between 1 and 32 characters!", registerPage.getInvalidLastNameInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (no email address input)
    protected void invalidUserAccountCreationNoEmailTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no email)
        registerPage.invalidUserInputDataNoEmailGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //do not input email address
        registerPage.inputNoEmailAddressIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Email Address does not appear to be valid!", registerPage.getInvalidEmailInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (no user address input)
    protected void invalidUserAccountCreationNoAddress1Test(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no address 1)
        registerPage.invalidUserInputDataNoUserAddressGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //do not input user address (address 1 - required)
        registerPage.inputNoUserAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Address 1 must be between 3 and 128 characters!", registerPage.getInvalidAddress1InputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (no user city input)
    protected void invalidUserAccountCreationNoCityTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no city)
        registerPage.invalidUserInputDataNoUserCityGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //do not input user city
        registerPage.inputNoUserCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("City must be between 3 and 128 characters!", registerPage.getInvalidCityInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method - (no user region)
    protected void invalidUserAccountCreationNoRegionTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //valid user input data getter
        registerPage.validUserInputDataGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Please Select' state - blank option
        registerPage.selectPleaseSelectRegionOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Please select a region / state!", registerPage.getInvalidRegionInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (no user zip code input)
    protected void invalidUserAccountCreationNoZipCodeTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no zip code)
        registerPage.invalidUserInputDataNoUserZipCodeGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //do not input zip code
        registerPage.inputNoZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Zip/postal code must be between 3 and 10 characters!", registerPage.getInvalidZipCodeInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method - (no user country)
    protected void invalidUserAccountCreationNoUserCountryTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //valid user input data getter
        registerPage.validUserInputDataGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click country dropdown menu
        registerPage.clickCountryDropdownMenu();
        //select 'Please Select' country - blank option
        registerPage.selectPleaseSelectCountryOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error messages appears
        assertEquals("Please select a country!", registerPage.getInvalidCountryInputErrorMessage(), "The valid input length error message isn't displayed.");
        assertEquals("Please select a region / state!", registerPage.getInvalidRegionInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (no user login name)
    protected void invalidUserAccountCreationNoLoginNameTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no login name)
        registerPage.invalidUserInputDataNoLoginNameGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //do not input login name
        registerPage.inputNoLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Login name must be alphanumeric only and between 5 and 64 characters!", registerPage.getInvalidLoginNameInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (no user password)
    protected void invalidUserAccountCreationNoPasswordTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no password)
        registerPage.invalidUserInputDataNoPasswordGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //do not input password
        registerPage.inputNoPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Password must be between 4 and 20 characters!", registerPage.getInvalidPasswordInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (no user confirm password)
    protected void invalidUserAccountCreationNoConfirmPasswordTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (no confirm password)
        registerPage.invalidUserInputDataNoConfirmPasswordGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //do not input confirm password
        registerPage.inputNoConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Password confirmation does not match password!", registerPage.getInvalidConfirmPasswordInputErrorMessage(), "The valid input length error message isn't displayed.");
    }

    //invalid -> too short/too long singular input test methods
    //invalid user account registration method (too long first name input)
    protected void invalidUserAccountCreationTooLongFirstNameTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too long first name)
        registerPage.invalidUserInputDataTooLongFirstNameGetter();
        //input too long first name
        registerPage.inputTooLongFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("First Name must be between 1 and 32 characters!", registerPage.getInvalidFirstNameInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too long last name input)
    protected void invalidUserAccountCreationTooLongLastNameTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too long last name)
        registerPage.invalidUserInputDataTooLongLastNameGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input too long last name
        registerPage.inputTooLongLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Last Name must be between 1 and 32 characters!", registerPage.getInvalidLastNameInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (invalid email address input)
    protected void invalidUserAccountCreationInvalidEmailTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (invalid email address)
        registerPage.invalidUserInputDataInvalidEmailGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input invalid email address
        registerPage.inputInvalidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Email Address does not appear to be valid!", registerPage.getInvalidEmailInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too short user address input)
    protected void invalidUserAccountCreationTooShortAddress1Test(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too short address 1)
        registerPage.invalidUserInputDataTooShortUserAddressGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input too short user address (address 1 - required)
        registerPage.inputTooShortUserAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Address 1 must be between 3 and 128 characters!", registerPage.getInvalidAddress1InputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too long user address input)
    protected void invalidUserAccountCreationTooLongAddress1Test(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too long address 1)
        registerPage.invalidUserInputDataTooLongUserAddressGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input too long user address (address 1 - required)
        registerPage.inputTooLongUserAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Address 1 must be between 3 and 128 characters!", registerPage.getInvalidAddress1InputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too short user city input)
    protected void invalidUserAccountCreationTooShortCityTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too short city)
        registerPage.invalidUserInputDataTooShortUserCityGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input too short user city
        registerPage.inputTooShortUserCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("City must be between 3 and 128 characters!", registerPage.getInvalidCityInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too long user city input)
    protected void invalidUserAccountCreationTooLongCityTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too long city)
        registerPage.invalidUserInputDataTooLongUserCityGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input too long user city
        registerPage.inputTooLongUserCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("City must be between 3 and 128 characters!", registerPage.getInvalidCityInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too short user zip code input)
    protected void invalidUserAccountCreationTooShortZipCodeTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too short zip code)
        registerPage.invalidUserInputDataTooShortUserZipCodeGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input too short zip code
        registerPage.inputTooShortZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Zip/postal code must be between 3 and 10 characters!", registerPage.getInvalidZipCodeInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too long user zip code input)
    protected void invalidUserAccountCreationTooLongZipCodeTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too long zip code)
        registerPage.invalidUserInputDataTooLongUserZipCodeGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input too long zip code
        registerPage.inputTooLongZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //log the issue if the account gets created
        if (registerPage.getAccountCreationMessage().isEmpty()) {
            assertEquals("Zip/postal code must be between 3 and 10 characters!", registerPage.getInvalidZipCodeInputErrorMessage(), "The valid input length error message isn't displayed.");
        } else {
            logger.error("The user account gets created despite inputting zip code longer than the max input limit(11 chars).");
        }
    }

    //invalid user account registration method (invalid user city region)
    protected void invalidUserAccountCreationInvalidCityRegionTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //valid user input data getter
        registerPage.validUserInputDataGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Arizona' state
        registerPage.selectArizonaOption();
        //log the invalid region selection
        logger.info("Region selected for this particular test: Arizona");
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //log the issue if the account gets created
        if (!registerPage.getAccountCreationMessage().isEmpty()) {
            logger.error("The user account gets created despite selecting invalid city region (the application doesn't verify the input city location)");
        }
    }
    //invalid user account registration method (too short user login name)
    protected void invalidUserAccountCreationTooShortLoginNameTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too short login name)
        registerPage.invalidUserInputDataTooShortLoginNameGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input too short login name
        registerPage.inputTooShortLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Login name must be alphanumeric only and between 5 and 64 characters!", registerPage.getInvalidLoginNameInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too long user login name)
    protected void invalidUserAccountCreationTooLongLoginNameTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too long login name)
        registerPage.invalidUserInputDataTooLongLoginNameGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input too long login name
        registerPage.inputTooLongLoginNameIntoInputField();
        //input valid password
        registerPage.inputValidPasswordIntoInputField();
        //input valid confirmation password
        registerPage.inputValidConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Login name must be alphanumeric only and between 5 and 64 characters!", registerPage.getInvalidLoginNameInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too short user password)
    protected void invalidUserAccountCreationTooShortPasswordTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too short password / confirm password)
        registerPage.invalidUserInputDataTooShortPasswordGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input too short password
        registerPage.inputTooShortPasswordIntoInputField();
        //input too short confirm password
        registerPage.inputTooShortConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Password must be between 4 and 20 characters!", registerPage.getInvalidPasswordInputErrorMessage(), "The valid input length error message isn't displayed.");
    }
    //invalid user account registration method (too long user password)
    protected void invalidUserAccountCreationTooLongPasswordTest(RegisterPage registerPage){
        //assert the register page title matches expectations
        assertEquals("Create Account", registerPage.getCreateAccountTitle(), "The register page title doesn't match expectations");
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid user input data getter (too long password / confirm password)
        registerPage.invalidUserInputDataTooLongPasswordGetter();
        //input valid first name
        registerPage.inputValidFirstNameIntoInputField();
        //input valid last name
        registerPage.inputValidLastNameIntoInputField();
        //input valid email address
        registerPage.inputValidEmailIntoInputField();
        //input valid user address (address 1 - required)
        registerPage.inputValidAddressIntoInputField();
        //input valid user city
        registerPage.inputValidCityIntoInputField();
        //click region dropdown menu
        registerPage.clickRegionDropdownMenu();
        //select 'Illinois' state
        registerPage.selectIllinoisOption();
        //input valid zip code
        registerPage.inputValidZipCodeIntoInputField();
        //input valid login name
        registerPage.inputValidLoginNameIntoInputField();
        //input too long password
        registerPage.inputTooLongPasswordIntoInputField();
        //input too long confirm password
        registerPage.inputTooLongConfirmPasswordIntoInputField();
        //click privacy policy checkbox (required)
        registerPage.clickPrivacyPolicyCheckbox();
        //click 'Continue' button (it appears after clicking privacy policy checkbox)
        registerPage.clickContinueButton();
        //assert the valid error message appears
        assertEquals("Password must be between 4 and 20 characters!", registerPage.getInvalidPasswordInputErrorMessage(), "The valid input length error message isn't displayed.");
    }

    //general page web element asserts (header and footer elements)
    protected void isGeneralPageWebElementDisplayed(HomePage homePage){
        //header web elements
        //assert home page logo link is displayed
        assertTrue(homePage.isHomePageLogoLinkDisplayed(), "The homepage logo link isn't displayed");
        //assert all categories dropdown menu is displayed
        assertTrue(homePage.isAllCategoriesDropdownMenuDisplayed(), "The all categories dropdown menu isn't displayed");
        //assert search bar is displayed
        assertTrue(homePage.isSearchBarDisplayed(), "The search bar isn't displayed");
        //assert search icon button is displayed
        assertTrue(homePage.isSearchIconButtonDisplayed(), "The search icon button isn't displayed");
        //assert currency conversion dropdown menu is displayed
        assertTrue(homePage.isCurrencyConversionDropdownMenuDisplayed(), "The currency conversion dropdown menu isn't displayed");
        //assert shopping cart icon button is displayed
        assertTrue(homePage.isShoppingCartIconButtonDisplayed(), "The shopping cart icon button isn't displayed");
        //header bottom(navbar) web elements
        //assert all categories hover dropdown menu is displayed
        assertTrue(homePage.isAllCategoriesHoverDropdownMenuDisplayed(), "The all categories hover dropdown menu isn't displayed");
        //assert home hover dropdown menu is displayed
        assertTrue(homePage.isHomeHoverMenuDisplayed(), "The home hover dropdown menu isn't displayed");
        //assert user account hover dropdown menu is displayed
        assertTrue(homePage.isUserAccountHoverMenuDisplayed(), "The user account hover dropdown menu isn't displayed");
        //assert shopping cart hover dropdown menu is displayed
        assertTrue(homePage.isShoppingCartHoverMenuDisplayed(), "The shopping cart hover dropdown menu isn't displayed");
        //assert makeup hover dropdown menu is displayed
        assertTrue(homePage.isMakeupHoverMenuDisplayed(), "The makeup hover dropdown menu isn't displayed");
        //assert checkout link is displayed
        assertTrue(homePage.isCheckoutLinkDisplayed(), "The checkout link isn't displayed");
        //assert specials button is displayed
        assertTrue(homePage.isSpecialsButtonDisplayed(), "The specials button isn't displayed");
        //footer web elements
        //assert newsletter signup title is displayed
        assertTrue(homePage.isNewsletterSignupTitleDisplayed(), "The newsletter signup title isn't displayed");
        //assert newsletter signup bar is displayed
        assertTrue(homePage.isNewsletterSignupBarDisplayed(), "The newsletter signup bar isn't displayed");
        //assert newsletter signup button is displayed
        assertTrue(homePage.isNewsletterSignupButtonDisplayed(), "The newsletter signup button isn't displayed");
        //assert 'art and fashion fuse' title is displayed
        assertTrue(homePage.isArtAndFashionFuseTitleDisplayed(), "The 'art and fashion fuse' title isn't displayed");
        //assert top brands link is displayed
        assertTrue(homePage.isTopBrandsLinkDisplayed(), "The top brands link isn't displayed");
        //assert discount link is displayed
        assertTrue(homePage.isDiscountLinkDisplayed(), "The discount link isn't displayed");
        //assert facebook icon link is displayed
        assertTrue(homePage.isFacebookIconLinkDisplayed(), "The facebook icon link isn't displayed");
        //assert twitter icon link is displayed
        assertTrue(homePage.isTwitterIconLinkDisplayed(), "The twitter icon link isn't displayed");
        //assert linked-in icon link is displayed
        assertTrue(homePage.isLinkedInIconLinkDisplayed(), "The linkedin icon link isn't displayed");
        //assert product column element is displayed
        assertTrue(homePage.isProductColumnElementDisplayed(), "The product column element isn't displayed");
        //assert abante footer logo is displayed
        assertTrue(homePage.isAbanteFooterLogoDisplayed(), "The abante footer logo isn't displayed");
        //assert abante cart address is displayed
        assertTrue(homePage.isAbanteCartAddressDisplayed(), "The abante cart address isn't displayed");
        //assert abante cart phone number is displayed
        assertTrue(homePage.isAbanteCartPhoneNumberDisplayed(), "The abante cart phone number isn't displayed");
        //assert abante cart live chat button is displayed
        assertTrue(homePage.isAbanteCartLiveChatButtonDisplayed(), "The abante cart live chat button isn't displayed");
        //assert abante cart help desk button is displayed
        assertTrue(homePage.isAbanteCartHelpDeskButtonDisplayed(), "The abante cart help desk button isn't displayed");
        //assert footer link is displayed (list elements) //this assert works only on homepage for some reason despite having similar selectors -> StaleElementReferenceException
        //assertTrue(homePage.isFooterLinkDisplayed(), "The footer link (list element) isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(homePage.isCopyrightTextDisplayed(), "The copyright text isn't displayed");
    }
    //homepage web element assert methods
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert user account icon button is displayed
        assertTrue(homePage.isUserAccountIconButtonDisplayed(), "The user account icon button isn't displayed");
        //slider section web elements
        //assert carousel previous button is displayed
        assertTrue(homePage.isCarouselPrevButtonDisplayed(), "The carousel previous button isn't displayed");
        //assert carousel next button is displayed
        assertTrue(homePage.isCarouselNextButtonDisplayed(), "The carousel next button isn't displayed");
        //assert carousel active image is displayed
        assertTrue(homePage.isCarouselActiveImageDisplayed(), "The carousel active image isn't displayed");
        //content section web elements
        //assert abante cart title is displayed
        assertTrue(homePage.isAbanteCartTitleDisplayed(), "The abante cart title isn't displayed");
        //assert free shipping window element is displayed
        assertTrue(homePage.isFreeShippingWindowElementDisplayed(), "The free shipping window element isn't displayed");
        //assert latest products section title is displayed
        assertTrue(homePage.isLatestProductsSectionTitleDisplayed(), "The latest product section title isn't displayed");
        //assert latest product is displayed
        assertTrue(homePage.isLatestProductDisplayed(), "The latest product isn't displayed");
        //assert featured products section title is displayed
        assertTrue(homePage.isFeaturedProductsSectionTitleDisplayed(), "The featured product section title isn't displayed");
        //assert featured product is displayed
        assertTrue(homePage.isFeaturedProductDisplayed(), "The featured product isn't displayed");
        //assert featured banners section title is displayed
        assertTrue(homePage.isFeaturedBannersSectionTitleDisplayed(), "The featured banners section title isn't displayed");
        //assert featured banner image is displayed
        assertTrue(homePage.isFeaturedBannerImageDisplayed(), "The featured banner image isn't displayed");
        //assert bestseller products section title is displayed
        assertTrue(homePage.isBestsellerProductsSectionTitleDisplayed(), "The bestseller product section title isn't displayed");
        //assert bestseller product is displayed
        assertTrue(homePage.isBestsellerProductDisplayed(), "The bestseller product isn't displayed");
        //assert special products section title is displayed
        assertTrue(homePage.isSpecialProductsSectionTitleDisplayed(), "The special product section title isn't displayed");
        //assert special product is displayed
        assertTrue(homePage.isSpecialProductDisplayed(), "The special product isn't displayed");
        //assert 'commerce better' image is displayed
        assertTrue(homePage.isCommerceBetterImageDisplayed(), "The 'commerce better' image isn't displayed");
        //assert most featured product title is displayed
        assertTrue(homePage.isMostFeaturedProductTitleDisplayed(), "The most featured product title isn't displayed");
        //assert most featured product button is displayed
        assertTrue(homePage.isMostFeaturedProductButtonDisplayed(), "The most featured product button isn't displayed");
        //assert brand scrolling section title is displayed
        assertTrue(homePage.isBrandScrollingSectionTitleDisplayed(), "The brand scrolling section title isn't displayed");
        //assert brand scrolling drag carousel is displayed
        assertTrue(homePage.isBrandScrollingDragCarouselDisplayed(), "The brand scrolling drag carousel isn't displayed");
        //assert clients feedback section title is displayed
        assertTrue(homePage.isClientsFeedbackSectionTitleDisplayed(), "The clients feedback section title isn't displayed");
        //assert clients feedback drag comment carousel is displayed
        assertTrue(homePage.isClientsFeedbackSectionDragCommentCarouselDisplayed(), "The clients feedback drag comment carousel  isn't displayed");
    }
    //homepage text element assert method
    protected void doesHomePageTextElementMatchExpectations(HomePage homePage){
        //assert abante cart title matches expectations
        assertEquals("Welcome to AbanteCart demo web store!", homePage.getAbanteCartTitle(), "The abante cart title doesn't match expected result");
        //assert latest products section title matches expectations
        assertEquals("Latest Products", homePage.getLatestProductsTitle(), "The latest products section title doesn't match expected result");
        //assert featured products section title matches expectations
        assertEquals("Featured", homePage.getFeaturedProductsTitle(), "The featured products section title doesn't match expected result");
        //assert featured banner section title matches expectations
        assertEquals("Featured Banner", homePage.getFeaturedBannerTitle(), "The featured banner title doesn't match expected result");
        //assert bestseller products section title matches expectations
        assertEquals("Bestsellers", homePage.getBestsellerProductsTitle(), "The bestseller products section title doesn't match expected result");
        //assert special products section title matches expectations
        assertEquals("Specials", homePage.getSpecialProductsTitle(), "The special products section title doesn't match expected result");
        //assert most featured products section title matches expectations
        assertEquals("See Our Most Featured Product", homePage.getMostFeaturedProductsTitle(), "The most featured products section title doesn't match expected result");
        //assert brands scrolling section title matches expectations
        assertEquals("Brands Scrolling List", homePage.getBrandsScrollingListTitle(), "The brands scrolling section title doesn't match expected result");
        //assert client feedback section title matches expectations
        assertEquals("What Our Clients Say About Us", homePage.getClientsFeedbackSectionTitle(), "The client feedback section title doesn't match expected result");
        //assert newsletter signup section title matches expectations
        assertEquals("Newsletter Signup", homePage.getNewsletterSignupTitle(), "The newsletter signup section title doesn't match expected result");
        //assert 'art and fashion fuse' section title matches expectations
        assertEquals("Where art and fashion fuse. Elevate your style with Balenciaga.", homePage.getArtAndFashionFuseTitle(), "The 'art and fashion fuse' section title doesn't match expected result");
        //assert abante cart address matches expectations
        assertEquals("1487 Rocky Horse Carrefour\n" +
                "Arlington, TX 16819", homePage.getAbanteCartAddress(), "The abante cart address doesn't match expected result");
        //assert abante cart phone number matches expectations
        assertEquals("(444) 019 120 0401", homePage.getAbanteCartPhoneNumber(), "The abante cart phone number doesn't match expected result");
    }

    //register/login dashboard page web element assert
    protected void isRegisterLoginDashboardPageWebElementDisplayed(RegisterLoginDashboardPage registerLoginDashboardPage){
        //assert register/login dashboard page title is displayed
        assertTrue(registerLoginDashboardPage.isRegisterLoginDashboardPageTitleDisplayed(), "The register/login dashboard page title isn't displayed");
        //assert register card section title is displayed
        assertTrue(registerLoginDashboardPage.isRegisterCardSectionTitleDisplayed(), "The register card section title isn't displayed");
        //assert register card button (register) is displayed
        assertTrue(registerLoginDashboardPage.isRegisterCardButtonDisplayed(), "The register card button (register) isn't displayed");
    }
    //register/login dashboard page text element assert
    protected void doesRegisterLoginDashboardPageTextMatchExpectations(RegisterLoginDashboardPage registerLoginDashboardPage){
        //assert register/login dashboard page title matches expectations
        assertEquals("Account Login", registerLoginDashboardPage.getRegisterLoginDashboardPageTitle(), "The register login dashboard page title doesn't match expected result");
        //assert register card section title matches expectations
        assertEquals("I am a new customer.", registerLoginDashboardPage.getRegisterCardSectionTitle(), "The register card section title doesn't match expected result");
    }

    //register page web element assert
    protected void isRegisterPageWebElementDisplayed(RegisterPage registerPage){
        //assert first name input field is displayed
        assertTrue(registerPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        //assert last name input field is displayed
        assertTrue(registerPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        //assert email address input field is displayed
        assertTrue(registerPage.isEmailAddressInputFieldDisplayed(), "The email address input field isn't displayed");
        //assert telephone number input field is displayed
        assertTrue(registerPage.isPhoneInputFieldDisplayed(), "The telephone number input field isn't displayed");
        //assert company input field is displayed
        assertTrue(registerPage.isCompanyInputFieldDisplayed(), "The company input field isn't displayed");
        //assert address 1 (required) input field is displayed
        assertTrue(registerPage.isAddress1InputFieldDisplayed(), "The address 1 input field isn't displayed");
        //assert address 2 input field is displayed
        assertTrue(registerPage.isAddress2InputFieldDisplayed(), "The address 2 input field isn't displayed");
        //assert city input field is displayed
        assertTrue(registerPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        //assert region dropdown menu is displayed
        assertTrue(registerPage.isRegionDropdownMenuDisplayed(), "The region dropdown menu isn't displayed");
        //assert ZIP code input field is displayed
        assertTrue(registerPage.isZipCodeInputFieldDisplayed(), "The ZIP code input field isn't displayed");
        //assert country dropdown menu is displayed
        assertTrue(registerPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        //assert login name input field is displayed
        assertTrue(registerPage.isLoginNameInputFieldDisplayed(), "The login name input field isn't displayed");
        //assert password input field is displayed
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        //assert confirm password input field is displayed
        assertTrue(registerPage.isConfirmPasswordInputFieldDisplayed(), "The confirm password input field isn't displayed");
        //assert 'subscribe to newsletter' checkbox is displayed
        assertTrue(registerPage.isSubscribeToNewsletterCheckboxDisplayed(), "The 'subscribe to newsletter' checkbox isn't displayed");
        //assert 'do not subscribe to newsletter' checkbox is displayed
        assertTrue(registerPage.isDoNotSubscribeToNewsletterCheckboxDisplayed(), "The 'do not subscribe to newsletter' checkbox isn't displayed");
        //assert 'privacy policy' checkbox is displayed
        assertTrue(registerPage.isPrivacyPolicyCheckboxDisplayed(), "The 'privacy policy' checkbox isn't displayed");
    }

}
