import com.demoqa.enums.Endpoints;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest{

    @Test(groups = {"Smoke", "323"}, description = "Alert test")
    void alertTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL") + Endpoints.ALERT.getEndpoint());
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(3000);

    }
}
