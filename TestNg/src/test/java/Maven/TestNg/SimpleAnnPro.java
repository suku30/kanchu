package Maven.TestNg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnPro {
	
	private static final String Fileutils = null;
	public static WebDriver driver;
	
	@BeforeSuite
	private void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	
	
	}
	
	@BeforeTest
	private void driver() {
		driver.manage().window().maximize();
		System.out.println("max");
		}
	@BeforeClass
	private void url() {
		driver.get("https://www.amazon.in/");

	}
	@BeforeMethod
	private void gettile() {
		String title = driver.getTitle();
		System.out.println("title");

	}
	
	
@Test
	private void dropdown() {
	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	findElement.sendKeys("iPhone");
	findElement.click();

}
@Test@Ignore
private void mobile() {
	WebElement findElement = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	findElement.click();

}
@Test(enabled = false)
private void all() {
	WebElement findElement = driver.findElement(By.className("hm-icon-label"));
    findElement.click();


}



@AfterMethod
private void refresh() {
	driver.navigate().refresh();

}
@AfterClass
private void backward() {
	driver.navigate().back();

}
@AfterTest
private void forward() {
	driver.navigate().forward();

}
@AfterSuite
private void close() {
	driver.close();

}

	


}
