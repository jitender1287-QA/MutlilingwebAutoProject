package Plagiarism_Checker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plagiarism_Checker_BeforGrammer_checking_Page {
	WebDriver driver;
	public Plagiarism_Checker_BeforGrammer_checking_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[normalize-space()='Plagiarism']")
	WebElement Plagiarism;
	@FindBy(id="input_content_ifr")
	WebElement frame_ID;
	
	@FindBy(xpath="//*[@id=\"tinymce\"]")
	WebElement text_enter;
	@FindBy(xpath="//button[@id='plagiarismButton']")
	WebElement plagiarismButton;
	@FindBy(xpath="//button[@id='checkButton']")
	WebElement checkButton;
	@FindBy(xpath="//*[@id=\"correctit2\"]/div/div[1]/div/div/div/div[2]/span[2]")
	WebElement delete;
	@FindBy(xpath="//*[@id=\"correctit2\"]/div/div/div/div/p/b")
	WebElement delete_MIS;
	@FindBy(id="dataIndexId1")
	WebElement idclickmiskae;
	public void PLag_GrammerChecker() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Plagiarism.click();
		
		driver.switchTo().frame(frame_ID);
		text_enter.sendKeys("Indian Americans have been making significant contributions to the US economy for decades. Many Indian-origin executives have reached the pinnacle of success in American corporations"
				+ " and hold some of the highest-paid positions in the country.Sundar Pichai is the CEO of Google and Alphabet Inc. Born in Tamil Nadu, India, Pichai grew up in a middle-class family and earned a Bachelor’s degree in Metallurgical Engineering from the Indian Institute of Technology in Kharagpur. He went on to earn a Master’s degree in Material Sciences and Engineering from Stanford University and "
				+ "an MBA from the Wharton School of the University of Pennsylvania.");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		checkButton.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		delete_MIS.click();
		Thread.sleep(3000);
		idclickmiskae.click();
}
}