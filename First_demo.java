package viswa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        
            
   WebDriver driver=new ChromeDriver();  
     driver.manage().window().maximize();  
     driver.get("https://www.leafground.com/dashboard.xhtml");
	     

	}

}
