package APP_Writing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Startup_idea_generator_Page {
WebDriver driver;
public Startup_idea_generator_Page(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}
}
