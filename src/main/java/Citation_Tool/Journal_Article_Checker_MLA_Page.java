package Citation_Tool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Journal_Article_Checker_MLA_Page {
WebDriver driver;
public  Journal_Article_Checker_MLA_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='Citation']")
WebElement Citation;
@FindBy(xpath="//span[normalize-space()='Journal article']")
WebElement Journal_article;
@FindBy(xpath="//input[@id='autocite-search-journal']")
WebElement search_journal;
@FindBy(xpath="//select[@id='autocite-search-journal-type']")
WebElement journal_type;
@FindBy(xpath="//div[@id='journal-article']//button[@type='submit']")
WebElement submit;


public void jouranal_checking_MLA() {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Citation.click();
	Journal_article.click();
	search_journal.sendKeys("https://doi.org/10.1111/dome.12082");
	Select sel= new Select(journal_type);
	sel.selectByVisibleText("MLA");
	submit.click();
}


}
