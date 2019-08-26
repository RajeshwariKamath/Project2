package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("rajiramesh30@gmail.com");
		Thread.sleep(1000);
	    WebElement pw = driver.findElement(By.id("pass"));
	    pw.sendKeys("rameshmylove");
	    Thread.sleep(1000);
	    WebElement ln = driver.findElement(By.cssSelector("input[value='Log In']"));
	    ln.click();
	    Thread.sleep(1000);
	    WebElement lo = driver.findElement(By.className("_w0d _w0d"));
	    lo.click(); 
	   
	   
	    
		

	}

}
