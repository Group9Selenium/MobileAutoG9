package iPhone;

import AlertsPage.Alerts;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class AlertsTest extends MobileAPI {

    @Test
    public void testActionSheetSimple()  {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Alerts alert=PageFactory.initElements(ad,Alerts.class);
        alert.showActionSheetSimple();
    }
    @Test
    public void testActionSheetOkCancel() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Alerts alert=PageFactory.initElements(ad,Alerts.class);
        alert.showActionSheetOkCancel();
    }
    @Test
    public void testActionSheetCustom() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Alerts alert=PageFactory.initElements(ad,Alerts.class);
        alert.showActionSheetCustom();
    }
    @Test
    public void testAlertSimple() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Alerts alert=PageFactory.initElements(ad,Alerts.class);
        alert.showAlertSimple();
    }
    @Test
    public void testAlertOkCancel() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Alerts alert=PageFactory.initElements(ad,Alerts.class);
        alert.showAlertOkCancel();
    }
    @Test
    public void testAlertCustom() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Alerts alert=PageFactory.initElements(ad,Alerts.class);
        alert.showAlertCustom();
    }
    @Test
    public void testSecureInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Alerts alert=PageFactory.initElements(ad,Alerts.class);
        alert.showSecureTextInput();
    }

}
