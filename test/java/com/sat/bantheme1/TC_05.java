package com.sat.bantheme1;

import com.sat.page.bantheme1.TaiKhoanPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_05 extends BaseTest { 

    @Test
    public void verifyTC05() {
        TaiKhoanPage taiKhoanPage = new TaiKhoanPage(); 

        logger.info("1. Mở trang chủ ");
        taiKhoanPage.openHomepage();
        Utils.hardWait(); // cho 3s

        logger.info("2.Dăng nhập");
        taiKhoanPage.clickTrangDangNhap();
        taiKhoanPage.nhapEmail("thu.dth0648@sinhvien.hoasen.edu.vn");
        taiKhoanPage.nhapMatKhau("Hoaithu139@");
        taiKhoanPage.clickDangNhap();
        Utils.hardWait();

        logger.info("3. Mở tab mới");
        taiKhoanPage.newTab();
        Utils.hardWait();

        logger.info("4. Đóng tab cũ");
        taiKhoanPage.closeOldTab();
        Utils.hardWait();

        logger.info("5. Chuyển sang tab mới mở");
        taiKhoanPage.switchToTab(1);
        
        logger.info("6. Mở trang chủ");
        taiKhoanPage.openHomepage();

        logger.info("7. Mở trang đăng nhập");
        taiKhoanPage.clickTrangDangNhap();

        // Verify 1
        logger.info("Xác minh người dùng chuyển hướng tới trang quản lý tài khoản");
        Assert.assertTrue(taiKhoanPage.titleDangNhap().contains("Tài khoản"));

    }    
}


