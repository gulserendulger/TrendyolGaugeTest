package constants;

import org.openqa.selenium.By;

public class LoginConstants {

    public static final String  EMAIL="gulserentestinium@gmail.com";
    public static final String  PASSWORD="Test1234.";

    public static final By EMAIL_LOGIN = By.cssSelector("input[id=\"login-email\"]");
    public static final By PASSWORD_LOGIN = By.cssSelector("input[id=\"login-password-input\"]");
    public static final By LOGIN = By.cssSelector("button[type=\"submit\"]");
}
