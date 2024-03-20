import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Youtube extends BaseClass{
    @FindBy (xpath = "//body[@dir=\"ltr\"]")
    WebElement song;
    String playsong(){
        return song.getText();
    }

}
