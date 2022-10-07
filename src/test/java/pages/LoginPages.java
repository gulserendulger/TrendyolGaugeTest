package pages;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constants.LoginConstants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPages extends Driver {
    Actions actions = new Actions(driver);
    Methods methods;
    public LoginPages() {methods = new Methods();}

    @Step("Giriş yap sayfasını kontrol et")
    public void controlLoginPage(){
        assertTrue(methods.isElementVisible(EMAIL_LOGIN, 20));
        assertTrue(methods.isElementVisible(PASSWORD_LOGIN, 20));
        assertTrue(methods.isElementVisible(LOGIN, 20));
    }

    @Step("Email - şifre gir ve giriş yap")
    public void login(){
        WebElement sendText = driver.findElement(EMAIL_LOGIN);
        sendText.sendKeys(EMAIL);
        WebElement passwordText = driver.findElement(PASSWORD_LOGIN);
        passwordText.sendKeys(PASSWORD);
        methods.clickElement(LOGIN);
    }

}
