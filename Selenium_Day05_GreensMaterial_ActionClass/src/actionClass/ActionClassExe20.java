package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExe20 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\Selenium_Day05_GreensMaterial_ActionClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions a =new Actions(driver);
		WebElement elect = driver.findElement(By.xpath("//div[text()='Electronics']"));
		a.moveToElement(elect).perform();
		WebElement electronics = driver.findElement(By.xpath("//a[text()='Electronics GST Store']"));
		electronics.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[4]/div/div[2]/div[6]/a")).click();
		WebElement tv = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[2]"));
	a.moveToElement(tv).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[1]/a[4]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
}
}
