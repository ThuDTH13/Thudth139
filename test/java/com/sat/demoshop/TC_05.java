package com.sat.demoshop;

import com.sat.page.demoshop.CartPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_05 extends BaseTest { // tinh ke thua

    @Test
    public void verifyTC05() {
        CartPage cartPage = new CartPage(); // tinh dong goi trong java

        logger.info("1. Mở trang chủ ");
        cartPage.openHomepage();
        Utils.hardWait(); // cho 3s

        logger.info("2. Nhấp vào nút Add to cart 1");      
        cartPage.clickAddToCart1();
        Utils.hardWait(500);

        logger.info("2. Nhấp vào nút Add to cart 2");      
        cartPage.clickAddToCart2();
        Utils.hardWait(500);

        logger.info("3. Nhấp vào nút Cart");       
        cartPage.clickCart();
        Utils.hardWait(500);
        
        logger.info("Xác minh giá item 1");
        //Assert.assertEquals(homePage.checkItemPrice1(), "149.99");

        logger.info("Xác minh giá item 2");
        //Assert.assertEquals(homePage.checkItemPrice2(), "39.99");

        logger.info("Xác minh tong tien");
        // Assert.assertEquals(homePage.checkTotalPrice(), "189.98");

        String actualResult = cartPage.totalPriceOfTwoItem();
        String expectedResult = cartPage.checkTotalPrice();
        Assert.assertEquals(actualResult, expectedResult);
    }
    
}


