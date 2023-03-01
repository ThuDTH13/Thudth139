package com.sat.page.bantheme1;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.bantheme1.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;

public class GioHangPage extends NavigationPage {

   //element
    @FindBy(xpath = "//input[@class='form-control js-typeahead tt-input']")
    private WebElement timKiem;

    @FindBy(xpath ="//a[@class='tt-selectable']")
    private WebElement deXuat;

    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    private WebElement themVaoGio;

    @FindBy(xpath = "//td[@class='product-name']/a")
    private WebElement ktSanPham;

    @FindBy(xpath = "//td[@class='product-remove']")
    private WebElement xoaSP;

    @FindBy(xpath = "//a[@class='button wc-backward']")
    private WebElement ktXoaSanPham;
    
    @FindBy(xpath = "//button[@class='plus']")
    private WebElement themSP;

    @FindBy(xpath = "//button[@class='button']")
    private WebElement capNhatGH;

    @FindBy(xpath = "//a[@class='restore-item']")
    private WebElement khoiPhuc;

    @FindBy(xpath = "//tr[@class=\"woocommerce-cart-form__cart-item cart_item\"]/td[@class=\"product-price\"]//span[@class='woocommerce-Price-amount amount']")
    private static WebElement gia1SP;


    @FindBy(xpath = "//tr[@class='order-total']/td//span[@class='woocommerce-Price-amount amount']")
    private static WebElement tongGia;


    //method
    @Step
    public void timKiem(String timkiem) {
        timKiem.clear();
        timKiem.sendKeys(timkiem);
    }
    
    @Step
    public void deXuat() { 
        deXuat.click();
    }

    @Step
    public void themVaoGio() { 
        themVaoGio.click();
    }

    @Step
    public String ktSanPham() {
        return ktSanPham.getText();
    }

    @Step
    public void xoaSP() { 
        xoaSP.click();
    }

    @Step
    public String ktXoaSanPham() {
        return ktXoaSanPham.getText();
    }

    @Step
    public void themSP() { 
        themSP.click();
    }

    @Step
    public void capNhatGH() { 
        capNhatGH.click();
    }

    @Step
    public void khoiPhuc() { 
        khoiPhuc.click();
    }
   
    //@Step
    //public String gia1SP() {
    //    return gia1SP.getText();
    //}

    @Step
    public String tongGia() {

        String unit = tongGia.getText();
        String removeLastCharUnit = Utils.removeLastChar(unit); // 12,500,000

        return removeLastCharUnit.replace(",", ""); 
    }

    @Step
    public String tongDonGia(int number) {
        String unit = gia1SP.getText(); //
        String removeLastCharUnit = Utils.removeLastChar(unit); // 12,500,000
        removeLastCharUnit = removeLastCharUnit.replace(",", ""); // 12500000

        float unitFloat = Float.parseFloat(removeLastCharUnit);

        //String number = numberProduct.getAttribute("value");
        //int numberInt = Integer.parseInt(number);

        float total = (unitFloat * number); // e....
        BigDecimal totalBD = new BigDecimal(total); // 12500000
        String totalPrice = totalBD.toString();
        return totalPrice; 
    }

    //@Step
    //public String checkTongGia() {
    //    String gia1SP = gia1SP();
    //    Float giaSP = Float.parseFloat(gia1SP);
    //    Float gia31SP = giaSP*31;
    //   System.out.println(gia31SP); 
    //    String gia31SPStr = String.format("%f",gia31SP);
    //    return gia31SPStr; 
    //}

    //@Step
    //public static String tongGiaTuTinh (){

        //String gia1SP = giaSP.getText();
        //float gia1SPFloat = Float.parseFloat(gia1SP);

        //String tongGiaTuTinh =  String.format("%f", (gia1SPFloat*31));
        
        //return tongGiaTuTinh ;
}


   

