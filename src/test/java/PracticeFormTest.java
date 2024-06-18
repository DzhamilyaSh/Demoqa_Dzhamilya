

import com.demoqa.entities.PracticeFormEntity;

import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest{
    @Test
    public void practiceFormTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");

        PracticeFormEntity practiceFormEntity = randomUtils.generaterandomPracticeFormEntity();

        practiceFormPage.fillPracticeForm(practiceFormEntity);

    }
}