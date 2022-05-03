package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computers extends Utility {
    By computerTab = By.linkText("Computers");
    By desktop = By.xpath("//div[@class='header-menu']/ul[1]/li[1]/ul/li[1]/a");
    By DropDown = By.xpath("//select[@id='products-orderby']");
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By buildUrOwnComputerText = By.xpath("//div[@class='products-wrapper']/div/div/div[1]/div/div[2]/h2/a");
    By intelPentiumDualCoreDropDown = By.xpath("//select[@id='product_attribute_1']");
    By GBCheckBox = By.xpath("//div[@class='product-essential']/div[2]/div[7]/dl/dd[2]/select");
    By HddRadio = By.xpath("//input[@id='product_attribute_3_7']");
    By vistaPrimiumRadio = By.xpath("//li[@data-attr-value='9']/input");
    By totalCommanderCheckBox = By.xpath("//input[@id='product_attribute_5_12']");
    By price = By.xpath("//div[@class='product-price']//span[@id='price-value-1']");
    By addToCartFinal = By.xpath("//button[@id='add-to-cart-button-1']");
    By addedToCartMsg = By.xpath("//body/div[@id='bar-notification']/div[1]");
    By closeButton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCart = (By.xpath("//span[contains(text(),'Shopping cart')]"));
    By GoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By ShoppingCartMsg = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By clearQty = By.xpath("//td[@class='quantity']/input");
    By updateButton = By.xpath("//button[@id='updatecart']");
    By total = By.xpath("//span[@class='value-summary']/strong");
    By termsAndService = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By welComeMsg = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By asGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By firstName =By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName =By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailID =By.xpath("//input[@id='BillingNewAddress_Email']");
    By country =By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By state =By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city =By.xpath("//input[@id='BillingNewAddress_City']");
    By add1 =By.xpath("//div[@class='edit-address']/div[8]/input");
    By add2 =By.xpath("//div[@class='edit-address']/div[9]/input");
    By zipCode = By.xpath("//div[@class='edit-address']/div[10]/input");
    By PhNum = By.xpath("//div[@class='edit-address']/div[11]/input");
    By faxNum = By.xpath("//div[@class='edit-address']/div[12]/input");
    By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
By nextDayAir = (By.xpath("//ul[@class='method-list']/li[2]/div/input"));
By continueButton1 = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
By creditCardRadioButton = By.xpath("//ul[@class='method-list']/li[2]/div[1]/div[2]/input");
By continueButton2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
By masterCard = (By.xpath("//select[@id='CreditCardType']"));
By cardHolderName = (By.xpath("//input[@id='CardholderName']"));
   By cardNumber = (By.xpath("//input[@id='CardNumber']"));
   By expireMonth = (By.xpath("//select[@id='ExpireMonth']"));
    By expireYear = (By.xpath("//select[@id='ExpireYear']"));
   By cardCode = (By.xpath("//input[@id='CardCode']"));
   By ContinueButton3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
By paymentMethodMsg = By.xpath("//span[contains(text(),'Credit Card')]");
By shippingMethodMsg = By.xpath("//li[@class='shipping-method']/span[2]");
By VerifyTotal = By.xpath("//tr[@class='order-total']/td/span");
By confirm = By.xpath("//button[contains(text(),'Confirm')]");
By verifyThanks = By.xpath("//h1[contains(text(),'Thank you')]");
By confirmationMsg = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
By continueButton4 = By.xpath("//button[contains(text(),'Continue')]");
By verifyWelcomeToStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public void clickOnComputerTab() { clickOnElement(computerTab); }
    public void clickOnDesktopTab() { mouseHoverToElement(computerTab);
        clickOnElement(desktop); }
    public void sortByPosition() { selectByValueFromDropdown(DropDown, "5"); }
    public void addToCart() { mouseHoverToElementAndClick(addToCart); }
    public String verifyBuildUrOwnCompText() { return getTextFromElement(buildUrOwnComputerText); }
    public void selectProcessor(String text) { selectByVisibleTextFromDropDown(intelPentiumDualCoreDropDown, text); }
    public void selectRAM(String text) { selectByValueFromDropdown(GBCheckBox, text); }
    public void selectHDD() { mouseHoverToElementAndClick(HddRadio); }
    public void selectOS() { mouseHoverToElementAndClick(vistaPrimiumRadio); }
    public void selectSoftware() { mouseHoverToElementAndClick(totalCommanderCheckBox); }
    public String verifyPrice() { return getTextFromElement(price); }
    public void addToCartFinal() { clickOnElement(addToCartFinal); }
    public String verifyAddedTocartText() { return getTextFromElement(addedToCartMsg); }
    public void closeButton() { clickOnElement(closeButton); }
    public void shoppingCart(){ mouseHoverToElement(shoppingCart);
    clickOnElement(GoToCart); }
    public String verifyShoppingCArtText(){ return getTextFromElement(shoppingCart);}
    public void clearQty(){clearTextFromField(clearQty);}
    public void upDateQty(String number){ sendTextToElement(clearQty,number);
    clickOnElement(updateButton);}
    public String verifyTotal(){return getTextFromElement(total);}
    public void selectTermsAndConditions(){clickOnElement(termsAndService);}
    public void clickOnCheckOut(){clickOnElement(checkOut);}
    public String welcomeText(){return getTextFromElement(welComeMsg);}
    public void clickOnCheckOutAsGuest(){clickOnElement(asGuest);}
    public void firstName(String name){sendTextToElement(firstName,name);}
    public void lasttName(String lastname){sendTextToElement(lastName,lastname);}
    public void email(String email){sendTextToElement(emailID,email);}

    public void country(String CountryName){sendTextToElement(country,CountryName);}
    public void state(String StateName){selectByValueFromDropdown(state,StateName);}
    public void city(String CityName) throws InterruptedException {Thread.sleep(2000);sendTextToElement(city,CityName);}
    public void address1(String addressfield1){sendTextToElement(add1,addressfield1);}
    public void address2(String addressfield2){sendTextToElement(add2,addressfield2);}
    public void zip(String ZipCode){sendTextToElement(zipCode,ZipCode);}
    public void Phone(String PhoneNumber){sendTextToElement(PhNum,PhoneNumber);}
    public void Fax(String FaxNumber){sendTextToElement(faxNum,FaxNumber);}
    public void clickOnContinueButton(){clickOnElement(continueButton);}
    public void selectNextDayAir(){clickOnElement(nextDayAir);}
    public void selectContinue1(){clickOnElement(continueButton1);}
    public void selectCreditCard(){clickOnElement(creditCardRadioButton);}
    public void clickoncontinuebutton2(){clickOnElement(continueButton2);}
    public void selectMasterCard(String card){selectByValueFromDropdown(masterCard,card);}
    public void setCardHolderName(String Name){sendTextToElement(cardHolderName,Name);}
    public void setCardHolderNumber(String Number){sendTextToElement(cardNumber,Number);}
    public void setExpireMonth(int Month){selectByIndexFromDropDown(expireMonth,Month);}
    public void setExpireYear(String Year){selectByValueFromDropdown(expireYear,Year);}
    public void setCardCode(String code){sendTextToElement(cardCode,code);}
    public void clickonContinueButton3(){clickOnElement(ContinueButton3);}
    public String verifyPaymentMethodText(){return getTextFromElement(paymentMethodMsg);}
    public String verifyShippingMethod(){return  getTextFromElement(shippingMethodMsg);}
    public String setVerifyTotalMsg(){return getTextFromElement(VerifyTotal);}
public void clickonConfirm(){clickOnElement(confirm);}
public String verifyThanksMsg(){return getTextFromElement(verifyThanks);}
public String setConfirmationMsg(){return getTextFromElement(confirmationMsg);}
public void clickOnContinueButton4(){clickOnElement(continueButton4);}
public String VerifyWelcomeoStoreMsg(){return getTextFromElement(verifyWelcomeToStore);}


}