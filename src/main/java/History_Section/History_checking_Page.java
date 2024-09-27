package History_Section;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class History_checking_Page {
WebDriver driver;
public History_checking_Page (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
String date="03-07-2024";
@FindBy(xpath = "//span[normalize-space()='History']")
WebElement History_Link;
@FindBy(xpath = "//div[@class='col-md-12 px-5']")
WebElement table_div;
@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div/div/table/tbody")
List<WebElement> table;
@FindBy(xpath = "//a[normalize-space()='Craft a blog post on effective time management tec']")
WebElement reprtlink;
public void check_history() {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	History_Link.click();
	
	int links=table.size();
	System.out.println("total link" +links);
	for(WebElement ele :table ) {
		System.out.println(ele.getText() + " " + ele.getAttribute("href"));
	}
	try {
	for (int i = 0; i<=table_div.findElements(By.tagName("a")).size(); i++) {
		String keyss=Keys.chord(Keys.CONTROL,Keys.ENTER);
		table_div.findElements(By.tagName("a")).get(i).sendKeys(keyss);
		String tablename=table_div.findElements(By.tagName("a")).get(i).getText();
		System.out.println(tablename);
		
		
		
		
	}
	
	
	
	
}
	catch(Exception e) {
		
		
	}
	}
}
	/*while(true)
	{
		String tex=table.getText();
		System.out.println(tex);
		if(tex.equals(date)) {
			boolean tx=table.isEnabled();
			System.out.println("if the date match " +tx);
			
			{
				System.out.println("if date not match");
				break;
			}
		}
		else {
			reprtlink.click();
		}
	}
}
}
*/