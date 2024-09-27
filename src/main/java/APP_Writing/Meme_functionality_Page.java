package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Meme_functionality_Page {
	WebDriver driver;
	public Meme_functionality_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[@class='hide-menu'][normalize-space()='Writing']")
	WebElement Writing;

	@FindBy(xpath="//h1[normalize-space()='Writing Assistant']")
	WebElement Writing_Assistant;
	@FindBy(xpath="//a[@href='/meme-generator']")
	WebElement meme_generator;

	@FindBy(xpath="//textarea[@id='input_textarea']")
	WebElement input_textarea;

	@FindBy(xpath="//a[@id='settingstab-tab']//span[@class='tab-text']")
	WebElement click_audioance_tab;

	@FindBy(xpath="//select[@id='quality']")
	WebElement quality;
	@FindBy(xpath="//select[@id='tone']")
	WebElement tone;
	@FindBy(xpath="//select[@id='target_audience']")
	WebElement target_audience;
	@FindBy(xpath="//input[@id='target_keywords']")
	WebElement target_keywords;

	@FindBy(xpath="//span[normalize-space()='Instructions']")
	WebElement Instructions;
	@FindBy(xpath="//span[normalize-space()='mic_off']")
	WebElement mic_off;
	@FindBy(xpath="//button[@id='generateButton']")
	WebElement generateButton;
	public void Meme_genrator() throws Exception {

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Writing.click();

		String text=Writing_Assistant.getText();
		System.out.println(text);
		meme_generator.click();
		input_textarea.sendKeys("IPL is an a youth dream to enter in a game");
		click_audioance_tab.click();
		Select sel= new Select(quality);
		sel.selectByVisibleText("Premium");

		Select sel1= new Select(tone);
		sel1.selectByVisibleText("Sarcastic");

		Select sel2= new Select(target_audience);
		sel2.selectByVisibleText("Youtubers");
		target_keywords.sendKeys("Funny");
		Instructions.click();
		mic_off.click();
		Thread.sleep(2000);
		String te= generateButton.getText();
		System.out.println(te);
		generateButton.click();


	}
}
