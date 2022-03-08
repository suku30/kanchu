package Com.Basic.Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement findElement = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
	
Actions a=new Actions(driver);
a.contextClick(findElement).build().perform();

Robot r= new Robot();

Thread.sleep(2000);

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

//Thread.sleep(2000);

//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);


r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);

Set<String> windowHandles = driver.getWindowHandles();
//List<String> ab=new ArrayList<>(windowHandles);

//String title = driver.switchTo().window(ab.get(0)).getTitle();
//System.out.println(title);

//String title2 = driver.switchTo().window(ab.get(1)).getTitle();
//System.out.println(title2);

//driver.close();

for (String string : windowHandles) {
	String title = driver.switchTo().window(string).getTitle();
	System.out.println(title);
	
}





	
	
	
	}
	
	
	
	

}
