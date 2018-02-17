/*
 * Selenium Chrome Webdriver
 * This code opens an instance of chrome and navigates to google.com and  searches term selenium tutorials (for example)
 */
package chromepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleQuery extends Exception{
	
	public static WebDriver webdriver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		webdriver = new ChromeDriver();
		
		webdriver.get("http://www.google.com");
		
		WebElement element = webdriver.findElement(By.name("q"));
		
		//Simulates typing
		element.sendKeys("selenium tutorials");
		
		element.submit();
		
		//Wait for 4 seconds and close browser automatically
		Thread.sleep(4000);
		
		webdriver.close();		

	}

}
