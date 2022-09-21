package practiceExternal;        // For Practice Only

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\projects\\automation_testing\\March4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int size = link.size();
		System.out.println("Link Count" +size);
		int count=0;
		for (int i = 0; i < link.size(); i++) {
			String attribute = link.get(i).getAttribute("href");
			if(!(attribute == null)) {
				URL url =new URL(attribute);
				URLConnection OpenConnection = url.openConnection();
				HttpsURLConnection connection =(HttpsURLConnection)OpenConnection;
				int responseCode = connection.getResponseCode();
				if(!(responseCode == 200)) {
					count++;
					System.out.println(attribute);
				}
			}
		}
		System.out.println("Broken link" + "   " +count);
		
	}

}
