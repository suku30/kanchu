package Maven.TestNg;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class GroupingPro {
	public static WebDriver driver;
	@Test(groups = "element")
	
	private void chrome() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("chrome");
	
}
	@Test(groups = "element")
	private void filp() {
		
		driver.get("https://www.flipkart.com/");
		System.out.println("element");
		
		

	}
	
	
	
	
	
	

}
