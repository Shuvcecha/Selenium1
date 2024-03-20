import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeTest extends BaseClass {
    Youtube youtube;
    @BeforeMethod
    void Starting(){
        OpenBrowser("https://www.youtube.com");
        youtube= PageFactory.initElements(driver,Youtube.class);
        driver.manage().window().maximize();

    }
    @Test
    void testPlay(){
        String expected="ring";
        String actual= youtube.playsong();
        Assert.assertEquals(actual,expected);
    }

}
