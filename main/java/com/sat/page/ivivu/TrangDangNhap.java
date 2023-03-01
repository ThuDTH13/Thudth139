package com.sat.page.ivivu;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.ivivu.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;

public class TrangDangNhap extends NavigationPage {

    //element

    @FindBy(xpath = "//input[@name='EmailPhoneDN']")
    private WebElement nhapEmail;

    @FindBy(xpath = "//input[@name='PasswordDN']")
    private WebElement nhapMatKhau;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement nhanNutDangNhap;

    @FindBy(xpath = "//span[@class='username-header']")
    private WebElement ktDangNhap;

    
    //method

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
    public void nhanNutDangNhap() {
        nhanNutDangNhap.click();
    }

    @Step
    public String ktDangNhap() {
        return ktDangNhap.getText();
    }

   
}

   

