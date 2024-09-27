package Login_Page_Object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Profile_Page {

	WebDriver driver;
	public Edit_Profile_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(xpath ="//span[normalize-space()='Edit Profile']" )
	WebElement Edit_Profile ;
	@FindBy(xpath = "//input[@id='company']")
	WebElement company;
	@FindBy(xpath = "//input[@id='website']")
	WebElement website;
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	@FindBy(xpath="//button[@class='btn btn-primary save-profile-data font-16']")
	WebElement savebtn;
	 public void Edit_profile_user() throws Exception {
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 Edit_Profile.click();
		 company.sendKeys("Bizspice.com");
		 website.sendKeys("www.Bizspice.com");
		 city.sendKeys("india");
		 savebtn.click();
	}
	
}
