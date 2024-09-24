package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTask1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebDriverWait wait;
		//wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div[1]/div/a/span"));
		login.click();
		//wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement kids =  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[5]"));
		kids.click();
		//wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement toys = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[5]"));
		//toys.click();
	
		Actions action = new Actions(driver);
		action.pause(Duration.ofSeconds(5))
		.click(toys)
		.pause(Duration.ofSeconds(5))
		.build()
		.perform();

		WebElement SoftToys = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/a[4]"));
		SoftToys.click();
		WebElement text=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div"));
		text.getText();
		System.out.println("Text="+text);

		
		
		
		
		
	}

}
