package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Landing_page_generator_Page {
WebDriver driver;
public Landing_page_generator_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//span[@class='hide-menu'][normalize-space()='Writing']")
WebElement Writing;
@FindBy(xpath="//h1[normalize-space()='Writing Assistant']")
WebElement Writing_Assistant;
@FindBy(xpath="//a[contains(@href,'/landing-page-generator')]")
WebElement landing_page_generator;
@FindBy(xpath="//input[@id='company_name']")
WebElement company_name;

@FindBy(xpath="//select[@id='company_size']")
WebElement company_size;

@FindBy(xpath="//select[@id='company_year']")
WebElement company_year;
@FindBy(xpath="//input[@id='feature_1']")
WebElement feature_1;
@FindBy(xpath="//input[@id='feature_2']")
WebElement feature_2;
@FindBy(xpath="//input[@id='feature_3']")
WebElement feature_3;
@FindBy(xpath="//textarea[@id='input_textarea']")
WebElement input_textarea;
@FindBy(xpath="//a[@id='settingstab-tab']//span[@class='tab-text']")
WebElement instruction_tab;
@FindBy(xpath="//a[@id='settingstab-tab']//span[@class='tab-text']")
WebElement click_audioance_tab;
@FindBy(xpath="//select[@id='quality']")
WebElement quality;
@FindBy(xpath="//select[@id='tone']")
WebElement tone;
@FindBy(xpath="//select[@id='target_audience']")
WebElement target_audience;
@FindBy(xpath="//a[@id='instruction-tab']")
WebElement instruction1_tab;
@FindBy(xpath="//button[@id='generateButton']")
WebElement generateButton;
/*
 * @FindBy(
 * xpath="//textarea[@class='writing-result-output font-18 auto-resize mb-2']")
 * WebElement gettext;
 */

public void Landding_page() throws Exception {
	
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Writing.click();
	String tex=Writing_Assistant.getText();
	System.out.println(tex);
	landing_page_generator.click();
	company_name.sendKeys("Bizspice tech");
	Select sel0= new Select(company_size);
	sel0.selectByVisibleText("50-100");
	Select sel01= new Select(company_year);
	sel01.selectByVisibleText("1993");
	feature_1.sendKeys("testing");
	feature_2.sendKeys("techbiz");
	feature_3.sendKeys("tech so fast");
	input_textarea.sendKeys("Sell mobile on cheap rate in delhi ncr sograb this approunity");
	instruction_tab.click();
	Select sel= new Select(quality);
	sel.selectByVisibleText("Premium");

	Select sel1= new Select(tone);
	sel1.selectByVisibleText("Sarcastic");

	Select sel2= new Select(target_audience);
	sel2.selectByVisibleText("Youtubers");
	instruction1_tab.click();
	Thread.sleep(3000);
	generateButton.click();
	/*
	 * String tex1=gettext.getText(); System.out.println(tex1);
	 */
}
}

