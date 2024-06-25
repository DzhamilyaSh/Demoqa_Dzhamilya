import com.demoqa.entities.TextBoxEntity;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test(groups = {"Regression", "126"})
    public void textBoxTest(){
        driver.get("https://demoqa.com/text-box");
        TextBoxEntity textBoxEntity = randomUtils.generaterandomTextBoxEntity();
        demoQAPages.getTextBoxPage().fillUpTextBoxForm(textBoxEntity);
    }
}
