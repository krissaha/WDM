package com.qa.WDM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDM 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Test
	public void url()
	{
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals(true,true);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
	
	
}
