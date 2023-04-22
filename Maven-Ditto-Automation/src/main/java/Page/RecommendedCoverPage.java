package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommendedCoverPage {
	
	//variable declaration
			@FindBy (xpath="//span[text()='Next']")
		    private WebElement NextButton;
			
	//variable initialization
			public RecommendedCoverPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
	//variable use
			public void clickOnNextButton() {
				NextButton.click();
			}

}
