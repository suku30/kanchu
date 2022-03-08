package Com.BaseClass.Pro;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Basic.Program.ScreenShot;
import Com.Basic.Testing.ScrollUP;

public class ChildClass extends BaseClassPro {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		setup("chrome");
		//url("https://www.facebook.com/");
		//navigateto("https://www.amazon.in/");
		//backward();
		//forward();
		//refresh();
		//currenturl();
		//gettitle();
		//WebElement findElement = driver.findElement(By.id("nav-link-prime"));
		//click(findElement);
		
		//WebElement findElement2 = driver.findElement(By.id("twotabsearchtextbox"));
		//sendkeys(findElement2, "iphone");
		
		//WebElement findElement3 = driver.findElement(By.linkText("Mobiles"));
		//movetoelement(findElement3);//
		
		//url("https://demoqa.com/droppable");
		//WebElement findElement4 = driver.findElement(By.id("draggable"));
		//drapanddrop(findElement4, findElement4);
		//WebElement findElement5 = driver.findElement(By.id("droppable"));
		//drapanddrop(findElement4, findElement5);
		
		
		//url("https://www.amazon.in/");
	//	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	//	sendkeys(findElement, "iphone");
	//	doubleclick(findElement);
		
		//WebElement findElement = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		//contextclick(findElement);
		
		//robot();
		
	/*url("http://demo.automationtesting.in/Alerts.html");
		WebElement findElement2 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		click(findElement2);
		WebElement findElement = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click(findElement);
		alert();
		WebElement findElement3 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		click(findElement3);
		WebElement findElement4 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		click(findElement4);
		confirmalert("ok");
		WebElement findElement5 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		click(findElement5);
		Thread.sleep(2000);
		WebElement findElement6 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		click(findElement6);
		promptAlert("accept", "kanchu");*/		
		
		//to("http://demo.automationtesting.in/Alerts.html");
		//ScrrenShot("C:\\Users\\Jagan\\eclipse-workspace\\Selenium Testing\\Driver\\ScreenShot\\nb.png");
		
		/*url("https://www.amazon.in/");
		WebElement findElement = driver.findElement(By.linkText("Instagram"));
		scrollUp(findElement);
		Thread.sleep(2000);
	WebElement findElement2 = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
	scrolldown(findElement2);*/
		
		to("https://www.w3schools.com/html/html_tables.asp");
	List<WebElement> findElements = driver.findElements
			(By.xpath("//table[@class='ws-table-all']/tbody/tr[6]/td[3]"));
	
	webtable(findElements);
	
	
	}
	
	
	
	
	

}
