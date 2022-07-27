package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavascriptExecutorPractise {

	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowswe() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void enterText_intoDisabledTextbox() throws InterruptedException {
		driver.get("file:///C:/Users/HP/eclipse-workspace/CQASelenium_Practice/src/test/java/com/bridgelabz/javascriptexecutor/DisabledTextBox_pgm.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		Thread.sleep(2000); 
		js.executeScript("document.getElementById('t1').value='admin'"); 
		Thread.sleep(2000); 
		js.executeScript("document.getElementById('t2').value=''"); 
		js.executeScript("document.getElementById('t2').value='manager'");
		js.executeScript("document.getElementById('t2').type='button'"); 
		 
	}
}
