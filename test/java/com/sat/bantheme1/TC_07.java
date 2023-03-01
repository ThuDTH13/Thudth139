package com.sat.bantheme1;

import com.sat.page.bantheme1.GioHangPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_07 extends BaseTest { 

    @Test
    public void verifyTC07() {
        GioHangPage gioHangPage = new GioHangPage(); 

        logger.info("1. Mở trang chủ ");
        gioHangPage.openHomepage();
        Utils.hardWait();

        logger.info("2. Nhấn tìm kiếm");
        gioHangPage.timKiem("Lốc lạnh (máy nén) xe Mercedes E CLass, GLK Class, SLK Class");
        Utils.hardWait();

        logger.info("3. Nhấn vào đê xuất");
        gioHangPage.deXuat();
        Utils.hardWait();

        logger.info("4. Nhấn vào thêm vào giỏ hàng");
        Utils.explicitWaitVOEL("//button[@class='single_add_to_cart_button button alt']", 30);
        gioHangPage.themVaoGio();
        //Utils.hardWait();

        logger.info("5. Nhấn thêm sản phẩm 30 lần");
        Utils.explicitWaitVOEL("//button[@class='plus']", 30);
        for (int i = 1;  i < 31; i++) {
            gioHangPage.themSP();
            //Utils.hardWait();
        }

        logger.info("6. Nhấn vào cập nhật giỏ hàng");
        Utils.explicitWaitVOEL("//button[@class='button']", 30);
        gioHangPage.capNhatGH();
        Utils.hardWait();

        logger.info("7. Kiểm tra tổng tiền trong giỏ là chính xác");
        String actualResult = gioHangPage.tongDonGia(31);
        String expectedResult = gioHangPage.tongGia();
        Assert.assertEquals(actualResult, expectedResult);
    }    
}


