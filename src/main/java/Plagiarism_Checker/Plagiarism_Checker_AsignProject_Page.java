package Plagiarism_Checker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Plagiarism_Checker_AsignProject_Page {
	WebDriver driver;

	public Plagiarism_Checker_AsignProject_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//span[normalize-space()='Plagiarism']")
	WebElement Plagiarism;
	@FindBy(xpath ="//*[@id=\"reportstable\"]/tbody/tr[1]/td[8]/div[1]/a/span")
	WebElement dotclick;
	@FindBy(xpath ="//tbody/tr[2]/td[8]/div[2]/a[6]/span[2]")
	WebElement assignlink;
	@FindBy(xpath ="//select[@id='folderSelect']")
	WebElement selecteproject;
	@FindBy(xpath ="//button[@type='type']")
	WebElement btnssign;

	public void assign_project() throws Exception {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Plagiarism.click();
		  dotclick.click();
	Thread.sleep(2000);
	assignlink.click();
	 JavascriptExecutor js1 = (JavascriptExecutor)driver;
	  js1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
	
	}
}