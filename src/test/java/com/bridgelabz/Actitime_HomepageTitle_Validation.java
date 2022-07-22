package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actitime_HomepageTitle_Validation {
	@Test
	public void verifyHomepageUsingTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin"); 
		driver.findElement(By.name("pwd")).sendKeys("manager"); 
		driver.findElement(By.xpath("//div[.='Login ']")).click(); 
		Thread.sleep(3000); 
		String expectedTitle = "Enter Time"; 
		String actualTitle = driver.getTitle(); 
		//If actual title contains "Enter Time" text then home page is displayed. 
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Home page is displayed"); 
		} else{ 
			System.out.println("Home page is NOT displayed");  
		} 
	}
}
