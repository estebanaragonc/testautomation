package com.automation.webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new  ChromeDriver();
	}
	
	@Test
	public void doLogin() throws InterruptedException 
	{
		
		driver.get("https://github.com/login");
		
		WebElement username, password, submit;
					
		username = driver.findElement(By.id("login_fiseld"));
		username.sendKeys("este es mi usuario");
		Thread.sleep(3000);
		password =  driver.findElement(By.name("password"));//
		password.sendKeys("esta es mi constraseña");
		Thread.sleep(3000);
		submit = driver.findElement(By.name("commit"));
		submit.click();
		
		
		/*
		 * 
		 * added comments
		 * 
		 * */
	}
	 
	@AfterSuite
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
