package BasePage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.BrowserManager;
import Utility.ExtentRep;
import Utility.ReadProp;
import Utility.Screenshot;

public class Common {

	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest test;

	public static void OpenUrl(String name)  {
			try {
				driver = BrowserManager.BeforeExe(driver, ReadProp.BrowserName(name));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				driver.get(ReadProp.URL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void driver_close() {
		driver.close();
	}
	public static void Start_Report() {
		reports = ExtentRep.getIns();
		test = reports.startTest("started");
	}
	public static void End_Report() {
		reports.endTest(test);
		reports.flush();
	}

	public static void afterMethod(ITestResult res) throws IOException {
		if (res.getStatus() == res.FAILURE) {
			String path = Screenshot.takeSS(driver, res.getName());
			String imagepath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, res.getMethod().getMethodName(),imagepath);
		}else if (res.getStatus() == res.SUCCESS) {
			test.log(LogStatus.PASS, res.getMethod().getMethodName());
		}else {
			test.log(LogStatus.SKIP, res.getMethod().getMethodName());
		}
	}
	
	public static void alert() {
		driver.switchTo().alert().accept();		

	}
	
	public static void drpdown() {
		List<WebElement> list = driver.findElements(By.xpath("---")); 

		  System.out.println("Size: " + list.size());

		  for(WebElement W1 : list) { 
		  System.out.println(W1.getText());
		  
		  
		  
		  if( W1.getText().contains("Bags")){
		  W1.click();
		  break;
		  }
		  }

	}
	
	public static void iframe() {
		driver.switchTo().frame(null);
		
	}
}
