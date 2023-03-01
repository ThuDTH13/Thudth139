package com.sat.page.demoshop;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.demoshop.common.NavigationPage;
import com.sat.utils.Utils;

import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.junit.Assert;

public class HomePage extends NavigationPage {

   //element
   @FindBy(xpath = "//button[@class='add']")
   private WebElement addToCart1;

   @FindBy(xpath = "//*[@id='__layout']/div/div/main/div[2]/section/div[2]/button")
   private WebElement addToCart2;

   @FindBy(xpath = "//*[@id='__layout']/div/div/main/div[2]/section/div[3]/button")
   private WebElement addToCart3;

   @FindBy(xpath = "//*[@id='__layout']/div/div/div[1]/nav/div/a[2]/div/div")
   private WebElement Cart;

   @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[1]/nav/div/a[1]")
   private WebElement Logo;


    //method
    @Step
    public void clickAddToCart1() {
        addToCart1.click();

    }
    @Step
    public void clickAddToCart2() {
        addToCart2.click();
    }

    @Step
    public void clickAddToCart3() {
        addToCart3.click();
    }

    @Step
    public void clickCart() {
        Cart.click();
    }

    @Step
    public Object getCart() {
        return Cart.getText();
    }

   

}

   

