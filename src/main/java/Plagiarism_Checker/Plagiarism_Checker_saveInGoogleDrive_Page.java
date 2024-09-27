package Plagiarism_Checker;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plagiarism_Checker_saveInGoogleDrive_Page {
WebDriver driver;
public Plagiarism_Checker_saveInGoogleDrive_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//span[normalize-space()='Plagiarism']")
WebElement Plagiarism;
@FindBy(xpath="//*[@id=\"reportstable\"]/tbody/tr[1]/td[8]/div[1]/a/span")
WebElement dotclick;
@FindBy(xpath="//*[@id=\"reportstable\"]/tbody/tr[1]/td[8]/div[2]/a[4]/span[2]")
WebElement download_google;
@FindBy(xpath="//input[@id='identifierId']")
WebElement id_filed;
@FindBy(xpath="//*[@id=\"passwordNext\"]")
WebElement nextbtn;
@FindBy(xpath="//input[@name='Passwd']")
WebElement pass;
@FindBy(xpath="//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']//div[@class='VfPpkd-RLmnJb']")
WebElement btn;

public void checking_google_drive() throws Exception {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Plagiarism.click();
	dotclick.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	download_google.click();
	Thread.sleep(2000);
	id_filed.sendKeys("Magetest2015@gmail.com");
	nextbtn.click();
	pass.sendKeys("Test@159357");
	btn.click();
}
}
