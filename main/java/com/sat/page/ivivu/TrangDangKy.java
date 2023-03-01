package com.sat.page.ivivu;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.ivivu.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;

public class TrangDangKy extends NavigationPage {


    //element
    @FindBy(xpath = "//form[@id='registerForm']//div[@class='col-xs-12 no-padding login-form']//button[@class='btn btn-login col-xs-12']")
    private WebElement nhanNutDangKy;

    @FindBy(xpath = "//form[@id='registerForm']//div[@class='col-xs-12 no-padding login-form']//input[@class='form-control input-lg']")
    private WebElement ktEmail;

    @FindBy(xpath = "//form[@id='registerForm']//div[@class='col-xs-12 no-padding login-form']//input[@class='form-control input-lg']")
    private WebElement nhapEmail;

    @FindBy(xpath = "//input[@name='PasswordDK']")
    private WebElement nhapMatKhau;

    @FindBy(xpath = "//input[@title='Mật khẩu tối thiểu 6 ký tự !']")
    private WebElement xacNhanMatKhau;

    @FindBy(xpath = "//input[@name='EmailDK' and @required]")
    private WebElement nameTextbox;

    @FindBy(xpath = "//div//input[@name='PasswordDK']")
    private WebElement passwordMessage;

    @FindBy(xpath = "//div//input[@name='PasswordDK']")
    private WebElement ktMatKhau;

    @FindBy(xpath = "//*[@id='registerForm']/div/div[3]/div/small")
    private WebElement dieuKhoan;




    //method
    @Step
    public void nhanNutDangKy() {
        nhanNutDangKy.click();
    }

    @Step
    public void ktEmail() {
        ktEmail.click();
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
    public void xacNhanMatKhau(String matkhau) { 
        xacNhanMatKhau.clear();
        xacNhanMatKhau.sendKeys(matkhau);
    }


    @Step
    public Boolean isEmailReuired(){

        WebElement nameTextbox = DriverManager.getDriver().findElement(By.xpath("//input[@name='EmailDK' and @required]"));

        return nameTextbox.isDisplayed(); //true /false
    }


    public String getHtml5ValidationMessage(WebElement element) {
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
       
        return (String) jsExecutor.executeScript("return arguments[0].validationMessage;", element);
    }


    @Step
    public String getPasswordMes(){

        System.out.println("passwordMessage");

        String passwordMessage = this.getHtml5ValidationMessage(DriverManager.getDriver().findElement(By.xpath("//div//input[@name='PasswordDK' and @required]")));

        System.out.println(passwordMessage);
        
        return passwordMessage;
    }




    public String getHtml5ValidationMessage1 (WebElement element) {
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
       
        return (String) jsExecutor.executeScript("return arguments[0].validationMessage;", element);
    }

    @Step
    public String getPasswordMes1(){

        System.out.println("passwordMessage");

        String passwordMessage = this.getHtml5ValidationMessage(DriverManager.getDriver().findElement(By.xpath("//div//input[@name='PasswordDK']")));

        System.out.println(passwordMessage);
        
        return passwordMessage;
    }

    @Step
    public String ktDieuKhoan() {
        return dieuKhoan.getText();
    }
    

}

   

