package com.demoqa.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImageUploader {
    private WebDriver driver;
    private WebDriverWait wait;

    public ImageUploader(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Метод для загрузки изображения
    public void uploadImage(String imagePath, By uploadButtonLocator) {
        WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(uploadButtonLocator));
        uploadButton.sendKeys(imagePath);

    }
}