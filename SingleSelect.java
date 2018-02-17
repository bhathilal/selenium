package chromepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static WebDriver webdriver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		webdriver = new ChromeDriver();
		
        String url = "http://toolsqa.com/automation-practice-form/";
		
		webdriver.get(url);
		
		Select continents = new Select(webdriver.findElement(By.name("continents")));
		
		continents.selectByVisibleText("North America");
		
		
		
	}

}
