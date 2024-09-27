package Projects_Create;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Created_Project_Check_Page {
WebDriver driver;
public Created_Project_Check_Page (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//span[normalize-space()='Projects']")
WebElement Projects;
@FindBy(xpath="//p[@class='clear mb-0 font-16 font-semibold desktop-show']")
WebElement gettext;
@FindBy(xpath="//*[@id=\"main-wrapper\"]/div/div/div/div/div/div[1]/div/div[2]/div[2]/a/span[2]")
WebElement chararater_count;
@FindBy(xpath="//a[@class='prevent-redirect active-project-btn']")
WebElement created_project_click;
@FindBy(tagName="div")
List<WebElement> resource;
//@FindBy(xpath="//div[@class='col-md-12 pl-5 pr-5 padding-edjust']")
@FindBy(xpath="//div[@class='row welcome-bottom-box']")
WebElement links;

public void New_Project() {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Projects.click();
String tx=	gettext.getText();
System.out.println(tx);
String txc=chararater_count.getText();
System.out.println(txc);
created_project_click.click();
	
int jc=resource.size();
System.out.println("total links"+ jc);
for(WebElement ele: resource) {
	System.out.println(ele.getText() + "   " + ele.getAttribute("href"));
}
try {
	for(int i=0; i<=links.findElements(By.tagName("a")).size(); i++)
	{
	String enterkey=Keys.chord(Keys.CONTROL, Keys.ENTER);
	links.findElements(By.tagName("a")).get(i).sendKeys(enterkey);
	String gttext=links.findElements(By.tagName("a")).get(i).getText();
	System.out.println(gttext);
	}
}
catch(Exception e) {
}
}
}
