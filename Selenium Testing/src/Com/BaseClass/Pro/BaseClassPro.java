package Com.BaseClass.Pro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.audits.model.AffectedCookie;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Com.Basic.Testing.ScrollUP;

public class BaseClassPro {
	
	public static WebDriver driver;

	
	public static void setup(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
				
			driver=new ChromeDriver();
			
}
			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", 
						"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
				
				driver=new InternetExplorerDriver();
			}
			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\edgedriver_win64\\msedgedriver.exe" );
				
			driver=new EdgeDriver();
			
}
			else {
				System.out.println("Invalid Browser");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void url(String url) {
		driver.get(url);
		}
	public static void navigateto(String url) {
		driver.navigate().to(url);
}
	 public static void backward() {
		driver.navigate().back();
}
	 public static void forward() {
		driver.navigate().forward();
}
	 public static void refresh() {
	driver.navigate().refresh();
}
	 public static void currenturl() {
		driver.getCurrentUrl();
}
	 public static void gettitle() {
		 driver.getTitle();
}
	 public static void close() {
		driver.close();

	}
	 public static void quit() {
      driver.quit();
	}
	 
	 
	 public static void click(WebElement element) {
		element.click();

	}
	 
	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	

	}
	public static void movetoelement(WebElement actions) {
		Actions ac=new Actions(driver);
		ac.moveToElement(actions).build().perform();
		

	}
	public static void drapanddrop(WebElement element, WebElement element1) {
	Actions ac=new Actions(driver);
	ac.dragAndDrop(element, element1).build().perform();

	}
	public static void doubleclick(WebElement actions) {
	Actions ac=new Actions(driver);
	ac.doubleClick(actions).build().perform();

	}
	public static void contextclick(WebElement element) {
		Actions ac=new Actions(driver);
		ac.contextClick(element).build().perform();
		

	}
	public static void robot() throws AWTException {
	Robot ac=new Robot();
	ac.keyPress(KeyEvent.VK_DOWN);
	ac.keyRelease(KeyEvent.VK_DOWN);
	ac.keyPress(KeyEvent.VK_ENTER);
	ac.keyRelease(KeyEvent.VK_ENTER);
	
	}
	public static void alert() {
		Alert ac = driver.switchTo().alert();
		ac.accept();
		
}
	public static void confirmalert(String option) {
		if (option.equalsIgnoreCase("ok")) {
			Alert ac = driver.switchTo().alert();
			ac.accept();
			
		}
		else if (option.equalsIgnoreCase("cancel")) {
			Alert ac = driver.switchTo().alert();
			ac.dismiss();
			
		}
		
		
}
  public static void promptAlert(String option, String value) {
  if (option.equalsIgnoreCase("accept")) {
	  driver.switchTo().alert().sendKeys(value);
	  driver.switchTo().alert().accept();
	
}
  else if (option.equalsIgnoreCase("dismiss")) {
	  driver.switchTo().alert().sendKeys(value);
	  driver.switchTo().alert().dismiss();
	
}

}

public static void ScrrenShot(String element) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(element);
		FileUtils.copyFile(Source, file);

	}
	
	 public static void to(String url) {
		driver.navigate().to(url);

	}
public static void scrollUp(WebElement element) {
	JavascriptExecutor a=(JavascriptExecutor)driver;
	a.executeScript("arguments[0].scrollIntoView();", element);
	
	}
public static void scrolldown(WebElement element) {
	JavascriptExecutor ac=(JavascriptExecutor)driver;
	ac.executeScript("arguments[0].scrollIntoView();", element);

}
public static void select(WebElement element, int value) {
	Select ac=new Select(element);
	ac.selectByIndex(value);

}
public static void handles() {
	Set<String> element = driver.getWindowHandles();
	for (String datas : element) {
		String title = driver.switchTo().window(datas).getTitle();
		System.out.println(title);
	
		
	}
	

}
public static void handles2() {
	Set<String> element = driver.getWindowHandles();
	List<String>ac=new ArrayList<>(element);
	String title = driver.switchTo().window(ac.get(0)).getTitle();
	System.out.println(title);

}
public static void webtable(List<WebElement> webElement) {
	for (WebElement value : webElement) {
		System.out.println(((WebElement)value).getText());
		
	}

}	
public static void robotrobot(WebElement webElement) throws AWTException {
	Robot ac=new Robot();
	ac.keyPress(KeyEvent.VK_DOWN);
	ac.keyRelease(KeyEvent.VK_DOWN);
	ac.keyPress(KeyEvent.VK_ENTER);
	ac.keyRelease(KeyEvent.VK_ENTER);

}
	}





	
	 
	
	


