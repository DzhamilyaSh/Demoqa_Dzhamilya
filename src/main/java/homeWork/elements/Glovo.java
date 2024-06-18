package homeWork.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Glovo {
        private WebDriver driver;

        @Test
        public void glovoTest() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            driver.get("https://glovoapp.com/kg/ru/bishkek/");
            Thread.sleep(5000);



            WebElement eda = driver.findElement(By.linkText("Еда"));
            eda.click();


            WebElement domino = driver.findElement(By.xpath("//a[@href='/kg/ru/bishkek/domino1-bsk/']"));
            domino.click();


            WebElement lemonads = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/section[1]/div[2]/div[2]/div[3]/div[3]/div/div[1]/div/div[2]/div[3]/div/div[2]/button/span/img"));
            lemonads.click();

}}
