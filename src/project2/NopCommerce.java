package project2;

import java.time.Duration;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NopCommerce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_JAVA\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.get("https://www.google.com");
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		String title = driver.getTitle();
		System.out.println("Main Title="+title);
		
		String expectedTitle ="nopCommerce demo store. Register";
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		String expectedheading = "Register";
		String actualheading = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		
		Assert.assertEquals(expectedheading, actualheading);
		
		driver.findElement(By.id("gender-male")).click();
		//driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Christopher");
		
		driver.findElement(By.id("LastName")).sendKeys("Nolan");
		
		Select Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
		Day.selectByIndex(12);
		Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		                      //Month.selectByValue("December");
		Month.selectByVisibleText("December");
		Select Year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		                      //Year.selectByVisibleText("1992");
		Year.selectByValue("1992");
		
		//driver.findElement(By.name("DateOfBirthDay")).sendKeys("10");
		//driver.findElement(By.name("DateOfBirthMonth")).sendKeys("oct");
		//driver.findElement(By.name("DateOfBirthYear")).sendKeys("1992");   
		
		
	/*	//driver.findElement(By.id("Email")).sendKeys("123nolan@gmail.com");  */
		
		String email = generateEmail();
		System.out.println("Email="+email);
		driver.findElement(By.id("Email")).sendKeys(email);
		
		
		String expectedheading1 = "Company Details";
		String actualheading1=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[2]/div[1]/strong")).getText();
		
		Assert.assertEquals(expectedheading1, actualheading1);
		
		
		
		driver.findElement(By.id("Company")).sendKeys("Enrich Talents pvt ltd");
		//driver.findElement(By.id("Newsletter")).click();
		
		driver.findElement(By.id("Password")).sendKeys("Lo43@1");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Lo43@1");
		
		driver.findElement(By.id("register-button")).click();
		
		String expectedTitle1 = "Your registration completed";
		String actualTitle1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]")).getText();
	
		//Manually taken Xpath //div[@class="result"]
		Assert.assertEquals(expectedTitle1, actualTitle1);
		//driver.quit();
		
	
	}
//create a method before the Email syntax//\
	
	public static String generateEmail() {
		// TODO Auto-generated method stub
		Random r = new Random();
		String s = "";
		for(int i=1;i<8;i++) {
		int x =r.nextInt(97,122);
		s= s+((char)x);	
	}
	
	s = s+"@gmail.com";
	return s;	

		
	}

		

}
