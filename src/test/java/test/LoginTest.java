package test;

import Pages.LoginPage;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest{
    @Test
    public void testLoginFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        loginPage = new LoginPage(driver);
        gmailLoginPages = loginPage.login();
        googleOauthPages = gmailLoginPages.gmailLogin("","");
        dashboardPage = googleOauthPages.oauth();
        softAssert.assertTrue("https://onboardify-frontend.espace.ws/dashboard".equals(driver.getCurrentUrl()),
                "Login is not Successful!");
        softAssert.assertAll();
    }

}