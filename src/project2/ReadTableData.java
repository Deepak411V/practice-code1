package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTableData {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		//driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]/span")).click();
		//driver.findElement(By.id("Email")).sendKeys("Email");
		//driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")).submit();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
		
			
			String s = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
					
			System.out.println(s);
	
			//*[@id="customers-grid"]/tbody/tr[3]/td[2]
		
		//driver.findElement(By.xpath("//table/tbody/tr/td[2]"));
		
		//table/tbody/tr/td[2]
		
	}

}
