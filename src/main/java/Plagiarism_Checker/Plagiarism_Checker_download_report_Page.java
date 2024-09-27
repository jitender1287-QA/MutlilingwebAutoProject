package Plagiarism_Checker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plagiarism_Checker_download_report_Page {
WebDriver driver;
public Plagiarism_Checker_download_report_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//span[normalize-space()='Plagiarism']")
WebElement Plagiarism;
@FindBy(xpath="//*[@id=\"reportstable\"]/tbody/tr[1]/td[8]/div[1]/a/span")
WebElement dotclick;
@FindBy(xpath="//*[@id=\"reportstable\"]/tbody/tr[1]/td[8]/div[2]/a[3]/span[2]")
WebElement download_report;

public void checking_download_report() {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Plagiarism.click();
	dotclick.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	download_report.click();
}
}
