package pages;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constants.MainConstants.*;
import static constants.ProductsConstants.BASKET;

public class MainPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public MainPage(){methods = new Methods();}

    @Step("Aranacak kelimeyi gir")
    public void searchBoxClick(){
        WebElement text = driver.findElement(INPUT_SEARCH);
        text.sendKeys(SEARCH_KEYWORD);
        methods.clickElement(SEARCH_ICON);
    }

    @Step("Random bir yere tıklama")
    public void click(){
        WebElement random=driver.findElement(CLICK);
        random.click();
    }

    @Step("Filtre seçme <>")
    public void controlSelectFilter(String brand) throws InterruptedException{
        WebElement searchCheckbox=driver.findElement(SEARCH_MARKA);
        searchCheckbox.click();
        searchCheckbox.sendKeys(brand);
        Thread.sleep(2000);
        String checkBoxLocator = "//div[text() = \"" + brand + "\" ]";
        methods.clickElement(By.xpath(checkBoxLocator));
    }
}
