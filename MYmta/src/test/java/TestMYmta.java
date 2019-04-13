import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMYmta extends MobileAPI {
    @Test
    public void runClickPlanTrip(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickPlanTrip();
    }
    @Test
    public void runClickSavedTrip(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickSavedTrip();
    }
    @Test
    public void clickSavedTripPlanTip(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickSavedTripPlanTip();
    }
    @Test
    public void clickSavedTripSchedule(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickSavedTripSchedule();
    }
    @Test
    public void clickNearbyStation(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickNearbyStation();
    }
    @Test
    public void clickAccessRide(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickAccessRide();
    }
    @Test
    public void clickUpdateBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickUpdateBtn();
    }
    @Test
    public void clickFavoriteBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickFavoriteBtn();
    }
    @Test
    public void clickSubwayBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickSubwayBtn();
    }
    @Test
    public void clickBusBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickBusBtn();
    }
    @Test
    public void clickRailBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickRailBtn();
    }
    @Test
    public void clickAddLinesBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickAddLinesBtn();
    }
    @Test
    public void clickPlanServiceChangeBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickPlanServiceChangeBtn();
    }
    @Test
    public void clickElevatorBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MYmta mYmta = PageFactory.initElements(ad,MYmta.class);
        mYmta.clickElevatorBtn();
    }

}
