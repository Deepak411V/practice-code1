package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

public static void main(String[]args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		WebElement login = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a/span"));
		//login.click();
		Actions action = new Actions(driver);
		action.pause(Duration.ofSeconds(5))
		.click(login)
		.pause(Duration.ofSeconds(5))
		.build()
		.perform();
		
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[3]"));
		Actions action2 = new Actions(driver);
		action2.pause(Duration.ofSeconds(3))
		.click(wb)
		.pause(Duration.ofSeconds(5))
		.build()
		.perform();
		WebElement mens = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div/div[3]/a[2]"));
		
		Actions action3 = new Actions(driver);
		action2.pause(Duration.ofSeconds(3))
		.click(mens)
		.build()
		.perform();
		
	}

}
