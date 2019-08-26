package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	 public static void main(String[] args)
	 {
		     WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			 WebElement r = driver.findElement(By.id("email"));
			
	 }
	

}
