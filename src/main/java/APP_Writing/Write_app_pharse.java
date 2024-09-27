package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Write_app_pharse {
WebDriver driver;

public Write_app_pharse(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//span[@class='hide-menu'][normalize-space()='Writing']")
WebElement Writing;

@FindBy(xpath="//h1[normalize-space()='Writing Assistant']")
WebElement Writing_Assistant;

@FindBy(xpath="//a[@href='/paraphraser']")
WebElement paraphraser;

 
 
@FindBy(id="input_textarea_ifr")
WebElement frameid;


@FindBy(xpath="/html[1]/body[1]/p[1]")
WebElement inputtext;
@FindBy(xpath="//a[@id='settingstab-tab']//span[@class='tab-text']")
WebElement audioance;

@FindBy(xpath="//select[@id='quality']")
WebElement quality;
@FindBy(xpath="//select[@id='tone']")
WebElement tone;
@FindBy(xpath="//select[@id='target_audience']")
WebElement target_audience;

@FindBy(xpath="//div[@class='bootstrap-tagsinput']//input[@placeholder='Comma separated values']")
WebElement testcase;

@FindBy(xpath="//a[@id='instruction-tab']")
WebElement instruction;

  @FindBy(xpath="//button[@id='paraphraseButton']") WebElement
  paraphraseButton;
 
public void phrase_checking() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Writing.click();
	
	String text=Writing_Assistant.getText();
	System.out.println(text);
	paraphraser.click();

	driver.switchTo().frame(frameid);
	Thread.sleep(2000);
	inputtext.sendKeys("Does a passage sound familiar from the paper and there's a passage in the source very similar to it? Add a citation if this is the case – too many citations is better than not enough. This method is used quite widely among teachers.");
	driver.switchTo().defaultContent();
	
	audioance.click();
	
	Select sel= new Select(quality);
	sel.selectByVisibleText("High");
	
	Select sel1= new Select(tone);
	sel1.selectByVisibleText("Professional");
	Select sel2= new Select(target_audience);
	sel2.selectByVisibleText("Freelancers");
	
	testcase.sendKeys("random");
	instruction.click();
	paraphraseButton.click();
}
}
