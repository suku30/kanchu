package Com.Basic.Testing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	Thread.sleep(2000);
	List<WebElement> findElements = driver.
			findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr[6]/td[3]"));
	
	System.out.println(findElements);
	
	
	
	
	for (WebElement datas : findElements) {
		System.out.println(datas.getText());
		
	}
	
	
	}

}
