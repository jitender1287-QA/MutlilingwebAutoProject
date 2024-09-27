package User_DashBoard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Team_Members_Page {
WebDriver driver;
public Team_Members_Page(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath ="//span[normalize-space()='Team Members']")
WebElement Team_Members;
@FindBy(xpath ="//div[@id='subuser-message']//p[@class='mb-0'][contains(text(),'This feature is exclusively available for premium ')]")
WebElement message;
@FindBy(xpath="//h2[normalize-space()='Team Members Details']")
WebElement Details;

public void Team_Memeber_ststus() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//Thread.sleep(2000);
	/*
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
	 * js.executeScript("window.scrollBy(0,350)", "");
	 */
	Thread.sleep(3000);
	Team_Members.click();
String tx=message.getText();
System.out.println(tx);
	
String tx1=Details.getText();
System.out.println(tx1);
}
}
