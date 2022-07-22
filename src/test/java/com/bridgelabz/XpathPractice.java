package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathPractice {
	
	@Test
	public void xpath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// using absolute xpath
		driver.findElement(By.xpath("/html/body/form/div/input[1]")).sendKeys("Ann");
		Thread.sleep(2000);
		
		// xpath using attributes
		driver.findElement(By.xpath("//input[@name='middlename']")).sendKeys("Mariya");
		Thread.sleep(2000);
		
		// xpath using multiple attributes
		driver.findElement(By.xpath("//input[@name='lastname' and @placeholder='Lastname']")).sendKeys("John");
		Thread.sleep(2000);
		
		
		
		//xpath using contains(text())
		driver.findElement(By.xpath("//input[text(),'Phone :  ']")).sendKeys("7306096567");
		
		
		// xpath using text() function
		driver.findElement(By.xpath("//button[text()='Register'")).click();
//		driver.findElement(By.xpath("//button[.='Register'")).click();
		
		
		
	}
}
