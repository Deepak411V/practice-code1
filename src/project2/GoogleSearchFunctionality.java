package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchFunctionality {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_JAVA\\chromedriver.exe");
		 
		 WebDriver driver = new  ChromeDriver();
		 
		 driver.get("https://www.google.com");
//Model 1 for writing Webelement obeject every time 	 
		// WebElement query =driver.findElement(By.id("APjFqb"));
		 //query.sendKeys("hcl technologies");
		 
		// try {Thread.sleep(2000); }
		// catch(InterruptedException e) {}                                JAVA INSTALL 21V //selenium webdriver 4.23.1//chrome webdriver
		 
		// WebElement searchButton = driver.findElement(By.name("btnK"));
	    // searchButton.click();
		 
//model 2 for writing webelement object 1 time only ..for action methods		
	     
	  /* WebElement query= driver.findElement(By.id("APjFqb"));
	     query.sendKeys("hcl technologies");
	     
//instead use of Thread.sleep();------use Try ,Catch	
 * 
	   try {Thread.sleep(2000); }
			 catch(InterruptedException e) {}
	     query.submit(); */
	     
//model 3 fro writing in single line on action methods
	     
	     driver.findElement(By.id("APjFqb")).sendKeys("hcl technologies");
	     driver.findElement(By.id("APjFqb")).submit();
	     
	     
		/* String Title =driver.getTitle();
		 
		 System.out.println("Title="+Title);
		 
		 String expectedTitle="hcl technologies";
		 String actualTitle=driver.getTitle();
		 
		 Assert.assertEquals(expectedTitle, actualTitle);
		 
		 System.out.println("Test passed");*/
		  
		// driver.quit();
		 
	}

}
