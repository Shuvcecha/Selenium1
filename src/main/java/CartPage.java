import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BaseClass{
    @FindBy (xpath = "//div[@class=\"font-title-3\"]/span/span/span")
    WebElement cartText;
    String emptyCart(){
        String cart=cartText.getText();
        return cart;
    }
}

