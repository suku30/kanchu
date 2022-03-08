package Com.Basic.Program;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		

		TakesScreenshot ka=(TakesScreenshot) driver;
		File ScreenShot = ka.getScreenshotAs(OutputType.FILE);
		File file = new File
		("C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\ScreenShot//fb1.png");
		FileUtils.copyFile(ScreenShot, file);
		driver.close();
		
		
	}

}
