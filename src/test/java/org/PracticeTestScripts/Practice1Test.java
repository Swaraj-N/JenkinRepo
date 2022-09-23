package org.PracticeTestScripts;

import org.Practice_GenericUtility.WebUtilDummy;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1Test {

	@Test
	public void practiceScript1()
	{
		String browser = System.getProperty("b");
		String url = System.getProperty("u");
		Reporter.log("Script1",true);
		WebUtilDummy wdu=new WebUtilDummy();
		WebDriver driver = wdu.launchTheBrowser(browser);
		wdu.openTheApplication(driver, url);
	}
}
