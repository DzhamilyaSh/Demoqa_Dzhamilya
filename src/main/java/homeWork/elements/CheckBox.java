package homeWork.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckBox {

    private WebDriver driver;

    @BeforeClass
    public  void textBox(){
  System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

    driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

   @Test
    public void textBoxTest() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        WebElement checkBox = driver.findElement(By.xpath("//span[text()='Check Box']"));
        checkBox.click();

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")));
        WebElement button = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
        button.click();
        Thread.sleep(2000);



       WebElement pushButtonHome = driver.findElement(By.xpath("//span[text()='Home']"));
        pushButtonHome.click();
       Thread.sleep(2000);

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Home']")));

       boolean result = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#result"), "home\n" +
               "desktop\n" +
               "notes\n" +
               "commands\n" +
               "documents\n" +
               "workspace\n" +
               "react\n" +
               "angular\n" +
               "veu\n" +
               "office\n" +
               "public\n" +
               "private\n" +
               "classified\n" +
               "general\n" +
               "downloads\n" +
               "wordFile\n" +
               "excelFile"));
       Assert.assertTrue(result);

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Desktop']")));

    WebElement pushButtonDesktop = driver.findElement(By.xpath("//span[text()='Desktop']"));
        pushButtonDesktop.click();
       Thread.sleep(2000);

    boolean result1 = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#result"),
            "documents\n" +
                    "workspace\n" +
                    "react\n" +
                    "angular\n" +
                    "veu\n" +
                    "office\n" +
                    "public\n" +
                    "private\n" +
                    "classified\n" +
                    "general\n" +
                    "downloads\n" +
                    "wordFile\n" +
                    "excelFile"));
       Assert.assertTrue(result1);


       WebElement pushButtonDocuments = driver.findElement(By.xpath("//span[text()='Documents']"));
       pushButtonDocuments.click();

       Thread.sleep(2000);

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Documents']")));

       boolean result2 = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#result"),
               "downloads\n" +
                       "wordFile\n" +
                       "excelFile"));
       Assert.assertTrue(result2);

       WebElement pushButtonDownloads = driver.findElement(By.xpath("//span[text()='Downloads']"));
       pushButtonDownloads.click();
       Thread.sleep(2000);


       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Downloads']")));

       boolean result3 = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > div:nth-child(4)"),
               ""));
       Assert.assertTrue(result3);


}
    @AfterClass
    public void tearDown() {
            driver.close();
            driver.quit();
        }
    }



