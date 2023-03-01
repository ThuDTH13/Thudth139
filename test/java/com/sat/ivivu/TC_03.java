package com.sat.ivivu;

import com.sat.page.ivivu.TrangChu;
import com.sat.page.ivivu.TrangDangNhap;
import com.sat.utils.BaseTest;
import com.sat.utils.Utils;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class TC_03 extends BaseTest { 

    @Test
    public void verifyTC03() {

        TrangChu TC = new TrangChu();


        logger.info("1. Mở trang chủ ");
        TC.openHomepage();
        Utils.hardWait(500);      

        logger.info("2. Nhấn vào 2 người lớn, 0 trẻ em, 1 phòng");
        Utils.explicitWaitVOEL("//p[@class='v_field__text ng-binding']", 30); 
        TC.nhanPhong();
        Utils.hardWait(500);


        logger.info("3. Nhấn tối đa số phòng");
        Utils.explicitWaitVOEL("//i[@class='fa fa-plus']", 30); 
        for (int i = 1;  i < 10; i++) {
            TC.nhanSoLuongPhong();
        }
        Utils.hardWait(500);


        logger.info("Xác minh so luong phong");
        Assert.assertEquals(TC.ktSlPhong(), "9");

        
        logger.info("4. Nhấn tối đa số người lớn");
        Utils.explicitWaitVOEL("//button[@ng-click=\"PlusOrMinusObject('adult','+',RoomNumber.value,AdultsConfig.length)\"]", 30); 
        for (int i = 0;  i < 30; i++) {
            TC.nhanSoLuongNguoiLon();
        }
        Utils.hardWait(500);


        logger.info("Xác minh so luong nguoi lon");
        Assert.assertEquals(TC.ktSlNguoiLon(), "30");

     
        logger.info("5. Nhấn tối đa số trẻ em");
        Utils.explicitWaitVOEL("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/button[2]/i[1]", 30); 
        for (int i = 0;  i < 12; i++) {
            TC.nhanSoLuongTreEm();
        }
        Utils.hardWait(500);


        logger.info("Xác minh so luong tre em");
        Assert.assertEquals(TC.ktSlTreEm(), "12");

    }
    
}


