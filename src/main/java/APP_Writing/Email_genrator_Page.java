package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Email_genrator_Page {
WebDriver driver;
public Email_genrator_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//span[@class='hide-menu'][normalize-space()='Writing']")
WebElement Writing;
@FindBy(xpath="//h1[normalize-space()='Writing Assistant']")
WebElement Writing_Assistant;
@FindBy(xpath="//a[26]")
WebElement email_link;
@FindBy(xpath="//select[@id='email_type']")
WebElement email_type;
@FindBy(xpath="//input[@id='company_name']")
WebElement company_name;
@FindBy(xpath="//textarea[@id='input_textarea']")
WebElement input_textarea;
@FindBy(xpath="//a[@id='settingstab-tab']//span[@class='tab-text']")
WebElement tab_text;
@FindBy(xpath="//a[@id='settingstab-tab']//span[@class='tab-text']")
WebElement click_audioance_tab;
@FindBy(xpath="//select[@id='quality']")
WebElement quality;
@FindBy(xpath="//select[@id='tone']")
WebElement tone;
@FindBy(xpath="//select[@id='target_audience']")
WebElement target_audience;
@FindBy(xpath="//a[@id='instruction-tab']")
WebElement instruction_tab;
@FindBy(xpath="//button[@id='generateButton']")
WebElement generateButton;
@FindBy(xpath="//textarea[@class='writing-result-output font-18 auto-resize mb-2']")
WebElement gettext;
public void Email_genrator_function() {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Writing.click();
	String tex=Writing_Assistant.getText();
	System.out.println(tex);
	email_link.click();
}
	public void email_chose() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	Select sel = new Select(email_type);
	sel.selectByVisibleText("Refund Email");
}
	
public void continue_Email() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	company_name.sendKeys("Bizspice india pvt");
	input_textarea.sendKeys("i want to refund my iphone 15 pro max");
	tab_text.click();
	Select sel1 = new Select(quality);
	sel1.selectByVisibleText("Premium");
	Select sel2= new Select(tone);
	sel2.selectByVisibleText("Sarcastic");
	Select sel3= new Select(target_audience);
	sel3.selectByVisibleText("Youtubers");instruction_tab.click();
	Thread.sleep(3000);
	generateButton.click();
	String tex1=gettext.getText();
	System.out.println(tex1);
}
}
