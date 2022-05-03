package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsMenu extends TestBase {
    Electronics electronics = new Electronics();
    @Test
    public void textVerified(){
        electronics.hoverOnElectronics();
        electronics.setCellphone();
        String actualText = electronics.verifyCellPhoneText();
        String expectedText = "Cell phones";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
//        2.1 Mouse Hover on “Electronics”Tab
        electronics.hoverOnElectronics();
//        2.2 Mouse Hover on “Cell phones” and click
        electronics.setCellphone();
//        2.3 Verify the text “Cell phones”
        String actualText = electronics.verifyCellPhoneText();
        String expectedText = "Cell phones";
        Assert.assertEquals(actualText,expectedText);
//        2.4 Click on List View Tab
        electronics.ListView();
//        2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(2000);
        electronics.clickOnNokiaLumia();
//        2.6 Verify the text “Nokia Lumia 1020”
        String actualTextNokia = electronics.VerifyNokiaLumiaText();
        String expectedTextNokia = "Nokia Lumia 1020";
        Assert.assertEquals(actualTextNokia,expectedTextNokia);
//        2.7 Verify the price “$349.00”
        String actualPrice = electronics.VerifyPrice();
        String expectedPrice = "$349.00";
        Assert.assertEquals(expectedPrice,actualPrice);
//        2.8 Change quantity to 2
        electronics.setClearQty();
        electronics.UpdateQty("2");
//        2.9 Click on “ADD TO CART” tab
        electronics.AddToCart();
//        2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualText2 = electronics.setVerifyProductAddedMsg();
        String expectedText2 = "The product has been added to your shopping cart";
        Assert.assertEquals(actualText2,expectedText2);
//        After that close the bar clicking on the cross button.
        electronics.CancelButton();
//        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(2000);
        electronics.MouseHoverOnShoppingCart();
//        2.12 Verify the message "Shopping cart"
        String actualText3 = electronics.verifyShoppingCartMsg();
        String expectedText3 = "Shopping cart";
        Assert.assertEquals(expectedText3,actualText3);
//        2.13 Verify the quantity is 2
//       String actualqty =  electronics.setVerifyQty();
//       String expectedQty = "2";
//       Assert.assertEquals(actualqty,expectedQty);
//        2.14 Verify the Total $698.00
        String actualTotal = electronics.setVerifyTotal();
        String expectedTotal = "$698.00";
        Assert.assertEquals(actualTotal,expectedTotal);
//        2.15 click on checkbox “I agree with the terms of service”
        Thread.sleep(2000);
        electronics.setIAgreeCheckBox();
//        2.16 Click on checkout
        electronics.setCheckOut();
//        2.17 Verify the Text “Welcome, Please Sign In!”
        String actualWelcome = electronics.setVerifyWelcomeText();
        String expectedWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcome,expectedWelcome);
//        2.18 Click on “REGISTER” tab
        electronics.clickOnRegister();
//        2.19 Verify the text “Register”
        String actualRegisterText =electronics.verifyRegisterText();
        String expectedRegisterText = "Register";
        Assert.assertEquals(actualRegisterText,expectedRegisterText);
//        2.20 Fill the mandatory fields
electronics.clickOnGender();
electronics.setFirstName("abc");
electronics.setLastName("ptl");
electronics.setDay("10");
electronics.setMonth("October");
electronics.setYear("1920");
electronics.setEmail();
electronics.setPassWord("abc123");
electronics.setConfirmPassword("abc123");

//        2.21 Click on “REGISTER” Button
        electronics.clickOnRegister1();
//        2.22 Verify the message “Your registration completed”
        String actualregistrationText = electronics.verifyRegistration1();
        String expectedregistrationText = "Your registration completed";
        Assert.assertEquals(actualregistrationText,expectedregistrationText);
//        2.23 Click on “CONTINUE” tab
        Thread.sleep(2000);
        electronics.clickOnContinue();
//        2.24 Verify the text “Shopping cart”
        String actualShoppingCart = electronics.verifyShoppingCart1();
//        2.25 click on checkbox “I agree with the terms of service”
        electronics.clickOnIAgreeCheckBox1();
//        2.26 Click on “CHECKOUT”
        Thread.sleep(2000);
        electronics.clickOnCheckOut1();
//        2.27 Fill the Mandatory fields
        electronics.setFirstNm("abc");
        electronics.setLastNm("ptl");
        electronics.Country("1");
        electronics.State("49");
        Thread.sleep(2000);
        electronics.City("Phoenix");
        electronics.Add1("alvarado road");
        electronics.Add2("444 west");
        electronics.Zip("34567");
        electronics.PhNum("+5751234567890");
        electronics.FaxNum("1234567");
//        2.28 Click on “CONTINUE”
        electronics.clickOnContinueButton2();
//        2.29 Click on Radio Button “2nd Day Air ($0.00)”
        electronics.selectDayAir();
//        2.30 Click on “CONTINUE”
        electronics.continueButton3();
//        2.31 Select Radio Button “Credit Card”
        electronics.clickOnCreditCard();
//        2.32 Select “Visa” From Select credit card dropdown
        electronics.clickOnVisa();
//        2.33 Fill all the details
        electronics.setCardHolderName("abcptl");
        electronics.setCardHolderNumber("4917484589897107");
        electronics.selectExpireYear(2);
        electronics.setCardCode("345");

//        2.34 Click on “CONTINUE”CHECKOUT”
        electronics.clickOnContinueCheckOut();
//        2.35 Verify “Payment Method” is “Credit Card”
        String actualMethod = electronics.VerifyPaymentMethod();
        String expectedMethod= "Credit Card";
        Assert.assertEquals(expectedMethod,actualMethod);
//        2.36 Verify “Shipping Method” is “2nd Day Air”
        String actualShippingMethod = electronics.verifyShippingMethod();
        String expectedShippingMethod = "Next Day Air";
        Assert.assertEquals(actualShippingMethod,expectedShippingMethod);
//        2.37 Verify Total is “$698.00”
        String actualFinalTotal = electronics.VerifyFinalTotal();
        String expectedFinalTotal = "$698.00";
        Assert.assertEquals(actualFinalTotal,expectedFinalTotal);
//        2.38 Click on “CONFIRM”
        electronics.clickOnConfirm();
//        2.39 Verify the Text “Thank You”
        String actualThankYou = electronics.verifyThankYouText();
        String expectedThankYou = "Thank you";
        Assert.assertEquals(actualThankYou,expectedThankYou);
//        2.40 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessfulMsg = electronics.verifyOrderIsSuccessfully();
        String expectedOrderSuccessfulMsg = "Your order has been successfully processed!";
        Assert.assertEquals(actualOrderSuccessfulMsg,expectedOrderSuccessfulMsg);
//        2.41 Click on “CONTINUE”
        electronics.continue1();
//        2.42 Verify the text “Welcome to our store”
        String actualWelcomeStoreMsg = electronics.verifyWelcomeMsg();
        String expectedWelcomeMsg = "Welcome to our store";
//        2.43 Click on “Logout” link
        electronics.clickOnLogOut();
//        2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}


