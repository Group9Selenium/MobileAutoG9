package iPhone;

import ButtonsPage.Buttons;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class ButtonTest extends MobileAPI {

    @Test
    public void navigateToButtonsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Buttons buttons = PageFactory.initElements(ad, Buttons.class);
        buttons.clickButtonsPage();
    }
    @Test
    public void runClickPnBackGround(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Buttons buttons = PageFactory.initElements(ad, Buttons.class);
        buttons.clickBackGroundbtn();
    }
    @Test
    public void runClickOnPointingArrow(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Buttons buttons = PageFactory.initElements(ad, Buttons.class);
        buttons.clickPointtingArrowbtn();
    }

}
