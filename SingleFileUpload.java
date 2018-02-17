package chromepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFileUpload {
	public static WebDriver webdriver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		webdriver = new ChromeDriver();
		
        String url = "http://toolsqa.com/automation-practice-form/";
		
		webdriver.get(url);
		
		webdriver.findElement(By.name("photo")).sendKeys("C://Users/Public/Pictures/Sample Pictures/Chrysanthemum.jpg");;
		
	}

}
