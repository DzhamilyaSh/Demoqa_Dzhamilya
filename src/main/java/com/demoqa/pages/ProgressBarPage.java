package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBarPage extends BasePage {

    @FindBy(id = "startStopButton")
    public WebElement progressBarStart;

    @FindBy(className = "progress-bar")
    public WebElement progressBar1;
}