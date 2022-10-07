package pages;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static constants.ProductsConstants.*;

public class ProductsPage extends Driver {
    Actions actions = new Actions(driver);
    Methods methods;
    public ProductsPage(){methods = new Methods();}

    @Step("Random ürün seçme")
    public void controlSelectProducts(){

        List<WebElement> productElems = driver.findElements(PRODUCTS);
        int maxProducts = productElems.size();
        System.out.println(maxProducts);
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        productElems.get(randomProduct).click();
    }

    @Step("Random seçilen ürünü sepete ekleme")
    public void controlAddToCart(){
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);}

        WebElement addToCart=driver.findElement(ADDTOBASKET);
        addToCart.click();
    }

    @Step("Sepete git")
    public void controlShoppingCart(){
        WebElement shoppingCart=driver.findElement(BASKET);
        shoppingCart.click();
    }

    @Step("Alışverişi tamamla")
    public void controlShoppingDone(){
        WebElement shopping=driver.findElement(CONFIRMBASKET);
        shopping.click();
    }
}
