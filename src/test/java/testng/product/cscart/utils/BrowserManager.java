package testng.product.cscart.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserManager {
	
	public static WebDriver getDriver(String type)
	{
		WebDriver driver;
		if(type.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(type.equalsIgnoreCase("firefox"))
		{
			
		}
		else if(type.equalsIgnoreCase("IE"))
		{
			
		}
		else
		{
			Assert.assertTrue(false,"No browser sent");
		}
		return null;
		
	}

}
