package com.sat.page.ivivu;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.ivivu.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TrangChu extends NavigationPage {

    //element
    @FindBy(xpath = "//div[@class='img-wrapper']")
    private WebElement nhanTaiKhoan;

    @FindBy(xpath = "//span[@class='register-link']")
    private WebElement nhanLinkDangKy;

    @FindBy(xpath = "//btn[@class='btn btn-action btn-login-header']")
    private WebElement dangNhapTC;

    @FindBy(xpath = "//input[@class='form-control v_field__input search-input typeahead tt-input']")
    private WebElement timKiem;

    @FindBy(xpath = "//input[@class='form-control v_field__input search-input typeahead tt-input']")
    private WebElement timKiem1;

    @FindBy(xpath = "//strong[@class='tt-highlight']")
    private WebElement chonGY;

    @FindBy(xpath = "//div[@class='v_field__content']")
    private WebElement icon;

    @FindBy(xpath = "//p[@class='v_field__text ng-binding']")
    private WebElement phong;

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    private WebElement soLuongPhong;

    @FindBy(xpath = "//button[@ng-click=\"PlusOrMinusObject('adult','+',RoomNumber.value,AdultsConfig.length)\"]")
    private WebElement soLuongNguoiLon;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/button[2]/i[1]")
    private WebElement soLuongTreEm;

    @FindBy(xpath = "//div[@class='quantity ng-binding']")
    private WebElement ktPhong;
  
    @FindBy(xpath = "//*[@id='search-form-rooms']/div[2]/div/div[2]/div[1]/div")
    private WebElement ktNguoiLon;

    @FindBy(xpath = "//*[@id='search-form-rooms']/div[2]/div/div[3]/div[1]/div")
    private WebElement ktTreEm;

    //@FindBy(xpath = "//td[@data-t-date='1659139200000']")
    //private WebElement selectDate;

    //@FindBy(xpath = "//*[@id='check-in-date-search']/div[2]/div[2]/table/thead/tr[1]/th[3]")
    //private WebElement arrowNext;

    @FindBy(xpath = "//*[@id='hero-form']/div[2]/div/div[4]/button")
    private WebElement tim;

    //method

    @Step
    public void nhanTim() {
        tim.click();
    }

    @Step
    public String ktSlTreEm() { 
        return ktTreEm.getText();
    }

    @Step
    public String ktSlNguoiLon() { 
        return ktNguoiLon.getText();
    }

    @Step
    public String ktSlPhong() { 
        return ktPhong.getText();
    } 

    @Step
    public void nhanTaiKhoan() {
        nhanTaiKhoan.click();
    }

    @Step
    public void nhanLinkDangKy() {
        nhanLinkDangKy.click();
    }

    @Step
    public void dangNhapTC() {
        dangNhapTC.click();
    }

    @Step
    public void nhapTimKiem(String timkiem) { 
        timKiem.clear();
        timKiem.sendKeys(timkiem);
        DriverManager.getDriver().findElement(By.xpath("//input[@class='form-control v_field__input search-input typeahead tt-input']")).sendKeys(Keys.ENTER);
    }

    @Step
    public void nhapTimKiem1(String timkiem) { 
        timKiem1.clear();
        timKiem1.sendKeys(timkiem);
       
    }

    @Step
    public void chonGoiY() {
        chonGY.click();
    }

    @Step
    public void nhanIcon() {
        icon.click();
    }

    @Step
    public void nhanPhong() { 
        phong.click();
    }

    @Step
    public void nhanSoLuongPhong() { 
        soLuongPhong.click();
    }

    @Step
    public void nhanSoLuongNguoiLon() { 
        soLuongNguoiLon.click();
    }

    @Step
    public void nhanSoLuongTreEm() { 
        soLuongTreEm.click();
    }


    @Step
    public void selectDate(String month_year, String select_day) { 

        while(true) {

            System.out.println("111111111111111111111");

            List<WebElement> monthYear = DriverManager.getDriver().findElements(By.xpath("//th[@class='t-month']"));
            System.out.println("111111111111111111112");

            System.out.println(monthYear);
            System.out.println(monthYear.size());

            for (int i = 0; i < monthYear.size(); i++) {
                System.out.println("111111111111111111113");
                System.out.println(monthYear.get(i).getText());

                //Selecting the month
                if(monthYear.get(i).getText().equals(month_year)){ 



                    WebElement tableContainer = DriverManager.getDriver().findElements(By.xpath("//table[@class=\"t-table-condensed\"]")).get(i);

                    //Selecting the date 
                    List<WebElement> days = tableContainer.findElements(By.xpath(".//td[not(contains(@class,\"t-disabled\"))]"));

                    for (WebElement d:days){ 
                        System.out.println(d.getText());
                        if(d.getText().equals(select_day)){
                            d.click();
                            return;
                        }
                    } 
                }
            }
            System.out.println("111111111111111111114");
            Utils.hardWait();
            //arrowNext.click();
        }
    }
}
   

