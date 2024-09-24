package project2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class AlertBox {
	
	//public static void main(String[] arg) {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost/demo/alert.html");
//		
//		WebElement button = driver.findElement(By.id("btn1"));
//		button.click();
//		
		public class AlertBox {
		    public static void main(String[] args) {
		        // Set up the Chrome driver
		       
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the webpage
		        driver.get("https://example.com");

		        // Click the button to trigger the alert
		        driver.findElement(By.xpath("//button[@id='alert-button']")).click();

		        // Switch to the alert
		        Alert alert = driver.switchTo().alert();

		        // Get the alert text
		        String alertText = alert.getText();
		        System.out.println("Alert Text: " + alertText);

		        // Accept the alert
		        alert.accept();

		        // Close the browser
		        driver.quit();
		
		
		
	}

}
