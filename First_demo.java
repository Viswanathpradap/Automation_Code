package viswa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        
            
   WebDriver driver=new ChromeDriver();  
     driver.manage().window().maximize();  
     driver.get("https://www.freejobalert.com/");
     
     driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]")).sendKeys("state bank"+Keys.ENTER);
     
     driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/a")).click();
     
    //driver.close();
   
     
	     

	}

}
