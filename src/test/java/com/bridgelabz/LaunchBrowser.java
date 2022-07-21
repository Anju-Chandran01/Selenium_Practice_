package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println("The title of the page is : " + title);
		Thread.sleep(2000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The URL of the page is : " + currentUrl);
		Thread.sleep(2000);
		
		String pageSource = driver.getPageSource();
		System.out.println("The source code of the page is : " + pageSource);
		Thread.sleep(2000);
	}

}
