package ControlsPage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Controls {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    WebElement controlsBtn;
}
