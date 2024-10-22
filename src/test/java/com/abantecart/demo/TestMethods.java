package com.abantecart.demo;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    //navigate to signup page test method
    protected void navigateToUserSignupPageTest(HomePage homePage){
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
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

    //homepage web element assert methods (Header and footer elements share similarities in other pages so those will be reused)
    protected void isHomePageWebElementDisplayed(HomePage homePage){
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
        //assert user account icon button is displayed
        assertTrue(homePage.isUserAccountIconButtonDisplayed(), "The user account icon button isn't displayed");
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
        //assert footer link is displayed (list elements
        assertTrue(homePage.isFooterLinkDisplayed(), "The footer link (list element) isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(homePage.isCopyrightTextDisplayed(), "The copyright text isn't displayed");
    }

}
