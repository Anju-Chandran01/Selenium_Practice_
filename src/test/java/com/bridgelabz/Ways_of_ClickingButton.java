package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ways_of_ClickingButton {
	@Test
	public void diff_waystoclick_button() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://demo.vtiger.com"); 
	    String xp = "//button[.='Sign in']"; 
	    
	    //1. using click() method 
	    driver.findElement(By.xpath(xp)).click(); 
	    
	    //2. using sendkeys 
	    driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER); 
	  
	    //3. using submit() method 
	    driver.findElement(By.xpath(xp)).submit();
	} 
}
