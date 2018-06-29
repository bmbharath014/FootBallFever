package google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class search {
	
	
	@Test
	public void search() {
		// TODO Auto-generated constructor stub
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe")	;
	WebDriver wd= new ChromeDriver();
	wd.get("https://www.google.com");
	wd.findElement(By.id("lst-ib")).sendKeys("Nextgen healthcare"+Keys.ENTER);
	
	
		
	}

}
