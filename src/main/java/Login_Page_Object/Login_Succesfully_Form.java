package Login_Page_Object;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login_Succesfully_Form {

	WebDriver driver;
	public Login_Succesfully_Form(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//select[@id='birth-year']")
	WebElement year_container;
	@FindBy(xpath="//select[@id='gender']")
	WebElement gender;
	@FindBy(xpath="//select[@id='profession']")
	WebElement profession;
	@FindBy(xpath="//select[@id='hear-about-us']")
	WebElement about_us;
	
	@FindBy(xpath="//select[@class='col-md-12 select2 form-control m-t-15 select2 language-speek select2-hidden-accessible']")
	WebElement city;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath="//button[normalize-space()='Save Information']")
	WebElement Save_Information;
	
	public void save_info_form() throws Exception {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(2000);
		Select sel= new Select(year_container);
		sel.selectByVisibleText("2021");
		
		Select sel1= new Select(gender);
		sel1.selectByVisibleText("Male");
		
		Select sel2= new Select(profession);
		sel2.selectByVisibleText("Professor");
		
		Select sel3= new Select(about_us);
		sel3.selectByVisibleText("Friend Referral");
		
		Select sel4= new Select(city);
		sel4.selectByVisibleText("Armenian");
		phone.sendKeys("9868753075");
		Save_Information.click();
	}
}
