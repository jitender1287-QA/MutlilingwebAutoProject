package Translation_Tool;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Translate_withFile_Page {
WebDriver driver;
public Translate_withFile_Page (WebDriver driver) {
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
@FindBy(xpath="//div[@class='translate-upload-container']//div[@class='drop-zone']")
WebElement click_drag_drop_btn;
@FindBy(xpath="(//button[@id='fileTranslateButton'])[1]")
WebElement fileTranslateButton2;
public void Translate_pdf() throws Exception {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Translate.click();
	Select input= new Select(translate_input);
	input.selectByVisibleText("Document");
	Select output= new Select(translate_output);
	output.selectByVisibleText("Document");
	
	Select chose_lange= new Select(input_language);
	chose_lange.selectByVisibleText("English");
	Select chose_lange_Output= new Select(output_language);
	chose_lange_Output.selectByVisibleText("Hindi");

	cancel.click();
	click_drag_drop_btn.click();
	
	 Thread.sleep(4000); 
	 Runtime.getRuntime().exec(
	  "C://Users//jiten//eclipse-workspacejc24-jitnderproject//App_Multilings_Project_24_06_2024//translateFile.exe"
	  + " " + "C:\\Users\\jiten\\Downloads\\8191173840000Forms.pdf");
	 
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,250)", "passwordElement");
			/*
			 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
			 * passwordElement =
			 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
			 * "//button[@id='fileTranslateButton2']"))); passwordElement.click();
			 */
		  
		Thread.sleep(5000);
	 fileTranslateButton2.click();
	
	
	
}
}
