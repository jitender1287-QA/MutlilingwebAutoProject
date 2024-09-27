package AI_Chat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AI_Chat_browsePrompt_Search_Page {
WebDriver driver;
public AI_Chat_browsePrompt_Search_Page (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='AI Chat']")
WebElement AI_Chat;
@FindBy(xpath="//input[@id='title']")
WebElement tittle;
@FindBy(xpath="//button[@id='browsePrompt']")
WebElement browsePrompt;
@FindBy(xpath="//input[@id='promptsearch']")
WebElement promptsearch;
@FindBy(xpath="//span[normalize-space()='SEO']")
WebElement SEO;
@FindBy(xpath="//div[normalize-space()='Meta Title']")
WebElement Meta_Title;
@FindBy(xpath="//button[@id='use-prompt-btn']")
WebElement prompt_btn;
@FindBy(xpath="//button[@id='generateButton']")
WebElement generateButton;
public void prompt_search() {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	AI_Chat.click();
	tittle.sendKeys("jc test");
	browsePrompt.click();
	promptsearch.sendKeys("SEO");
	SEO.click();
	Meta_Title.click();
	Actions action = new Actions(driver);
	action.moveToElement(prompt_btn).click().build().perform();
	generateButton.click();
	
}



	}


