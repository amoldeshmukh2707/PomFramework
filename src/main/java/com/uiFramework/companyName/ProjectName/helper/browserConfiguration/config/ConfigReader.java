package com.uiFramework.companyName.ProjectName.helper.browserConfiguration.config;

import com.uiFramework.companyName.bhanuProjectName.helper.browserConfiguration.BrowserType;
/**
 *
 * @author AD
 *
 */
public interface ConfigReader {

	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
	public String getUserName();
	public String getPassword();

}
