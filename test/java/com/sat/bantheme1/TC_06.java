package com.sat.bantheme1;

import com.sat.driver.DriverManager;
import com.sat.page.bantheme1.GioHangPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import io.appium.java_client.functions.ExpectedCondition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_06 extends BaseTest { 

    @Test
    public void verifyTC06() {
        GioHangPage gioHangPage = new GioHangPage(); 

        logger.info("1. Mở trang chủ ");
        gioHangPage.openHomepage();
        Utils.hardWait();

        logger.info("2. Nhấn tìm kiếm");
        gioHangPage.timKiem("Lốc lạnh (máy nén) xe Mercedes E CLass, GLK Class, SLK Class");;
        //Utils.explicitWaitVOEL("//input[@class='form-control js-typeahead tt-input']", 5);
        Utils.hardWait();

        logger.info("3. Nhấn vào đề xuất");
        gioHangPage.deXuat();
        //Utils.hardWait(); // 3s

        logger.info("4. Nhấn vào thêm vào giỏ hàng");
        Utils.explicitWaitVOEL("//button[@class='single_add_to_cart_button button alt']", 30);
        gioHangPage.themVaoGio();
        //Utils.hardWait();

        // Verify 1
        logger.info("Xác minh sản phẩm đã thêm vào giỏ hàng");
        Assert.assertTrue(gioHangPage.ktSanPham().contains("Lốc lạnh (máy nén) xe Mercedes E CLass, GLK Class, SLK Class"));

        logger.info("5. Xóa sản phẩm");
        //Utils.explicitWaitVOEL("//td[@class='product-remove']", 30);
        gioHangPage.xoaSP();
        Utils.hardWait();

        // Verify 2
        logger.info("Xác minh sản phẩm đã bị xoá không còn xuất hiện tại trang giỏ hàng");
        Assert.assertTrue(gioHangPage.ktXoaSanPham().contains("Quay trở lại cửa hàng"));
    }    
}


