package com.sat.demoshop;

//import com.sat.page.demoshop.HomePage1;
import com.sat.page.demoshop.CartPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03 extends BaseTest { 

    @Test
    public void verifyTC03() {
        CartPage cartPage = new CartPage();

        logger.info("1. Mở trang chủ ");
        cartPage.openHomepage();
        Utils.hardWait();         
        
        logger.info("2. Nhấp vào nút Add to cart");
        for (int i = 1;  i < 6; i++) { // modify
            cartPage.clickAddToCart1();
            Utils.hardWait(500);
        }

        logger.info("3. Nhấp vào nút Add to cart");
        for (int j = 1; j < 6; j++){
            cartPage.clickAddToCart2();
            Utils.hardWait(500);
        }
         
        logger.info("Xác minh so luong");
        Assert.assertEquals(cartPage.getCart(), "10");
    }        
}


    


