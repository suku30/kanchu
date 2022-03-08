package Com.Basic.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePro {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	WebElement findElement = driver.findElement(By.id("singleframe"));
	
	driver.switchTo().frame(findElement);
	
	WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	findElement2.sendKeys("abcd");
	
	driver.switchTo().defaultContent();
	WebElement findElement3 = driver.findElement(By.linkText("Iframe with in an Iframe"));
	findElement3.click();
System.out.println("findelement");
	
	WebElement findElement4 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(findElement4);
	
	
	
	WebElement findElement5 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));

	driver.switchTo().frame(findElement5);
	
	WebElement findElement6 = driver.findElement(By.xpath("//input[@type='text']"));
	findElement6.sendKeys("123");
	
	
	
	
	
	
	
	
	
	}

}
