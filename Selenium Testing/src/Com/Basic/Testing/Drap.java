package Com.Basic.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drap {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/droppable");
	WebElement findElement = driver.findElement(By.id("draggable"));
	WebElement findElement2 = driver.findElement(By.id("droppable"));
	
	Actions a=new Actions(driver);
	a.dragAndDrop(findElement, findElement2).build().perform();
	
	WebElement findElement5 = driver.findElement(By.id("droppableExample-tab-accept"));
	findElement5.click();
	
	WebElement findElement3 = driver.findElement(By.linkText("Acceptable"));
	WebElement findElement4 = driver.findElement(By.id("droppable"));
	Actions b=new Actions(driver);
	b.dragAndDrop(findElement3, findElement4).build().perform();
	
	
	WebElement findElement6 = driver.findElement(By.id("droppableExample-tab-preventPropogation"));
	findElement6.click();
	
	
	
	}

}
