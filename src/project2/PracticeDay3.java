package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDay3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_JAVA\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//get browser
		driver.get("https://www.google.com");
		//get title
		String title = driver.getTitle();
		System.out.println("Title="+title);
		//Thread.sleep(1000);
		//Expected title and actual title
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("Testcase failed");
		}
		
//Assert
		//Assert.assertEquals(expectedTitle,actualTitle);
		
		
		
	}

}
