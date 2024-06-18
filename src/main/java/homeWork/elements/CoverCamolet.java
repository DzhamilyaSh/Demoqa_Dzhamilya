package homeWork.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class CoverCamolet {
    private WebDriver driver;

    @Test
    public void foodTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://dostavka312.kg/");
        Thread.sleep(5000);

//        driver.get("https://dostavka312.kg/category/11");
        WebElement eda = driver.findElement(By.xpath("/html/body/section[3]/div/div/div[2]/div[1]/a/img"));
        eda.click();

        Thread.sleep(3000);

        WebElement national = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/div/p[2]/a/img"));
        national.click();
        Thread.sleep(3000);

        WebElement kithen = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/article[2]/div/div/div[2]/div[13]/div/div[2]/div[2]/a"));
        kithen.click();

        WebElement salads = driver.findElement(By.xpath("//a[contains(text(),'Салаты')]"));
        salads.click();
        Thread.sleep(3000);

        WebElement salad = driver.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[3]/div[10]/div/div[2]/form/button"));
        salad.click();
        Thread.sleep(3000);

        WebElement hotEda = driver.findElement(By.xpath("//a[text()='Вторые блюда']"));
        hotEda.click();
        Thread.sleep(3000);

        WebElement lagman = driver.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[5]/div[5]/div/div[2]/form/button"));
        lagman.click();
        Thread.sleep(3000);

        WebElement lemonads = driver.findElement(By.xpath("//a[text()='Напитки']"));
        lemonads.click();
        Thread.sleep(3000);

        WebElement sok = driver.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[9]/div[3]/div/div[2]/form/button"));
        sok.click();
        Thread.sleep(3000);

        driver.get("https://dostavka312.kg/cart");


        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Ваше имя']"));
        fullName.sendKeys("Dzhamilya");
        Thread.sleep(3000);

        WebElement address = driver.findElement(By.xpath("//input[@placeholder='Адрес']"));
        address.sendKeys("Bishkek123");
        Thread.sleep(3000);

        WebElement number = driver.findElement(By.xpath("//input[@placeholder='Ваш телефон']"));
        number.sendKeys("123456789");
        Thread.sleep(3000);

        WebElement money = driver.findElement(By.xpath("//input[@placeholder='Сдача с']"));
        money.sendKeys("2000");
        Thread.sleep(3000);

        WebElement zakaz = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/button[1]"));
        zakaz.click();
        Thread.sleep(3000);

            }}








