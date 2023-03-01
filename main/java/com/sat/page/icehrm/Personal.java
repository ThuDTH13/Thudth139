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

public class Personal extends NavigationPage {

   //element
   @FindBy(xpath = "//input[@id='employee_id']")
   private WebElement eNumber;

   @FindBy(xpath = "//input[@id='first_name']")
   private WebElement fName;

   @FindBy(xpath = "//input[@id='middle_name']")
   private WebElement mName;

   @FindBy(xpath = "//input[@id='last_name']")
   private WebElement lName;
    
   @FindBy(xpath = "//input[@id='rc_select_0']")
   private WebElement nationality;

   @FindBy(xpath = "//div[@label='Vietnamese']")
   private WebElement Vietnam;

   //method

  
   @Step
   public void ENumber(String employeeNumber) {
      eNumber.clear();
      eNumber.sendKeys(employeeNumber);
   }

   @Step
   public void FName(String firstName) {
      fName.clear();
      fName.sendKeys(firstName);
   }

   @Step
   public void MName(String middleName) {
      mName.clear();
      mName.sendKeys(middleName);
   }

   @Step
   public void LName(String lastName) {
      lName.clear();
      lName.sendKeys(lastName);
   }

   @Step
   public void Nationality() {
      nationality.click();
   }

   @Step
   public void VietNam() {
      Vietnam.click();
   }


}

   

