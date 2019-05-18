package com.qa.abhibus.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abhibus.base.TestBase;
import com.qa.abhibus.pages.login_page;

public class login_page_test extends TestBase {
	login_page lp;
	public login_page_test(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		lp=new login_page();
	}
	@Test(priority=1)
	public void validateGuiLogin_Singup_Btn(){
		lp.validatelogin_signupbtn();
	}
	@Test(priority=2)
	public void validateGuiHotel_link(){
		lp.validateHotel_link();
		}
	@Test(priority=3)
	public void validateGuiOffers_link(){
		lp.validateOffers_link();
	}
	@Test(priority=4)
	public void validateGuiPrint_ticket_link(){
		lp.validatePrint_ticket_link();
	}
	
	@Test(priority=5)
	public void validateGuiCancel_ticket_link(){
		lp.validateCancel_ticket_link();
	}
	@Test(priority=6)
	public void validateGuiCustomer_care_link(){
		lp.validateCustomer_care_link();
	}
	@Test(priority=7)
	public void validateclickOnlogin_signup_Link(){
		lp.clickOnlogin_signup_Link();
	}
	@Test(priority=8)
	public void validateclickOnhotel_link(){
		lp.clickOnhotel_link();
		}
	@Test(priority=9)
	public void validateclickonOffers_link(){
		lp.clickonOffers_link();
	}
	@Test(priority=10)
	public void validateclickonPrint_ticket_link(){
		lp.clickonPrint_ticket_link();
	}
	
	@Test(priority=11)
	public void validateclickoncancel_ticket_link(){
		lp.clickoncancel_ticket_link();
	}
	@Test(priority=12)
	public void validateclickonCustomer_care_link(){
		lp.clickonCustomer_care_link();
	}
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}

}
