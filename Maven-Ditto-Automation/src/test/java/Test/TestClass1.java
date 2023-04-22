package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Page.ABitAboutYourselfPage;
import Page.AddExtraProtectionPage;
import Page.AvailablePlansPage;
import Page.GetStartedPage;
import Page.MaxLifePage;
import Page.PaymentTermOptionsPage;
import Page.RecommendedCoverPage;
import Page.TellUsAboutYouPage;

public class TestClass1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\testing\\automation\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions ops=new ChromeOptions();
		 ops.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://app.joinditto.in/term/quote");
		
		GetStartedPage getStartedPage=new GetStartedPage(driver);
		getStartedPage.clickOnGetStartedButton();
		
		TellUsAboutYouPage tellUsAboutYouPage=new TellUsAboutYouPage(driver);
		tellUsAboutYouPage.selectGenderMale();
		tellUsAboutYouPage.sendYourDateOfBirth();
		tellUsAboutYouPage.noButton();
		tellUsAboutYouPage.nextButton();
		Thread.sleep(2000);
		
		ABitAboutYourselfPage aBitAboutYourselfPage=new ABitAboutYourselfPage(driver);
		aBitAboutYourselfPage.sendPinCode();
		aBitAboutYourselfPage.sendAnnualIncome();
		aBitAboutYourselfPage.sendMonthlyExpences();
		aBitAboutYourselfPage.clickOnNoButton();
		aBitAboutYourselfPage.clickOnNextButton();
		Thread.sleep(2000);
		
		RecommendedCoverPage recommendedCoverPage=new RecommendedCoverPage(driver);
		recommendedCoverPage.clickOnNextButton();
		Thread.sleep(2000);
		
		AvailablePlansPage availablePlansPage=new AvailablePlansPage(driver);
		availablePlansPage.clickOnViewDetailsButton();
		Thread.sleep(2000);
		
		MaxLifePage maxLifePage=new MaxLifePage(driver);
		maxLifePage.clickOnBuyThisButton();
		Thread.sleep(2000);
		
		PaymentTermOptionsPage paymentTermOptionsPage=new PaymentTermOptionsPage(driver);
		paymentTermOptionsPage.clickOnNextButton();
		Thread.sleep(2000);
		
		AddExtraProtectionPage addExtraProtectionPage=new AddExtraProtectionPage(driver);
		addExtraProtectionPage.clickOnNextButton();
		Thread.sleep(2000);
		
		
		
		
}
}