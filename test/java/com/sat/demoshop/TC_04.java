package com.sat.demoshop;

import com.sat.page.demoshop.CartPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_04 extends BaseTest { // tinh ke thua

    @Test
    public void verifyTC04() {
        CartPage cartPage = new CartPage(); // tinh dong goi trong java

        logger.info("1. Mở trang chủ ");
        cartPage.openHomepage();
        Utils.hardWait(); // cho 3s

        // Verify 1
        logger.info("Xac minh Logo");
        Assert.assertTrue(cartPage.isLogoDisplay());
        

        logger.info("2. Nhấp vào nút Add to cart");      
        cartPage.clickAddToCart1();
        Utils.hardWait(500);
     

        // Verify 2
        logger.info("Xác minh so luong");
        Assert.assertEquals(cartPage.getCart(), "1");

        //Assert.assertTrue(ele.isDisplayed());

        logger.info("3. Nhấp vào nút Cart");       
        cartPage.clickCart();
        Utils.hardWait(500);

        // Verify 3
        logger.info("Xac minh Cart Count");
        Assert.assertTrue(cartPage.getProductName().contains("Khaki Suede Polish Work Boots"));
        
        logger.info("4. Nhập vào form Email");
        cartPage.enterEmail("thu@gmail.com");
        Utils.hardWait();

        logger.info("5. Nhập vào Credit Cart");
        cartPage.enterCartNumber("4242 4242 4242 4242");
        Utils.hardWait();
        

        logger.info("6. Nhập vào Date");
        cartPage.enterDate("1025");
        Utils.hardWait();

        logger.info("7. Nhập vào CVC");
        cartPage.enterCVC("123");
        Utils.hardWait();

        logger.info("8. Nhập vào Zip");
        cartPage.enterZip("12345");
        Utils.hardWait();
        
        logger.info("9. Nhấp vào nút Pay with credit cart");
        cartPage.clickPayCart();
        Utils.hardWait(); 

        logger.info("Xac minh thanh toán thành công");
        Assert.assertTrue(cartPage.getpayment().contains("Success!"));

    }
    
}


