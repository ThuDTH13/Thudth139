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

public class TC_04 extends BaseTest { 

    @Test
    public void verifyTC04() {

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

        logger.info("4. Nhập Email, mật khẩu");  
        Utils.explicitWaitVOEL("//input[@name='EmailPhoneDN']", 30);     
        TDN.nhapEmail("qwerty@gmail.com");
        Utils.explicitWaitVOEL("//input[@name='PasswordDN']", 30);       
        TDN.nhapMatKhau("12345678");
        //Utils.hardWait(500);
        
        logger.info("5. Nhấp vào nút đăng nhập"); 
        //Utils.explicitWaitVOEL("//button[@type='submit']", 30);            
        TDN.nhanNutDangNhap();
        Utils.hardWait();

        logger.info("6. Nhập địa điểm Phú Quốc"); 
        Utils.explicitWaitVOEL("//input[@class='form-control v_field__input search-input typeahead tt-input']", 30);       
        TC.nhapTimKiem1("Phú Quốc");
        Utils.hardWait(500);

        logger.info("7. Nhập địa điểm gợi ý Phú Quốc"); 
        Utils.explicitWaitVOEL("//strong[@class='tt-highlight']", 30);       
        TC.chonGoiY();
        Utils.hardWait(500);

        logger.info("8. Nhấn icon"); 
        Utils.explicitWaitVOEL("//div[@class='col-xs-6 no-padding check-in  t-check-in']", 30);       
        //TC.nhanIcon();
        Utils.hardWait(500);

        logger.info("9. Chọn ngày đi"); 
        //Utils.explicitWaitVOEL("//th[@class='t-month']", 30);       
        TC.selectDate("Th 08 2022", "1");
        Utils.hardWait(1000);

        logger.info("10. Chọn ngày về "); 
        TC.selectDate("Th 08 2022", "7");
        Utils.hardWait(1000);

        logger.info("11. Nhấp vào nút tìm"); 
        Utils.explicitWaitVOEL("//*[@id='hero-form']/div[2]/div/div[4]/button", 300);            
        TC.nhanTim();
        Utils.hardWait(2000);


        logger.info("12. Nhấp vào gợi ý khách sạn"); 
        //Utils.explicitWaitVOEL("//p[@class='name limit-length']", 30);            
        TKS.chonKS();
        Utils.hardWait(2000);


        logger.info(".... Chuyển sang tab mới mở");
        TDP.switchToTab(1);
        Utils.hardWait(3000);

      
        logger.info("13. Nhấp vào đặt phòng");   
        Utils.explicitWaitVOEL("//b[@class='ng-scope']", 100);     
        TDP.datPhong();
        Utils.hardWait(2000);

        logger.info("14. Nhấp vào nút yêu cầu đặt phòng");   
        //Utils.explicitWaitVOEL("//button[@class='btn btn-warning next-button']", 10);     
        TTT.nhanYCDP();
        Utils.hardWait(2000);

        logger.info("15.Xóa tên có sẵn "); 
        //Utils.explicitWaitVOEL("//p[@class='name limit-length']", 30);            
        TTT.clearTen();
        Utils.hardWait();

        logger.info("16.Xóa email có sẵn "); 
        //Utils.explicitWaitVOEL("//p[@class='name limit-length']", 30);            
        TTT.clearTen();
        Utils.hardWait();

        logger.info("17. Nhấp vào nút yêu cầu đặt phòng");   
        //Utils.explicitWaitVOEL("//button[@class='btn btn-warning next-button']", 10);     
        TTT.nhanYCDP();
        Utils.hardWait(2000);

        logger.info("Xác minh vui lòng nhập đầy đủ họ tên");
        Assert.assertEquals(TTT.ktTEN(),"Vui lòng nhập đầy đủ họ tên");

        logger.info("Xác minh số di động không đúng định dạng");
        Assert.assertEquals(TTT.ktTEN(),"Số di động không đúng định dạng");


    }
    
}


