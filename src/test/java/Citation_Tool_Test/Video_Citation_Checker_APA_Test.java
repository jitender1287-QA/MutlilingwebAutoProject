package Citation_Tool_Test;

import org.testng.annotations.Test;

import APP_URL.URL;
import BaseTest_Multilings.BaseClass;
import Citation_Tool.Video_Citation_Checker_APA_Page;
import Login_Page_Object.Login_PAge;
import Login_Page_Object.Login_Succesfully_Form;

public class Video_Citation_Checker_APA_Test extends BaseClass{
	@Test(priority=1)

	public void Launch_app() {
		URL hit_URL= new URL();
		hit_URL.APP_URL();
	}

	@Test(priority=2)
	public void Test_Login() throws Exception {
		Login_PAge lp= new Login_PAge(driver);
		lp.login_detail();
	}

	@Test(priority=3)
	public void Test_Login_form() throws Exception {
		Login_Succesfully_Form form= new Login_Succesfully_Form(driver);
		form.save_info_form();
	}
	@Test(priority=4)
	public void Test_Video_Citation_Checker_APA_Page() throws Exception { 
		Video_Citation_Checker_APA_Page APA = new Video_Citation_Checker_APA_Page(driver);
		APA.Video_APA_Page();
	}
}
