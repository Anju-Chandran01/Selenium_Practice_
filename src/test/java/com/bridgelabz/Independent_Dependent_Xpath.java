package com.bridgelabz;

public class Independent_Dependent_Xpath{ 
    public static void main(String[] args) throws InterruptedException { 
System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe"); 
 WebDriver driver = new FirefoxDriver(); 
// enter the url 
    driver.get("http://www.seleniumhq.org/download/"); 
 Thread.sleep(3000); 
// xpath using independent and dependent concept 
    driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click(); 


 } 

}
