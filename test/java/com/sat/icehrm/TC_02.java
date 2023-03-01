package com.sat.icehrm;

import com.sat.page.icehrm.DangNhap;
import com.sat.page.icehrm.TrangChu;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_02 extends BaseTest { 

    @Test(dataProvider = "data") 
    public void verifyTC02(String Username, String Password) {
        DangNhap DN = new DangNhap(); 
        TrangChu TC = new TrangChu();
        
        logger.info("1. Mở trang chủ ");
        DN.openHomepage();
        Utils.hardWait(); // cho 3s

        // System.setProperty("webdriver.chrome.driver", "Path of the driver");
        // WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        // driver.get("https://icehrm-open.gamonoid.com/login.php#");
        // driver.findElement(By.id("username")).clear();
        // driver.findElement(By.id("username")).sendKeys(Username);
        // driver.findElement(By.id("password")).clear();
        // driver.findElement(By.id("password")).sendKeys(Password);

        
        DN.Username(Username);
        System.out.println("Đăng nhập với username: " + Username);

        DN.Password(Password);
        System.out.println("Đăng nhập với Password: " + Password);

        logger.info("2. Nhấn vào nút Login ");
        DN.Login();
        Utils.hardWait();

        logger.info("Xác minh đăng nhập thành công");
        Assert.assertEquals(TC.ktLogo(), "ICE Hrm");
    }

    @DataProvider(name = "data")
    public Object [][] TestDataFeed(){
        
        Object [][] twitterdata = new Object[4][2];
        twitterdata[0][0]="admin";
        twitterdata[0][1]="admin";

        twitterdata[1][0]="manager";
        twitterdata[1][1]="demouserpwd";

        twitterdata[2][0]="user1";
        twitterdata[2][1]="demouserpwd";

        twitterdata[3][0]="user2";
        twitterdata[3][1]="demouserpwd";

        return twitterdata;

    }
    
}


