package com.bridgelabz.contextclick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContextClick {

	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowswe() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void contextClick_UsingActionClass() throws InterruptedException, AWTException {
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//find the ActiTIME Inc. link 
		WebElement link = driver.findElement(By.linkText("actiTIME Inc.")); 
		
	    //right click (context click) on actitime link 
	    Actions actions = new Actions(driver); 
	    actions.contextClick(link).perform(); 
	    Thread.sleep(3000); 
	    
	    //press 'w' from the keyboard for opening in a new window 
	    Robot r = new Robot(); 
	    r.keyPress(KeyEvent.VK_W); 
	    r.keyRelease(KeyEvent.VK_W); 
	    
	    driver.quit(); 
	}
}
