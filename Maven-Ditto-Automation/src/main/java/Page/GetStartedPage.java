package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {
	
	@FindBy (xpath="//span[text()='Get Started']")
	private WebElement GetStartedButton;
	
	public GetStartedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnGetStartedButton() {
		GetStartedButton.click();
	}
	

}
