package project2;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFunctionalityWithAssertions {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_JAVA\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.google.com");
	//1	 KEYWORD
		 String keyword = "capgemini";
		 
		 driver.findElement(By.id("APjFqb")).sendKeys(keyword);   
		 driver.findElement(By.name("btnK")).click();
	//2	 HEADING
		 String expectedheading =  "Capgemini";
		 String actualheading = driver.findElement(By.xpath("//div[@class='PZPZlf ssJ7i B5dxMb']"))
				 .getText();
		
		 Assert.assertEquals(expectedheading, actualheading);
	//3	 KEYWORD
		 String actualkeyword= driver.findElement(By.id("APjFqb")).getAttribute("value");
		 Assert.assertEquals(keyword, actualkeyword);
	//4	 TITLE
		 String actualTitle = driver.getTitle();
	     //so,complicated lined for spaces
		 Assert.assertEquals(keyword+" - Google Search", actualTitle);
		
		 System.out.println("Test passed");
		 System.out.println("keyword="+keyword);
		 
		 if (keyword=="capgemini"){
			 System.out.println("Code passed");
		 }
		 else {
			 System.out.println("Code failed");
		 }
		 driver.quit();             
		
	}

}
