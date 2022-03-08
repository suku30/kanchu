package Com.BaseClass.Pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPractice {
	public static WebDriver driver;
	
	@FindBy(id="search_query_top")
	private WebElement search;
	
	@FindBy(name="submit_search")
	private WebElement dropdown;
	
	@FindBy(xpath="(//a[@class='quick-view-mobile'])[5]")
	private WebElement view;
	
	@FindBy(id="quantity_wanted")
	private WebElement quantity;
	
	public TestingPractice(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}



public WebElement getSearch() {
		return search;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getView() {
		return view;
	}
	public WebElement getQuantity() {
		return quantity;
	}





	
	
	
	
	
	

}
