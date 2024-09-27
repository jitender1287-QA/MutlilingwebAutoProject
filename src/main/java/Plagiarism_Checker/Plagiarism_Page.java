package Plagiarism_Checker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plagiarism_Page {
WebDriver driver;
public Plagiarism_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//span[normalize-space()='Plagiarism']")
WebElement Plagiarism;
@FindBy(id="input_content_ifr")
WebElement frame_ID;

@FindBy(xpath="//*[@id=\"tinymce\"]")
WebElement text_enter;
@FindBy(xpath="//button[@id='plagiarismButton']")
WebElement plagiarismButton;
@FindBy(xpath="//button[@id='form-submit']")
WebElement form_submit;
public void PLag_checker() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Plagiarism.click();
	
	driver.switchTo().frame(frame_ID);
	text_enter.sendKeys("had the same problem and then figured out the cause. I was trying to type in a span tag instead of an input tag. My XPath was written with a span tag, which was a wrong thing to do. I reviewed the Html for the element and found the problem. All I then did was to find the input tag which happens to be a child element. You can only type in an input field "
			+ "if your XPath is created with an input tagname I came across this error too. "
			+ "I thought it might have been because the field was not visible. I tried the scroll solution above and although the field became visible in the controlled browser session I still got the exception. The solution I am committing looks similar to below. It looks like the event can bubble to the contained"
			+ " input field and the end result is the "
			+ "Selected property becomes true.");
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	plagiarismButton.click();
	form_submit.click();
	
}

}
