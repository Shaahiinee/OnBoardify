package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLoginPages extends Base {
    private final By emailBox = By.cssSelector("input[type='email']");
    private final By passwordBox = By.cssSelector("input[type='password']");
    private final By nextButton1 = By.cssSelector("#identifierNext > div > button");
    private final By nextButton2 = By.cssSelector("#passwordNext > div > button");

    public GmailLoginPages(WebDriver driver) {
        super(driver);
    }
    public GoogleOauthPages gmailLogin(String email, String password){
        sendKeys(emailBox, email);
        click(nextButton1);
        sendKeys(passwordBox, password);
        click(nextButton2);
        return new GoogleOauthPages(driver);
    }
}
