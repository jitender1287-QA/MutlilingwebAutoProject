package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Social_media_post_Page {
WebDriver driver;
public Social_media_post_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//span[@class='hide-menu'][normalize-space()='Writing']")
WebElement Writing;
@FindBy(xpath="//h1[normalize-space()='Writing Assistant']")
WebElement Writing_Assistant;
@FindBy(xpath="//a[contains(@href,'/social-media-post')]")
WebElement Social_media_post;
@FindBy(xpath="//select[@id='platform']")
WebElement platform;
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

public void soical_genrator() throws Exception {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Writing.click();
	String tex=Writing_Assistant.getText();
	System.out.println(tex);
	
	Social_media_post.click();
	Select sel0= new Select(platform);
	sel0.selectByVisibleText("WhatsApp");
	
	input_textarea.sendKeys("Sell mobile on cheap rate in delhi ncr sograb this approunity");
	tab_text.click();
	Select sel= new Select(quality);
	sel.selectByVisibleText("Premium");

	Select sel1= new Select(tone);
	sel1.selectByVisibleText("Sarcastic");

	Select sel2= new Select(target_audience);
	sel2.selectByVisibleText("Youtubers");
	instruction_tab.click();
	Thread.sleep(3000);
	generateButton.click();
	String tex1=gettext.getText();
	System.out.println(tex1);
}
}


