package APP_Writing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Proofreader_checking_Page {
	WebDriver driver;

	public Proofreader_checking_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='hide-menu'][normalize-space()='Writing']")
	WebElement Writing;
	@FindBy(xpath = "//h1[normalize-space()='Writing Assistant']")
	WebElement Writing_Assistant;
	@FindBy(xpath = "//a[14]")
	WebElement proofreader;
	@FindBy(xpath = "//select[@id='language']")
	WebElement language;
	@FindBy(xpath = "//label[@class='col-md-8 pl-0 mb-0 pb-1 input-label-section col-form-label']")
	WebElement file;
	@FindBy(xpath="//button[@id='uploadButton']")
	WebElement uploadButton;

	@FindBy(id="input_textarea_ifr")
	WebElement frame;
	@FindBy(xpath = "/html[1]/body[1]/p[1]")
	WebElement input_textarea;

	@FindBy(xpath = "//button[normalize-space()='Check Proofreading']")
	WebElement generateButton;
	@FindBy(xpath = "//textarea[@class='writing-result-output font-18 auto-resize mb-2']")
	WebElement gettext;

	public void proofreader_check() throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Writing.click();
		String tex = Writing_Assistant.getText();
		System.out.println(tex);
		proofreader.click();

		Select sel0 = new Select(language);
		sel0.selectByVisibleText("English (British)");
		file.click();
		Thread.sleep(2000);

		Runtime.getRuntime().exec( "C://Users//jiten//eclipse-workspacejc24-jitnderproject//App_Multilings_Project_24_06_2024//jctim.exe" + " " + "C:\\Users\\jiten\\Downloads\\info.pdf");

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(uploadButton).click().build().perform(); //uploadButton.click();

		driver.switchTo().frame(frame);
		input_textarea.sendKeys("iPhone 13 with high selling product");
		driver.switchTo().defaultContent();

		Thread.sleep(1000); generateButton.click();
		String tex1=gettext.getText(); System.out.println(tex1);

	}
}
