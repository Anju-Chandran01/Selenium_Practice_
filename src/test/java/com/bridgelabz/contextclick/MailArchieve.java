package com.bridgelabz.contextclick;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MailArchieve {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowswe() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void contextClick_MailArchieve() throws InterruptedException, AWTException {

		driver.get("https://www.gmail.com"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anjuchandran153@gmail.com"); 
		
		//click on Next button 
		driver.findElement(By.xpath("//span[.='Next']")).click(); 
		Thread.sleep(3000); 
		
		//enter password id 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anju162@123"); 
		
		//click on Next button 
		driver.findElement(By.xpath("//span[.='Next']")).click(); 
		Thread.sleep(10000); 
		
		//Write xpath expression for the mail item based on a subject 
		String xp = "(//b[contains(.,'CV is shortlisted')])[2]"; 
		
		//get the address of the mail item which you want to archive 
		WebElement mail = driver.findElement(By.xpath(xp)); 
		
		//print the subject of the mail 
		System.out.println(mail.getText()); 
 
		//Creating an object of Actions class  
		Actions actions = new Actions(driver); 
		
		//using Actions class object and contextClick() method, right click on the mail item 
		actions.contextClick(mail).perform(); 
		Thread.sleep(6000); 
		
		//click on Archive to archive the mail  
		driver.findElement(By.xpath("(//div[@class='J-N-JX aDE aDD'])[1]")).click(); 
	}

}
