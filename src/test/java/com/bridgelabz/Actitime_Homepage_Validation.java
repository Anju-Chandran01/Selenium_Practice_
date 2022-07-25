package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actitime_Homepage_Validation {
	@Test
	public void verifyHomepageUsingTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin"); 
		driver.findElement(By.name("pwd")).sendKeys("manager"); 
		driver.findElement(By.xpath("//div[.='Login ']")).click(); 
		Thread.sleep(3000); 
		String expectedTitle = "Enter Time"; 
		String actualTitle = driver.getTitle(); 
//		String expectedUrl = "submit";
//		String actualUrl = driver.getCurrentUrl(); 
//		if (actualTitle.contains(expectedTitle) and (actualUrl.contains(expectedUrl))) {
		if (actualTitle.contains(expectedTitle))
		{
			System.out.println("Home page is displayed"); 
		} else{ 
			System.out.println("Home page is NOT displayed");  
		} 
	}
	
	// verify home page using url
	@Test
	 public void verifyHomepageUsingUrl() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin"); 
	    driver.findElement(By.name("pwd")).sendKeys("manager"); 
	    driver.findElement(By.xpath("//div[.='Login ']")).click(); 
	    Thread.sleep(3000); 
	    String expectedUrl = "submit"; 
	    String actualUrl = driver.getCurrentUrl(); 
	    if (actualUrl.contains(expectedUrl)) 
	    { 
	    	System.out.println("Home page is displayed"); 
		} else{ 
		    System.out.println("Home page is NOT displayed"); 
		} 
	}
	
	@Test
	 public void verifyHomepageUniqueElement() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);driver.findElement(By.id("username")).sendKeys("admin"); 

		driver.findElement(By.name("pwd")).sendKeys("manager"); 
		driver.findElement(By.xpath("//div[.='Login ']")).click(); 
		Thread.sleep(3000); 
		WebElement logoutBtn = driver.findElement(By.xpath("//a[.='Logout']")); 
		if (logoutBtn.isDisplayed()) { 
			System.out.println("Home page is displayed"); 
		} else{ 
			System.out.println("Home page is NOT displayed"); 
		} 
	} 	 
}
