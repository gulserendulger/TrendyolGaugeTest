package constants;

import org.openqa.selenium.By;

public class MainConstants {

    public static final String  SEARCH_KEYWORD="Telefon";

    public static final By INPUT_SEARCH = By.cssSelector("input[data-testid=\"suggestion\"]");
    public static final By SEARCH_ICON = By.cssSelector("i[data-testid=\"search-icon\"]");
    public static final By SEARCH_MARKA = By.cssSelector("input[placeholder=\"Marka ara\"]");
    public static final By CLICK = By.cssSelector("div[class=\"slctd-fltrs-cntnr-wrppr\"]");
}
