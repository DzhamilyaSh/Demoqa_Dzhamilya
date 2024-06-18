import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHelperTest extends BaseTest {

    @Test
    void test123() throws InterruptedException {
        browserHelper.open("https://demoqa.com/browser-windows");
        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        Thread.sleep(2000);
        browserHelper.goBack();
        Thread.sleep(2000);
        browserHelper.goForward();
        Thread.sleep(2000);
        browserHelper.refreshThePage();
        Thread.sleep(2000);
        browserHelper.switchToWindow(0);
        Thread.sleep(3000);
        browserHelper.switchToWindow(0);
        Thread.sleep(3000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindow(0);
        Thread.sleep(1000);
        browserHelper.switchToWindow(0);
        Thread.sleep(1000);
        browserHelper.switchToWindow(0);
        Thread.sleep(1000);
        browserHelper.switchToWindow(1);
        Thread.sleep(6000);

        browserHelper.switchToParentWithChildClose();
        Thread.sleep(6000);


    }
}
