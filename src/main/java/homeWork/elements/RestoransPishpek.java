package homeWork.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class RestoransPishpek {

    private WebDriver driver;

    @Test
    public void foodTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://dostavka312.kg/");


        WebElement eda = driver.findElement(By.xpath("//span [text()='Eды']"));
        eda.click();

        Thread.sleep(3000);
        System.out.println("Весь список заведений");
        WebElement national = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/div/p[2]/a/img"));
        national.click();



        List<WebElement> restoransList = driver.findElements(By.xpath("//div[@class='panel-heading']"));
        restoransList.stream().map(WebElement::getText).forEach(System.out::println);



        System.out.println( "Количество заведений: " + restoransList.size());


        System.out.println("----------------------------------------------------");

        restoransList.stream()
                .filter(restoran -> restoran.getText().equals("Ложка столовая"))
                .findFirst()
                .ifPresent(restoran -> {
                    WebElement lojka = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/lojka']"));

                    lojka.click();

                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("ЗАВТРАКИ");
                    List<WebElement> zavtraki = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[1]"));
                    zavtraki.stream()
                            .map(WebElement::getText)
                            .forEach(System.out::println);

                    System.out.println("_____________________________");
                    System.out.println("САЛАТЫ");
                    List<WebElement> salads = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[2]"));
                    salads.stream()
                            .map(WebElement::getText)
                            .forEach(System.out::println);

                    System.out.println("_____________________________");
                    System.out.println("СУПЫ");
                    List<WebElement> sup = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[3]"));
                    sup.stream()
                            .map(WebElement::getText)
                            .forEach(System.out::println);

                    System.out.println("_____________________________");
                    System.out.println("ВТОРЫЕ БЛЮДА");
                    List<WebElement> two = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[4]"));
                    two.stream()
                            .map(WebElement::getText)
                            .forEach(System.out::println);
                    System.out.println("_____________________________");
                    System.out.println("ВЫПЕЧКА");
                    List<WebElement> vypechka = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[5]"));
                    vypechka.stream()
                            .map(WebElement::getText)
                            .forEach(System.out::println);
                    System.out.println("_____________________________");
                    System.out.println("КОНДИТЕРСКИЕ ИЗДЕЛИЯ");
                    List<WebElement> condir = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[6]"));
                    condir.stream()
                            .map(WebElement::getText)
                            .forEach(System.out::println);
                    System.out.println("_____________________________");
                    System.out.println("ГАРНИРЫ");
                    List<WebElement> garnyry = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[7]"));
                    garnyry.stream()
                            .map(WebElement::getText)
                            .forEach(System.out::println);


                });

        driver.quit();
    }


}










