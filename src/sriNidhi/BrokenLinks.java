package sriNidhi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Siddharth/Desktop/BrokenLink.html");
		
		WebElement link=driver.findElement(By.xpath("//a[text()='RESTFULL services testing']"));
		String link1=link.getAttribute("href");
		URL u=new URL(link1);
		URLConnection ulink=u.openConnection();
		HttpURLConnection connection=(HttpURLConnection)ulink;
		
		int Rcode=connection.getResponseCode();
		if(Rcode==200)
		{
			System.out.println(Rcode);
			System.out.println(connection.getResponseMessage());
			System.out.println("link is not broken");
		}
		else
		{
			System.out.println(Rcode);
			System.out.println(connection.getResponseMessage());
			System.out.println("link is broken");
		}
		
		
	

	}

}
