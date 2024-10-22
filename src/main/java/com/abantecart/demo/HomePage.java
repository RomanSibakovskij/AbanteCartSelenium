package com.abantecart.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class HomePage extends BasePage{

    //header web elements
    @FindBy(xpath = "//a[@class= 'navbar-brand logo']")
    private WebElement homePageLogoLink;
    @FindBy(xpath = "//form[@id='search_form']/div[1]/button[@type='button']")
    private WebElement allCategoriesDropdownMenu;
    @FindBy(xpath = "//form[@id='search_form']/div[1]/div/input[@id='filter-keyword']")
    private WebElement searchBar;
    @FindBy(xpath = "//form[@id='search_form']/div[1]/button[@id='search-button']")
    private WebElement searchIconButton;
    @FindBy(xpath = "//div[@class='header-right-block block_2 d-flex justify-content-end']/div/button[@type='button']")
    private WebElement currencyConversionDropdownMenu;
    @FindBy(xpath = "//div[@class='cart-top-block']")
    private WebElement shoppingCartIconButton;
    @FindBy(xpath = "//div[@id='customer_menu_top']")
    private WebElement userAccountIconButton;

    //header bottom (navbar) web elements
    @FindBy(xpath = "//div[@class='col']")
    private WebElement allCategoriesHoverDropdownMenu;
    @FindBy(xpath = "//ul[@class='mega-sf-menu navbar-nav mx-auto mb-2 mb-lg-0 align-items-start flex-wrap']/li[1]")
    private WebElement homeHoverMenu;
    @FindBy(xpath = "//ul[@class='mega-sf-menu navbar-nav mx-auto mb-2 mb-lg-0 align-items-start flex-wrap']/li[2]")
    private WebElement userAccountHoverMenu;
    @FindBy(xpath = "//ul[@class='mega-sf-menu navbar-nav mx-auto mb-2 mb-lg-0 align-items-start flex-wrap']/li[3]")
    private WebElement shoppingCartHoverMenu;
    @FindBy(xpath = "//ul[@class='mega-sf-menu navbar-nav mx-auto mb-2 mb-lg-0 align-items-start flex-wrap']/li[4]")
    private WebElement makeupHoverMenu;
    @FindBy(xpath = "//ul[@class='mega-sf-menu navbar-nav mx-auto mb-2 mb-lg-0 align-items-start flex-wrap']/li[5]")
    private WebElement checkoutLink;
    @FindBy(xpath = "//div[@class='d-none d-lg-flex']/a")
    private WebElement specialsButton;

    //slider section web elements
    @FindBy(xpath = "//button[@data-bs-slide='prev']")
    private WebElement carouselPrevButton;
    @FindBy(xpath = "//button[@data-bs-slide='next']")
    private WebElement carouselNextButton;
    @FindBy(xpath = "//div[@id='carouselExample']/div/div[1]/img[1]")
    private WebElement carouselActiveImage;

    //content main section title web element
    @FindBy(xpath = "//div[@class='welcome-msg container mb-4']")
    private WebElement abanteCartTitle;

    //content bottom section web elements
    @FindBy(xpath = "//section[1]//div[@class='row g-4']/div")
    private List<WebElement> freeShippingWindowElements;
    //latest products
    @FindBy(xpath = "//div[@id='block_frame_latest_2460']//h2")
    private WebElement latestProductsSectionTitle;
    @FindBy(xpath = "//section[2]//div[@class='row g-4']/div")
    private List<WebElement> latestProductsProductElements;
    //featured products
    @FindBy(xpath = "//div[@id='block_frame_featured_2461']//h2")
    private WebElement featuredProductsSectionTitle;
    @FindBy(xpath = "//section[3]//div[@class='row g-4']/div")
    private List<WebElement> featuredProductsProductElements;
    //featured banner
    @FindBy(xpath = "//section[4]/div/div/div/h2")
    private WebElement featuredBannerSectionTitle;
    @FindBy(xpath = "//section[4]//div[@class='row g-4']/div")
    private List<WebElement> featuredBannerImageElements;
    //bestsellers
    @FindBy(xpath = "//section[5]//h2")
    private WebElement bestsellersSectionTitle;
    @FindBy(xpath = "//section[5]//div[@class='row g-4']/div")
    private List<WebElement> bestsellersProductElements;
    //specials
    @FindBy(xpath = "//section[6]//h2")
    private WebElement specialsSectionTitle;
    @FindBy(xpath = "//section[6]//div[@class='row g-4']/div")
    private List<WebElement> specialsProductElements;
    //'commerce better' section web element
    @FindBy(xpath = "//section[7]/img[1]")
    private WebElement commerceBetterImage;
    //'most featured product' section web elements
    @FindBy(xpath = "//section[8]//h2")
    private WebElement mostFeaturedProductTitle;
    @FindBy(xpath = "//section[8]//a")
    private WebElement mostFeaturedProductButton;
    //'brands scrolling list' section web elements
    @FindBy(xpath = "//section[@id='popularbrands']//h2")
    private WebElement brandsScrollingSectionTitle;
    @FindBy(xpath = "//section[@id='popularbrands']//div[@class='brand-carousel owl-carousel owl-theme owl-loaded owl-drag']")
    private WebElement brandsScrollingDragCarousel;
    //'Clients say about us' section web elements
    @FindBy(xpath = "//section[10]//h2")
    private WebElement clientsFeedbackSectionTitle;
    @FindBy(xpath = "//section[10]//div[@class='comment-carousel owl-carousel owl-theme owl-loaded owl-drag']")
    private WebElement clientsFeedbackDragComment;
    //footer web elements
    //footer top
    @FindBy(xpath = "//div[@id='newslettersignup']//h4")
    private WebElement newsLetterSignupTitle;
    @FindBy(xpath = "//div[@id='newslettersignup']//form//input[@name='email']")
    private WebElement newsLetterSignupSubscriptionBar;
    @FindBy(xpath = "//div[@id='newslettersignup']//form//button[@type='submit']")
    private WebElement newsLetterSignupButton;
    //footer bottom
    @FindBy(xpath = "//div[@class='footer-abtus text-center text-md-start']/h3")
    private WebElement artAndFashionFuseTitle;
    //links
    @FindBy(xpath = "//div[@class='footer-abtus text-center text-md-start']/ul/li[1]")
    private WebElement topBrandsLink;
    @FindBy(xpath = "//div[@class='footer-abtus text-center text-md-start']/ul/li[2]")
    private WebElement discountLink;
    //social links
    @FindBy(xpath = "//div[@class='footer-abtus text-center text-md-start']/div[@class='social_icons']/ul/li[1]")
    private WebElement faceBookLink;
    @FindBy(xpath = "//div[@class='footer-abtus text-center text-md-start']/div[@class='social_icons']/ul/li[2]")
    private WebElement twitterLink;
    @FindBy(xpath = "//div[@class='footer-abtus text-center text-md-start']/div[@class='social_icons']/ul/li[3]")
    private WebElement linkedInLink;
    //product columns
    @FindBy(xpath = "//div[@class='footer-main-links row']/div")
    private List<WebElement> productColumnElements;
    //contacts section
    @FindBy(xpath = "//div[@class='contactus-block text-center text-md-start']/img")
    private WebElement abanteCartFooterLogo;
    @FindBy(xpath = "//div[@class='contactus-block text-center text-md-start']/p")
    private WebElement abanteCartAddress;
    @FindBy(xpath = "//div[@class='contactus-block text-center text-md-start']/h4")
    private WebElement abanteCartPhoneNumber;
    //buttons
    @FindBy(xpath = "//div[@class='contactus-block text-center text-md-start']/a[1]")
    private WebElement abanteCartLiveChatButton;
    @FindBy(xpath = "//div[@class='contactus-block text-center text-md-start']/a[2]")
    private WebElement abanteCartHelpDeskButton;
    //footer links web elements
    private List<WebElement> footerLinkElements = driver.findElements(By.xpath("//div[@class='col-lg-8']/ul/li//div[@class='navbar-nav ms-auto me-auto mb-2 mb-lg-0 align-items-start flex-wrap']/div"));
    //copyright web element
    @FindBy(xpath = "//div[@class='col-lg-8']/p")
    private WebElement copyrightTextElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //register/login icon button click method
    public void clickRegisterLoginPageIconButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(445));
        wait.until(ExpectedConditions.elementToBeClickable(userAccountIconButton));
        userAccountIconButton.click();
    }

    //abante cart title getter
    public String getAbanteCartTitle(){return abanteCartTitle.getText();}
    //latest products title getter
    public String getLatestProductsTitle(){return latestProductsSectionTitle.getText();}
    //latest products title getter
    public String getFeaturedProductsTitle(){return featuredProductsSectionTitle.getText();}
    //featured banner title getter
    public String getFeaturedBannerTitle(){return featuredBannerSectionTitle.getText();}
    //bestseller products title getter
    public String getBestsellerProductsTitle(){return bestsellersSectionTitle.getText();}
    //special products title getter
    public String getSpecialProductsTitle(){return specialsSectionTitle.getText();}
    //brands scrolling list title getter
    public String getBrandsScrollingListTitle(){return brandsScrollingSectionTitle.getText();}
    //most featured products title getter
    public String getMostFeaturedProductsTitle(){return mostFeaturedProductTitle.getText();}
    //clients feedback section title getter
    public String getClientsFeedbackSectionTitle(){return clientsFeedbackSectionTitle.getText();}
    //newsletter signup title getter
    public String getNewsletterSignupTitle(){return newsLetterSignupTitle.getText();}
    //'art and fashion fuse' title getter
    public String getArtAndFashionFuseTitle(){return artAndFashionFuseTitle.getText();}
    //abante cart address getter
    public String getAbanteCartAddress(){return abanteCartAddress.getText();}
    //abante cart phone number getter
    public String getAbanteCartPhoneNumber(){return abanteCartPhoneNumber.getText();}


    //homepage web element assert methods
    public boolean isHomePageLogoLinkDisplayed(){return homePageLogoLink.isDisplayed();}
    public boolean isAllCategoriesDropdownMenuDisplayed(){return allCategoriesDropdownMenu.isDisplayed();}
    public boolean isSearchBarDisplayed(){return searchBar.isDisplayed();}
    public boolean isSearchIconButtonDisplayed(){return searchIconButton.isDisplayed();}
    public boolean isCurrencyConversionDropdownMenuDisplayed(){return currencyConversionDropdownMenu.isDisplayed();}
    public boolean isShoppingCartIconButtonDisplayed(){return shoppingCartIconButton.isDisplayed();}
    public boolean isUserAccountIconButtonDisplayed(){return userAccountIconButton.isDisplayed();}
    public boolean isAllCategoriesHoverDropdownMenuDisplayed(){return allCategoriesHoverDropdownMenu.isDisplayed();}
    public boolean isHomeHoverMenuDisplayed(){return homeHoverMenu.isDisplayed();}
    public boolean isUserAccountHoverMenuDisplayed(){return userAccountHoverMenu.isDisplayed();}
    public boolean isShoppingCartHoverMenuDisplayed(){return shoppingCartHoverMenu.isDisplayed();}
    public boolean isMakeupHoverMenuDisplayed(){return makeupHoverMenu.isDisplayed();}
    public boolean isCheckoutLinkDisplayed(){return checkoutLink.isDisplayed();}
    public boolean isSpecialsButtonDisplayed(){return specialsButton.isDisplayed();}
    public boolean isCarouselPrevButtonDisplayed(){return carouselPrevButton.isDisplayed();}
    public boolean isCarouselNextButtonDisplayed(){return carouselNextButton.isDisplayed();}
    public boolean isCarouselActiveImageDisplayed(){return carouselActiveImage.isDisplayed();}
    public boolean isAbanteCartTitleDisplayed(){return abanteCartTitle.isDisplayed();}

    public boolean isFreeShippingWindowElementDisplayed() {
        for (WebElement element : freeShippingWindowElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isLatestProductsSectionTitleDisplayed(){return latestProductsSectionTitle.isDisplayed();}
    public boolean isLatestProductDisplayed() {
        for (WebElement element : latestProductsProductElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isFeaturedProductsSectionTitleDisplayed(){return featuredProductsSectionTitle.isDisplayed();}
    public boolean isFeaturedProductDisplayed() {
        for (WebElement element : featuredProductsProductElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isFeaturedBannersSectionTitleDisplayed(){return featuredBannerSectionTitle.isDisplayed();}
    public boolean isFeaturedBannerImageDisplayed() {
        for (WebElement element : featuredBannerImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellerProductsSectionTitleDisplayed(){return bestsellersSectionTitle.isDisplayed();}
    public boolean isBestsellerProductDisplayed() {
        for (WebElement element : bestsellersProductElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSpecialProductsSectionTitleDisplayed(){return specialsSectionTitle.isDisplayed();}
    public boolean isSpecialProductDisplayed() {
        for (WebElement element : specialsProductElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCommerceBetterImageDisplayed(){return commerceBetterImage.isDisplayed();}
    public boolean isMostFeaturedProductTitleDisplayed(){return mostFeaturedProductTitle.isDisplayed();}
    public boolean isMostFeaturedProductButtonDisplayed(){return mostFeaturedProductButton.isDisplayed();}
    public boolean isBrandScrollingSectionTitleDisplayed(){return brandsScrollingSectionTitle.isDisplayed();}
    public boolean isBrandScrollingDragCarouselDisplayed(){return brandsScrollingDragCarousel.isDisplayed();}
    public boolean isClientsFeedbackSectionTitleDisplayed(){return clientsFeedbackSectionTitle.isDisplayed();}
    public boolean isClientsFeedbackSectionDragCommentCarouselDisplayed(){return clientsFeedbackDragComment.isDisplayed();}
    public boolean isNewsletterSignupTitleDisplayed(){return  newsLetterSignupTitle.isDisplayed();}
    public boolean isNewsletterSignupBarDisplayed(){return  newsLetterSignupSubscriptionBar.isDisplayed();}
    public boolean isNewsletterSignupButtonDisplayed(){return  newsLetterSignupButton.isDisplayed();}
    public boolean isArtAndFashionFuseTitleDisplayed(){return artAndFashionFuseTitle.isDisplayed();}
    public boolean isTopBrandsLinkDisplayed(){return topBrandsLink.isDisplayed();}
    public boolean isDiscountLinkDisplayed(){return discountLink.isDisplayed();}
    public boolean isFacebookIconLinkDisplayed(){return faceBookLink.isDisplayed();}
    public boolean isTwitterIconLinkDisplayed(){return twitterLink.isDisplayed();}
    public boolean isLinkedInIconLinkDisplayed(){return linkedInLink.isDisplayed();}
    public boolean isProductColumnElementDisplayed() {
        for (WebElement element : productColumnElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAbanteFooterLogoDisplayed(){return abanteCartFooterLogo.isDisplayed();}
    public boolean isAbanteCartAddressDisplayed(){return abanteCartAddress.isDisplayed();}
    public boolean isAbanteCartPhoneNumberDisplayed(){return abanteCartPhoneNumber.isDisplayed();}
    public boolean isAbanteCartLiveChatButtonDisplayed(){return abanteCartLiveChatButton.isDisplayed();}
    public boolean isAbanteCartHelpDeskButtonDisplayed(){return abanteCartHelpDeskButton.isDisplayed();}
    public boolean isFooterLinkDisplayed() {
        for (WebElement element : footerLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCopyrightTextDisplayed(){return copyrightTextElement.isDisplayed();}

}
