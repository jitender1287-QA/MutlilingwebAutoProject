package Plagiarism_Checker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plagiarism_Checker_ViewReport_Page {
WebDriver driver;
public Plagiarism_Checker_ViewReport_Page(WebDriver driver) {	
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//span[normalize-space()='Plagiarism']")
WebElement Plagiarism;
@FindBy(xpath="//*[@id=\"reportstable\"]/tbody/tr[1]/td[8]/div[1]/a/span")
WebElement dotclick;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[2]/a[1]/span[2]")
WebElement veiwreportclick;
 

public void checking_viewreport() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Plagiarism.click();
	dotclick.click();
	JavascriptExecutor js =(JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,250)", "");
	Thread.sleep(3000);
	veiwreportclick.click();
}
}