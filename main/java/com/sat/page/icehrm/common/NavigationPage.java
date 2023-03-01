package com.sat.page.icehrm.common;

import com.sat.config.Constants;
import com.sat.driver.DriverManager;
import com.sat.page.AbstractPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class NavigationPage extends AbstractPageObject {
    
    @Step
    public void openHomepage() {
        DriverManager.getDriver().get(Constants.Url_Base9);
    }

    @Step
    public void openUrl(String url) {
        DriverManager.getDriver().get(url);
    }

    @Step
    public String getTitle() {
        return DriverManager.getDriver().getTitle();
    }

    @Step
    public void back() {
        DriverManager.getDriver().navigate().back();
    }

    @Step
    public void forward() {
        DriverManager.getDriver().navigate().forward();
    }

}
