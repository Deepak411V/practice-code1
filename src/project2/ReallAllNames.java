package project2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReallAllNames {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")).submit();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		
		for (WebElement ob:names) {
			System.out.println(ob.getText());
		}
		
//Model 2 using for loop & concatination(+i+)
		
	/*	String name = driver.findElement(By.xpath("//table/tbody/tr[+i+]/td[2]")).getText();
		for(int i=0;i<2;i++){
			System.out.println("Nmaes="+name);
			
		}
		*/
	}

}
