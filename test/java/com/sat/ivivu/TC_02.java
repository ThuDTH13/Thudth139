package com.sat.ivivu;

import com.sat.page.ivivu.TrangChu;
import com.sat.page.ivivu.TrangDangNhap;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02 extends BaseTest { 

    @Test
    public void verifyTC02() {

        TrangChu TC = new TrangChu();
        TrangDangNhap TDN = new TrangDangNhap(); 

        logger.info("1. Mở trang chủ ");
        TC.openHomepage();
        Utils.hardWait(500);      

        logger.info("2. Nhấp vào tài khoản"); 
        Utils.explicitWaitVOEL("//div[@class='img-wrapper']", 30);       
        TC.nhanTaiKhoan();
        //Utils.hardWait(500);

        logger.info("3. Nhấp vào đăng nhập ở trang chủ");
        Utils.explicitWaitVOEL("//btn[@class='btn btn-action btn-login-header']", 30);          
        TC.dangNhapTC();
        //Utils.hardWait(500);

        logger.info("4. Nhập Email");  
        Utils.explicitWaitVOEL("//input[@name='EmailPhoneDN']", 30);     
        TDN.nhapEmail("qwerty@gmail.com");
        //Utils.hardWait(500);

        logger.info("5. Nhập mật khẩu"); 
        Utils.explicitWaitVOEL("//input[@name='PasswordDN']", 30);       
        TDN.nhapMatKhau("12345678");
        //Utils.hardWait(500);
        
        logger.info("6. Nhấp vào nút đăng nhập"); 
        //Utils.explicitWaitVOEL("//button[@type='submit']", 30);            
        TDN.nhanNutDangNhap();
        Utils.hardWait();

        // Verify 1
        logger.info("Xác minh đăng nhập thành công");
        logger.info(TDN.ktDangNhap());
        Assert.assertTrue(TDN.ktDangNhap().contains("qwerty@gmailcom") );
    }
    
}


