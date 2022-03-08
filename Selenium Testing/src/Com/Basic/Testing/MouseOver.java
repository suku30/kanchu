package Com.Basic.Testing;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
	    WebElement customer = driver.findElement(By.xpath("//a[text()='Customer Service']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(customer).build().perform();
	    
	    WebElement audio = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	    audio.click();
	    Actions b=new Actions(driver);
	    b.moveToElement(audio).build().perform();
		
	    
		
		
	}

}
