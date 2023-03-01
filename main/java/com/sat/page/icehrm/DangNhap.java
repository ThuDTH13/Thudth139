package com.sat.page.icehrm;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.icehrm.common.NavigationPage;
import com.sat.utils.Utils;
import org.testng.annotations.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

import java.util.List;

import org.junit.Assert;

public class DangNhap extends NavigationPage {

   //element
    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-info btn-medium w-100 rounded-5 text-uppercase']")
    private WebElement login;

    @FindBy(xpath = "/html/body")
    private WebElement ktBDangKy;

    
    
    
    @Step
    public int ktraDaky() { 
        List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//button[@class='btn btn-info btn-medium w-100 rounded-5 text-uppercase dangky']"));
        return elements.size();
    
    }
    
    
    //method
    @Step
    public void Username(String Username) { 
        username.clear();
        username.sendKeys(Username);
    }

    @Step
    public void Password(String Password) { 
        password.clear();
        password.sendKeys(Password);
    }


    @Step
    public void Login() {
        login.click();
    }

    @Step
    public String ele() {
      return ktBDangKy.getText();
    }

  
}

   

