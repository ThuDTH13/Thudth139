package com.sat.demoshop;

//import com.sat.page.demoshop.HomePage1;
import com.sat.page.demoshop.CartPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02 extends BaseTest { 

    @Test
    public void verifyTC02() {
        CartPage cartPage = new CartPage();

        logger.info("1. Mở trang chủ ");
        cartPage.openHomepage();
        Utils.hardWait(); 

        
        
        logger.info("2. Nhấp vào nút Add to cart");

        //for 
        // L1 : i = 0, i = i +1 = 1
        // L2: i = 1 , ...., i = 2
        // L10: i = 9, ...., i =10
        // L11: i = 10, ......xxxxxx
        for (int i = 0;  i < 10; i++) {
            //addToCart1.click();
            cartPage.clickAddToCart1();
            //Utils.hardWait(500); // 3s
        }


       

        logger.info("Xác minh so luong");
        Assert.assertEquals(cartPage.getCart(), "10");

    }

    

    
}


