package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class Electronics extends Utility {
    By ElectronicsTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");

    public void hoverOnElectronics() {
        mouseHoverToElement(ElectronicsTab);
    }

    By Cellphone = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");

    public void setCellphone() {
        mouseHoverToElementAndClick(Cellphone);
    }

    By CellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");

    public String verifyCellPhoneText() {
        return getTextFromElement(CellPhoneText);
    }
//======================2nd method locators===============================

    By ListViewTab = By.xpath("//div[@class='product-viewmode']/a[2]");

    public void ListView() {
        clickOnElement(ListViewTab);
    }

    By NokiaLumia = By.xpath("//div[@class='item-grid']/div[3]/div/div[2]/h2/a");

    public void clickOnNokiaLumia() {
        mouseHoverToElement(NokiaLumia);
        clickOnElement(NokiaLumia);
    }

    By NokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");

    public String VerifyNokiaLumiaText() {
        return getTextFromElement(NokiaLumiaText);
    }

    By Price = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[6]/div[1]/span[1]");

    public String VerifyPrice() {
        return getTextFromElement(Price);
    }

    By ClearQty = By.xpath("//div[@class='add-to-cart']/div/input");

    public void setClearQty() {
        clearTextFromField(ClearQty);
    }

    By ChangeQty = By.xpath("//div[@class='add-to-cart']/div/input");

    public void UpdateQty(String text) {
        sendTextToElement(ChangeQty, text);
    }

    By AddToCart = By.xpath("//div[@class='add-to-cart']/div");

    public void AddToCart() {
        clickOnElement(AddToCart);
    }

    By VerifyProductAddedMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");

    public String setVerifyProductAddedMsg() {
        return getTextFromElement(VerifyProductAddedMsg);
    }

    By crossButton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    public void CancelButton() {
        clickOnElement(crossButton);
    }

    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public void MouseHoverOnShoppingCart() throws InterruptedException {
        mouseHoverToElement(shoppingCart);
        Thread.sleep(2000);
        mouseHoverToElement(goToCart);
        clickOnElement(goToCart);

    }

    //2.12 Verify the message "Shopping cart"
    By shoppingCartMsg = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyShoppingCartMsg() {
        return getTextFromElement(shoppingCartMsg);
    }
    By verifyQty = By.xpath("//td[@class='quantity']/input");
    public String setVerifyQty() {
        return getTextFromElement(verifyQty);
    }

    By VerifyTotal = By.xpath("//td[@class='cart-total-right']/span/strong");
    public String setVerifyTotal() {
        return getTextFromElement(VerifyTotal);
    }

    By IAgreeCheckBox = By.id("termsofservice");
    public void setIAgreeCheckBox() {
        clickOnElement(IAgreeCheckBox);
    }

    By CheckOut = By.xpath("//button[@id='checkout']");
    public void setCheckOut() {
        mouseHoverToElement(CheckOut);
        clickOnElement(CheckOut);
    }

    By VerifyWelcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String setVerifyWelcomeText() {
        return getTextFromElement(VerifyWelcomeText);
    }

    By Register = By.xpath("//button[contains(text(),'Register')]");
    public void clickOnRegister() {
        clickOnElement(Register);
    }
    By RegisterText = By.xpath("//h1[contains(text(),'Register')]");
    public String verifyRegisterText(){
        return getTextFromElement(RegisterText);
    }
    //        2.20 Fill the mandatory fields

    By Gender= By.xpath("//input[@id='gender-female']");
    public void clickOnGender(){clickOnElement(Gender);

    }
    By FirstName = By.xpath("//input[@id='FirstName']");
    public void setFirstName(String Firstname) {
        sendTextToElement(FirstName, Firstname);
    }

    By LastName = By.xpath("//input[@id='LastName']");
    public void setLastName(String Lastname) {
        sendTextToElement(LastName, Lastname);
    }

    By Day = By.xpath("//select[@name='DateOfBirthDay']");
    public void setDay(String text) {
        selectByValueFromDropdown(Day, text);
    }

    By Month = By.xpath("//select[@name='DateOfBirthMonth']");
    public void setMonth(String month) {
        selectByVisibleTextFromDropDown(Month, month);
    }

    By Year = By.xpath("//select[@name='DateOfBirthYear']");
    public void setYear(String year) {
        selectByVisibleTextFromDropDown(Year, year);}
By Email = By.xpath("//input[@id='Email']");
    public void setEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(Email,"username" + randomInt + "@gmail.com");

    }
    By PassWord = By.xpath("//input[@id='Password']");
    public void setPassWord(String password){
        sendTextToElement(PassWord,password);
    }
    By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    public void setConfirmPassword(String confirmpassword){
        sendTextToElement(ConfirmPassword,confirmpassword);
    }
    By RegisterButton1 = By.xpath("//button[@id='register-button']");
    public void clickOnRegister1(){
        clickOnElement(RegisterButton1);
    }
    By VerifyRegistration1 = By.xpath("//div[contains(text(),'Your registration completed')]");
    public String verifyRegistration1(){
        return getTextFromElement(VerifyRegistration1);
    }
    By ContinueButton = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnContinue(){
        clickOnElement(ContinueButton);
    }
    By ShoppingCart1 = By.xpath("//h1[contains(text(),'Shopping cart')]");
    //        2.24 Verify the text “Shopping cart”
    public String verifyShoppingCart1(){
        return getTextFromElement(ShoppingCart1);
    }
    //   2.25 click on checkbox “I agree with the terms of service”
    By IAgrreeCheckBox1 = By.xpath("//input[@id='termsofservice']");
    public void clickOnIAgreeCheckBox1(){
        clickOnElement(IAgrreeCheckBox1);
    }
    // 2.26 click on “CHECKOUT”
    By CheckOut1 = By.xpath("//button[@id='checkout']");
    public void clickOnCheckOut1(){
        clickOnElement(CheckOut1);
    }
    //  2.27 Fill the Mandatory fields
    By FirstNm = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    public void setFirstNm(String name){
        sendTextToElement(FirstNm,name);
    }
    By LastNm = By.xpath("//input[@id='BillingNewAddress_LastName']");
    public void setLastNm(String lastname){
        sendTextToElement(FirstNm,lastname);
    }
    By Country = By.xpath("//div[@class='edit-address']/div[5]/select");
    public void Country(String country){
       selectByValueFromDropdown(Country,country);
    }
    By State = By.xpath("//div[@class='edit-address']/div[6]/select");
    public void State(String state){
       selectByValueFromDropdown(State,state);
    }
    By City = By.xpath("//input[@id='BillingNewAddress_City']");
    public void City(String city){
        mouseHoverToElementAndClick(City);
        sendTextToElement(City,city);
    }
    By Add1 = By.id("BillingNewAddress_Address1");
    public void Add1(String add1) throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick(Add1);
        sendTextToElement(Add1,add1);}
    By Add2 = By.id("BillingNewAddress_Address2");
    public void Add2(String add2) throws InterruptedException {
        Thread.sleep(20000);
        mouseHoverToElementAndClick(Add2);
        sendTextToElement(Add2,add2);}
    By Zip = By.id("BillingNewAddress_ZipPostalCode");
    public void Zip(String zip){
        mouseHoverToElementAndClick(Zip);
        sendTextToElement(Zip,zip);}
    By Phnum = By.id("BillingNewAddress_PhoneNumber");
    public void PhNum(String number){
        mouseHoverToElementAndClick(Phnum);
        sendTextToElement(Phnum,number);}
        By FaxNum =By.id("BillingNewAddress_FaxNumber");
    public void FaxNum(String faxnumber){
        mouseHoverToElementAndClick(FaxNum);
        sendTextToElement(FaxNum,faxnumber);
    }
    // 2.28 Click on “CONTINUE”
    By ContinueButton2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    public void clickOnContinueButton2(){
        clickOnElement(ContinueButton2);
    }
    //        2.29 Click on Radio Button “2nd Day Air ($0.00)”
   By DayAir = By.xpath("//ul[@class='method-list']/li[2]/div[1]/input");
    public void selectDayAir(){
        clickOnElement(DayAir);
    }
    By ContinueButton3 = By.xpath("//div[@id='shipping-method-buttons-container']/button");
    public void continueButton3(){
        clickOnElement(ContinueButton3);
    }
    By CreditCard=  By.id("paymentmethod_1");
    By Visa  = By.xpath("//div[@id='payment-method-buttons-container']/button");
    public void clickOnCreditCard(){
        clickOnElement(CreditCard);
    }
    public void clickOnVisa(){
        clickOnElement(Visa);
    }
    By Cardholdername = By.id("CardholderName");
    public void setCardHolderName(String name){
        sendTextToElement(Cardholdername,name);
    }
    By Cardholdernumber = By.id("CardNumber");
    public void setCardHolderNumber(String number){
        sendTextToElement(Cardholdernumber,number);
    }
    By ExpireYear = By.id("ExpireYear");
    public void selectExpireYear(int year){
        selectByIndexFromDropDown(ExpireYear,year);
    }
    By CardCode = By.id("CardCode");
    public void setCardCode(String code){
        sendTextToElement(CardCode,code);
    }
    By ContinueCheckOut =By.xpath("//div[@id='payment-info-buttons-container']/button");
    public void clickOnContinueCheckOut() throws InterruptedException {
Thread.sleep(2000);
        mouseHoverToElement(ContinueCheckOut);
        mouseHoverToElementAndClick(ContinueCheckOut);
}
By VerifyPaymentMethod = By.xpath("//li[@class='payment-method']/span[2]");
    public String VerifyPaymentMethod(){
        return getTextFromElement(VerifyPaymentMethod);
    }
    By VerifyShippingMethod = By.xpath("//li[@class='shipping-method']/span[2]");
    public String verifyShippingMethod(){
        return getTextFromElement(VerifyShippingMethod);
    }
    By VerifyFinalTotal = By.xpath("//td[@class='subtotal']/span");
    public String VerifyFinalTotal(){
        return getTextFromElement(VerifyFinalTotal);
    }
    By Confirm = By.xpath("//div[@id='confirm-order-buttons-container']/button");
    public void clickOnConfirm(){
        clickOnElement(Confirm);
    }
    By ThankyouText = By.xpath("//div[@class='page checkout-page order-completed-page']/div[1]/h1");
    public String verifyThankYouText(){
        return getTextFromElement(ThankyouText);
    }
    By SuccessfulOrder = By.xpath("//div[@class='page checkout-page order-completed-page']/div[2]/div/div[1]");
    public String verifyOrderIsSuccessfully(){
        return getTextFromElement(SuccessfulOrder);
    }
    By Continue1 = By.xpath("//div[@class='section order-completed']/div[3]/button");
    public void continue1(){
        clickOnElement(Continue1);
    }
    By WelcomeMsg = By.xpath("//div[@class='topic-block-title']/h2");
    public String verifyWelcomeMsg(){
        return getTextFromElement(WelcomeMsg);
    }
    By LogOut = By.xpath("//div[@class='header-links']/ul/li[2]");
    public void clickOnLogOut(){
        clickOnElement(LogOut);
    }

}