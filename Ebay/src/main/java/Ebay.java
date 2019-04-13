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

public class Ebay extends MobileAPI {
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
        InputStream in = Ebay.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
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
    //region some dum shut
    @FindBy (id = "com.ebay.mobile:id/home")
    WebElement homeBtn;
    @FindBy (id = "com.ebay.mobile:id/search_box")
    WebElement searchEdit;
    @FindBy (id = "com.ebay.mobile:id/button_register")
    WebElement registerBtn;
    @FindBy (id = "com.ebay.mobile:id/button_sign_in")
    WebElement signinBtn;
    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Selling button\"]")
    WebElement sellingBtn;
    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Deals button\"]")
    WebElement dealsBtn;
    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]")
    WebElement categoriesBtn;
    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Saved button\"]")
    WebElement savedBtn;
    @FindBy (id = "com.ebay.mobile:id/button_header_more")
    WebElement dailyDealsBtn;
    @FindBy (id = "com.ebay.mobile:id/action_view_icon")
    WebElement viewKart;
    @FindBy(id = "com.ebay.mobile:id/social_account_splash_screen_close")
    WebElement closePupap;
    @FindBy (xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Recent\"]/android.widget.TextView")
    WebElement searchRecent;
    @FindBy (xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Saved\"]/android.widget.TextView")
    WebElement searchSaved;

    public void clickClosePupap() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        try {
            if (closePupap.isDisplayed()) closePupap.click();
        } catch (Exception e) {
        }
    }

    public void clickHomeButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeBtn.click();
    }

    public void clickRegisterButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registerBtn.click();
    }

    public void clickSigninButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signinBtn.click();
    }

    public void clickSellingButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sellingBtn.click();
    }

    public void clickDealsButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        dealsBtn.click();
    }

    public void clickCategoriesButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        categoriesBtn.click();
    }

    public void clickSavedButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        savedBtn.click();
    }

    public void clickDailyDealsButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        dailyDealsBtn.click();
    }

    public void clickViewKart() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewKart.click();
    }
    //endregion
    // region Search With data driven
    @FindBy (id = "com.ebay.mobile:id/search_src_text")
    WebElement searchEdit2;
    public void searchRecentDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = ConnectToSqlDB.readDataBase("ItemList", "Items");
        searchEdit.click();
        for (String s : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            searchEdit2.sendKeys(s, Keys.ENTER);
            searchRecent.click();
            Thread.sleep(500);
            searchEdit2.clear();
        }
    }

    public void searchRecentSheets() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = getDataFromGSheet("Items");//ConnectToSqlDB.readDataBase("ItemList","Items");
        searchEdit.click();
        for (String s : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            searchEdit2.sendKeys(s, Keys.ENTER);
            searchRecent.click();
            Thread.sleep(500);
            searchEdit2.clear();
        }
    }

    public void searchRecentEcxel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        DataReader dr = new DataReader();
        String path = "/Users/anour/GDrive/Projects/Intellij/ANourMobileAutomation/Ebay/src/main/data/Excel.xls";
        String[] data = dr.fileReader2(path, 0);
        searchEdit.click();
        for (String s : data) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            searchEdit2.sendKeys(s, Keys.ENTER);
            searchRecent.click();
            Thread.sleep(500);
            searchEdit2.clear();
        }
    }

    public void searchSavedDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = ConnectToSqlDB.readDataBase("ItemList", "Items");
        searchEdit.click();
        for (String s : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            searchEdit2.sendKeys(s, Keys.ENTER);
            searchRecent.click();
            Thread.sleep(500);
            searchEdit2.clear();
        }
    }

    public void searchSavedSheets() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = getDataFromGSheet("Items");//ConnectToSqlDB.readDataBase("ItemList","Items");
        searchEdit.click();
        for (String s : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            searchEdit2.sendKeys(s, Keys.ENTER);
            searchRecent.click();
            Thread.sleep(500);
            searchEdit2.clear();
        }
    }

    public void searchSavedEcxel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        DataReader dr = new DataReader();
        String path = "/Users/anour/GDrive/Projects/Intellij/ANourMobileAutomation/Ebay/src/main/data/Excel.xls";
        String[] data = dr.fileReader2(path, 0);
        searchEdit.click();
        for (String s : data) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            searchEdit2.sendKeys(s, Keys.ENTER);
            searchRecent.click();
            Thread.sleep(500);
            searchEdit2.clear();
        }
    }
    //endregion
}
