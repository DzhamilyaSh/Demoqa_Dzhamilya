package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.DropdownHelper;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebElementActions webElementActions;

    public DropdownHelper dropDownHelper = new DropdownHelper(DriverManager.getDriver());
    public BasePage(){
        this.driver = DriverManager.getDriver();
//        PageFactory.initElements(DriverManager.getDriver(), this);
        PageFactory.initElements(driver, this);
        this.webElementActions = new WebElementActions(driver);

    }


}
