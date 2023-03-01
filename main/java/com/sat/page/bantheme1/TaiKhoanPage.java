package com.sat.page.bantheme1;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.bantheme1.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;

public class TaiKhoanPage extends NavigationPage {

   //element
   @FindBy(xpath = "//strong[@class='block']")
   private WebElement trangDangNhap;

   @FindBy(xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
   private WebElement dangNhap;

   @FindBy(id = "username")
   private WebElement nhapEmail;

   @FindBy(id = "password")
   private WebElement nhapMatKhau;

   @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account']/a")
   private WebElement nhanTaiKhoan;

   @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']/a")
   private WebElement nhanThoat;

   @FindBy(xpath = "//div[@class='u-column1 col-1']")
   private WebElement trangDaThoat;

   @FindBy(xpath = "//div[@class='col-xs-12']/header/h1")
   private WebElement titleDangNhap;


    
    //method
    @Step
    public void clickTrangDangNhap() {
        //Utils.explicitWaitVOEL("//strong[@class='block']", 3);
        trangDangNhap.click();
    }
    
    @Step
    public void clickDangNhap() {
        //Utils.explicitWaitVOEL("//strong[@class='block']", 3);
        dangNhap.click();
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
    public void clickTaiKhoan(){
        nhanTaiKhoan.click();
    }

    @Step
    public void clickThoat(){
        nhanThoat.click();
    }

    @Step
    public void back(){
        DriverManager.getDriver().navigate().back();
    }

    @Step
    public String getTrangDaThoat() {
        return trangDaThoat.getText();
    }

    @Step
    public void newTab() {
        JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
        jse.executeScript("window.open()");
        Utils.hardWait(500);
        ArrayList<String> tabs = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
        DriverManager.getDriver().switchTo().window(tabs.get(1));
    }

    @Step
    public void closeOldTab() {
        ArrayList<String> tabs = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
        DriverManager.getDriver().switchTo().window(tabs.get(0));
        Utils.hardWait(500);
        DriverManager.getDriver().close();

    }

    @Step
    public void switchToTab(int idx) {
        ArrayList<String> tabs = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
        DriverManager.getDriver().switchTo().window(tabs.get(0));

    }

    @Step
    public String titleDangNhap() {
        return titleDangNhap.getText();
    }

    // private static void hardWait(int i) {
    // }

   
}

   

