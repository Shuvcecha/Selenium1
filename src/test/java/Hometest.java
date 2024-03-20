import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hometest extends BaseClass {
    Homeclass homeclass;
    @BeforeMethod
    void starting(){
        OpenBrowser("https://www.ebay.com");
        homeclass= PageFactory.initElements(BaseClass.driver,Homeclass.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }
    @AfterMethod
    void Close(){
        driver.quit();
    }
    @Test
    void testFashion(){
        String expected="Clothing, Shoes & Accessories for sale | eBay";
        homeclass.Clickfashion();
        String actual=driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    void testWomenshoes(){
        homeclass.movetoFashion();
        homeclass.clickWomenshoes();
        String expected="https://www.ebay.com/b/Womens-Shoes/3034/bn_740022";
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);}
        @Test
        void testsearchmobile() {
            String key = "iphone";
            homeclass.search(key);
            String actual = driver.getCurrentUrl();
            //String expected="https://www.ebay.com/sch/i.html?_from=R40&_trksid=p4432023.m570.l1313&_nkw=samsung&_sacat=0";
            //Assert.assertEquals(actual,expected);
            Assert.assertTrue(actual.contains(key));
        }
        @Test
    void testAboutText(){
        String actualText = "About eBay";
        String expectedText= homeclass.AboutText();
        Assert.assertEquals(actualText,expectedText);
        }
        @Test
    void testallLinks(){
        int actualLinks= homeclass.alllinks();
        //Assert.assertEquals(actualLinks,426);
            Assert.assertTrue(actualLinks>412);
        }





}
