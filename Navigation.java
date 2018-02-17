package chromepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navigation {

		// TODO Auto-generated method stub
		public static WebDriver webdriver;


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
	        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
			
			webdriver = new ChromeDriver();
			
			String url = "http://toolsqa.com/automation-practice-form/";
			
			webdriver.navigate().to(url);;
		
			
			webdriver.findElement(By.xpath("//*[@id='primary-menu']/li[1]/a")).click();
			
			Thread.sleep(5000);
			
			webdriver.navigate().back();
			
			
			
		}


}
