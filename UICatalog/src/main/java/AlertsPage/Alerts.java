package AlertsPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;


public class Alerts extends MobileAPI{
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Alerts\"]")
    public WebElement alertsBtn;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]")
    public WebElement actionSheetSimple;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    public WebElement actionSheetOkCancel;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Show Customized\"")
    public WebElement actionSheetCustom;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]")
    public WebElement alertSimple;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[2]")
    public WebElement alertOkCancel;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Show Custom\"]")
    public WebElement alertCustom;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Secure Text Input\"]")
    public WebElement secureTextInput;

    public void showActionSheetSimple(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertsBtn.click();
        actionSheetSimple.click();
    }
    public void showActionSheetOkCancel(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertsBtn.click();
        actionSheetOkCancel.click();
    }
    public void showActionSheetCustom(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertsBtn.click();
        actionSheetCustom.click();
    }
    public void showAlertSimple(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertsBtn.click();
        alertSimple.click();
    }
    public void showAlertOkCancel(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertsBtn.click();
        alertOkCancel.click();
    }
    public void showAlertCustom(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertsBtn.click();
        alertCustom.click();
    }
    public void showSecureTextInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertsBtn.click();
        secureTextInput.click();
    }
}
