package Com.Basic.Program;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclconsolipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	   WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	   findElement.click();
	   Thread.sleep(2000);
	   
	   WebElement date = driver.findElement(By.id("day"));
	   
	   Select s=new Select(date);
	   s.selectByIndex(5);
	   Thread.sleep(2000);
	   
	   WebElement month = driver.findElement(By.id("month"));
	   
	   
	   Select s1=new Select(month);
	   s1.selectByIndex(2);
	   Thread.sleep(2000);
	   
	   WebElement year = driver.findElement(By.id("year"));
	   Select s2=new Select(year);
	   s2.selectByIndex(3);
	   
	   List<WebElement> options = s1.getOptions();
	   
	   for (WebElement datas : options) {
		   System.out.println(datas.getText());
		
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 
	   
	   
	   
	   
	
	
	
	
	}
	
	
	
	

}
