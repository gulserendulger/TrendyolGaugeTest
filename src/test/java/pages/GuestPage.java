package pages;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constants.GuestConstants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuestPage extends Driver {

    Actions actions = new Actions(driver);
    Methods methods;
    public GuestPage(){methods = new Methods();}

    @Step("<time> saniye bekle")
    public void waitForsecond(int time) throws InterruptedException {
        Thread.sleep(time*1000);
    }

    @Step("Trendyol sayfasının geldiğini kontrol et")
    public void controlTrendyolHomePage(){
        WebElement LoginClick= driver.findElement(ACCEPT_BUTTON);
        actions.moveToElement(LoginClick).click().perform();
        assertTrue(methods.isElementVisible(MYACCOUNT_CONTROL, 20));
        assertTrue(methods.isElementVisible(LOGO_CONTROL, 20));
        assertTrue(methods.isElementVisible(SEARCHTEXT_CONTROL, 20));
    }

    @Step("Login butonunu bul")
    public void findLoginButton(){
        WebElement LoginHover= driver.findElement(MYACCOUNT_CONTROL);
        actions.moveToElement(LoginHover).perform();
    }

    @Step("Login butonuna tıkla")
    public void loginClick(){
        WebElement LoginClick= driver.findElement(LOGİN_BUTTON);
        actions.moveToElement(LoginClick).click().perform();
    }
}
