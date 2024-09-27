package BaseTest_Multilings;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver driver = null;
	
	@BeforeTest
	
	public void Steupbrowser() {
		
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		
		
	}
	@AfterTest
	
	public void teardown() {
		//driver.close();
	}
	
	
	@AfterMethod
	public void fail(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			Date currentdata = new Date();
			String screenshotfilename =currentdata.toString().replace(" ", " -").replace(":"," -");
			
			File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenshotFile, new File(".//Screenshot//"+screenshotfilename+".png"));
			
}


	}}


