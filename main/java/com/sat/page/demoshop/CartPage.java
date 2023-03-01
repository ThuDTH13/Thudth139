package com.sat.page.demoshop;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.demoshop.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;

public class CartPage extends NavigationPage {

   //element
   @FindBy(xpath = "//button[@class='add']")
   private WebElement addToCart1;

   @FindBy(xpath = "//*[@id='__layout']/div/div/main/div[2]/section/div[2]/button")
   private WebElement addToCart2;

   @FindBy(xpath = "//*[@id='__layout']/div/div/main/div[2]/section/div[3]/button")
   private WebElement addToCart3;

   @FindBy(xpath = "//*[@id='__layout']/div/div/div[1]/nav/div/a[2]/div/div")
   private WebElement Cart;

   @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[1]/nav/div/a[1]")
   private WebElement Logo;


    @FindBy(xpath = "//*[@id='__layout']/div/div/div[2]/div/div[1]/div/h4")
    private WebElement ProductName; 

    @FindBy(xpath = "//*[@id='email']")
    private WebElement EnterEmail;

    @FindBy(xpath = "//*[@id='__layout']/div/div/div[2]/div/h2")
    private WebElement payment;

    @FindBy(xpath = "//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")
    private WebElement enterCartNumber;

    @FindBy(xpath = "//*[@id=\"root\"]/form/div/div[2]/span[2]/span/span/input")
    private WebElement enterDate;

    @FindBy(xpath = "//*[@id='root']/form/div/div[2]/span[3]/span/span/input")
    private WebElement enterCVC;

    @FindBy(xpath = "//*[@id='root']/form/div/div[2]/span[3]/span/span/input")
    private WebElement enterZip;

    @FindBy(xpath = "//*[@id='__layout']/div/div/div[2]/div/div[3]/div/button")
    private WebElement PayCart;

    @FindBy(xpath = "//*[@id='__layout']/div/div/div[2]/div/div[1]/div/p[2]/strong")
    private WebElement itemPrice1;

    @FindBy(xpath = "//*[@id='__layout']/div/div/div[2]/div/div[2]/div/p[2]/strong")
    private WebElement itemPrice2;

    @FindBy(xpath = "//*[@id='__layout']/div/div/div[2]/div/div[3]/h3")
    private WebElement totalPrice;
    
    //method
    @Step
    public void clickAddToCart1() {
        addToCart1.click();

    }
    @Step
    public void clickAddToCart2() {
        addToCart2.click();
    }

    @Step
    public void clickAddToCart3() {
        addToCart3.click();
    }

    @Step
    public void clickCart() {
        Cart.click();
    }

    @Step
    public Object getCart() {
        return Cart.getText();
    }

    @Step
    public Boolean isLogoDisplay() {
        return Logo.isDisplayed();
    }

    @Step
    public String getProductName(){
        return ProductName.getText();
    }

    @Step
    public void enterEmail(String email) { // method
        EnterEmail.sendKeys(email);
    }

    @Step
    public void enterCartNumber(String number) {
        DriverManager.getDriver().switchTo().frame(0);
        String cartNumber = "//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input";
        WebElement cartNumberInput = DriverManager.getDriver().findElement(By.xpath(cartNumber));
        cartNumberInput.sendKeys("4242 4242 4242 4242");
        DriverManager.getDriver().switchTo().defaultContent();
    }


    @Step
    public void enterDate(String date) {
        DriverManager.getDriver().switchTo().frame(0);
        String eDate = "//*[@id=\"root\"]/form/div/div[2]/span[2]/span/span/input";
        WebElement enterDateInput = DriverManager.getDriver().findElement(By.xpath(eDate));
        enterDateInput.sendKeys("1025");
        DriverManager.getDriver().switchTo().defaultContent();
    }

    @Step
    public void enterCVC(String cvc) {
        DriverManager.getDriver().switchTo().frame(0);
        String eCVC = "//*[@id='root']/form/div/div[2]/span[3]/span/span/input";
        WebElement enterCVCInput = DriverManager.getDriver().findElement(By.xpath(eCVC));
        enterCVCInput.sendKeys("123");
        DriverManager.getDriver().switchTo().defaultContent();
    }

    @Step
    public void enterZip(String zip) {
        DriverManager.getDriver().switchTo().frame(0);
        String eZip = "//*[@id='root']/form/div/div[2]/span[4]/span/span/input";
        WebElement enterZipInput = DriverManager.getDriver().findElement(By.xpath(eZip));
        enterZipInput.sendKeys("12345");
        DriverManager.getDriver().switchTo().defaultContent();
    }

    @Step
    public void clickPayCart() {
        PayCart.click();
    }

    @Step
    public String getpayment(){
        return payment.getText();
    }

    @Step
    public String checkItemPrice1() {
        return itemPrice1.getText();
    }

    @Step
    public String checkItemPrice2() {
        return itemPrice2.getText();
    }   

    // total price
    @Step
    public String checkTotalPrice() {
        return totalPrice.getText(); //$189.98
    }

    // get sum of tưo items
    @Step
    public String totalPriceOfTwoItem() {
        System.out.println("1111111");
        String itemPrice1 = checkItemPrice1();
        String itemPrice2 = checkItemPrice2();
        //String totalPrice = checkTotalPrice();


        System.out.println("1111112");
        Float price1 = Float.parseFloat(itemPrice1);
        System.out.println("1111112b");
        Float price2 = Float.parseFloat(itemPrice2);
        System.out.println("1113");
        Float totalPrice1 = price1 + price2; // 
        System.out.println("1114");
        System.out.println(totalPrice1); // 189.98001
        System.out.println("salary : " + String.format("%.2f", totalPrice1));


        String totalPrice1Str = "Total: $" + String.format("%.2f", totalPrice1); 
        
        //String expectedResult = t1.getText();
        //String actualResult   = totalPrice.getText();
        
        

        // convert int 1 & 2 -> tinh tong



        /// convert tong thanh string

        
        //int expected = itemPrice1 + itemPrice2; // 1, 2 = 3 -> string '3'


        // int i=10;
        // String s=Integer.toString(i);//Now it will return "10"




        //@Step
        //public String priceTwoProducts (){

        //String price1 = priceProduct1.getText();
        //float price1Float = Float.parseFloat(price1);

        //String price2 = priceProduct2.getText();
        //float price2Float = Float.parseFloat(price2);

        //String totalPrice =  String.format("%.2f", (price1Float + price2Float));
        
        //return "Total: $" + totalPrice ;
    //}

        return totalPrice1Str;
       
        
      }

}

   

