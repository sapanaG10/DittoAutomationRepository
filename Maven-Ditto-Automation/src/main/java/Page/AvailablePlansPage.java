package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvailablePlansPage {
	//variable declaration
	@FindBy (xpath="(//span[text()='View Details'])[1]")
    private WebElement ViewDetailsButton1;
	

	//	variable initialization
	public AvailablePlansPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//variable use
	public void clickOnViewDetailsButton() {
		ViewDetailsButton1.click();
	}
}
