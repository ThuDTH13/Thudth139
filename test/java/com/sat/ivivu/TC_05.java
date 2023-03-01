package com.sat.ivivu;

import com.sat.page.ivivu.TrangChu;
import com.sat.page.ivivu.TrangDangNhap;
import com.sat.page.ivivu.TrangDatPhong;
import com.sat.page.ivivu.TrangKhachSan;
import com.sat.page.ivivu.TrangThanhToan;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_05 extends BaseTest { 

    @Test
    public void verifyTC05() {

        TrangChu TC = new TrangChu();
        TrangDangNhap TDN = new TrangDangNhap(); 
        TrangKhachSan TKS = new TrangKhachSan();
        TrangDatPhong TDP = new TrangDatPhong();
        TrangThanhToan TTT = new TrangThanhToan();


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


        logger.info("7. Nhập địa điểm Phú Quốc"); 
        Utils.explicitWaitVOEL("//input[@class='form-control v_field__input search-input typeahead tt-input']", 10);       
        TC.nhapTimKiem("Phú Quốc");
        Utils.hardWait(5000);


        logger.info("8. Nhấp vào gợi ý khách sạn"); 
        //Utils.explicitWaitVOEL("//p[@class='name limit-length']", 30);            
        TKS.chonKS();
        Utils.hardWait(2000);


        logger.info(".... Chuyển sang tab mới mở");
        TDP.switchToTab(1);
        Utils.hardWait();

      
        logger.info("9. Nhấp vào đặt phòng");   
        Utils.explicitWaitVOEL("//div[@class='col-xs-12 col-sm-12 no-padding hotel-reservation__actions hidden-xs have-price']", 10);     
        TDP.datPhong();
        Utils.hardWait(2000);


        logger.info("10. Nhấp vào button xuất hóa đơn điện tử");   
        Utils.explicitWaitVOEL("//input[@class='customizedCheckbox']", 10);     
        TTT.thanhToan();
        Utils.hardWait(2000);


        logger.info("Xác minh so luong tre em");
        Assert.assertEquals(TTT.ktTTXHDon(), "Thông tin xuất hóa đơn");
    }
    
}


