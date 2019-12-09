package example;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver  driver;	
	
	
	  
  @Test
  public void f() throws InterruptedException {
	  
	  
	  try {
	//	  WebDriverManager.chromedriver().clearPreferences();
		//  WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		  driver= new ChromeDriver();

		    driver.get("https://www.designmate.com/");  
		  String title = driver.getTitle();				 
		  Assert.assertTrue(title.contains("Designmate - Learning Through Exploration")); 	
		  Thread.sleep(10000);
		  driver.quit();
		
	} catch (Exception e) {
		// TODO: handle exception
		 driver.quit();
		 System.out.println("Browser Not Loading");
	}
	 
  
  }

}
