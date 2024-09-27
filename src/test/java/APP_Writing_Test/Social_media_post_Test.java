package APP_Writing_Test;

import org.testng.annotations.Test;

import APP_URL.URL;
import APP_Writing.Social_media_post_Page;
import BaseTest_Multilings.BaseClass;
import Login_Page_Object.Login_PAge;
import Login_Page_Object.Login_Succesfully_Form;

public class Social_media_post_Test extends BaseClass{
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
	public void Test_Social_media_post_Page() throws Exception {
		Social_media_post_Page soical_media= new Social_media_post_Page(driver);
		soical_media.soical_genrator();
		
	}
}
