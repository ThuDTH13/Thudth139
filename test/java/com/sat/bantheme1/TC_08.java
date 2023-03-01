package com.sat.bantheme1;

import com.sat.page.bantheme1.GioHangPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_08 extends BaseTest { 

    @Test
    public void verifyTC08() {
        GioHangPage gioHangPage = new GioHangPage(); 

        logger.info("1. Mở trang chủ ");
        gioHangPage.openHomepage();
        Utils.hardWait();

        logger.info("2. Nhấn tìm kiếm");
        gioHangPage.timKiem("Lốc lạnh (máy nén) xe Mercedes E CLass, GLK Class, SLK Class");
        //Utils.explicitWaitVOEL("//input[@class='form-control js-typeahead tt-input']", 3000);
        Utils.hardWait();

        logger.info("3. Nhấn vào đê xuất");
        gioHangPage.deXuat();
        //Utils.explicitWaitVOEL("//a[@class='tt-selectable']", 3000);
        Utils.hardWait();

        logger.info("4. Nhấn vào thêm vào giỏ hàng");  
        Utils.explicitWaitVOEL("//button[@class='single_add_to_cart_button button alt']", 30);
        gioHangPage.themVaoGio();
        //Utils.hardWait();

        logger.info("5. Xóa sản phẩm");
        //Utils.explicitWaitVOEL("//td[@class='product-remove']", 30);
        gioHangPage.xoaSP();
        Utils.hardWait();

        // Verify 1
        logger.info("Xác minh sản phẩm đã bị xoá không còn xuất hiện tại trang giỏ hàng");
        Assert.assertTrue(gioHangPage.ktXoaSanPham().contains("Quay trở lại cửa hàng"));

        logger.info("6. Khôi phục sản phẩm");
        gioHangPage.khoiPhuc();
        Utils.hardWait();

        // Verify 2
        logger.info("Xác minh sản phẩm vừa xoá được khôi phục");
        Assert.assertTrue(gioHangPage.ktSanPham().contains("Lốc lạnh (máy nén) xe Mercedes E CLass, GLK Class, SLK Class"));

    
    }    
}


