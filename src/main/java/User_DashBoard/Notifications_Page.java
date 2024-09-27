package User_DashBoard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notifications_Page {
WebDriver driver;
public Notifications_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath ="//span[normalize-space()='Notifications']")
WebElement  Notifications;
@FindBy(xpath ="//div[@class='notification-table bg-white-table']")
WebElement Notifications_table;

public void notifiction_table() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Thread.sleep(3000);
	Notifications.click();
	String tx=Notifications_table.getText();
	System.out.println(tx);
	
}
}
