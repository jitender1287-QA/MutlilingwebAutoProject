package Translation_Tool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Translate_Website_Page {
WebDriver driver;
public Translate_Website_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//span[normalize-space()='Translate']")
WebElement Translate;
@FindBy(xpath="//select[@id='translate_input']")
WebElement translate_input;
@FindBy(xpath="//select[@id='translate_output']")
WebElement translate_output;
@FindBy(xpath="//select[@id='input_language']")
WebElement input_language;
@FindBy(xpath="//select[@id='output_language']")
WebElement output_language;
@FindBy(xpath="//span[contains(text(),'cancel')]")
WebElement cancel;
@FindBy(xpath="//*[@id=\"website_textarea\"]")
WebElement textweb;
@FindBy(xpath="//button[@id='websitetranslateButton']")
WebElement button;
public void website_translate() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Translate.click();
	Select input= new Select(translate_input);
	input.selectByVisibleText("Website");
	Select output= new Select(translate_output);
	output.selectByVisibleText("Text");
	
	Select chose_lange= new Select(input_language);
	chose_lange.selectByVisibleText("English");
	Select chose_lange_Output= new Select(output_language);
	chose_lange_Output.selectByVisibleText("Hindi");

	cancel.click();
	
	textweb.sendKeys("https://www.bizspice.com/");
	Thread.sleep(1000);
	button.click();
}
}
