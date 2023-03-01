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
import org.junit.Assert;

public class TrangChu extends NavigationPage {

   //element
   @FindBy(xpath = "//div[@class='logo logoResponsive']")
   private WebElement ktlogo;

   @FindBy(xpath = "//li[@ref='admin_Employees']")
   private WebElement employees;

   @FindBy(xpath = "//ul[@id='admin_Employees']")
   private WebElement employee1;

   @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
   private WebElement addNew;
    
   //  @FindBy(xpath = "//*[@id='employeeLink']")
   //  private WebElement nhan;

   //method

  
   @Step
   public String ktLogo() {
      return ktlogo.getText();
   }

   @Step
   public void Employee() {
      employees.click();
   }

   @Step
   public void Employee1() {
      employee1.click();
   }

   @Step
   public void AddNew() {
      addNew.click();
   }

   // @Step
   // public void Nhan() {
   //    nhan.click();
   // }


}

   

