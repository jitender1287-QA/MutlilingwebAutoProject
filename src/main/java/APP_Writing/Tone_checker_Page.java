package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tone_checker_Page {
WebDriver driver;
public Tone_checker_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//span[@class='hide-menu'][normalize-space()='Writing']")
WebElement Writing;
@FindBy(xpath="//h1[normalize-space()='Writing Assistant']")
WebElement Writing_Assistant;
@FindBy(xpath="//a[@href='/tone-checker']")
WebElement tone_checker;
@FindBy(xpath="//textarea[@id='input_textarea']")
WebElement input_textarea;

@FindBy(xpath="//button[@id='generateButton']")
WebElement generateButton;
@FindBy(xpath="//textarea[@class='writing-result-output font-18 auto-resize mb-2']")
WebElement gettext;

public void Tone_check() throws Exception {
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Writing.click();
	String tex=Writing_Assistant.getText();
	System.out.println(tex);
	tone_checker.click();
	
	input_textarea.sendKeys("Sell mobile on cheap rate in delhi ncr sograb this approunity");
	Thread.sleep(3000);
	generateButton.click();
	String tex1=gettext.getText();
	System.out.println(tex1);
}

}


