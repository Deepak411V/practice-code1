package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUsingSelector{
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//link 1		
		driver.get("https://the-internet.herokuapp.com/dropdown");

		Select options = new Select(driver.findElement(By.id("dropdown")));
		options.selectByIndex(1);
		
		WebElement selectedOption1 = options.getFirstSelectedOption();
		System.out.println("Selection=" + selectedOption1.getText());
		
		driver.navigate().back();
		driver.navigate().refresh();
//link 2
		
		driver.get("http://localhost/demo/file.html");
		
		Select course = new Select(driver.findElement(By.id("dropdown")));
	    course.selectByVisibleText("CUCUMBER");
		
		WebElement selectedOption = course.getFirstSelectedOption();
		System.out.println("Selection="+selectedOption.getText());
		
		
		//driver.findElement(By.id("radio2")).click();
		
	}
}