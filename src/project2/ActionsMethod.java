package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethod{
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement divA = driver.findElement(By.id("column-a"));
		WebElement divB = driver.findElement(By.id("column-b"));
		
	    Actions action=	new Actions(driver);
		action.pause(Duration.ofSeconds(5))
		.dragAndDrop(divA, divB)
		.pause(Duration.ofSeconds(5))
		.build()
		.perform();
		
		
		
	}

}





