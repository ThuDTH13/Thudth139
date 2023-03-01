package com.sat.page.ivivu;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.ivivu.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TrangThanhToan extends NavigationPage {

    //element
    @FindBy(xpath = "//input[@class='customizedCheckbox']")
    private WebElement tt;

    @FindBy(xpath = "//*[@id='registercustomerortherformhodon']/div[2]/h2")
    private WebElement ktTTXHD;

    @FindBy(xpath = "//button[@class='btn btn-warning next-button']")
    private WebElement ycdp;
   
    @FindBy(xpath = "//input[@class='form-control input-sm auto-name-fill']")
    private WebElement ten;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "customername")
    private WebElement ktTen;

    @FindBy(id = "phone")
    private WebElement ktDT;

    //method

    @Step
    public String ktDT() { 
        return ktDT.getText();
    }

    @Step
    public String ktTEN() { 
        return ktTen.getText();
    }

    @Step
    public void clearEmail() { 
        email.clear();  
    } 

    @Step
    public void clearTen() { 
        ten.clear();  
    } 

    @Step
    public void nhanYCDP() {
        ycdp.click();
    }

    @Step
    public void thanhToan() {
        tt.click();
    }

    @Step
    public String ktTTXHDon() { 
        return ktTTXHD.getText();
    }
   
}

    
   

