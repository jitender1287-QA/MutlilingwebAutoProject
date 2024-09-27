package User_DashBoard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Secuirty_Page {
WebDriver driver;
public User_Secuirty_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	
}
@FindBy(xpath = "//span[normalize-space()='Security']")
WebElement Security;
@FindBy(xpath = "//div[@id='usersecurrity']//div[@class='table-responsive mt-0 billingdetail-table bg-white-table']")
WebElement Secuiry_table_data;


public void secuirty_info() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(3000);
	Security.click();
	String tx=Secuiry_table_data.getText();
	System.out.println(tx);
	
}
}
