package Login_Page_Object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acoount_DashBoard_Page {
	WebDriver driver;
	public Acoount_DashBoard_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="(//span[@role='presentation'])[2]")
	WebElement Nav_click;
	@FindBy(xpath="//div[@class='row top-pqge-header-section account-heading desktop-show']//span[@class='material-symbols-outlined logout-icon notranslate'][normalize-space()='expand_more']")
	WebElement clickon;
	@FindBy(xpath = "//div[@class='row top-pqge-header-section account-heading desktop-show']//li[@class='sidebar-item account-menu']//a[@class='sidebar-link waves-effect waves-dark sidebar-link']")
	WebElement account;
	@FindBy(xpath = "//label[@for='product-dont-liked-writing-assistant']")
	WebElement notuse;
	@FindBy(xpath = "//label[@for='product-sometime-liked-language-translator']")
	WebElement someclick;
	@FindBy(xpath = "//label[normalize-space()='Very Satisfied']")
	WebElement Satisfied_product;
	@FindBy(xpath = "//label[@for='product-mosttime-liked-plagiarism-checker']")
	WebElement plag;
	@FindBy(xpath = "//label[@for='product-mosttime-liked-citation-generator']")
	WebElement plag1;
	@FindBy(xpath = "//label[normalize-space()='Daily']")
	WebElement Daily_Product;
	@FindBy(xpath = "//label[normalize-space()='Excellent']")
	WebElement Excellent;
	@FindBy(xpath = "//label[normalize-space()='Very likely']")
	WebElement Very_likely;
	@FindBy(xpath = "//button[@id='surveystep2']")
	WebElement surveystep2;
	@FindBy(xpath = "//label[normalize-space()='Very helpful']")
	WebElement Very_helpful;
	@FindBy(xpath = "//label[normalize-space()='Super']")
	WebElement Super;
	@FindBy(xpath = "//input[@id='other-ai-tools']")
	WebElement other_ai_tools;
	@FindBy(xpath = "//textarea[@id='additional-feedback']")
	WebElement additional_feedback;
	@FindBy(xpath = "//button[@id='submitSurvey']")
	WebElement submitSurvey;

	public void acoount_dashborad() throws Exception {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		Nav_click.click();
		clickon.click();
		//ssclickon.click();
		account.click();
		notuse.click();
		someclick.click();
		Satisfied_product.click();
		plag.click();
		plag1.click();
		Daily_Product.click();
		Excellent.click();
		Very_likely.click();
		surveystep2.click();
		Thread.sleep(2000);
		Very_helpful.click();
		Super.click();
		other_ai_tools.sendKeys("No this is good for me ");
		additional_feedback.sendKeys("this is test feedback so please ignore send by jtenderchauhan Lead QA");
		submitSurvey.click();

	}
}
