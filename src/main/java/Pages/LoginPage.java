package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.Common;

public class LoginPage {
	
	public static WebDriver driver = Common.driver;
	public static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static String Authorized_HomePage_Title = "Nike. Just Do It. Nike IN";
	
		public static void LoginHomePage_Wait() {
			wait.until(ExpectedConditions.visibilityOf(LoginPage.search(driver)));
		}
	
		public static WebElement search(WebDriver driver) {
			return driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		}
		public static void searchbar(String product) {
			LoginPage.search(driver).sendKeys(product);
		} 
		
		public static WebElement Searchbutton(WebDriver driver) {
			return driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		}
		public static void searchbutton() {
			wait.until(ExpectedConditions.elementToBeClickable(LoginPage.Searchbutton(driver)));
			LoginPage.Searchbutton(driver).sendKeys(Keys.ENTER);;
		}
		
		public static String assertt() {
			return driver.getTitle();
		}
		
		
	}

