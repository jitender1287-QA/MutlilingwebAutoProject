package Translation_Tool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Translate_Page {
WebDriver driver;
public Translate_Page(WebDriver driver) {
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
@FindBy(id="input_textarea_ifr")
WebElement idfrme;
@FindBy(xpath="//*[@id=\"tinymce\"]")
WebElement tinymcedata;

@FindBy(xpath="//button[@id='translateButton']")
WebElement Translate1;
@FindBy(id="output_textarea_ifr")
WebElement idfrme_out;
@FindBy(xpath="//iframe[@id='output_textarea_ifr']")
WebElement gettext;
public void translate_checking() throws Exception {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Translate.click();
	Select input= new Select(translate_input);
	input.selectByVisibleText("Text");
	Select output= new Select(translate_output);
	output.selectByVisibleText("Text");
	
	Select chose_lange= new Select(input_language);
	chose_lange.selectByVisibleText("Finnish");
	Select chose_lange_Output= new Select(output_language);
	chose_lange_Output.selectByVisibleText("Hindi");
	
	driver.switchTo().frame(idfrme);
	tinymcedata.sendKeys("One way to detect paraphrasing is to look at the source material and the paper. Does a passage sound familiar from the paper and there's a passage in the source very similar to it? Add a citation if this is the case – too many citations is better than not enough. This method is used quite widely among teachers.");
	driver.switchTo().defaultContent();
	Translate1.click();
	driver.switchTo().frame(idfrme_out);
	Thread.sleep(2000);
	String text=gettext.getText();
	System.out.println(text);
	driver.switchTo().defaultContent();
}

}
