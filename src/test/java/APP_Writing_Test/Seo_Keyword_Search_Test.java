package APP_Writing_Test;

import org.testng.annotations.Test;

import APP_URL.URL;

import APP_Writing.Seo_Keyword_Search_Page;
import BaseTest_Multilings.BaseClass;
import Login_Page_Object.Login_PAge;
import Login_Page_Object.Login_Succesfully_Form;

public class Seo_Keyword_Search_Test extends BaseClass{

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
	public void Test_Seo_Keywords() throws Exception {
		Seo_Keyword_Search_Page Keywords=new Seo_Keyword_Search_Page(driver);
		Keywords.Seo_keyword();
	}
}
