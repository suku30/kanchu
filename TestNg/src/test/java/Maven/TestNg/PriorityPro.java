package Maven.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityPro {
	public static WebDriver driver;
	@Test(priority = 0 )
	private void chrome() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");

	driver=new ChromeDriver();
	
	
	}
	@Test(priority = 1 )
	private void url() {
		driver.get("https://www.flipkart.com/");
		

	}
	@Test(groups = "element") 
	private void close() {
		WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

		findElement.click();
	}
	
	@Test(groups = "element")
	private void search() {
		WebElement findElement = driver.findElement(By.xpath("//input[@class='_3704LK']"));

		findElement.click();
	}	

}
