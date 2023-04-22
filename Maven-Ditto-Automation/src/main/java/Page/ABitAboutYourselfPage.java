package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABitAboutYourselfPage {

	        //variable declaration
			@FindBy (xpath="//input[@id='text-input-pincode']")
		    private WebElement PinCode;
			
			@FindBy (xpath="//input[@id='text-input-annInc']")
			private WebElement AnnualIncome;
			
			@FindBy (xpath="//input[@id='text-input-mExpenses']")
			private WebElement MonthlyExpences;
			
			@FindBy (xpath="//span[text()='No']")
			private WebElement NoButton ;
			
			@FindBy (xpath="//span[text()='Yes']")
			private WebElement YesButton ;
			
			@FindBy (xpath="//span[text()='Next']")
			private WebElement NextButton ;
	
			private WebDriver driver;
			private Actions act;
			//	variable initialization
			public ABitAboutYourselfPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver=driver;
			}
			
			//variable use
			public void sendPinCode() {
				PinCode.sendKeys("410410");
			}
			public void sendAnnualIncome() {
				AnnualIncome.sendKeys("3,50,000");
			}
			public void sendMonthlyExpences() {
				MonthlyExpences.sendKeys("3500");
			}
			public void clickOnNoButton() {
			  act=new Actions(driver);
			  act.moveToElement(NoButton).click().build().perform();
			}
			public void clickOnYesButton() {
				act=new Actions(driver);
				 act.moveToElement(YesButton).click().build().perform();
			}
			public void clickOnNextButton() {
				act=new Actions(driver);
				  act.moveToElement(NextButton).click().build().perform();
			}
			
			
			
}
