import com.demoqa.enums.Endpoints;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest{

    @Test(groups = {"Regression", "124"},description = "Verify that driver can switch to another frame")
    public void doubleClickTest() {
        browserHelper.open(ConfigReader.getValue("baseURL") + Endpoints.FRAMES.getEndpoint());
        iframeHelper.switchToFrame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")));
        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")));
    }
}
