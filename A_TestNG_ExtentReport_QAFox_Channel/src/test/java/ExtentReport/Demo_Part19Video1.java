package ExtentReport;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo_Part19Video1 {
public static void main(String[] args) throws IOException {
	ExtentReports extent=new ExtentReports();
	File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\eReport.html");
ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
extent.attachReporter(sparkReporter);
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://tutorialsninja.com/demo/");
String Base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
String destinationFilePath=System.getProperty("user.dir")+"\\Screenshots\\Tutorialninja1.png";
File destinationScreenshotFile=new File(destinationFilePath);
FileOutputStream fos=new FileOutputStream(destinationScreenshotFile);
fos.write(Base64.decode(Base64Screenshot));
ExtentTest eTest1=extent.createTest("TestOne","This text is describing TestOne1");
eTest1.log(Status.INFO,"TestOne Started");
eTest1.log(Status.INFO,"TestOne Progress");
eTest1.addScreenCaptureFromPath(destinationFilePath,"Tutorial ninja home page");
eTest1.log(Status.INFO,"TestOne Started");
eTest1.log(Status.INFO,"TestOne Started");
extent.flush();
Desktop.getDesktop().browse(file.toURI());
}
}
