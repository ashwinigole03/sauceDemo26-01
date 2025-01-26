package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseLayer.baseClass;

public class Utils extends baseClass{
	
	public static void selectProducts(List<WebElement> plist,int a)
	{
		for(int i=1; i<=a; i++)
		{
			plist.get(i).click();
		}

	}

}
