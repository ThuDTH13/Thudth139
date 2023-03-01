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

public class SanPhamPage extends NavigationPage {

   //element
   @FindBy(id = "s")
   private WebElement timKiem;

   @FindBy(xpath = "//a[@class='tt-selectable']")
   private WebElement deXuat;

   @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
   private WebElement themVaoGio;

   @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
   private WebElement thanhToan;

   @FindBy(xpath = "//h1[@class='avo-b font18 red mb20 entry-title']")
   private WebElement ktThanhToan;
    
    //method
    @Step
    public void nhapTimKiem(String timkiem) {
        timKiem.clear();
        timKiem.sendKeys(timkiem);
    }
    
    @Step
    public void clickDeXuat() {
        deXuat.click();
    }

    @Step
    public void clickThemVaoGio() {
        themVaoGio.click();
    }

    @Step
    public void clickThanhToan() {
        thanhToan.click();
    }

    @Step
    public String getktThanhToan() {
        return ktThanhToan.getText();
    }

        

}

   

