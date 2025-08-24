package test;

import Pages.DashboardPage;
import Pages.GmailLoginPages;
import Pages.GoogleOauthPages;
import Pages.LoginPage;
import Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AppTest {
    WebDriver driver;
    LoginPage loginPage;
    GmailLoginPages gmailLoginPages;
    GoogleOauthPages googleOauthPages;
    DashboardPage dashboardPage;

    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver("edge");
    }

    @Test
    public void testLoginFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        loginPage = new LoginPage(driver);
        gmailLoginPages = loginPage.login();
        googleOauthPages = gmailLoginPages.gmailLogin("","");
        dashboardPage = googleOauthPages.oauth();
        softAssert.assertTrue("https://onboardify-frontend.espace.ws/dashboard".equals(driver.getCurrentUrl()));
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}