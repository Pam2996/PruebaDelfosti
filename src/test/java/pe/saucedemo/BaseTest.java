package pe.saucedemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	  @Test
	  public void setUp() throws InterruptedException {
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
	  }
	  
}
