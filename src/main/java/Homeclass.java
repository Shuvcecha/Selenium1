import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Homeclass extends BaseClass {
    @FindBy(xpath = "//li[@data-currenttabindex=\"4\"]")
    WebElement fashion;
    @FindBy(css = "[_sp=\"p4375194.m1383.l3252\"]")
    WebElement womenShoes;
    @FindBy(xpath = "//input[@placeholder=\"Search for anything\"]")
    WebElement searchButton;
    @FindBy(css = "[_sp=\"m571.l2932\"]")
    WebElement aboutEbay;
    @FindBy(xpath = "//a")
    List<WebElement> links;


    void Clickfashion() {
        fashion.click();

    }

    void movetoFashion() {
        Actions actions = new Actions(driver);
        actions.moveToElement(fashion).perform();
    }

    void clickWomenshoes() {
        womenShoes.click();

    }

    void search(String searchkey) {
        searchButton.sendKeys(searchkey, Keys.ENTER);

    }

    String AboutText() {
        return aboutEbay.getText();

    }

    int alllinks() {
        return links.size();
    }
}