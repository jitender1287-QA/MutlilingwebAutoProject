package Projects_Create;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Project_Page {
WebDriver driver;
public New_Project_Page (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='Projects']")
WebElement Projects;
@FindBy(xpath="//p[@class='clear mb-0 font-16 font-semibold desktop-show']")
WebElement gettext;
@FindBy(xpath="//*[@id=\"main-wrapper\"]/div/div/div/div/div/div[1]/div/div[2]/div[2]/a/span[2]")
WebElement chararater_count;
@FindBy(xpath="//div[@class='tile folder create-new-folder-box']")
WebElement add;
@FindBy(xpath="//h4[normalize-space()='Create a new project']")
WebElement project;
@FindBy(xpath="//input[@id='project-name']")
WebElement project_name;
@FindBy(xpath="//textarea[@id='project_description']")
WebElement project_description;
@FindBy(xpath = "//span[normalize-space()='Next']")
WebElement Next;
@FindBy(xpath = "//select[@id='tone']")
WebElement tone;
@FindBy(xpath = "//select[@id='language']")
WebElement language;
@FindBy(xpath = "//div[@class='bootstrap-tagsinput']//input[@placeholder='e.g. Tesla cars']")
WebElement enter_text;
@FindBy(xpath = "//select[@id='target_audience']")
WebElement target_audience;
@FindBy(xpath = "//label[@for='switch']")
WebElement switchclick;
@FindBy(xpath = "//select[@id='project-logo-placement']")
WebElement logo_placement;
@FindBy(xpath = "//span[normalize-space()='Upload Project Logo']")
WebElement uploadFile;
@FindBy(xpath = "//span[normalize-space()='Save']")
WebElement savebtn;
public void add_project() throws Exception {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Projects.click();
	String tx=gettext.getText();
	System.out.println(tx);
	String jx=chararater_count.getText();
	System.out.println(jx);
	add.click();
	String tex=project.getText();
	System.out.println(tex);
	project_name.sendKeys("JC Test Automation Ai");
	project_description.sendKeys("This is auomation tool to veriy the code working fine ");
	Next.click();
	Select sel= new Select(tone);
	sel.selectByVisibleText("Dramatic");
	Select sel1= new Select(language);
	sel1.selectByVisibleText("Dutch");
	enter_text.sendKeys("AI");
	Select sel2= new Select(target_audience);
	sel2.selectByVisibleText("Teenagers");
	//switchclick.click();
	/*
	 * Select sel3= new Select(logo_placement);
	 * sel3.selectByVisibleText("Top Right");
	 */
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	//uploadFile.click();
	//Thread.sleep(3000);
	//Runtime.getRuntime().exec("C://Users//jiten//eclipse-workspacejc24-jitnderproject//App_Multilings_Project_24_06_2024//Logo.exe" + " " + "C:\\Users\\jiten\\Downloads\\time.jpg");
	savebtn.click();
}
}
