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

public class TrangDatPhong extends NavigationPage {

    //element
    @FindBy(xpath = "//b[@class='ng-scope']")
    private WebElement dp;

   



    //method

   

    @Step
    public void datPhong() {
        dp.click();
    }

    @Step
    public void switchToTab(int idx) {
       ArrayList<String> tabs = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
       DriverManager.getDriver().switchTo().window(tabs.get(idx));
    }
}

    
   

