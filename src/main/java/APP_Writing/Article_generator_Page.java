package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Article_generator_Page {
WebDriver driver;
public Article_generator_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[@class='hide-menu'][normalize-space()='Writing']")
WebElement Writing;
@FindBy(xpath="//h1[normalize-space()='Writing Assistant']")
WebElement Writing_Assistant;
@FindBy(xpath="//a[contains(@href,'/article-generator')]")
WebElement article_generator;
@FindBy(xpath="//span[normalize-space()='Manually Generate Article']")
WebElement Manually_Generate;
@FindBy(xpath="//div[@class='bootstrap-tagsinput']//input[@placeholder='seperate with comma ( , )']")
WebElement place_enter;
@FindBy(xpath="//button[@id='generateTitle']")
WebElement generateTitle;
@FindBy(xpath="//span[normalize-space()='Generate Intro']")
WebElement Generate_Intro;
@FindBy(xpath="//button[@id='generateButton']")
WebElement generateButton;
@FindBy(xpath="//button[@id='audienceSettingsButton']")
WebElement audienceSettingsButton;
@FindBy(xpath="//select[@id='quality']")
WebElement quality;
@FindBy(xpath="//select[@id='target_audience']")
WebElement target_audience;
@FindBy(xpath="//select[@id='tone']")
WebElement tone;
@FindBy(xpath="//select[@id='min_article_length']")
WebElement min_article_length;
@FindBy(xpath="//select[@id='max_article_length']")
WebElement max_article_length;
@FindBy(xpath="//input[@id='keyword1']")
WebElement keyword1;
@FindBy(xpath="//input[@id='link1']")
WebElement link1;
@FindBy(xpath="//button[@id='generateButton3']")
WebElement generateButton3;

public void Article_check() throws Exception {
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Writing.click();
	String tex=Writing_Assistant.getText();
	System.out.println(tex);
	article_generator.click();
	Manually_Generate.click();
	place_enter.sendKeys("ipl 2024");
	
	generateTitle.click();
	Thread.sleep(4000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,350)","");
	
	Generate_Intro.click();
	Thread.sleep(4000);
	JavascriptExecutor js1 =(JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,350)","");
	generateButton.click();
	Thread.sleep(3000);
	audienceSettingsButton.click();
	Thread.sleep(3000);
	Select sel= new Select(quality);
	sel.selectByVisibleText("Regular");
	Select sel1= new Select(target_audience);
	sel1.selectByVisibleText("Entrepreneurs");		
	Select sel2= new Select(tone);
	sel2.selectByVisibleText("Engaging");	
	Select sel3= new Select(min_article_length);
	sel3.selectByVisibleText("~ 900 Words");
	Select sel4= new Select(max_article_length);
	sel4.selectByVisibleText("~ 1500 Words");
	keyword1.sendKeys("Test Match");
	link1.sendKeys("www.bci.com");
	Thread.sleep(3000);
	generateButton3.click();
}
}
