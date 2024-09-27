package User_DashBoard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscriptions_Update_Page {
WebDriver driver;
public Subscriptions_Update_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath ="//span[normalize-space()='Subscription']")
WebElement Subscription;
@FindBy(xpath ="//h2[normalize-space()='Active Subscription']")
WebElement Subscription_headingText;
@FindBy(xpath ="//button[@class='btn btn-sm btn-success upgrade-plan-button']")
WebElement upgrade_plan_button;
@FindBy(xpath ="//p[contains(text(),'Your are on')]")
WebElement Your_are_on;
@FindBy(xpath = "//span[@class='slider round']")
WebElement checkbox_click;
@FindBy(xpath ="//div[@class='billing-plan-inner-section py-2 px-1 border bg-white pb-3 pro-monthly-plan']")
WebElement hover;
@FindBy(xpath = "//label[@for='pro-translate-month']")
WebElement Choose_This;
@FindBy(xpath = "//div[@class='col-md-4 free-plan mt-4 pro-addon']//div[@class='billing-plan-inner-section p-2 border bg-white']")
WebElement hover_next;
@FindBy(xpath = "//label[@for='prepaid-translator-month1']//span[@class='add-on-buy-now-text'][normalize-space()='Buy Now']")
WebElement buynowbtn;
@FindBy(xpath = "//div[@class='card p-4 payment-column bg-white fixedPaymentElement makesticky']")
WebElement makesticky;
@FindBy(xpath ="//button[@id='payment-button']")
WebElement payment_button;
public void subscription_plan() throws Exception {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Thread.sleep(3000);
	Subscription.click();
	String text=Subscription_headingText.getText();
	System.out.println(text);
	upgrade_plan_button.click();
	String tx=Your_are_on.getText();
	System.out.println(tx);
	checkbox_click.click();
	Actions action= new Actions(driver);
	action.moveToElement(hover).perform();
	Thread.sleep(1000);
	Choose_This.click();
	Actions action1= new Actions(driver);
	action1.moveToElement(hover_next).perform();
	buynowbtn.click();
	String t1x=makesticky.getText();
	System.out.println(t1x);
	payment_button.click();
}
}
