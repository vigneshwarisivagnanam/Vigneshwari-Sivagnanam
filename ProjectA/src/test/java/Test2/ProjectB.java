package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectB {
  @Test
  public void testlogin() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver ();
			  driver.get("http://www.google.com");
	  WebElement element = driver.findElement(By.name("q"));
	  element.sendKeys("Current sport news");
	  element.submit();
  }
  }
  
