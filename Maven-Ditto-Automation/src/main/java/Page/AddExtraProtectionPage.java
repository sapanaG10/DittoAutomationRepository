package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddExtraProtectionPage {
	
	//variable declaration
		@FindBy (xpath="(//span[@class='MuiButton-label'])[2]")
	    private WebElement NextButton;
		
WebDriver driver;
		//	variable initialization
		public AddExtraProtectionPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		//variable use
		public void clickOnNextButton() {
			Actions act=new Actions(driver);
			act.moveToElement(NextButton).click().build().perform();
		}
	
	

}
