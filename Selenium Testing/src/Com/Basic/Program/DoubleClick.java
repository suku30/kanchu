package Com.Basic.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	findElement.sendKeys("iphone");
	
	Actions a=new Actions(driver);
	a.doubleClick(findElement).build().perform();
	
	
	
	
	}
	
	
	
	

}
