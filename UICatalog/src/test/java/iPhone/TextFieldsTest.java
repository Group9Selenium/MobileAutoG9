package iPhone;

import TextFieldsPage.TextFields;
import common.MobileAPI;
import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class TextFieldsTest extends NavigateUi {
    @Test
    public void runTypeOnUiTextField() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.typeOnUiTextField();
    }

    @Test
    public void runTypeOnUiTextFieldRounded() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.typeOnUiTextFieldRounded();
    }

    @Test
    public void runTypeOnUiTextFieldSecure() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.typeOnUiTextFieldSecure();
    }

    @Test
    public void runTypeOnUiTextFieldLeftView() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.typeOnUiTextFieldLeftView();
    }
}
