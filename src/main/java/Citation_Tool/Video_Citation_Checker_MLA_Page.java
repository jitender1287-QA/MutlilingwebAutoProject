package Citation_Tool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Video_Citation_Checker_MLA_Page {
WebDriver driver;
public  Video_Citation_Checker_MLA_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='Citation']")
WebElement Citation;
@FindBy(xpath="//span[normalize-space()='Video']")
WebElement Video;
@FindBy(xpath="//input[@id='video-search']")
WebElement video_search;
@FindBy(xpath="//select[@id='video-search-type']")
WebElement video_type;
@FindBy(xpath="//div[@id='video']//button[@type='submit']")
WebElement submit;


public void Video_MLA_Page() {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Citation.click();
	Video.click();
	video_search.sendKeys("https://www.bizspice.com/");
	Select sel= new Select(video_type);
	sel.selectByVisibleText("MLA");
	submit.click();
	
}

}

