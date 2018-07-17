package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_GITHUB {
	@Test
	public void testlogin()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver ();
				  driver.get("https://github.com/login");
				  driver.findElement(By.id("login_field")).sendKeys("vigneshwarisivagnanam");
				  driver.findElement(By.id("password")).sendKeys("Vigneshwari@123");
				  driver.findElement(By.name("commit")).click();
				  String title=driver.getTitle();
				  System.out.println(title);
				  
				  Assert.assertEquals(title,"Sign in to GitHub . GitHub");
				  
				  System.out.println("verified");
				
				  
				  
	}

}
