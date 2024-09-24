package project2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAllNamesByDynamicTable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")).submit();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
		
		//List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		
	    //for (WebElement ob : rows) {
	    //System.out.println(ob.getText());
	    //	}
		//int rowCount = rows.size();
			
		//for(int i=1;i<=rowCount	;i++) {
			
			//String course = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			//System.out.println("Course="+course);		
		//}
		
//Count the number of rows and columns of a dynamic table	
        
        List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        
        System.out.println("Colounms::"+cols.size());
        System.out.println("Rows::"+rows.size());
        
        
  
	}

}
