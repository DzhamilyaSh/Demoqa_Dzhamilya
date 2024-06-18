package com.demoqa.helper;

import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHelper {
    private WebDriver driver = DriverManager.getDriver();

    public AlertHelper(WebDriver driver) {
        this.driver = driver;
    }

    public Alert getAlert() {
        return driver.switchTo().alert();
    }

    public void acceptAlert() {
        getAlert().accept();
    }
    public void dismissAlert() {
        getAlert().dismiss();
    }

    public String getAlertText() {
        return getAlert().getText();

    }

    public boolean isAlertPresent(){
        driver.switchTo().alert().accept();
        return true;


    }

    public void acceptAlertIfPresented() {
        if (!isAlertPresent())
            return;
        acceptAlert();
    }

    public void dismissAlertIfPresented() {
        if (!isAlertPresent())
            return;
        dismissAlert();
    }

   public void acceptPrompt(String txt) {
        if(!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.accept();
   }

   public void dismissPrompt(String txt) {
        if(!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.dismiss();
   }


}

