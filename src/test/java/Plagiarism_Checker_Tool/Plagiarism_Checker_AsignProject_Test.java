package Plagiarism_Checker_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import APP_URL.URL;
import BaseTest_Multilings.BaseClass;
import Login_Page_Object.Login_PAge;
import Login_Page_Object.Login_Succesfully_Form;
import Plagiarism_Checker.Plagiarism_Checker_AsignProject_Page;

public class Plagiarism_Checker_AsignProject_Test extends BaseClass{
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
	public void Test_Plagiarism_Checker_AsignProject_Page() throws Exception {
		Plagiarism_Checker_AsignProject_Page Assign= new Plagiarism_Checker_AsignProject_Page(driver);
		Assign.assign_project();
}

}
