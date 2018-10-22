package com.uiFramework.companyName.ProjectName.testScripts.registration;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.uiFramework.companyName.ProjectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.ProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.companyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFramework.companyName.ProjectName.pageObject.LoginPage;
import com.uiFramework.companyName.ProjectName.pageObject.MyAccountPage;
import com.uiFramework.companyName.ProjectName.pageObject.RegistrationPage;
import com.uiFramework.companyName.ProjectName.testbase.TestBase;

/**
 * @author AD
 */
public class RegistrationTest extends TestBase{

	private final Logger log = LoggerHelper.getLogger(RegistrationTest.class);
	LoginPage loginPage;
	RegistrationPage register;
	MyAccountPage myAccountPage;

	@Test
	public void testRegistration(){
		// go to application
		getApplicationUrl(ObjectReader.reader.getUrl());

		loginPage = new LoginPage(driver);
		loginPage.clickOnSignInLink();
		loginPage.enterRegistrationEmail();

		register = loginPage.clickOnCreateAnAccount();

		// enter registration data
		register.setMrRadioButton();
		register.setFirstName("firstName");
		register.setLastname("lastname");
		register.setPassword("password");
		register.setAddress("address");
		register.setDay("5");
		register.setMonth("June");
		register.setYear("2017");
		register.setYourAddressFirstName("yourAddressFirstName");
		register.setYourAddressLastName("yourAddressLastName");
		register.setYourAddressCompany("yourAddressCompany");
		register.setYourAddressCity("yourAddressCity");
		register.setYourAddressState("Alaska");
		register.setYourAddressPostCode("99501");
		register.setMobilePhone("9999999999");
		register.setAddressAlias("addressAlias");
		register.clickRegistration();

		myAccountPage = new MyAccountPage(driver);
		boolean status = myAccountPage.isYourAccountPageMessage();

		AssertionHelper.updateTestStatus(status);
	}
}
