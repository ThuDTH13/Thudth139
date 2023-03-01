package com.sat.page.bantheme1;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.bantheme1.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;

public class DangNhapPage extends NavigationPage {

   //element
   @FindBy(xpath = "//strong[@class='block']")
   private WebElement trangDangNhap;

   @FindBy(xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
   private WebElement dangNhap;

   @FindBy(xpath = "//ul[@class='woocommerce-error']")
   private WebElement ktDangNhap;

   @FindBy(id = "username")
   private WebElement nhapEmail;

   @FindBy(id = "password")
   private WebElement nhapMatKhau;

   @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']")
   private WebElement ktDangNhapThanhCong;
    
    //method
    @Step
    public void clickTrangDangNhap() {
        trangDangNhap.click();
    }
    
    @Step
    public void clickDangNhap() {
        dangNhap.click();
    }

    @Step
    public String getDangNhap() {
        return ktDangNhap.getText();
    }

    @Step
    public void nhapEmail(String email) { 
        nhapEmail.clear();
        nhapEmail.sendKeys(email);
    }

    @Step
    public void nhapMatKhau(String matkhau) { 
        nhapMatKhau.clear();
        nhapMatKhau.sendKeys(matkhau);
    }  

    @Step
    public String getDangNhapThanhCong() {
        return ktDangNhapThanhCong.getText();
    }

}

   

