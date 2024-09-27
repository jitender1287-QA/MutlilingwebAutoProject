package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class about_us_generator_Page {
WebDriver driver;
public about_us_generator_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//span[@class='hide-menu'][normalize-space()='Writing']")
WebElement Writing;
@FindBy(xpath = "//div[@class='row top-pqge-header-section account-heading desktop-show']//span[@class='material-symbols-outlined logout-icon notranslate'][normalize-space()='expand_more']")
WebElement thik;

@FindBy(xpath="//h1[normalize-space()='Writing Assistant']")
WebElement Writing_Assistant;
@FindBy(xpath="//a[@href='/about-us-generator']")
WebElement about_us_generator;
@FindBy(xpath="//select[@id='est_year']")
WebElement est_year;
@FindBy(xpath="//input[@id='company_name']")
WebElement company_name;
@FindBy(xpath="//input[@id='founder_name']")
WebElement founder_name;
@FindBy(xpath="//select[@id='business_categoty']")
WebElement business_categoty;
@FindBy(xpath="//input[@id='location']")
WebElement  location;
@FindBy(xpath="//select[@id='company_size']")
WebElement company_size;
@FindBy(xpath="//textarea[@id='milestones']")
WebElement milestones;
@FindBy(xpath="//textarea[@id='awards']")
WebElement awards;
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

public void abouts_us() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Writing.click();
	thik.click();
	String tex=Writing_Assistant.getText();
	System.out.println(tex);
	about_us_generator.click();
	Select sel0= new Select(est_year);
			sel0.selectByVisibleText("2000");	
			company_name.sendKeys("Bizspice");
			founder_name.sendKeys("jitender chauhan");
			Select se112 =new Select(business_categoty);
			se112.selectByVisibleText("Health and Wellness");
			
			location.sendKeys("california");
	Select selc= new Select(company_size);
	selc.selectByVisibleText("100");
	milestones.sendKeys("iphone 12 sell in america");
	awards.sendKeys("i phone 13 sell in india low price");	
	
	input_textarea.sendKeys("lowest chepeast price in USA Apple iphone");
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
