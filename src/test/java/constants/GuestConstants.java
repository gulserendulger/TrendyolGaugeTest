package constants;

import org.openqa.selenium.By;

public class GuestConstants {
    public static final By ACCEPT_BUTTON = By.cssSelector("button[id=\"onetrust-accept-btn-handler\"]");
    public static final By MYACCOUNT_CONTROL = By.xpath("//p[text() = 'Giriş Yap']");
    public static final By LOGO_CONTROL = By.cssSelector("a[id=\"logo\"]");
    public static final By SEARCHTEXT_CONTROL = By.cssSelector("div[id=\"autoCompleteAppWrapper\"]");
    public static final By LOGİN_BUTTON = By.cssSelector("div.login-button");

}
