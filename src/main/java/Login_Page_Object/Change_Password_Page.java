package Login_Page_Object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_Password_Page {
WebDriver driver;
public Change_Password_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath = "//span[normalize-space()='Password']")
WebElement Password;
@FindBy(xpath = "//input[@id='new_password']")
WebElement new_password;
@FindBy(xpath = "//input[@id='confirm_password']")
WebElement confirm_password;
@FindBy(xpath = "//button[@class='btn btn-primary update-password-data font-16']")
WebElement savebtn_changepassowrd;

public void password_update() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(3000);
	Password.click();
	new_password.sendKeys("Test@1234");
	confirm_password.sendKeys("Test@12345");
	savebtn_changepassowrd.click();
	
}
}
