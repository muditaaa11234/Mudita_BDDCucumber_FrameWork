package pages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePage.Common;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;

public class BaseTestPage  extends AbstractTestNGCucumberTests{
	public TestNGCucumberRunner testng;
	
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String name) throws IOException {
		testng = new TestNGCucumberRunner(getClass());
		Common.OpenUrl(name);
		Common.Start_Report();
	}
	@Test
	public void test1() {
		Assert.assertTrue(false);
	}
	
	@Test(enabled = false)
	public void test2() {
		Common.alert();
	}
	@Test(enabled =  false)
	public void test3() {
		Common.drpdown();
	}
	
	@Test(enabled =  false)
	public void test4() {
		Common.iframe();
	}
	@AfterMethod
	public void AfteerMethod(ITestResult result) {
		try {
			Common.afterMethod(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@AfterTest
	public void afterTest() {
		Common.End_Report();
		Common.driver_close();
	}
}
