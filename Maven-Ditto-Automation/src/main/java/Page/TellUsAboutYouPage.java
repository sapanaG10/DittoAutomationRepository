package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TellUsAboutYouPage {
	//variable declaration
	@FindBy (xpath="//span[text()='Male']")
	    private WebElement GenderMaleRadioButton;
		
		@FindBy (xpath="//span[text()='Female']")
		private WebElement GenderFemaleRadioButton;
		
		@FindBy (xpath="//span[text()='Others']")
		private WebElement GenderOthersRadioButton;
		
		@FindBy (xpath="//input[@placeholder='DD/MM/YYYY']")
		private WebElement YourDateOfBirth;
		
		@FindBy (xpath="//div[@class='jss174']//label")
		private WebElement TextMessageHaveYouSmoke;
		
		@FindBy (xpath="//span[text()='No']")
		private WebElement NoButton;
		
		@FindBy (xpath="//span[text()='Yes']")
		private WebElement YesButton;
		
		@FindBy (xpath="//span[text()='Next']")
		private WebElement NextButton;
		
		private WebDriver driver;
		private Actions act;
	
		//variable Initialization
		public TellUsAboutYouPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		public void selectGenderMale() {
			act=new Actions(driver);
			act.moveToElement(GenderMaleRadioButton).click().build().perform();
		}
		public void selectGenderFemale() {
			act=new Actions(driver);
			act.moveToElement(GenderFemaleRadioButton).click().build().perform();
		}
		public void selectGenderOthers() {
			act=new Actions(driver);
			act.moveToElement(GenderOthersRadioButton).click().build().perform();
		}
		public void sendYourDateOfBirth() {
			YourDateOfBirth.sendKeys("20/05/1995");
		}
		public void getTextHaveYouSmoke() {
			String text=TextMessageHaveYouSmoke.getText();
		}
		public void noButton() {
			act=new Actions(driver);
			act.moveToElement(NoButton).click().build().perform();
		}
		public void yesButton() {
			act=new Actions(driver);
			act.moveToElement(YesButton).click().build().perform();
		}
		public void nextButton() {
			NextButton.click();
		}
}
