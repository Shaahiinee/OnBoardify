package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By loginButton = By.cssSelector("[href='https://onboardify-backend.espace.ws/api/v1/auth/google_oauth2?redirect_url=https://onboardify-frontend.espace.ws/auth/callback']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public GmailLoginPages login () {
        driver.get("https://onboardify-frontend.espace.ws/sign-in");
        click(loginButton);
        return new GmailLoginPages(driver);
    }
}
