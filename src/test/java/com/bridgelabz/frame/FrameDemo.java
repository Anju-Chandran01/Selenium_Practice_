package com.bridgelabz.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameDemo {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowswe() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void enterText_InsideAnElement_InTheFrame() throws InterruptedException {
		
		driver.get("file:///C:/Users/HP/eclipse-workspace/CQASelenium_Practice/src/test/java/com/bridgelabz/frame/Framepage2.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//using index of the frame - [ int value] [ index of frames starts with zero] 
	    driver.switchTo().frame(0); 
	    driver.findElement(By.id("t1")).sendKeys("a"); 
	    driver.switchTo().defaultContent(); 
	    driver.findElement(By.id("t2")).sendKeys("a"); 
		Thread.sleep(2000);
	    
	    //using id attribute of the frame -string 
	    driver.switchTo().frame("f1"); 
	    driver.findElement(By.id("t1")).sendKeys("b"); 
	    driver.switchTo().defaultContent(); 
	    driver.findElement(By.id("t2")).sendKeys("b"); 
		Thread.sleep(2000);
	    
	    //using name attribute of the frame -string 
	    driver.switchTo().frame("n1"); 
	    driver.findElement(By.id("t1")).sendKeys("c"); 
	    driver.switchTo().defaultContent(); 
	    driver.findElement(By.id("t2")).sendKeys("c"); 
		Thread.sleep(2000);
	    
	    //using address of the frame -webelement 
	    WebElement f = driver.findElement(By.className("c1")); 
	    driver.switchTo().frame(f); 
	    driver.findElement(By.id("t1")).sendKeys("d"); 
	    driver.switchTo().defaultContent(); 
	    driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(2000); 
	    driver.close(); 
	}
}
