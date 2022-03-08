package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium\\src\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("abachg");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("23456");
		
		WebElement button=driver.findElement(By.xpath(")
		
		
	}
}