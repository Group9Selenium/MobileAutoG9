import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MYmta extends MobileAPI {
    //region Some dum shut
    @FindBy(id = "info.mta.mymta:id/edtPlanTrip")
    WebElement planTripEdit;
    @FindBy (id = "info.mta.mymta:id/txtSavedTripText")
    WebElement savedTrip;
    @FindBy (id = "info.mta.mymta:id/btn_plan_trip")
    WebElement planTripBtn;
    @FindBy (id = "info.mta.mymta:id/btn_schedule")
    WebElement scheduleBtn;
    @FindBy (id = "info.mta.mymta:id/text_view_nearby")
    WebElement nearbyStation;
    @FindBy (id = "info.mta.mymta:id/tvAar")
    WebElement accessRide;
    @FindBy (id = "info.mta.mymta:id/text_view_service_status_update")
    WebElement updateBtn;
    @FindBy (xpath = "//android.support.v7.app.ActionBar.Tab[@content-desc=\"FAVORITES\"]/android.widget.TextView")
    WebElement favoriteBtn;
    @FindBy (xpath = "//android.support.v7.app.ActionBar.Tab[@content-desc=\"SUBWAY\"]/android.widget.TextView")
    WebElement subwayBtn;
    @FindBy (xpath = "//android.support.v7.app.ActionBar.Tab[@content-desc=\"BUS\"]/android.widget.TextView")
    WebElement busBtn;
    @FindBy (xpath = "//android.support.v7.app.ActionBar.Tab[@content-desc=\"RAIL\"]/android.widget.TextView")
    WebElement railBtn;
    @FindBy (id ="info.mta.mymta:id/btn_add_to_fav")
    WebElement addLinesBtn;
    @FindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Planned Service Changes\"]/android.widget.TextView")
    WebElement planServiceChangeBtn;
    @FindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Elevator & Escalator Status\"]/android.widget.TextView")
    WebElement elevatorBtn;
    @FindBy (id = "com.android.packageinstaller:id/permission_allow_button")
    WebElement allowBtn;

    public void clickPlanTrip(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        planTripEdit.click();
        allowBtn.click();
    }
    public void clickSavedTrip(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        savedTrip.click();
    }
    public void clickSavedTripPlanTip(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSavedTrip();
        planTripBtn.click();
    }
    public void clickSavedTripSchedule(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSavedTrip();
        scheduleBtn.click();
    }
    public void clickNearbyStation(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nearbyStation.click();
    }
    public void clickAccessRide(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        accessRide.click();
    }
    public void clickUpdateBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        updateBtn.click();
    }
    public void clickFavoriteBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        favoriteBtn.click();
    }
    public void clickSubwayBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        subwayBtn.click();
    }
    public void clickBusBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        busBtn.click();
    }
    public void clickRailBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        railBtn.click();
    }
    public void clickAddLinesBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        addLinesBtn.click();
    }
    public void clickPlanServiceChangeBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        planServiceChangeBtn.click();
    }
    public void clickElevatorBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        elevatorBtn.click();
    }
    //endregion
}
