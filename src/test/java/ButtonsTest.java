import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{

    @Test(groups = {"Regression", "123"}, description = "Verify double click button is working propertly")
    public void doubleClickTest(){
        browserHelper.open("https://demoqa.com/buttons");
        webElementActions.doubleClick(demoQAPages.getButtonsPage().doubleClickBtn);
//        webElementActions.doubleClick(demoQAPages.getButtonsPage().doubleClickMessage);
//        Assert.assertEquals(demoQAPages.getButtonsPage().doubleClickBtn.getText(), "You have done a double click");
    }

//    @Test(description = "Verify right click button is working propertly")
//    public void rightClickTest(){
//        browserHelper.open("https://demoqa.com/buttons");
//        webElementActions.rightClick(demoQAPages.buttonsPage.rightClickBtn);
//        Assert.assertEquals();
//    }

}
