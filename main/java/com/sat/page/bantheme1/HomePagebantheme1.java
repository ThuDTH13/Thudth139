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

public class HomePagebantheme1 extends NavigationPage {

   //element
   @FindBy(xpath = "//strong[@class='block']")
   private WebElement dangNhap;

   @FindBy(xpath = "//button[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']")
   private WebElement dangKy;

   @FindBy(xpath = "//ul[@class='woocommerce-error']")
   private WebElement ktDangKy;

   @FindBy(id = "reg_email")
   private WebElement nhapEmail;

    
    //method
    @Step
    public void clickDangNhap() {
        dangNhap.click();
    }
    
    @Step
    public void clickDangKy() {
        dangKy.click();
    }

    @Step
    public String getDangKy() {
        return ktDangKy.getText();
    }

    @Step
    public void nhapEmail(String email) { 
        nhapEmail.clear();
        nhapEmail.sendKeys(email);
    }

        

}

   

