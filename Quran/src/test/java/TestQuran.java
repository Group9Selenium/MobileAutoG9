import common.MobileAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestQuran extends Quran {
    @Test
    public void runOpenMainPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.openMainPage();
    }
    @Test
    public void runClickOnSurah(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.clickOnSurah();
    }
    @Test
    public void runClickOnJuza(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.clickOnJuza();
    }
    @Test
    public void runClickOnBookMark(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.clickOnBookMark();
    }
    @Test
    public void runClickOnSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.clickOnSearch();
    }
    @Test
    public void runOpenQuarnRead(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.openQuarnRead();
    }
    @Test
    public void runSearchSurahFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.searchSurahFromDB();
    }
    @Test
    public void runSearchSurahFromExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.searchSurahFromExcel();
    }
    @Test
    public void runSearchSurahFromSheet() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Quran quran = PageFactory.initElements(ad, Quran.class);
        quran.searchSurahFromSheet();
    }
}
