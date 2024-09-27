package History_Section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class newhistory_page {
WebDriver driver;
	public newhistory_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
