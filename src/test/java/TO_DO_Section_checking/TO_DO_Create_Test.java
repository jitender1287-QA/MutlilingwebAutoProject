package TO_DO_Section_checking;

import org.testng.annotations.Test;

import APP_URL.URL;
import BaseTest_Multilings.BaseClass;
import Login_Page_Object.Login_PAge;
import Login_Page_Object.Login_Succesfully_Form;
import TO_DO_Section.TO_DO_Create_Page;

public class TO_DO_Create_Test extends BaseClass{
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
	public void Test_TO_DO_Create_Page() throws Exception {
		TO_DO_Create_Page add_To_Do= new TO_DO_Create_Page(driver);
		add_To_Do.To_do_create();
	}
}
