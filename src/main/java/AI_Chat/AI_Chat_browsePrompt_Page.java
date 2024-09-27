package AI_Chat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AI_Chat_browsePrompt_Page {
WebDriver driver;
public AI_Chat_browsePrompt_Page (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='AI Chat']")
WebElement AI_Chat;
@FindBy(xpath="//input[@id='title']")
WebElement tittle;
@FindBy(xpath="//button[@id='browsePrompt']")
WebElement browsePrompt;
@FindBy(xpath="//div[normalize-space()='Article Generator']")
WebElement Article_Generator;
@FindBy(xpath="//button[@id='use-prompt-btn']")
WebElement prompt_btn;
@FindBy(xpath="//span[normalize-space()='send']")
WebElement sendbtn;

@FindBy(xpath="//button[@id='generateButton']")
WebElement generateButton;


public void USE_Prompt() {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	AI_Chat.click();
	tittle.sendKeys("create a AI Content");
	browsePrompt.click();
	Article_Generator.click();
	/*
	 * JavascriptExecutor js =(JavascriptExecutor)driver;
	 * js.executeScript("window.scrollBy(0,250)", "sendbtn");
	 */
	Actions action = new Actions(driver);
	action.moveToElement(sendbtn).click().build().perform();
	//sendbtn.click();
	prompt_btn.click();
	generateButton.click();
	
	
	
}
}
