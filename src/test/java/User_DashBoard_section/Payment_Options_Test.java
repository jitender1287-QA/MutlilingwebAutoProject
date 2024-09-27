package User_DashBoard_section;

import org.testng.annotations.Test;

import APP_URL.URL;
import BaseTest_Multilings.BaseClass;
import Login_Page_Object.Acoount_DashBoard_Page;
import Login_Page_Object.Login_PAge;
import Login_Page_Object.Login_Succesfully_Form;
import User_DashBoard.Payment_Options_Page;

public class Payment_Options_Test extends BaseClass{
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
	public void Test_Acoount_DashBoard_Page() throws Exception {
		Acoount_DashBoard_Page account_DSH_PAge= new Acoount_DashBoard_Page(driver);
		account_DSH_PAge.acoount_dashborad();
	}
	@Test(priority=5)
	public void Test_Payment_Options_Page() throws Exception {
		Payment_Options_Page payment_choose= new Payment_Options_Page(driver);
		payment_choose.addew_card();
	}
}
