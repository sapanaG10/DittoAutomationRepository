package TestNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BrowserSetup.Base;
import Page.ABitAboutYourselfPage;
import Page.AddExtraProtectionPage;
import Page.AvailablePlansPage;
import Page.GetStartedPage;
import Page.MaxLifePage;
import Page.PaymentTermOptionsPage;
import Page.RecommendedCoverPage;
import Page.TellUsAboutYouPage;

public class TestClassNG extends Base{
	WebDriver driver;
	GetStartedPage getStartedPage;
	TellUsAboutYouPage tellUsAboutYouPage;
	ABitAboutYourselfPage aBitAboutYourselfPage;
    RecommendedCoverPage recommendedCoverPage;
    AvailablePlansPage availablePlansPage;
    MaxLifePage maxLifePage;
    
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName)  {
	if(browserName.equals("Chrome"))
	{
		driver=openChromeBrowser();	
	}
	
	if(browserName.equals("Edge"))
	{
		driver=openEdgeBrowser();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
}
	@BeforeClass
	public void createPOMObjects() {
	    getStartedPage=new GetStartedPage(driver);
	    tellUsAboutYouPage=new TellUsAboutYouPage(driver);
	    aBitAboutYourselfPage=new ABitAboutYourselfPage(driver);
	    recommendedCoverPage=new RecommendedCoverPage(driver);
	    availablePlansPage=new AvailablePlansPage(driver);
	    maxLifePage=new MaxLifePage(driver);
	}
   
	@BeforeMethod
    public void goToGetStarted() throws InterruptedException {
    Thread.sleep(2000);
    	driver.get("https://app.joinditto.in/term/quote");
    }
    
    @Test(priority=1)
    public void verifyInsurance() throws InterruptedException {
  
    	getStartedPage=new GetStartedPage(driver);
		getStartedPage.clickOnGetStartedButton();
		tellUsAboutYouPage=new TellUsAboutYouPage(driver);
		tellUsAboutYouPage.selectGenderMale();
		tellUsAboutYouPage.sendYourDateOfBirth();
		tellUsAboutYouPage.noButton();
		tellUsAboutYouPage.nextButton();
		Thread.sleep(2000);
		
		aBitAboutYourselfPage=new ABitAboutYourselfPage(driver);
		aBitAboutYourselfPage.sendPinCode();
		aBitAboutYourselfPage.sendAnnualIncome();
		aBitAboutYourselfPage.sendMonthlyExpences();
		aBitAboutYourselfPage.clickOnNoButton();
		aBitAboutYourselfPage.clickOnNextButton();
		Thread.sleep(2000);
		
	    recommendedCoverPage=new RecommendedCoverPage(driver);
		recommendedCoverPage.clickOnNextButton();
		Thread.sleep(2000);
		
		availablePlansPage=new AvailablePlansPage(driver);
		availablePlansPage.clickOnViewDetailsButton();
		Thread.sleep(2000);
		
		maxLifePage=new MaxLifePage(driver);
		maxLifePage.clickOnBuyThisButton();
		Thread.sleep(2000);
		
		PaymentTermOptionsPage paymentTermOptionsPage=new PaymentTermOptionsPage(driver);
		paymentTermOptionsPage.clickOnNextButton();
		Thread.sleep(2000);
		
		AddExtraProtectionPage addExtraProtectionPage=new AddExtraProtectionPage(driver);
		addExtraProtectionPage.clickOnNextButton();
		Thread.sleep(2000);
		
    
    }
    @AfterMethod 
	public void afterMethod(){
		System.out.println("After Method");
	}
	
	@AfterClass
	public void clearObjects() {
		
		getStartedPage=null;
		tellUsAboutYouPage=null;
		aBitAboutYourselfPage=null;
		recommendedCoverPage=null;
		availablePlansPage=null;
		maxLifePage=null;
		
	}
	@AfterTest 
	public void afterTest(){
		driver.quit();
		driver=null;
		System.gc();
	}
}

	


