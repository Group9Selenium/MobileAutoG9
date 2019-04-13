package ButtonsPage;


import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Buttons extends MobileAPI {
    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    WebElement buttonsPageBtn;
    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    WebElement backGroundBtn;
    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    WebElement pointingArrowBtn;
    public void clickButtonsPage()  {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        buttonsPageBtn.click();
    }
    public void clickBackGroundbtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickButtonsPage();
        backGroundBtn.click();
    }
    public void clickPointtingArrowbtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickButtonsPage();
        pointingArrowBtn.click();
    }
}
