package TO_DO_Section;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Created_Find_TO_DO_Page {
	WebDriver driver;
	public Created_Find_TO_DO_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	String month="July 2024";
	@FindBy(xpath="//span[normalize-space()='To Do']")
	WebElement To_do_click;
	@FindBy(xpath = "//button[@title='Next month']")
	WebElement click;
	@FindBy(xpath = "//*[@id=\"calendar\"]/div[2]/div/table/tbody")
	WebElement clander;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/div[2]/div[1]/a[1]")
	WebElement clickdate;

	public void find_To_Do() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		To_do_click.click();

		/*while(true) {
	String tx=	click.getText();
	if(tx.equals(month)) {
		break;
	}

	else {

		click.click();
	}
	}
}}*/

		for (int i = 0; i < 0; i++) {
			click.click();

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickdate.click();


	}	}









