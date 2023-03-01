package com.sat.bantheme1;

import com.sat.page.bantheme1.DangNhapPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02 extends BaseTest { 

    @Test
    public void verifyTC02() {
        DangNhapPage dangNhapPage = new DangNhapPage(); 

        logger.info("1. Mở trang chủ ");
        dangNhapPage.openHomepage();
        Utils.hardWait(); // cho 3s

        logger.info("2. Nhấn vào trang đăng nhập");
        dangNhapPage.clickTrangDangNhap();
        Utils.hardWait();

        logger.info("3. Nhấn vào nút đăng nhập");
        dangNhapPage.clickDangNhap();
        Utils.hardWait();

        // Verify 1
        logger.info("Xác minh đăng nhập lần 1");
        Assert.assertTrue(dangNhapPage.getDangNhap().contains("Yêu cầu tên tài khoản."));

        logger.info("4. Nhập vào form Email lần 1");
        dangNhapPage.nhapEmail("qwerty@gmail.com");
        Utils.hardWait();

        logger.info("5. Nhấn vào nút đăng nhập");
        dangNhapPage.clickDangNhap();
        Utils.hardWait();

        // Verify 2
        logger.info("Xác minh đăng nhập lần 2");
        Assert.assertTrue(dangNhapPage.getDangNhap().contains("Mục nhập mật khẩu trống."));

        logger.info("6. Nhập vào form Email lần 2");
        dangNhapPage.nhapEmail("qwerty@gmail.com");
        Utils.hardWait();

        logger.info("7. Nhập vào mật khẩu lần 1");
        dangNhapPage.nhapMatKhau("123456");
        Utils.hardWait();

        logger.info("8. Nhấn vào nút đăng nhập");
        dangNhapPage.clickDangNhap();
        Utils.hardWait();

        // Verify 3
        logger.info("Xác minh đăng nhập lần 3");
        Assert.assertTrue(dangNhapPage.getDangNhap().contains("Địa chỉ email không xác định. Kiểm tra lại hoặc thử tên người dùng của bạn."));

        logger.info("9. Nhập vào form Email lần 3");
        dangNhapPage.nhapEmail("thu.dth0648@sinhvien.hoasen.edu.vn");
        Utils.hardWait();

        logger.info("10. Nhập vào mật khẩu  lần 2");
        dangNhapPage.nhapMatKhau("Hoaithu139@");
        Utils.hardWait();

        logger.info("11. Nhấn vào nút đăng nhập");
        dangNhapPage.clickDangNhap();
        Utils.hardWait();

        // Verify 4
        logger.info("Xác minh đăng nhập lần 4");
        Assert.assertTrue(dangNhapPage.getDangNhapThanhCong().contains("Xin chào "));

    }

    

    
}


