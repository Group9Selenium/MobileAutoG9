import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;
import common.MobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Reddit extends MobileAPI {
    @FindBy(id = "com.reddit.frontpage:id/skip_text")
    public WebElement skipBtn;

    public void clickSkipButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        skipBtn.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/login_button")
    public WebElement loginBtn;

    public void clickLoginButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginBtn.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/signup_button")
    public WebElement registerBtn;

    public void clickRegisterButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registerBtn.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/sort_description")
    public WebElement hotPosts;

    public void clickHotPosts() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hotPosts.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/sort_description")
    public WebElement newPosts;

    public void clickNewPosts() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newPosts.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/nav_icon")
    public WebElement iconBtn;

    public void clickIconButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        iconBtn.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/view_mode")
    public WebElement gridBtn;

    public void clickGridButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        gridBtn.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/search_view")
    public WebElement searchBar;

    public void clickSearchBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBar.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/geopopular_selection_text")
    public WebElement globalBtn;

    public void clickGlobalButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        globalBtn.click();
    }

    @FindBy(id = "com.reddit.frontpage:id/search_view")
    public WebElement searchEdit;

    public void searchItems() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        skipBtn.click();
        //searchEdit.clear();
        String[] listStr = new String[]{"test1", "r/aww", "r/gaming", "r/pics"};
        for (String s : listStr) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            searchEdit.sendKeys(s);
            Thread.sleep(1000);
            searchEdit.clear();
        }
    }

    @FindBy(id = "com.reddit.frontpage:id/search_view")
    public WebElement searchEdit2;

    public void searchItems2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        skipBtn.click();
        //searchEdit.clear();
        String[] listStr = new String[]{"test2", "r/askreddit", "r/globaloffensive", "r/politics"};
        for (String s : listStr) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            searchEdit.sendKeys(s);
            Thread.sleep(1000);
            searchEdit.clear();

        }
    }
}