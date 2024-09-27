package Citation_Tool;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Webpage_Citation_Checker_Page {
	WebDriver driver;
	public Webpage_Citation_Checker_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[normalize-space()='Citation']")
	WebElement Citation;
	@FindBy(xpath="//input[@id='autocite-search-webpage']")
	WebElement autocite_search_webpage;
	@FindBy(xpath="//select[@id='autocite-search-webpage-type']")
	WebElement webpage_type;
	@FindBy(xpath="//*[@id=\"webpage\"]/div/div[2]/div[4]/button")
	WebElement btn;

	public void checking_citition() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Citation.click();
		autocite_search_webpage.sendKeys("https://mvnrepository.com/");
		Select new1 = new Select(webpage_type);
		new1.selectByVisibleText("MLA");
		btn.click();
	}
}
