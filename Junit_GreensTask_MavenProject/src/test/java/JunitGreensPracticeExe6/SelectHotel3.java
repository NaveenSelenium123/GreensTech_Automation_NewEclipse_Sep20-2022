package JunitGreensPracticeExe6;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel3 extends BaseClass{
	public SelectHotel3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
private WebElement select;
	@FindBy(id="continue")
private WebElement continue1;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getContinue1() {
		return continue1;
	}

}
