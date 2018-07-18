package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Project_GITHUB {
	@Parameters("browser")
	@Test
	public void testlogin(String value)
	{
		WebDriver driver=null;
		if(value.equals("chrome"))
		{
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver ();
		}
		else if(value.equals("firefox"))
				{
			 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\chromedriver_win32\\geckodriver.exe");
			  driver = new FirefoxDriver ();
			}
		else {
			System.out.println("No Driver Found");
		}
				  driver.get("https://github.com/login");
				  driver.findElement(By.id("login_field")).sendKeys("vigneshwarisivagnanam");
				  driver.findElement(By.id("password")).sendKeys("Vigneshwari@123");
				  driver.findElement(By.name("commit")).click();
				  String title=driver.getTitle();
				  System.out.println(title);
				  
				  Assert.assertEquals(title,"GitHub");
				  
				  System.out.println("verified");
								  //**mkfsdasadsa
				  
	}

}
