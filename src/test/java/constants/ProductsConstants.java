package constants;

import org.openqa.selenium.By;

public class ProductsConstants {
    public static final By PRODUCTS = By.cssSelector("div[class=\"p-card-wrppr with-campaign-view\"]");
    public static final By ADDTOBASKET= By.cssSelector("button[class=\"add-to-basket\"]");
    public static final By BASKET = By.cssSelector("div[class=\"account-nav-item basket-preview\"]");
    public static final By CONFIRMBASKET = By.cssSelector("a[class=\"ty-link-btn-primary\"]");
    public static final By ADDADRESS = By.cssSelector("div[class=\"p-add-address-box ty-p-flex-center\"]");
}
