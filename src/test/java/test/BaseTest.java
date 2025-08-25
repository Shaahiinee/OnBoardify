package test;

import Pages.DashboardPage;
import Pages.GmailLoginPages;
import Pages.GoogleOauthPages;
import Pages.LoginPage;
import Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    GmailLoginPages gmailLoginPages;
    GoogleOauthPages googleOauthPages;
    DashboardPage dashboardPage;

    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver("edge");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
