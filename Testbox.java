package viswa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        
        
		   WebDriver driver=new ChromeDriver();  
		     driver.manage().window().maximize();  
		     driver.get("https://www.leafground.com/dashboard.xhtml");
		     driver.get("https://www.leafground.com/input.xhtml");

		     WebElement name=driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		     name.sendKeys("Viswanath pradap");
		     
		     WebElement append=driver.findElement(By.id("j_idt88:j_idt91"));
		     append.sendKeys(", India");
	}

}
