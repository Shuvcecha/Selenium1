import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cartPageTest extends BaseClass{
    CartPage cartPage;
    @BeforeMethod
    void Starting(){
        OpenBrowser("https://cart.ebay.com/");
        cartPage= PageFactory.initElements(driver,CartPage.class);
        driver.manage().window().maximize();
    }
    @Test
    void testCart(){
        String expected= "You don't have any items in your cart.";
        String actual=cartPage.emptyCart();
        Assert.assertEquals(actual,expected);
    }
}
