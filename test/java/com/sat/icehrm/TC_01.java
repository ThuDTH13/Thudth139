package com.sat.icehrm;

import com.sat.page.icehrm.DangNhap;

import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 extends BaseTest { 

    @Test
    public void verifyTC01() {
        DangNhap DN = new DangNhap(); 
        

        logger.info("1. Mở trang chủ ");
        DN.openHomepage();
        Utils.hardWait(); 

        logger.info("Xác minh không có button đăng ký");
       
        Assert.assertEquals(DN.ktraDaky(),0);
    }

    

    
}


