package Login_Page_Object;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PAge {
WebDriver driver;

public Login_PAge(WebDriver driver) {
	
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
}

/*
 * @FindBy(xpath="//a[normalize-space()='Login']") WebElement Login;
 */
@FindBy(xpath="//input[@id='email']")
WebElement email;

@FindBy(xpath="//input[@id='password']")
WebElement password;
@FindBy(xpath="//button[@id='signinButton']")
WebElement signinButton;

public void login_detail() throws Exception {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	/*
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
	 * js.executeScript("window.scrollBy(0,800)", ""); Thread.sleep(4000);
	 * Login.click();
	 */
	
	Thread.sleep(2000);
	email.sendKeys("JITENDER1287@GMAIL.COM");
	password.sendKeys("Chauhan@9868");
	signinButton.click();
}


}
