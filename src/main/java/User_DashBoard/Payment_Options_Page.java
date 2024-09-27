package User_DashBoard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment_Options_Page {
WebDriver driver;
public Payment_Options_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath ="//span[normalize-space()='Payment Options']")
WebElement Payment_Options;
@FindBy(xpath = "//span[normalize-space()='Add New Card']")
WebElement Add_New_Card;
@FindBy(xpath = "//span[@class='addcard-heading-text']")
WebElement addcard_heading_text;
@FindBy(xpath ="//input[@id='card_name']")
WebElement card_name;
@FindBy(xpath ="//input[@id='ccn']")
WebElement ccn;
@FindBy(xpath ="//input[@id='expirydata']")
WebElement expirydata;
@FindBy(xpath ="//input[@id='cvv']")
WebElement cvv;
@FindBy(xpath ="//select[@id='country2']")
WebElement country2;
@FindBy(xpath ="//button[@id='submitAddCard']")
WebElement submitAddCard;

public void addew_card() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Thread.sleep(3000);
	Payment_Options.click();
	Add_New_Card.click();
	String tx=addcard_heading_text.getText();
	System.out.println(tx);
	card_name.sendKeys("jitender chauhan");
	ccn.sendKeys("1234567898652450");
	expirydata.sendKeys("20133");
	cvv.sendKeys("456");
	Select new1 = new Select(country2);
	new1.selectByVisibleText("Central African Republic");
	submitAddCard.click();
}
}
