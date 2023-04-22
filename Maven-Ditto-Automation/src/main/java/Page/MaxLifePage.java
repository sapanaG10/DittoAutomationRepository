package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaxLifePage {
	
	//variable declaration
	@FindBy (xpath="(//span[@class='MuiButton-label'])[3]")
    private WebElement BuyThisButton;
	
    WebDriver driver;
	//	variable initialization
	public MaxLifePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//variable use
	public void clickOnBuyThisButton() {
	Actions act=new Actions(driver);
	act.moveToElement(BuyThisButton).click().build().perform();
	}

}
