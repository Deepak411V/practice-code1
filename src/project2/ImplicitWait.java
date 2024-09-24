package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_JAVA\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
//use Implicity time ..instead of thread sleep
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("hcl technologies");
		driver.findElement(By.name("btnK")).submit();
		
		
		
		
	}
}
