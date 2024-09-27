package AI_Chat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AI_Chat_Add_Custom_Prompt_Page {
WebDriver driver;
public AI_Chat_Add_Custom_Prompt_Page (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='AI Chat']")
WebElement AI_Chat;
@FindBy(xpath="//input[@id='title']")
WebElement tittle;
@FindBy(xpath="//button[@id='browsePrompt']")
WebElement browsePrompt;
@FindBy(xpath="//span[normalize-space()='Add Custom Prompt']")
WebElement Add_Custom_Prompt;
@FindBy(xpath="//div[@placeholder='Click here to add Parent prompt name']")
WebElement add_Prompt;
@FindBy(xpath="//span[normalize-space()='list_alt_add']")
WebElement list_alt_add;
@FindBy(xpath="//div[@placeholder='Click here to add prompt option']")
WebElement prompt_option;
@FindBy(xpath=" //button[@id='save-prompt-btn']")
WebElement saveprompt;


public void add_prompt_name() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	AI_Chat.click();
	browsePrompt.click();
	String tex=browsePrompt.getText();
	System.out.println(tex);
	Add_Custom_Prompt.click();
	Thread.sleep(2000);
	add_Prompt.sendKeys("SEO JC");
	list_alt_add.click();
	Thread.sleep(2000);
	prompt_option.sendKeys("Meta SEO Data");
	Actions action = new Actions(driver);
	action.moveToElement(saveprompt).click().build().perform();
}
}
