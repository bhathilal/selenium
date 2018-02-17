package chromepackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static WebDriver webdriver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		webdriver = new ChromeDriver();
		
        String url = "http://toolsqa.com/automation-practice-form/";
		
		webdriver.get(url);
		
		//get checkboxes list
		
		List<WebElement> profession = webdriver.findElements(By.name("profession"));
		
		int professionCount = profession.size();
		
		for(int i = 0 ; i < professionCount ; i++){
			profession.get(i).click();
		}
		
        List<WebElement> automation_tools  = webdriver.findElements(By.name("tool"));
		
		int toolCount = automation_tools.size();
		
		for(int i = 0 ; i < toolCount ; i++){
			
			if(automation_tools.get(i).getAttribute("value").equalsIgnoreCase("Selenium Webdriver")){
				automation_tools.get(i).click();
				
			}
		
		}

	}

}
