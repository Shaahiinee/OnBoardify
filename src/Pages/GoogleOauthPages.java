package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleOauthPages extends Base {
    private final By continueButton = By.cssSelector("#yDmH0d > c-wiz > main > div.JYXaTc.F8PBrb > div > div > div:nth-child(2) > div > div > button");
    private final By allowButton = By.cssSelector("#submit_approve_access > div > button");

    public GoogleOauthPages(WebDriver driver) {
        super(driver);
    }
    public DashboardPage oauth(){
        click(continueButton);
        click(allowButton);
        return new DashboardPage(driver);
    }
}
