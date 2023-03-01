package com.sat.bantheme1;

import com.sat.page.bantheme1.SanPhamPage;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03 extends BaseTest { 

    @Test
    public void verifyTC03() {
        SanPhamPage sanPhamPage = new SanPhamPage(); 

        logger.info("1. Mở trang chủ ");
        sanPhamPage.openHomepage();
        Utils.hardWait(); // cho 3s

        logger.info("2. Nhấn vào tìm kiếm");
        sanPhamPage.nhapTimKiem("Lốc lạnh xe Mercedes");
        Utils.hardWait();

        logger.info("3. Nhấn vào đê xuất");
        sanPhamPage.clickDeXuat();
        Utils.hardWait();

        logger.info("4. Nhấn vào nút thêm vào giỏ hàng");
        sanPhamPage.clickThemVaoGio();
        Utils.hardWait();

        logger.info("5. Nhấn vào nút thanh toán");
        sanPhamPage.clickThanhToan();
        Utils.hardWait();

        // Verify 1
        logger.info("Xác minh thanh toán");
        Assert.assertTrue(sanPhamPage.getktThanhToan().contains("Thanh toán"));


    }    
}


