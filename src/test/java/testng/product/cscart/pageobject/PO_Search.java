package testng.product.cscart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Search {

	WebDriver driver;
	
	public PO_Search(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.CLASS_NAME,using="col-12-12 _1MRYA1")
	WebElement SearchButton;
}
