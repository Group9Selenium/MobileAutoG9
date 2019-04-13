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

public class Udemy extends MobileAPI {

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

    public Udemy() throws IOException {
    }

    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = Udemy.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
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
    //region MainPage SetUp
    @FindBy(id = "com.udemy.android:id/browse_button")
    public WebElement browseBtn;
    @FindBy(id = "com.udemy.android:id/signin_button")
    public WebElement signinBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")
    public WebElement signinWithEmail;
    @FindBy(id = "com.udemy.android:id/email_edit")
    public WebElement editEmail;
    @FindBy(id = "com.udemy.android:id/nextBtn")
    public WebElement nextBtnEmail;
    @FindBy(id = "com.udemy.android:id/password")
    public WebElement editPassEmail;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    public WebElement signinWithGmail;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View")
    public WebElement editGmail;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.TextView")
    public WebElement signinWithFacebook;
    @FindBy(id = "m_login_email")
    public WebElement editEmailFacebook;
    @FindBy(id = "m_login_password")
    public WebElement editPassFacebook;

    public void clickOnBrowseBtn() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        browseBtn.click();
    }

    public void signingIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signinBtn.click();
    }

    public void signingInWithEmail() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signingIn();
        signinWithEmail.click();
        Thread.sleep(500);
        editEmail.sendKeys("aroussi.nouredine@gmail.com", Keys.ENTER);
        Thread.sleep(500);
        editPassEmail.sendKeys("123456789qwerty");
    }

    public void signingInWithGmail() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signingIn();
        signinWithGmail.click();
        Thread.sleep(500);
        editGmail.sendKeys("aroussi.nouredine@gmail.com", Keys.ENTER);
    }

    public void signingInWithFacebook() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signingIn();
        signinWithFacebook.click();
        Thread.sleep(500);
        editEmailFacebook.sendKeys("aroussi.nouredine@gmail.com", Keys.TAB);
        editPassFacebook.sendKeys("123456789qwerty");
    }

    public void signinWithKeyWord() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> keyWord = new ArrayList<>();
        keyWord.add("Email");
        keyWord.add("Gmail");
        keyWord.add("Facebook");
        for (String s : keyWord) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + s);
            switch (s) {
                case "Email": {
                    signingInWithEmail();
                    break;
                }
                case "Gmail": {
                    signingInWithGmail();
                    break;
                }
                case "Facebook": {
                    signingInWithFacebook();
                    break;
                }
            }
        }
    }

    //endregion
    //region Start Browser Page
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView")
    public WebElement featuredBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView")
    public WebElement searchBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.TextView")
    public WebElement myCoursesBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.TextView")
    public WebElement wishListBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[5]/android.widget.TextView")
    public WebElement accountBtn;

    public void clickOnFeatured() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnBrowseBtn();
        featuredBtn.click();
    }

    public void clickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnBrowseBtn();
        searchBtn.click();
    }

    public void clickOnMyCourses() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnBrowseBtn();
        myCoursesBtn.click();
    }

    public void clickOnWishList() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnBrowseBtn();
        wishListBtn.click();
    }

    public void clickOnAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnBrowseBtn();
        accountBtn.click();
    }
    //endregion
    //region some dumShut
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.TextView[2]")
    public WebElement seeAllCategories;

    public void clickOnCategories() {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnBrowseBtn();
        seeAllCategories.click();
    }

    public String[] getCategoriesList() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        DataReader dr = new DataReader();
        String path = "/Users/anour/GDrive/Projects/Intellij/ANourMobileAutomation/Udemy/src/main/data/ExcelCat.xls";
        return dr.fileReader2(path, 0);
    }


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[1]")
    public WebElement devBtn;

    public void clickOnDevlopment() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        devBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[2]")
    public WebElement busBtn;

    public void clickOnBusiness() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        busBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[3]")
    public WebElement iTSoftBtn;

    public void clickOnITSoftware() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        iTSoftBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[4]")
    public WebElement offiProBtn;

    public void clickOnOfficeProductivity() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        offiProBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[5]")
    public WebElement perDevBtn;

    public void clickOnPersonalDevelopment() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        perDevBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[6]")
    public WebElement desigBtn;

    public void clickOnDesign() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        desigBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[7]")
    public WebElement marketBtn;

    public void clickOnMarketing() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        marketBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[8]")
    public WebElement lifeStyBtn;

    public void clickOnLifestyle() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        lifeStyBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[9]")
    public WebElement photoGBtn;

    public void clickOnPhotography() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        photoGBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[10]")
    public WebElement healFitBtn;

    public void clickOnHealthFitness() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        healFitBtn.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.TextView[11]")
    public WebElement musicBtn;

    public void clickOnMusic() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
        musicBtn.click();
    }
    //endregion
    //region data driven Tests
    @FindBy(id = "com.udemy.android:id/search_bar_text")
    WebElement searchEdit;

    public void searchWithDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnSearch();
        List<String> list = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    public void searchWithExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        DataReader dr = new DataReader();
        String path = "/Users/anour/GDrive/Projects/Intellij/ANourMobileAutomation/Udemy/src/main/data/Excel.xls";
        String[] list = dr.fileReader2(path, 0);
        clickOnSearch();
        for (String str : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    public void searchWithSheets() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = getDataFromGSheet("Jobs");
        clickOnSearch();
        for (String str : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            searchEdit.clear();
        }
    }
    //endregion
}
