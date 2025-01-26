package utilityLayer;

import org.openqa.selenium.WebElement;

import baseLayer.baseClass;

public class WebElementHelper extends baseClass{

	public static void clickOnWebElement(WebElement wb)
	{
		wb.click();
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		wb.sendKeys(value);
	}
	
	
}
