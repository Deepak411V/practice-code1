package project2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://localhost/demo/new%20links.html");
		
		WebElement window = driver.findElement(By.xpath("/html/body/li[1]/a"));
		window.getText();
		
		String Currentwindow = driver.getWindowHandle();
		System.out.println("Currentwindow="+Currentwindow);
		 
		 driver.findElement(By.linkText("Google")).click();
		 
		 try {
				Thread.sleep(5000);
			}catch(InterruptedException ex) {}
		 
		 Set<String> s = driver.getWindowHandles();
		 
		 System.out.println("Title="+driver.getTitle());
		 System.out.println("Total tabs="+s.size());
		 
		 Iterator<String> itr = s.iterator();
		 while(itr.hasNext()) {
			 String x = itr.next();
			 if(!x.equals(Currentwindow)) {
				 driver.switchTo().window(x);
				 System.out.println("Title="+driver.getTitle());
			 }
		 }
		 
		 driver.switchTo().window(Currentwindow);
		 System.out.println("Title="+driver.getTitle());
		
	}
}
