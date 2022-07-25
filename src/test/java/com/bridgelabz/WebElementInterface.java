package com.bridgelabz;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementInterface {
	@Test
		public void getLocation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
// 		getLocation()
		WebElement unTB = driver.findElement(By.name("middlename")); 
		int x = unTB.getLocation().getX();
		System.out.println("The position of middlename is in "+x+" of x axis");
	}
	@Test
	public void getSize() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
//		getSize().. getWidth() and getHeight()
		WebElement unTB = driver.findElement(By.name("middlename"));
		int width = unTB.getSize().width;
		System.out.println("The width of middlename is "+width);
		int height = unTB.getSize().height;
		System.out.println("The height of middlename is "+height);
	}
	
	@Test
	public void isDisplayed() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
//		isDisplayed() 
		WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastname']")); 
		if (lastNameField.isDisplayed()) { 
			System.out.println("Last name field is displayed"); 
		} else{ 
			System.out.println("Last name field is not displayed"); 
		} 
	}
		
	@Test
	public void isEnabled() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		isEnabled()
		WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstname']")); 
		if (firstNameField.isEnabled()) { 
		   System.out.println("First name text box is enabled"); 
		}else { 
		   System.out.println("Username text box is disabled"); 
		}
	}
	@Test
	public void sendKeys() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
//		sendKeys()
		driver.findElement(By.name("firstname")).sendKeys("anju_ozhankal");
		Thread.sleep(2000);
	}

	@Test
	public void clear() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("ozhangal");
	
//		clear()
		String lastName= driver.findElement(By.name("lastname")).getAttribute("lastname"); 
		System.out.println("Value present inside the text box is : "+lastName); 
		driver.findElement(By.name("lastname")).clear(); 
	}

	@Test
	public void isSelected() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		isSelected()
		WebElement select = driver.findElement(By.name("male"));
		select.click();
		if (select.isSelected()) { 
		   System.out.println("Checkbox is selected"); 
		}else{ 
		   System.out.println("Checkbox is NOT selected"); 
	    } 
	}

	@Test
	public void getattribute() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
//		getAttribute()
		String elementType = driver.findElement(By.name("male")).getAttribute("type"); 
		System.out.println(elementType); 
		if (elementType.equalsIgnoreCase("radio")) { 
		  System.out.println("it is a radio button"); 
		}else{ 
		  System.out.println("it is NOT  a radio button"); 
		}
	}
	
	@Test
	public void gettagName() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		
//		getTagname()
		String tagName = driver.findElement(By.id("address")).getTagName(); 
		if (tagName.equals("textarea")) { 
		   System.out.println("Address is a textarea"); 
		} else{ 
		   System.out.println("Address is NOT a textarea"); 
		}
	}
	
	@Test
	public void submit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
//		submit()
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']")); 
		submitButton.submit();
	}

	@Test
	public void getrect() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("C:\\Users\\HP\\eclipse-workspace\\CQASelenium_Practice\\xml_selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
//		getRect()
		WebElement dimension = driver.findElement(By.name("psw-repeat"));
		Dimension dim = dimension.getRect().getDimension();
		System.out.println("Dimension of Confirm password is " + dim);
	}
	
//	getText
	@Test
	public void gettext() throws InterruptedException{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    String xpathforVersion = "//nobr[contains(text(),'actiTIME')]"; 
	    String version = driver.findElement(By.xpath(xpathforVersion)).getText(); 
	    System.out.println("Version of actitime on login page is : " + version); 
	 }
}
