package org.test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\SeleniumDay01\\\\\\\\driver\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot screenshot =(TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File f =new File("E:\\Greenshot\\fb.jpeg");
		FileUtils.copyFile(screenshotAs, f);
		
	}

}
