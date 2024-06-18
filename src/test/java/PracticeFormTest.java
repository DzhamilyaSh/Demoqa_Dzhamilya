

import com.demoqa.entities.PracticeFormEntity;

import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest{
    @Test
    public void practiceFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        PracticeFormEntity practiceFormEntity = randomUtils.generaterandomPracticeFormEntity();
        Thread.sleep(5000);
        practiceFormPage.fillPracticeForm(practiceFormEntity);
        Thread.sleep(5000);
    }
}