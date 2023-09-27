package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;

public class Base {

	static WebElement target;
	public static WebDriver driver;
	static Robot key;
	 static Actions act;
	
	

	// 1 to launch browser
	public static WebDriver LaunchBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-workspace\\Amazon\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver\"",
					"D:\\eclipse-workspace\\Amazon\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.manage().window().fullscreen();
		return driver;
	}

// 2 to close the webpage
	public static void close() {
		driver.close();
	}
// 3 to quit the browser

	public static void quit() {
		driver.quit();
	}

// 4 navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}

// 5 navigate 
	public static void navigate_back_forw(String option) {
		if (option.equalsIgnoreCase("back"))
			driver.navigate().back();
		else
			driver.navigate().forward();
	}

// 7 navigate refresh
	public static void refresh() {
		driver.navigate().refresh();
	}

// 8 get
	public static void geturl(String url) {
		driver.get(url);
	}

	// 9 alert

	public static void alert(String command) {
		if (command.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

//10
	public static void alertmsg(String message) {
		driver.switchTo().alert().sendKeys(message);
	}

	// 11 actions--- mouseactions
	public static void click(String option) {
		if (option.equalsIgnoreCase("double")) {
			act.doubleClick(target).build().perform();
		} else if (option.equalsIgnoreCase("right")) {
			act.contextClick(target).build().perform();
		}
	}

//15

	public static void click_n_hold(WebElement target) {
		act = new Actions(driver);
		act.clickAndHold(target).build().perform();
	}

//16
	public static void drag_n_drop(WebElement src, WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(src, target).build().perform();
	}

//17
	public static void moveTo(WebElement target) {
		act = new Actions(driver);
		act.moveToElement(target).build().perform();
	}

//18
	public static void sendkeys_mouse(WebElement target, String value) {
		act = new Actions(driver);
		act.sendKeys(target, value).build().perform();
	}

//19 Frames
	public static void frame(WebElement target) {
		driver.switchTo().frame(target);
	}

//20
	public static void frameparent() {
		WebDriver parentFrame = driver.switchTo().parentFrame();
	}

// 21 robot --- keyboard  functions

	public static void key() throws AWTException {
		Robot key = new Robot();

		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
	}

// 22 window handles

	public static Set<String> windowtitles() {
		Set<String> title = driver.getWindowHandles();
		for (String string : title) {
			String titles = driver.switchTo().window(string).getTitle();
			System.out.println(titles);

		}
		return title;
	}

//23
	public static String windowhandle() {
		String title = driver.getWindowHandle();
		return title;
	}

// 24 dropdown
	public static List<WebElement> getoptions(WebElement target) {
		Select s = new Select(target);

		List<WebElement> options = s.getOptions();
		return options;
	}

//25
	public static void selectby(WebElement target,String option,String text) {
		Select s = new Select(target);

		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(text);
		} else if (option.equalsIgnoreCase("text"))
			s.selectByVisibleText(text);
	}

//26
	public void selectbyindex(int index) {
		Select s = new Select(target);

		s.selectByIndex(index);
	}

// 27 checkbox
	public static boolean ismultiple() {
		Select s = new Select(target);

		boolean multiple = s.isMultiple();
		return multiple;
	}

//28
	public static void deselectAll() {
		Select s = new Select(target);

		s.deselectAll();
	}

// 29 is enable
	public static void is_enable(WebElement target) {
		boolean check = target.isEnabled();
	}

// 30 is display
	public static void is_display(WebElement target) {
		boolean check = target.isDisplayed();
	}

// 31 is selected
	public static void is_selected(WebElement target) {
		boolean check = target.isSelected();

	}

// 32 get options------->line no 140

// 33 get title
	public static String gettitle() {
		String title = driver.getTitle();
		return title;
	}

// 34 get curret url
	public static String geturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

//35 get text
	public static String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}

// 36 get attribute
	public static String getattribute(WebElement element, String attribute) {
		String text = element.getAttribute(attribute);
		return text;
	}

// 37
	public static void implicitwait(int seconds) {
		TimeUnit unit1 = TimeUnit.SECONDS;
		driver.manage().timeouts().implicitlyWait(seconds, unit1);

	}

//38
	public static WebElement waitTovisible(int sec, WebElement s) {
		WebDriverWait w = new WebDriverWait(driver, sec);// create new object
		WebElement clickable_element = w.until(ExpectedConditions.visibilityOf(s));
		return clickable_element;
	}

// 39 take screenshot
	public static void takeScreenShot(String filename) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desti = new File("D:\\eclipse-workspace\\selenium\\screenshot\\" + filename + ".png");

		try {
			FileUtils.copyFile(src, desti);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//40 scrollup down
	public static void scrollinto(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", element);
	}

//41
	public static void scrollby(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("scrollBy(x, y)");

	}

//42 sendkeys
	public static void sendkeyto(WebElement w, String v) {
		w.sendKeys(v);
	}

//43 get first selected options
	public static WebElement get_firstoptionSelected() {
		Select s = new Select(target);

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}
//44 get all selected options

	public static List<WebElement> get_allSelectedoption() {
		Select s = new Select(target);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		return allSelectedOptions;
	}
//45

	public static void clickOn(WebElement target) {
		waitTovisible(10, target);
		target.click();
	}
}
