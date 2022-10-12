package screenshot_Day07;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShotExe7 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement top = driver.findElement(By.xpath("//*[@id=\"heading20\"]/h2"));
		top.click();
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File f = top.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenshotImages//7.png");
		FileUtils.copyFile(f, dest);
		System.out.println("============Done========");
		System.out.println(top.getText());
		//Thread.sleep(3000);
		
	}

}
