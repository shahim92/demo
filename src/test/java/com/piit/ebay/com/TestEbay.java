package com.piit.ebay.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestEbay {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  EbayHome Home = new EbayHome(driver);
	  Home.Clickonhome();
	  Thread.sleep(5000);
	  Home.Clickonsave();
	  Thread.sleep(5000);
	  driver.navigate().to("https://www.ebay.com");
	  Home.Clickonmotors();
	  Home.Clickonsearch();
	  Thread.sleep(5000);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shahi\\\\eclipse-workspace\\\\Amazon1\\\\Driver\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.ebay.com");
	 
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
