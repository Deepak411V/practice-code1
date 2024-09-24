package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDownload {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.get("https://the-internet.herokuapp.com/upload");
	    
	    driver.findElement(By.xpath("//*[@id=\'file-upload\']")).sendKeys();
		
	}
}




