import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class TestEbay extends MobileAPI {
    @Test
    public void runClickClosePupap() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickClosePupap();
    }

    @Test
    public void runClickHomeButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickHomeButton();
    }

    @Test
    public void runClickRegisterButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickRegisterButton();
    }

    @Test
    public void runClickSigninButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickSigninButton();
    }

    @Test
    public void runClickSellingButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickSellingButton();
    }

    @Test
    public void runClickDealsButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickDealsButton();
    }

    @Test
    public void runClickCategoriesButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickCategoriesButton();
    }

    @Test
    public void runClickSavedButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickSavedButton();
    }

    @Test
    public void runClickDailyDealsButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickDailyDealsButton();
    }

    @Test
    public void runClickViewKart() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.clickViewKart();
    }

    @Test
    public void runSearchRecentDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.searchRecentDB();
    }

    @Test
    public void runSearchRecentSheets() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.searchRecentSheets();
    }

    @Test
    public void runSearchRecentEcxel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.searchRecentEcxel();
    }

    @Test
    public void runSearchSavedDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.searchSavedDB();
    }

    @Test
    public void runSearchSavedSheets() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.searchSavedSheets();
    }

    @Test
    public void runSearchSavedEcxel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Ebay eBay = PageFactory.initElements(ad, Ebay.class);
        eBay.searchSavedEcxel();
    }
}
