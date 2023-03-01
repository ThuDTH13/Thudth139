package com.sat.bantheme1;

import com.sat.page.bantheme1.TaiKhoanPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_04 extends BaseTest { 

    @Test
    public void verifyTC04() {
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

        logger.info("3. Nhấn vào tài khoản");
        taiKhoanPage.clickTaiKhoan();
        Utils.hardWait();

        logger.info("4. Nhấn vào thoat");
        taiKhoanPage.clickThoat();
        Utils.hardWait();

        logger.info("5. Nhấn vào nút back");
        taiKhoanPage.back();
        Utils.hardWait();

        // Verify 1
        logger.info("Xác minh người dùng ko chuyển hướng tới trang quản lý tài khoản");
        Assert.assertTrue(taiKhoanPage.getTrangDaThoat().contains("Đăng nhập"));


    }    
}


