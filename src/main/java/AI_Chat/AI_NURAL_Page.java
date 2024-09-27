package AI_Chat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AI_NURAL_Page {
WebDriver driver;
public  AI_NURAL_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='AI Chat']")
WebElement AI_Chat;
@FindBy(xpath="//input[@id='title']")
WebElement tittle;
@FindBy(xpath="//div[@id='input_textarea']")
WebElement input_text;
@FindBy(xpath="//span[normalize-space()='send']")
WebElement sendbtn;
@FindBy(className="result-text p-2")
WebElement text;
public void AI_check_nural() {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	AI_Chat.click();
	tittle.sendKeys("create a demoss");
	input_text.sendKeys("write a code for datepicter in webdriver");
	sendbtn.click();
	String tx=text.getText();
	System.out.println(tx);
	
}

}
