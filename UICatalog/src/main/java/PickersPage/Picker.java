package PickersPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class Picker extends MobileAPI {

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIASegmentedControl[1]/UIAButton")
    List<WebElement> segmentControl = new ArrayList<WebElement>();

    public void getUIPicker(){
        segmentControl.get(0).click();
    }
    public void getUIDatePicker(){
        segmentControl.get(1).click();
    }
    public void getCustom(){
        segmentControl.get(2).click();
    }


}
