import org.testng.annotations.Test;

public class MenuTest extends BaseTest{
    @Test(groups = {"Smoke", "321"},description = "Verify move to element methods is working")
    public void moveToElementTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/menu");
        webElementActions.moveToElement(demoQAPages.getMenuPage().mainItem2);
        Thread.sleep(5000);
    }
}
