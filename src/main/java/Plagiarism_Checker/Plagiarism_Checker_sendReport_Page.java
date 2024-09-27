package Plagiarism_Checker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plagiarism_Checker_sendReport_Page {
	WebDriver driver;
	public Plagiarism_Checker_sendReport_Page(WebDriver driver) {	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Plagiarism']")
	WebElement Plagiarism;
	@FindBy(xpath="//*[@id=\"reportstable\"]/tbody/tr[1]/td[8]/div[1]/a/span")
	WebElement dotclick;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/div[2]/a[2]/span[2]")
	WebElement view_report;
	
	public void checking_send_report() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Plagiarism.click();
		dotclick.click();
		Thread.sleep(2000);
		view_report.click();
		
	}
}
