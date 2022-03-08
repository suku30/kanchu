package Com.Basic.Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotpro {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	
	    TakesScreenshot sc = (TakesScreenshot) driver;
	    File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
	    File destn= new File 
	  	("C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\ScreenShot//g1.png");
	    FileUtils.copyFile(screenshotAs, destn);
	
	
	
	
	}

}
