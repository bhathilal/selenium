package chromepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormElements {
	
	public static WebDriver webdriver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		webdriver = new ChromeDriver();
		
		String url = "http://toolsqa.com/automation-practice-form/";
		
		webdriver.get(url);
		
		webdriver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("first name");
		
		
		webdriver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("last name");
		
		List<WebElement> gender =  webdriver.findElements(By.name("sex"));
		
		
		int gSize = gender.size();
		
		for(int i = 0 ; i < gSize; i++){
			if(gender.get(i).getAttribute("value").equalsIgnoreCase("female")){
				gender.get(i).click();
			}
		}
		
        List<WebElement> exp =  webdriver.findElements(By.name("exp"));
		
		
		int expSize = exp.size();
		
		for(int i = 0 ; i < expSize; i++){
			if(exp.get(i).getAttribute("value").equals("5")){
				exp.get(i).click();
			}
		}
		
	   //webdriver.findElement(By.name("photo")).sendKeys("C://Users/Public/Pictures/Sample Pictures/Chrysanthemum.jpg");

	}

}
