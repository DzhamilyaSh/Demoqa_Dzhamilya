import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class AutomationPracticeFormTest {
    @Test
    public void testFillFormRandomly() {

        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe"); // Убедитесь, что путь правильный

        // Создаем экземпляр веб-драйвера Chrome
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        try {
            // Открываем веб-страницу с формой
            driver.get("https://demoqa.com/automation-practice-form");

            // Создаем экземпляр Faker для генерации случайных данных
            Faker faker = new Faker();
            Random random = new Random();

            // Заполняем поля формы
            WebElement firstName = driver.findElement(By.id("firstName"));
            firstName.sendKeys(faker.name().firstName());

            WebElement lastName = driver.findElement(By.id("lastName"));
            lastName.sendKeys(faker.name().lastName());

            WebElement userEmail = driver.findElement(By.id("userEmail"));
            userEmail.sendKeys(faker.internet().emailAddress());

            List<WebElement> genders = driver.findElements(By.xpath("//input[@name='gender']/following-sibling::label"));
            genders.get(random.nextInt(genders.size())).click();

            WebElement userNumber = driver.findElement(By.id("userNumber"));
            userNumber.sendKeys(faker.phoneNumber().subscriberNumber(10));

            WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
            dateOfBirthInput.click();
            WebElement monthSelect = driver.findElement(By.className("react-datepicker__month-select"));
            Select month = new Select(monthSelect);
            month.selectByIndex(random.nextInt(12));
            WebElement yearSelect = driver.findElement(By.className("react-datepicker__year-select"));
            Select year = new Select(yearSelect);
            year.selectByValue(String.valueOf(faker.number().numberBetween(1900, 2023)));
            List<WebElement> days = driver.findElements(By.className("react-datepicker__day"));
            days.get(random.nextInt(days.size())).click();

            WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
            subjectsInput.sendKeys("Maths");
            subjectsInput.sendKeys("\n");

            List<WebElement> hobbies = driver.findElements(By.className("custom-control-label"));
            hobbies.get(random.nextInt(hobbies.size())).click();

            WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
            uploadPicture.sendKeys("C:/Users/NOTNIK_KG/OneDrive/Desktop/domestic-dog_thumb_square.avif");

            WebElement currentAddress = driver.findElement(By.id("currentAddress"));
            currentAddress.sendKeys(faker.address().fullAddress());

            WebElement state = driver.findElement(By.id("react-select-3-input"));
            state.sendKeys("NCR");
            state.sendKeys("\n");

            WebElement city = driver.findElement(By.id("react-select-4-input"));
            city.sendKeys("Delhi");
            city.sendKeys("\n");

            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
        } finally {
            // Закрываем браузер
            driver.quit();
        }
    }
}