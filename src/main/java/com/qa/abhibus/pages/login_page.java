package com.qa.abhibus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.abhibus.base.TestBase;

public class login_page extends TestBase {
	@FindBy(xpath="//a[@class='open']")
	WebElement login_signup_Link;
	@FindBy(xpath="/html/body/header/div/div[2]/a[1]/span")
	WebElement Hotel_link;
	@FindBy(xpath="//html/body/header/div/div[2]/a[2]")
	WebElement Offers_link;
	@FindBy(xpath="//html/body/header/div/div[2]/a[3]")
	WebElement Print_ticket_link;
	@FindBy(xpath="//html/body/header/div/div[2]/a[4]")
	WebElement Cancel_ticket_link;
	@FindBy(xpath="//html/body/header/div/div[3]/a[1]/span[@id='cCare_city']")
	WebElement Customer_care_link;
	//pageFactory
	public login_page(){
		PageFactory.initElements(driver, this);
	}
	//Actions
	public  boolean validatelogin_signupbtn(){
		return login_signup_Link.isDisplayed();
	}
	
	public  boolean validateHotel_link(){
		return Hotel_link.isDisplayed();
	}
	
	public  boolean validateOffers_link(){
		return Offers_link.isDisplayed();
	}
	
	public  boolean validatePrint_ticket_link(){
		return Print_ticket_link.isDisplayed();
	}
	
	public  boolean validateCancel_ticket_link(){
		return Cancel_ticket_link.isDisplayed();
	}
	
	public  boolean validateCustomer_care_link(){
		return Customer_care_link.isDisplayed();
	}
	
	public sign_up clickOnlogin_signup_Link(){
		login_signup_Link.click();
		return new sign_up();
	}
	public Hotels_page clickOnhotel_link(){
		Hotel_link.click();
		return new Hotels_page();
		
	}
	public offers_page clickonOffers_link(){
		Offers_link.click();
		return new offers_page();
	}
	
	public print_ticket_page clickonPrint_ticket_link(){
		Print_ticket_link.click();
		return new print_ticket_page();
	
	}
	public cancel_ticket_page clickoncancel_ticket_link(){
		Cancel_ticket_link.click();
		return new cancel_ticket_page();
	}
	public customercare_page clickonCustomer_care_link(){
		Customer_care_link.click();
		return new customercare_page();
	}
	}
