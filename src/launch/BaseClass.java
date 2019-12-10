package launch;

import java.awt.Desktop.Action;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BaseClass {
	static WebDriver driver;
	public static void launchrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\eclipse-workspace\\FrameToolsQA\\Driver\\chromedriver.exe");
		Actions a=new Actions(driver);
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		}
	public static void closeBrowser() {
		driver.quit();		
	}
	public static void type(WebElement loc,String in) {
		loc.sendKeys(in);
		}
	public static void click(WebElement loc) {
		loc.click();
	}
	public static void radio(WebElement loc) {
		loc.click();
		
	}
	public static void text(WebElement loc) {
		System.out.println(loc);
		
	}
	public static void MoveTo(WebElement loc) {
		loc.click();
	}
	public static void Isselected(WebElement loc) {
		boolean qqq = loc.isSelected();
		System.out.println(qqq);
		}
	public static void Isdisplay(WebElement loc) {
		boolean eee = loc.isDisplayed();
		System.out.println(eee);
	}
	public static void Isenabled(WebElement loc) {
		boolean rrr = loc.isEnabled();
		System.out.println(rrr);
	}
	public static void Get(WebElement loc, String i) {
		String ttt = loc.getAttribute("url");
		System.out.println(ttt);
	}
	public static void To(WebElement loc) {
		driver.navigate().to("www.facebook.com");		
	}
	public static void Back(WebElement loc) {
		driver.navigate().back();
		}
	public static void Forward(WebElement loc) {
		driver.navigate().forward();
		}
	public static void Refresh(WebElement loc) {
		driver.navigate().refresh();
		}
	public static void DragAndDrop(WebElement w,WebElement d) {
		Actions a=new Actions(driver);
		a.dragAndDrop(w, d);
		}
	
	public static void RightClick(WebElement loc) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
		}
	public static void ContextClick(WebElement loc) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	public static void ClickAndHold(WebElement c, WebElement l) {
		Actions a=new Actions(driver);
		a.clickAndHold().perform();	
		a.moveToElement(l).perform();
	}
	public static void SimpleAlert(String s) {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void ConfirmAlert(String d) {
		Alert a=driver.switchTo().alert();
		if(d.equals("ok")) {
			a.accept();
		}else {
			a.dismiss();
		}
		public static void PromptAlert(String g) {
			Alert a=driver.switchTo().alert();
			a.sendKeys(s);
			a.accept();
		}
	}
	public static void GetText(WebElement loc, String a) {
		String rty = loc.getText();
		System.out.println(rty);
	}
	public static void IsEnabled(WebElement loc, String t) {
		boolean yui = loc.isEnabled();
		System.out.println(yui);		
	}
	public static void IsDisplay(WebElement loc, String o) {
		boolean ppp = loc.isDisplayed();
		System.out.println(ppp);
	}
	
}