package Com.Basic.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	WebElement findElement2 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	findElement2.click();
	
	Thread.sleep(2000);
	
	WebElement findElement = driver.findElement(By.linkText("Contact Us"));
	
	System.out.println("find");
	
	JavascriptExecutor abc=(JavascriptExecutor) driver;
	abc.executeScript("arguments[0].scrollIntoView();", findElement);
	
	Thread.sleep(2000);
	WebElement findElement3 = driver.findElement(By.linkText("Electronics"));
	abc.executeScript("arguments[0].scrollIntoView();", findElement3);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
