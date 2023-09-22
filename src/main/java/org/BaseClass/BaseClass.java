package org.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	//1 launch Chrome
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	//2 Load URL
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	//3 Maximize the Window
	public static void winMax() {
		driver.manage().window().maximize();
	}
	
	//4 print Title
	public static void printTitle() {
		driver.getTitle();
		
	}
	
	//5 print Current url
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());

	}
	
	//6 SendKeys
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	//7 Click method
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	
	//8 Close the TAB
	public static void closeChrome() {
		driver.close();
	}
	
	//9 Read the Excel Sheet To Input Value and Data
	public static  String getData(int rowNumber, int cellNumber) throws IOException {
		File f = new File("");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("logIn");
		
		Row row = s.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		
		int cellType = cell.getCellType();
		
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();			
		}else if (cellType == 0) {
			if (DateUtil.isCellInternalDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				
				SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
				value = sim.format(d);
				
			}else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
			}
		}
		return value;

	}
	
	//10 Close The EnTier Chrome
	public static void quiteChrome() {
		driver.quit();
	}
	
	static Actions a;
	
	//11 Move to Element in Actions
	public static void moveElementTo(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();

	}
	
	//12 Drag And Drop in Actions
	public static void dragDrop(WebElement eleSource , WebElement eleTtarget) {
		a = new Actions(driver);
		a.dragAndDrop(eleSource , eleTtarget).perform();

	}
	
	//13 Key Down Actions
	public static void keyKickDown(WebElement eleTarget, CharSequence key) {
		a = new Actions(driver);
		a.keyUp(eleTarget, key).perform();
		

	}
	
	//14 Key Up Actions
	public static void keyKickUp(WebElement eleTarget, CharSequence key) {
		a = new Actions(driver);
		a.keyDown(eleTarget, key).perform();
	}
	
	//15 Click Actions
	public static void actionsClick() {
		a = new Actions(driver);
		a.click().perform();
		
	}
	
	//16 Send Keys In Actions
	public static void actionsSend(WebElement target, CharSequence keys) {
		a = new Actions(driver);
		a.sendKeys(target, keys).perform();
	}
	
	//17 DoubleClick Actions
	public static void doubleLeftClick(WebElement target) {
		a = new Actions(driver);
		a.doubleClick(target).perform();
	}
	
	//18 Context Click Actions
	public static void rightClick(WebElement target) {
		a = new Actions(driver);
		a.contextClick(target).perform();

	}
	
	//19 Alert Simple Alert Accept
	public static void alertOK() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}
	
	//20 Alert Confirm Alert Reject
	public static void alertCancel() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	//21 Alert Prompt Alert SendKeys
	public static void alertFill(String SendKeys) {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys(SendKeys);
		}
	
	// 22 ScreenShot
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc = new File("C:\\Users\\gopal\\eclipse-workspace\\AdactinHotelBooking\\target\\Screenshot"+name+".png");
		FileUtils.copyFile(src, dsc);
	}
			
	//23 java Script pass Value	
	public static void jsFill(String SendKeys, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+SendKeys+"')", ele);
		
	}
	
	// 24 jsclick
	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	
	// 25 jsScroll Top
	public static WebElement jsScrollTop(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		return ele;
		
	}
	
	// 26 jsScroll Bottom
	public static void jsScrollFoot(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
	}
	
	// 27 js High Light
		public static void jsHighLight(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		}
		
	
	// 27 Enter Key Using Robot class
	public static Robot r;
	public static void roboEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	// up using robot class
	public static void roboup() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);	
	}
	// 28 Down Using Robot class
	public static void roboDown() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);		
	}
	
	// 29 Copy using Robot class
	public static void roboCopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	//30 Paste Using Robot Class
	public static void roboPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	//31 Tab Using Robot class
	public static void roboTap() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);	
	}
	
	//32 Cut Using Robot Class
	public static void roboCut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public static Select s;
	//33 Single DropDown
	public static void ddStringValue(WebElement ele, String value) {
		s = new Select(ele);
		s.selectByValue(value);
	}
	//34 single DropDown Visible 
	public static void ddStringVisibleText(WebElement ele, String vtext) {
		s = new Select(ele);
		s.selectByVisibleText(vtext);
	}
	//35 single dropdown Index
	public static void ddStringIndex(WebElement ele,int index) {
		s = new Select(ele);
		s.selectByIndex(index);
	}
	//34 isMultiple
	public static void multipleIs(WebElement element) {
		s = new Select(element);
		System.out.println(s.isMultiple());
	}
	// getOptions Select Class
	public static void allOption(WebElement element) {
		s = new Select(element);
		List<WebElement> list = s.getOptions();
		for (int i = 0; i < list.size(); i++) {
			WebElement eachOption = list.get(i);
			String string = eachOption.getText();
			System.out.println(string);
		}

	}
	
	//35 getAllSelectedOption
	public static void selectedOption(WebElement element) {
		s = new Select(element);
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < selectedOptions.size(); i++) {
			WebElement eachOp = selectedOptions.get(i);
			String text = eachOp.getText();
			System.out.println(text);
		}
	}
	
	//36 getFirstSelectedOption
	public static void selectedFirstOption(WebElement element) {
		s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("first Selected Option = "+ firstSelectedOption);
	
	}
	
	//37 Deselect By index posion
	public static void ddDeSelectIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.deselectByIndex(index);
	}
	
	//38 Dselect By Value
	public static void ddDeSelectValue(WebElement ele, String value) {
		s = new Select(ele);
		s.deselectByValue(value);
	}
	
	//39 Deselect By Visible Text
	public static void ddDeSelectText(WebElement ele, String text) {
		s = new Select(ele);
		s.deselectByVisibleText(text);
	}
	
	//40 DeselectAll
	public static void ddDelectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}
	
	//41 Switch to Frame Id
	public static void goFrameId(String Id) {
		driver.switchTo().frame(Id);
	}
	
	//42 Switch To Frame Name
	public static void goFrameName(String Name) {
		driver.switchTo().frame(Name);
	}
	
	//43 Switch To Frame WebElement
	public static void goFrameWebEle(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	//44 Switch To Frame Index Position
	public static void goFrameIndex(int Index) {
		driver.switchTo().frame(Index);
	}
	
	//45 Exit To  Previous Frame
	public static void preFrame() {
		driver.switchTo().parentFrame();
	}
	
	//46 Exit Frame To Html
	public static void exitFrame() {
		driver.switchTo().defaultContent();
	}
	
	//47 ForWord Page
	public static void forWord() {
		driver.navigate().forward();
	}
	
	//48 BackWard Page
	public static void backWord() {
		driver.navigate().back();
	}
	
	//49 Refresh your Page
		public static void reFresh() {
			driver.navigate().refresh();
		}
	
	//50 Static Wait Thtread.Sleep  
	public static void sleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	//51 Implicit Wait (Duration.ofSeconds(seconds))
	@SuppressWarnings("deprecation")
	public static void waitimplicit(int sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	}
	
	//52 Table Handling
	public static void tableView(String element) {
		WebElement table = driver.findElement(By.xpath(element));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			WebElement ro = row.get(i);
			
			List<WebElement> heading = ro.findElements(By.tagName("th"));
			for (int j = 0; j < heading.size(); j++) {
				WebElement head = heading.get(j);
				String text = head.getText();
				System.out.println(text);
				
			}
			List<WebElement> datas = ro.findElements(By.tagName("td"));
			for (int j = 0; j < datas.size(); j++) {
				WebElement data = datas.get(j);
				System.out.println(data.getText());
			}
		}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}