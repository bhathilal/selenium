package chromepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBox {
	public static WebDriver webdriver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		webdriver = new ChromeDriver();
		
        String url = "http://toolsqa.com/automation-practice-form/";
		
		webdriver.get(url);
		
		List<WebElement> radioboxs = webdriver.findElements(By.name("sex"));
		
		int radioBoxlength = radioboxs.size();
		
		for(int i = 0 ; i < radioBoxlength ;i++){
			if(radioboxs.get(i).getAttribute("value").equalsIgnoreCase("male")){
				radioboxs.get(i).click();
			}
		}
		
		

	}

}
