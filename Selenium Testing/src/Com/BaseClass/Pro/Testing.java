package Com.BaseClass.Pro;

import java.awt.AWTException;

public class Testing extends BaseClassPro {
	public static void main(String[] args) throws AWTException {
		
		setup("chrome");
		url("http://automationpractice.com/index.php");
		TestingPractice ac= new TestingPractice(driver);
		sendkeys(ac.getSearch(), "dress");
		doubleclick(ac.getSearch());
	
		robotrobot(ac.getDropdown());
		scrollUp(ac.getView());
		click(ac.getView());
		scrollUp(ac.getQuantity());
		sendkeys(ac.getQuantity(), "2");
		
		
		
		
		
		
	}

}
