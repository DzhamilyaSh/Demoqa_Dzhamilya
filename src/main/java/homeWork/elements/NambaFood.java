
package homeWork.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

            public class NambaFood {
                private WebDriver driver;

                @Test
                public void nambaFoodTest() throws InterruptedException {
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                    driver.manage().window().maximize();
                    driver.get("https://nambafood.kg/");
                    Thread.sleep(5000);


                    WebElement eda = driver.findElement(By.xpath("/html/body/main/section[3]/a"));
                    Assert.assertNotNull(eda, "Элемент не найден"); // Проверяем, что элемент найден
                    eda.click();


                    WebElement kithen = driver.findElement(By.xpath("/html/body/div/main/section[3]/div/a/div"));
                    kithen.click();
                    Thread.sleep(5000);

                    WebElement alligator = driver.findElement(By.xpath("//div[normalize-space(text()) = 'Кафе Alligator Green']"));
                    alligator.click();
                    Thread.sleep(5000);

                    WebElement salads = driver.findElement(By.xpath("//a[@data-tag='14']"));
                    salads.click();
                    Thread.sleep(5000);

                    WebElement shefSalat = driver.findElement(By.xpath("//*[@id=\"14\"]/div/div[2]/div[2]/button"));
                    shefSalat.click();

                    WebElement korzina = driver.findElement(By.id("basket_icon"));
                    korzina.click();
                    Thread.sleep(10000);


                }

                @AfterMethod
                public void close() throws InterruptedException {
                    Thread.sleep(5000);
                    driver.close();
                    driver.quit();

                }
            }