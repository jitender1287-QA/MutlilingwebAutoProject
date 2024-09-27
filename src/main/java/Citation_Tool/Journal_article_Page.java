package Citation_Tool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Journal_article_Page {
WebDriver driver;
public Journal_article_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='Citation']")
WebElement Citation;
@FindBy(xpath="//span[normalize-space()='Journal article']")
WebElement Journal_article;
@FindBy(xpath="//input[@id='autocite-search-journal']")
WebElement search_journal;
@FindBy(xpath="//div[@id='journal-article']//button[@type='submit']")
WebElement submit;


public void jouranal_checking() {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Citation.click();
	Journal_article.click();
	search_journal.sendKeys("One Up on Wall Street");
	submit.click();
}
}
