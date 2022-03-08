package Com.Basic.Testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		WebElement alert2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alert2.click();
		
		WebElement findElement = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		findElement.click();
		
		Alert b = driver.switchTo().alert();
		b.dismiss();
		
		WebElement textbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		textbox.click();
		
		WebElement findElement2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		findElement2.click();
		
		Alert c = driver.switchTo().alert();
		c.accept();
		
		
		
		
		
		
		
		
	
	
	
	
	
	}
	
	
	

}
