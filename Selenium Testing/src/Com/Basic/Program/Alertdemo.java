package Com.Basic.Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement findElement = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		findElement.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		WebElement findElement2 = driver.findElement(By.xpath("(//a[text()='Alert with OK & Cancel '])"));
		findElement2.click();	
		
		
		
		//WebElement findElement3 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		//findElement3.click();
		//Alert c = driver.switchTo().alert();
		//c.accept();
		
		WebElement findElement3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		findElement3.click();
		Alert b = driver.switchTo().alert();
		b.accept();
		
		WebElement findElement4 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		findElement4.click();
		
		
		
		WebElement findElement5 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		findElement5.click();
		Alert c = driver.switchTo().alert();
		c.accept();
		
	
		
		
		
		
		
		
		
		
		
	}

}
