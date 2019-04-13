import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import common.MobileAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quran extends MobileAPI {
    //region Get The data from google sheat
    private static final String APPLICATION_NAME = "GSheetsStart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "credentials.json";

    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = Quran.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    /**
     * Prints the names and majors of students in a sample spreadsheet:
     * https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
     */
    public List<String> getDataFromGSheet(String sheetName) throws IOException, GeneralSecurityException {
        // Build a new authorized API client service.
        List<String> list = new ArrayList<String>();
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "1Ix83cJHE4h2UxCU_eCxXuWzMEvu40hSWvm9TD_HzYBM";
        final String range = sheetName + "!A2:E";
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
            list = null;
        } else {
            //System.out.println("Name, Major");
            for (List row : values) {
                // Print columns A and E, which correspond to indices 0 and 4.
                //System.out.printf("%s\n", row.get(0));
                list.add(row.get(0).toString());
            }
            //System.out.println(list);
        }
        return list;
    }

    //endregion
    //region Opening and searching the pages
    @FindBy(id = "android:id/button1")
    public WebElement firstOKBtn;
    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public WebElement firstAllowBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
    public WebElement surahsBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]")
    public WebElement juzaBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]")
    public WebElement bookMarkBtn;
    @FindBy(id = "com.quran.labs.androidquran:id/search")
    public WebElement searchBtn;
    @FindBy(id = "com.quran.labs.androidquran:id/search_src_text")
    public WebElement searchEdit;
    @FindBy (id = "com.quran.labs.androidquran:id/last_page")
    public WebElement openQuranPages;

    public void openMainPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstOKBtn.click();
        firstAllowBtn.click();
    }
    public void clickOnSurah(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        openMainPage();
        surahsBtn.click();
    }
    public void clickOnJuza(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        openMainPage();
        juzaBtn.click();
    }
    public void clickOnBookMark(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        openMainPage();
        bookMarkBtn.click();
    }
    public void clickOnSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        openMainPage();
        searchBtn.click();
    }
    public void openQuarnRead(){
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        openMainPage();
        openQuranPages.click();
    }
    public void searchSurahFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnSearch();
        List<String> list = ConnectToSqlDB.readDataBase("Quran","Surah");
        for (String str: list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+", "+str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            searchEdit.clear();
        }
    }
    public void searchSurahFromExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnSearch();
        DataReader dr = new DataReader();
        String path = "/Users/anour/GDrive/Projects/Intellij/ANourMobileAutomation/Quran/src/main/data/Excel.xls";
        String[] data = dr.fileReader2(path, 0);
        for (int i = 0; i < data.length; i++) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+", "+data[i]);
            searchEdit.sendKeys(data[i], Keys.ENTER);
            Thread.sleep(500);
            searchEdit.clear();
        }
    }
    public void searchSurahFromSheet() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnSearch();
        List<String> list = getDataFromGSheet("Quran");
        for (String str: list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+", "+str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            searchEdit.clear();
        }
    }
    //endregion
}
