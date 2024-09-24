package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionsJunit {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_JAVA\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String expectedTitle = "Google";
		String actualTitle=driver.getTitle();
		
		org.junit.Assert.assertEquals(expectedTitle, actualTitle);
		
		
		System.out.println("testcase passed");
		
		//driver.quit();
		
		
	}

}
