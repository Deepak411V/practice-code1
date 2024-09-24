package project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenSetsize {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_JAVA\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1000, 768));
		driver.get("https://www.google.com");
		//driver.manage().window().setSize(new Dimension(500, 768));
		//driver.manage().window().fullscreen();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().fullscreen();
		//driver.navigate().back();
		
	
		
		
		
		
		
		
		
	}

}
