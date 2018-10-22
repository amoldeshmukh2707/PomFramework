package com.uiFramework.companyName.ProjectName.testScripts.loginPage;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.uiFramework.companyName.ProjectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.ProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.companyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFramework.companyName.ProjectName.pageObject.LoginPage;
import com.uiFramework.companyName.ProjectName.testbase.TestBase;
/**
 *
 * @author AD
 */
public class LoginTest extends TestBase{
	private final Logger log = LoggerHelper.getLogger(LoginTest.class);

	@Test(description="Login test with valid credentials")
	public void testLoginToApplication(){
		getApplicationUrl(ObjectReader.reader.getUrl());

		LoginPage loginPage = new LoginPage(driver);

		loginPage.loginToApplication(ObjectReader.reader.getUserName(), ObjectReader.reader.getPassword());

		boolean status = loginPage.verifySuccessLoginMsg();

		AssertionHelper.updateTestStatus(status);
	}
}
