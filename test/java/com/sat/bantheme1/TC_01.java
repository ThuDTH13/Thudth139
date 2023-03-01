package com.sat.bantheme1;

import com.sat.page.bantheme1.HomePagebantheme1;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01 extends BaseTest { 

    @Test
    public void verifyTC01() {
        HomePagebantheme1 homePage = new HomePagebantheme1(); 

        logger.info("1. Mở trang chủ ");
        homePage.openHomepage();
        Utils.hardWait(); // cho 3s

        logger.info("2. Nhấn vào nút đăng nhập");
        homePage.clickDangNhap();
        Utils.hardWait();

        logger.info("3. Nhấn vào nút đăng ký");
        homePage.clickDangKy();
        Utils.hardWait();

        // Verify 1
        logger.info("Xác minh đăng ký lần 1");
        Assert.assertTrue(homePage.getDangKy().contains(" Vui lòng cung cấp địa chỉ email hợp lệ."));

        logger.info("4. Nhập vào form Email lần 1");
        homePage.nhapEmail("123@456");
        Utils.hardWait();

        logger.info("5. Nhấn vào nút đăng ký");
        homePage.clickDangKy();
        Utils.hardWait();

        // Verify 2
        logger.info("Xác minh đăng ký lần 2");
        Assert.assertTrue(homePage.getDangKy().contains(" Vui lòng cung cấp địa chỉ email hợp lệ."));

        logger.info("6. Nhập vào form Email lần 2");
        homePage.nhapEmail("qwerty@gmail.com");
        homePage.clickDangKy();
        Utils.hardWait();

        // Verify 3
        logger.info("Xác minh đăng ký lần 3");
        logger.info(homePage.getDangKy());
        Assert.assertTrue(homePage.getDangKy().contains(" Vui lòng nhập mật khẩu tài khoản."));


    }

    

    
}


