package Com.Basic.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234");
		
	 // WebElement Create = driver.findElement(By.xpath("//a[@role='button]"));
	 // Create.click();
		
		//WebElement firstname = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		//firstname.sendKeys("kanchu");
		
		
		WebElement newaccount = driver.findElement(By.linkText("Create New Account"));
		newaccount.click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("kanchu");
		
		
	}
	
	
	
	
	

}
