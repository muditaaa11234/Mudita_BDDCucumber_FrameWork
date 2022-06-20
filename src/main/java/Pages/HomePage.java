package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.Common;

public class HomePage {
	public static WebDriver driver = Common.driver;
	public static WebDriverWait wait = new WebDriverWait(driver, 10);
	

	public static WebElement hoveron(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='__next']/div[2]/div[3]/div/div[1]/span"));
	}
	public static void HoverOnElement() {
		
		Actions act =new Actions(driver);
	    act.moveToElement(hoveron(driver)).click().perform();
	       
		
	}
	public static WebElement SearcheFeild(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='pre-search-contain']/div/input"));
	}
	public static void SearchFeild_Input(String input) {
		HomePage.SearcheFeild(driver).sendKeys(input);
	}
	public static void SearchFeild_Click() {
		HomePage.SearcheFeild(driver).click();
		
	}
	
	public static String assertt() {
		return driver.getTitle();
	}
	
	public static WebElement Username(WebDriver driver) {
		return driver.findElement(By.xpath("//form/div[2]/input"));
	}
	
	public static WebElement Password(WebDriver driver) {
		return driver.findElement(By.xpath("//form/div[3]/input"));
	}

}
