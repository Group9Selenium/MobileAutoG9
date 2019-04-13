package TextFieldsPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;


public class TextFields extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    public WebElement texFieldBtn;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Normal\"]")
    public WebElement uiTextField;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Rounded\"]")
    public WebElement uiTextFieldRounded;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Secure\"]")
    public WebElement uiTextFieldSecure;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Check\"]")
    public WebElement uiTextFieldLeftView;

    public void typeOnUiTextField() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+", "+ "Architecture");
        texFieldBtn.click();
        uiTextField.sendKeys("Architecture");
        Thread.sleep(1000);
    }
    public void typeOnUiTextFieldRounded() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+", "+ "Rounded");
        texFieldBtn.click();
        uiTextFieldRounded.sendKeys("Rounded");
        Thread.sleep(1000);
    }
    public void typeOnUiTextFieldSecure() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+", "+ "test123");
        texFieldBtn.click();
        uiTextFieldSecure.sendKeys("test123");
        Thread.sleep(1000);
    }
    public void typeOnUiTextFieldLeftView() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+", "+ "Secure");
        texFieldBtn.click();
        uiTextFieldLeftView.sendKeys("Secure");
        Thread.sleep(1000);
    }
}
