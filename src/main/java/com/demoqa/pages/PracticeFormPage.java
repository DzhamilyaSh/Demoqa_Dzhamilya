package com.demoqa.pages;

import com.demoqa.entities.PracticeFormEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class PracticeFormPage extends BasePage {
    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    public WebElement genderInput;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")
    public WebElement genderInput2;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")
    public WebElement genderInput3;

    @FindBy(id = "userNumber")
    public WebElement mobileNumberInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "subjectsContainer")
    public WebElement subjectInput;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")
    public WebElement hobbiesInput;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]")
    public WebElement hobbiesInput2;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]")
    public WebElement hobbiesInput3;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPictureInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "state")
    public WebElement stateInput;

    @FindBy(xpath = "//*[@id=\"city\"]//div[contains(@class,'css-1hwfws3')]")
    public WebElement cityInput;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id="closeLargeModal")
    public WebElement closeAlert;

    private final Random random = new Random();

    private final List<WebElement> genderOptions = List.of(genderInput, genderInput2, genderInput3);
    private final List<WebElement> hobbiesOptions = List.of(hobbiesInput, hobbiesInput2, hobbiesInput3);

    public PracticeFormPage fillPracticeForm(PracticeFormEntity practiceFormEntity) throws InterruptedException {
        webElementActions.sendKeys(firstNameInput, practiceFormEntity.getFirstName())
                .sendKeys(lastNameInput, practiceFormEntity.getLastName());
        Thread.sleep(1000); // Пауза для видимости

        webElementActions.sendKeys(emailInput, practiceFormEntity.getEmail());
        Thread.sleep(1000); // Пауза для видимости

        webElementActions.click(genderOptions.get(random.nextInt(genderOptions.size())));
        Thread.sleep(1000); // Пауза для видимости

        webElementActions.sendKeys(mobileNumberInput, practiceFormEntity.getMobile());
        Thread.sleep(1000); // Пауза для видимости

        selectRandomDate();

        webElementActions.click(subjectInput);
        webElementActions.jsSendKeys(subjectInput, practiceFormEntity.getSubjects());
        Thread.sleep(1000); // Пауза для видимости

        webElementActions.click(hobbiesOptions.get(random.nextInt(hobbiesOptions.size())))
                .sendKeys(currentAddressInput, practiceFormEntity.getCurrentAddress())
                .click(stateInput);

        // Выбор случайного штата
        List<WebElement> states = webElementActions.getElements(By.xpath("//div[contains(@id,'react-select-3-option')]"));
        WebElement randomState = states.get(random.nextInt(states.size()));
        randomState.click();
        Thread.sleep(1000);

        // Выбор случайного города
        webElementActions.click(cityInput);
        List<WebElement> cities = webElementActions.getElements(By.xpath("//div[contains(@id,'react-select-4-option')]"));
        WebElement randomCity = cities.get(random.nextInt(cities.size()));
        randomCity.click();
        Thread.sleep(1000);

        // Загрузка фотографии
        webElementActions.sendKeys(uploadPictureInput, "C:/Users/NOTNIK_KG/OneDrive/Desktop/domestic-dog_thumb_square.avif");

        // Отправка формы
        webElementActions.click(submitButton)
                .jsClick(closeAlert);
        return this;

    }

    private void selectRandomDate() throws InterruptedException {
        webElementActions.click(dateOfBirthInput);

        // Выбор случайного месяца и года
        WebElement monthSelect = driver.findElement(By.className("react-datepicker__month-select"));
        WebElement yearSelect = driver.findElement(By.className("react-datepicker__year-select"));

        int randomMonth = random.nextInt(12);
        int randomYear = random.nextInt(2024 - 1900 + 1) + 1900; // Random year between 1900 and 2024

        webElementActions.selectByIndex(monthSelect, randomMonth);
        webElementActions.selectByValue(yearSelect, String.valueOf(randomYear));
        Thread.sleep(1000); // Пауза для видимости

        // Выбор случайного дня
        List<WebElement> days = driver.findElements(By.className("react-datepicker__day"));
        WebElement randomDay = days.get(random.nextInt(days.size()));
        webElementActions.click(randomDay);
        Thread.sleep(1000); // Пауза для видимости
    }
}
//        public PracticeFormPage selectDateMonthYear(String dateMonthYear) {
//            String [] dateMonthYearParts = dateMonthYear.split(" ");
//            String date = dateMonthYearParts[0];
//            String month = dateMonthYearParts[1];
//            String year = dateMonthYearParts[2];
//
//            webElementActions.click(datePickerBtn);
//
//            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
//
//            WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-select")));
//            WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));
//
//            dropdownHelper.selectByVisibleText(monthDropDown,month)
//                    .selectByVisibleText(yearDropDown,year);
//
//            WebElement day = wait.until(ExpectedConditions.elementToBeClickable(
//                    By.xpath("//div[contains(@class,'react-datepicker__day') and not (contains(@class, 'react-datepicker__day--outside-month')) and text()='"+ date +"']")));
//            return this;
//
//
//        }










//    WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
//            uploadPicture.sendKeys("C:/Users/NOTNIK_KG/OneDrive/Desktop/domestic-dog_thumb_square.avif");

















