package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleOauthPages extends BasePage {
    private final By continueButton = By.xpath("//button//span[text()='Continue']");
    private final By allowButton = By.id("submit_approve_access");

    public GoogleOauthPages(WebDriver driver) {
        super(driver);
    }
    public DashboardPage oauth(){
        click(continueButton);
        click(allowButton);
        wait.until(ExpectedConditions.urlToBe("https://onboardify-frontend.espace.ws/dashboard"));
        return new DashboardPage(driver);
    }
}
