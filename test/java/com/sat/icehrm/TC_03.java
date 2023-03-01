package com.sat.icehrm;

import com.sat.page.icehrm.DangNhap;
import com.sat.page.icehrm.TrangChu;
import com.sat.page.icehrm.Personal;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_03 extends BaseTest { 

    @Test() 
    public void verifyTC02() {
        DangNhap DN = new DangNhap(); 
        TrangChu TC = new TrangChu();
        Personal P = new Personal();

        logger.info("1. Mở trang chủ ");
        DN.openHomepage();
        Utils.hardWait(); // cho 3s

        logger.info("2. Đăng nhập với tài khoản Admin ");
        DN.Username("admin");
        DN.Password("admin");
        DN.Login();
        Utils.hardWait();

        logger.info("3. Vào Employee -> click AddNew ");
        TC.Employee();
        TC.Employee1();
        TC.AddNew();
        Utils.hardWait();

        logger.info("4. Điền toàn bộ thông tin ");
        P.ENumber("111");
        P.FName("Mai");
        P.MName("Anh"); 
        P.LName("Hoa");
        P.Nationality();
        Utils.hardWait(1000);
        P.VietNam();
        Utils.hardWait(1000);
    }
       
    
}


