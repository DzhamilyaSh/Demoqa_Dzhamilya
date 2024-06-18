package homeWork.elements;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TextBox {
    private WebDriver driver;

    @BeforeClass
    public void textBoxTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));

    }
    @Test
    public void testFormSubmission() throws InterruptedException {

        String fullName1 = "Dzhamilya";
        String email1 = "dzhama_sh@gmail.com";
        String currentAddress1 = "Bishkek123";
        String permanentAddress1 = "Bishkek123";


        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(fullName1);
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(email1);
        Thread.sleep(2000);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(currentAddress1);
        Thread.sleep(2000);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(permanentAddress1);
        Thread.sleep(2000);


        WebElement submit = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submit).click().perform();
        Thread.sleep(2000);


        String submitName = driver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
        System.out.println(submitName);



        String submitEmail = driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
        System.out.println(submitEmail);



        String submitCurAdd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div/p[3]")).getText();
        System.out.println(submitCurAdd);


        String submitPerAdd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div/p[4]")).getText();
        System.out.println(submitPerAdd);

        submitName = submitName.replace("Name:", "");
        submitEmail = submitEmail.replace("Email:", "");
        submitCurAdd = submitCurAdd.replace("Current Address :", "");
        submitPerAdd = submitPerAdd.replace("Permananet Address :", "");


        Assert.assertEquals(fullName1, submitName);
        Assert.assertEquals(email1, submitEmail);
        Assert.assertEquals(currentAddress1, submitCurAdd);
        Assert.assertEquals(permanentAddress1, submitPerAdd);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}