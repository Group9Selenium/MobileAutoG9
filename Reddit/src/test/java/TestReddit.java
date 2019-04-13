import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestReddit extends MobileAPI {
    @Test
    public void runClickSkip() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void runClickSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void runClickSignUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void runClickHotPosts() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

        @Test
    public void runClickNewPosts(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad,Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
        reddit.clickNewPosts();
    }
    @Test
    public void runClickIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void runGridButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void runSearchBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void runGlobalButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void runSearchBar2() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test1() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void Test2() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void Test3() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void Test4() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

    @Test
    public void Test5() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void Test6() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void Test7() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test8() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void Test9() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test10() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void Test11() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void Test12() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void Test13() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

    @Test
    public void Test14() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void Test15() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void Test16() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test17() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void Test18() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test19() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void Test20() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void Test21() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void Test22() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

    @Test
    public void Test23() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void Test24() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void Test25() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test26() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void Test27() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test28() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void Test29() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void Test30() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void Test31() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

    @Test
    public void Test32() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void Test33() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void Test34() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test35() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void Test36() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test37() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void Test38() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void Test39() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void Test40() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

    @Test
    public void Test41() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void Test42() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void Test43() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test44() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void Test45() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test46() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void Test47() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void Test48() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void Test49() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

    @Test
    public void Test50() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void Test51() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void Test52() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test53() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void Test54() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test55() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void Test56() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void Test57() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void Test58() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

    @Test
    public void Test59() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void Test60() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void Test61() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test62() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void Test63() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test64() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
    }

    @Test
    public void Test65() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickLoginButton();
    }

    @Test
    public void Test66() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickRegisterButton();
    }

    @Test
    public void Test67() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickHotPosts();
    }

    @Test
    public void Test68() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickIconButton();
    }

    @Test
    public void Test69() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGridButton();
    }

    @Test
    public void Test70() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test71() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickGlobalButton();
    }

    @Test
    public void Test72() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.clickSkipButton();
        reddit.clickSearchBar();
    }

    @Test
    public void Test73() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.searchItems();
    }

    @Test
    public void Test74() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Reddit reddit = PageFactory.initElements(ad, Reddit.class);
        reddit.searchItems2();
    }
}