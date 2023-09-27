package MavenProject.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;
import com.pageObjectFactory.Search;
import com.pageObjectFactoryManager.AmazonManager;

import FIleReaderManager.ReaderManager;
import propertyReaderConfi.ReaderAmazonValue;

public class AmazonTest extends Base{
	public static WebDriver driver;

public static void main(String[] args) throws Exception {
	driver = LaunchBrowser("chrome");
	
	ReaderAmazonValue readerAmazon = ReaderManager.Readerinsta().ReaderAmazon();
	String url = readerAmazon.geturl();
//	
	geturl(url);
	implicitwait(10);
//	
//	
	AmazonManager Amanager=new AmazonManager(driver);
//
//	WebElement search = Amanager.log().getSearch();
//	
//	clickOn(search);
//	
//	WebElement premiumStore = Amanager.log().getMobile();
//
//	clickOn(premiumStore);
//	
//	WebElement samsung = Amanager.log().getSamsung();
//	scrollinto(samsung);
//	clickOn(samsung);
//	driver.manage().window().fullscreen();
//
////	WebElement protection_plan = Amanager.add().getProtection_plan();
////	scrollinto(protection_plan);
////	clickOn(protection_plan);
////	
////	WebElement quantity = Amanager.add().getQuantity();
////	selectby(quantity, "value", "2");
////	WebElement addbag = Amanager.add().addbag;
////	scrollinto(addbag);
////
////	clickOn(addbag);
////	WebElement gocart = Amanager.add().getGocart();
////	
////	clickOn(gocart);
//	
//	WebElement textArea = Amanager.phonecase().getTextArea();
//	sendkeyto(textArea, "s23 ultra samsung cover spigen");
//	clickOn(textArea);
//	textArea.submit();
//	
//	WebElement cusrating = Amanager.phonecase().getcrating();
//	
//	scrollinto(cusrating);
//
//	WebElement rating = Amanager.phonecase().getjRating();
//	
//	clickOn(rating);
	
	WebElement title = Amanager.phonecase().getTitle();
	scrollinto(title);
	
	WebElement color = Amanager.phonecase().getColor();

	clickOn(color);
	
}
}
