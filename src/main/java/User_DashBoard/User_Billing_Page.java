package User_DashBoard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Billing_Page {
WebDriver driver;
public User_Billing_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath = "//span[normalize-space()='Billing']")
WebElement Billing;
@FindBy(xpath = "//h2[normalize-space()='Billing Details']")
WebElement Billing_Details;


public void user_billing_detail() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(3000);
	Billing.click();
	String tx=Billing_Details.getText();
	System.out.println(tx);
	
	
}
}
