package project2;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAccess {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("https://www.flipkart.com");
//create webelement		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("sony camera");
		search.submit();
		
		//WebElement text = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
		WebElement text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]"));
		//text.click();
		text.getText();
		
		//driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).getText();
		
		System.out.println(text);
		
		String actualtext ="SONY Alpha ILCE-6400L APS-C Mirrorless Camera with 16-50 mm Power Zoom Lens Featuring Eye AF and 4K mo...";
		String expectedtext = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).getText();
		
		if (actualtext.equals(expectedtext))   
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		WebElement price = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]"));
		price.getText();
		System.out.println("Price="+price);
		
		//driver.close();
		
		String title =driver.getTitle();
		System.out.println("Title="+title);
		
		String expectedTitle ="Sony Camera- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		WebElement childwindow = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
	    childwindow.click();
	    
	    
		WebElement fashion =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/span"));
		fashion.click();
//		/html/body/div[4]/div[2]/object/a[4]
		 driver.findElement(By.xpath("/html/body/div[4]/div[2]/object/a[4]")).click();
			
		 driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[2]")).click();
		 
		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img")).click();
			
		
		//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span[2]
	}

}
