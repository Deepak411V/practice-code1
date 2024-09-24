package project2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_JAVA\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
//open a browser		 
		 driver.get("https://www.google.com");
		 
//web page maximize		 
	driver.manage().window().maximize();
	
	//Thread.sleep(2000);
	
//get title
		 String title = driver.getTitle();
		 System.out.println("Title="+title);
		 
//get url		 
		 String url = driver.getCurrentUrl();
		 System.out.println("URL="+url);
		 
//delete all cookies
		 driver.manage().deleteAllCookies();
		 
//to set size of the window	
		 org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(500, 564);
		driver.manage().window().setSize(d);
		//Thread.sleep(2000);
		
//complete navigation commands
//to enter URL
		driver.navigate().to("https://www.facebook.com");
		//Thread.sleep(2000);
		
//to navigate to previous page
		driver.navigate().back();
		//Thread.sleep(1000);
		
//to navigate to next page
		driver.navigate().forward();
		//Thread.sleep(1000);
		
//refresh current webpage
		driver.navigate().refresh();
		//Thread.sleep(1500);
		

//to set the position of window
		 org.openqa.selenium.Point p=new org.openqa.selenium.Point(500, 500);
		// Assuming 'driver' is an instance of WebDriver
		 driver.manage().window().setPosition(p);
		 //Thread.sleep(3000);
		 
		
		         int[][] positions = {
		                 {100, 250},
		                 {250, 500},
		                 {250, 150},
		                 {350, 450},
		                 {120, 650},
		                 {200, 200}
		         };

		         for (int i = 0; i < 5; i++) {
		             for (int[] position : positions) {
		                 Point p1 = new Point(position[0], position[1]);
		                 driver.manage().window().setPosition(p1);
		                 System.out.println("Window position set to: " + p1);
		                 //Thread.sleep(1000);
		                // try {
		                     //Thread.sleep(1000); // wait for 1 second
		                // } catch (InterruptedException ex) {}
		                  //   Exception exception = new Exception();
							//exception.printStackTrace();
		                     
		                     driver.close();
		                 }
		             }
		         }
	}

