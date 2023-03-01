package com.sat.demoshop;

import com.sat.page.demoshop.HomePage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01 extends BaseTest { // tinh ke thua

    @Test
    public void verifyTC01() {
        HomePage homePage = new HomePage(); // tinh dong goi trong java

        logger.info("1. Mở trang chủ ");
        homePage.openHomepage();
        Utils.hardWait(); // cho 3s

        logger.info("2. Nhấp vào nút Add to cart");
        homePage.clickAddToCart1();
        Utils.hardWait();

        logger.info("3. Nhấp vào nút Add to cart");
        homePage.clickAddToCart2();
        Utils.hardWait();

        logger.info("4. Nhấp vào nút Add to cart");
        homePage.clickAddToCart3();
        Utils.hardWait();

        // logger.info("5. Nhấp vào nút Add to cart");
        // homePage.clickAddToCart3();
        // Utils.hardWait();

        // logger.info("6. Nhấp vào nút Add to cart");
        // homePage.clickAddToCart4();
        // Utils.hardWait();

        logger.info("Xác minh so luong");
        Assert.assertEquals(homePage.getCart(), "3");

    }

    

    
}


