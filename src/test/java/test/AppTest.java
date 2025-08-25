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
        googleOauthPages = gmailLoginPages.gmailLogin("omar.shahin.i@espace.com.eg","Omar-4870743");
        dashboardPage = googleOauthPages.oauth();
        softAssert.assertTrue("https://onboardify-frontend.espace.ws/dashboard".equals(driver.getCurrentUrl()),
                "Login is not Successful!");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}