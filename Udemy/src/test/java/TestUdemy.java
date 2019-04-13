import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestUdemy extends Udemy {

    public TestUdemy() throws IOException {
    }

    @Test
    public void runSigningIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.signingIn();
    }

    @Test
    public void runSigingInWithEmail() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.signingInWithEmail();
    }

    @Test
    public void runSigingInWithGmail() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.signingInWithGmail();
    }

    @Test
    public void runSigingInWithFacebook() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.signingInWithFacebook();
    }

    @Test
    public void runBrowseBtn() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnBrowseBtn();
    }

    @Test
    public void runClickOnFeatured() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnFeatured();
    }

    @Test
    public void runClickOnMyCourses() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnMyCourses();
    }

    @Test
    public void runClickOnWishList() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnWishList();
    }

    @Test
    public void runClickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnSearch();
    }

    @Test
    public void runClickOnAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnAccount();
    }

    @Test
    public void runClickOnCategories() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnCategories();
    }

    @Test
    public void runGetCategoriesList() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.getCategoriesList();
    }

    @Test
    public void runClickOnDevlopment() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnDevlopment();
    }

    @Test
    public void runClickOnBusiness() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnBusiness();
    }

    @Test
    public void runClickOnITSoftware() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnITSoftware();
    }

    @Test
    public void runClickOnOfficeProductivity() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnOfficeProductivity();
    }

    @Test
    public void runClickOnPersonalDevelopment() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnPersonalDevelopment();
    }

    @Test
    public void runClickOnDesign() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnDesign();
    }

    @Test
    public void runClickOnMarketing() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnMarketing();
    }

    @Test
    public void runClickOnLifestyle() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnLifestyle();
    }

    @Test
    public void runClickOnPhotography() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnPhotography();
    }

    @Test
    public void runClickOnHealthFitness() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnHealthFitness();
    }

    @Test
    public void runClickOnMusic() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.clickOnMusic();
    }

    @Test
    public void runSearchWithDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.searchWithDB();
    }

    @Test
    public void runSearchWithExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.searchWithExcel();
    }

    @Test
    public void runSearchWithSheets() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.searchWithSheets();
    }

    @Test
    public void runSigninWithKeyWord() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Udemy udemy = PageFactory.initElements(ad, Udemy.class);
        udemy.signinWithKeyWord();
    }
}
