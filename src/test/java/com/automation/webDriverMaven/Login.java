package com.automation.webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;


public class Login {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new  ChromeDriver(options);
	}
	
	@Test
	public void doLogin() throws InterruptedException 
	{
		//comment moree
		driver.get("https://github.com/login");
		System.out.println("########## NORMAL ##########");
		WebElement username, password, submit;
		System.out.println("enter username");
		username = driver.findElement(By.id("login_field"));
		username.sendKeys("este es mi usuario");
		Thread.sleep(3000);
		System.out.println("enter password");
		password =  driver.findElement(By.name("password"));//
		password.sendKeys("esta es mi constraseña");
		Thread.sleep(3000);
		System.out.println("click enter");
		submit = driver.findElement(By.name("commit"));
		submit.click();
	}
	 
	@AfterSuite
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
