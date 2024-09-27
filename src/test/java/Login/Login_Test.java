package Login;

import org.testng.annotations.Test;

import APP_URL.URL;
import BaseTest_Multilings.BaseClass;
import Login_Page_Object.Login_PAge;

public class Login_Test extends BaseClass {

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
	
}
