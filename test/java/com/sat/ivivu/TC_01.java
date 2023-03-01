package com.sat.ivivu;

import com.sat.page.ivivu.TrangChu;
import com.sat.page.ivivu.TrangDangKy;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01 extends BaseTest { 

    @Test
    public void verifyTC01() {

        TrangChu TC = new TrangChu();
        TrangDangKy TDK = new TrangDangKy(); 

        logger.info("1. Mở trang chủ ");
        TC.openHomepage();
        Utils.hardWait(500);      

        logger.info("2. Nhấp vào tài khoản"); 
        Utils.explicitWaitVOEL("//div[@class='img-wrapper']", 30);       
        TC.nhanTaiKhoan();
        //Utils.hardWait(500);

        logger.info("3. Nhấp vào link đăng ký");
        Utils.explicitWaitVOEL("//span[@class='register-link']", 30);          
        TC.nhanLinkDangKy();
        //Utils.hardWait(500);

        logger.info("4. Nhấp vào nút đăng ký");  
        Utils.explicitWaitVOEL("//form[@id='registerForm']//div[@class='col-xs-12 no-padding login-form']//button[@class='btn btn-login col-xs-12']", 30);       
        TDK.nhanNutDangKy();
        //Utils.hardWait(500);

        // Verify 1
        logger.info("Xác minh Email field");
        Assert.assertTrue(TDK.isEmailReuired());
        
        // logger.info("5. Nhập Email");  
        Utils.explicitWaitVOEL("//form[@id='registerForm']//div[@class='col-xs-12 no-padding login-form']//input[@class='form-control input-lg']", 30);     
        TDK.nhapEmail("qwerty@gmail.com");
        //Utils.hardWait(500);

        logger.info("6. Nhấp vào nút đăng ký lần 2"); 
        Utils.explicitWaitVOEL("//form[@id='registerForm']//div[@class='col-xs-12 no-padding login-form']//button[@class='btn btn-login col-xs-12']", 30);      
        TDK.nhanNutDangKy();
        Utils.hardWait();



        // Verify 2
        logger.info("Xác minh mật khẩu field");
        Assert.assertEquals(TDK.getPasswordMes(), "Please fill out this field.");




        logger.info("7. Nhập mật khẩu"); 
        Utils.explicitWaitVOEL("//input[@name='PasswordDK']", 30);       
        TDK.nhapMatKhau("123");
        //Utils.hardWait(500);
        
        logger.info("8. Nhấp vào nút đăng ký lần 3"); 
        Utils.explicitWaitVOEL("//form[@id='registerForm']//div[@class='col-xs-12 no-padding login-form']//button[@class='btn btn-login col-xs-12']", 30);            
        TDK.nhanNutDangKy();
        //Utils.hardWait(500);




        // Verify 3
        logger.info("Xác minh mật khẩu tối thiểu 6 ký tự");
        Assert.assertEquals(TDK.getPasswordMes1(), "Mật khẩu tối thiểu 6 ký tự");




        logger.info("9. Nhập mật khẩu"); 
        Utils.explicitWaitVOEL("//input[@name='PasswordDK']", 30);       
        TDK.nhapMatKhau("12345678");
        //Utils.hardWait(500);

        logger.info("10. Xác nhận mật khẩu");  
        Utils.explicitWaitVOEL("//input[@title='Mật khẩu tối thiểu 6 ký tự !']", 30);      
        TDK.xacNhanMatKhau("12345678");
        //Utils.hardWait(500);

        logger.info("8. Nhấp vào nút đăng ký lần 4"); 
        Utils.explicitWaitVOEL("//form[@id='registerForm']//div[@class='col-xs-12 no-padding login-form']//button[@class='btn btn-login col-xs-12']", 30);            
        TDK.nhanNutDangKy();
        //Utils.hardWait(500);

        // Verify 4
        logger.info("Xác minh điều khoản");
        Assert.assertTrue(TDK.ktDieuKhoan().contains("Bạn phải đồng ý với điều khoản của iVIVU !") );

        
    }
    
}


