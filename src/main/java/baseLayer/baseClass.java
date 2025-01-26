package baseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


import utilityLayer.propertyReader;

public class baseClass {
	protected static WebDriver driver;
	
	public static void initialization() throws Exception
	{
		String browsername=propertyReader.getProperty("BROWSER");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
		 driver=new ChromeDriver();
		
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("incognito"))
		{
			ChromeOptions opt=new ChromeOptions();
			
			opt.addArguments("--incognito");
			
			driver=new ChromeDriver(opt);
		}
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.manage().deleteAllCookies();
			
			String url=propertyReader.getProperty("SIT_URL");
			
			driver.get(url);
			
			
			
		}
	}
	


