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
import org.openqa.selenium.JavascriptExecutor;

public class TrangKhachSan extends NavigationPage {

    //element
    @FindBy(xpath = "//p[@class='name limit-length']")
    private WebElement ks;

   

    //method
    @Step
    public void chonKS() {
        ks.click();
    }

   
}

    
   

