package Citation_Tool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Online_News_Aritcle_MLA_Page {
WebDriver driver;
public Online_News_Aritcle_MLA_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='Citation']")
WebElement Citation;
@FindBy(xpath="//span[normalize-space()='Online News Article']")
WebElement Online_News_Article;
@FindBy(xpath="//input[@id='article-search']")
WebElement article_search;
@FindBy(xpath="//select[@id='article-search-type']")
WebElement search_type;
@FindBy(xpath="//div[@id='online-news-article']//button[@type='submit']")
WebElement submit;
  
public void  News_Aritcle_MLA() {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Citation.click();
	Online_News_Article.click();
	article_search.sendKeys("https://www.bizspice.com");
	Select new1 = new Select(search_type);
	new1.selectByVisibleText("MLA");
	submit.click();
}
}
