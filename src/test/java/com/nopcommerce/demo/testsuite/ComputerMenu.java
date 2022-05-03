package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computers;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerMenu extends TestBase {
    Computers computers = new Computers();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

//        2.1 Click on Computer Menu.
        computers.clickOnComputerTab();
//        2.2 Click on Desktop
        computers.clickOnDesktopTab();
//        2.3 Select Sort By position "Name: A to Z"
        computers.sortByPosition();
//        2.4 Click on "Add To Cart"
        computers.addToCart();
//        2.5 Verify the Text "Build your own computer"
        String actualText = computers.verifyBuildUrOwnCompText();
        String expectedText = "Build your own computer";
        Assert.assertEquals(expectedText, actualText);
//        2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computers.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
//        2.7.Select "8GB [+$60.00]" using Select class.
        computers.selectRAM("5");
//        2.8 Select HDD radio "400 GB [+$100.00]"
        computers.selectHDD();
//        2.9 Select OS radio "Vista Premium [+$60.00]"
        computers.selectOS();
//        A 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        computers.selectSoftware();
//        2.11 Verify the price "$1,475.00"
        String actualPrice = computers.verifyPrice();
        String expectedPrice = "$1,470.00";
        Assert.assertEquals(actualPrice, expectedPrice);
//        2.12 Click on "ADD TO CART" Button.
        computers.addToCartFinal();
//        2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualTextOfCart = computers.verifyAddedTocartText();
        String expectedTextOfCart = "The product has been added to your shopping cart";
        Assert.assertEquals(actualTextOfCart, expectedTextOfCart);
//        After that close the bar clicking on the cross button.
        computers.closeButton();
//        2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computers.shoppingCart();
//        2.15 Verify the message "Shopping cart"
        String actualShoppingCartText = computers.verifyShoppingCArtText();
        String expectedShoppingCartText = "Shopping cart";
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText);
//        2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computers.clearQty();
        computers.upDateQty("2");
//        2.17 Verify the Total"$2,950.00"
        Thread.sleep(2000);
        String actualTotal = computers.verifyTotal();
        String expectedTotal = "$2,950.00";
        Assert.assertEquals(actualTotal, expectedTotal);
//        2.18 click on checkbox “I agree with the terms of service”
        computers.selectTermsAndConditions();
//        2.19 Click on “CHECKOUT”
        computers.clickOnCheckOut();
//        2.20 Verify the Text “Welcome, Please Sign In!”
        String actualWelcome = computers.welcomeText();
        String expectedWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcome,expectedWelcome);
//        2.21Click on “CHECKOUT AS GUEST”Tab
        computers.clickOnCheckOutAsGuest();
//        2.22 Fill the all mandatory field
        computers.firstName("abc");
        computers.lasttName("ptl");
        computers.email("abc@123gmail.com");
        computers.country("United States");
        Thread.sleep(2000);
        computers.state("49");
        Thread.sleep(2000);
        computers.city("phoenix");
        computers.address1("lapata street");
        computers.address2("chor gali");
        computers.zip("12345");
        computers.Phone("+5751234567890");
        computers.Fax("23456789");
//        2.23 Click on “CONTINUE”
        computers.clickOnContinueButton();
//        2.24 Click on Radio Button “Next Day Air($0.00)”
        computers.selectNextDayAir();
//        2.25 Click on “CONTINUE”
        computers.selectContinue1();
//        2.26 Select Radio Button “Credit Card”
computers.selectCreditCard();
// click on continue button
        computers.clickoncontinuebutton2();
//        2.27 Select “Master card” From Select credit card dropdown
        computers.selectMasterCard("MasterCard");
//        2.28 Fill all the details
computers.setCardHolderName("abpatel");
computers.setCardHolderNumber("5105105105105100");
computers.setExpireMonth(10);
computers.setExpireYear("2022");
computers.setCardCode("123");
//        2.29 Click on “CONTINUE”
        computers.clickonContinueButton3();
//        2.30 Verify “Payment Method” is “Credit Card”
        String actualPaymentMethodText = computers.verifyPaymentMethodText();
        String expectedPaymentMethodText = "Credit Card";
        Assert.assertEquals(actualPaymentMethodText,expectedPaymentMethodText);

//        2.32 Verify “Shipping Method” is “Next Day Air”
        String actualShippingMethod = computers.verifyShippingMethod();
        String expectedShippingMethod = "Next Day Air";
        Assert.assertEquals(actualShippingMethod,expectedShippingMethod);
//        2.33 Verify Total is “$2,950.00”
        String actualTotal1 = computers.setVerifyTotalMsg();
        String expectedTotal1 = "$2,950.00";
        Assert.assertEquals(actualTotal1,expectedTotal1);
//        2.34 Click on “CONFIRM”
        computers.clickonConfirm();
//        2.35 Verify the Text “Thank You”
        String actualThanksText = computers.verifyThanksMsg();
        String expectedThanksText = "Thank you";
        Assert.assertEquals(actualThanksText,expectedThanksText);
//        2.36 Verify the message “Your order has been successfully processed!”
        String actualFinalMsg = computers.setConfirmationMsg();
        String expectedFinalMsg = "Your order has been successfully processed!";
        Assert.assertEquals(actualFinalMsg,expectedFinalMsg);
//        2.37 Click on “CONTINUE”
        computers.clickOnContinueButton4();
//        2.37 Verify the text “Welcome to our store”
        String actualWelcomeToStore = computers.VerifyWelcomeoStoreMsg();
        String expectedWelcomeToStore = "Welcome to our store";
        Assert.assertEquals(actualWelcomeToStore,expectedWelcomeToStore);
    }

}
