package StepDefinations;

import java.io.IOException;

import Pages.HomePage;
import Pages.LoginPage;
import Utility.ReadProp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search1 {
	
	@Given("user on Home page")
	public void user_on_home_page() {
		System.out.println(HomePage.assertt());
	}
	
	@Given("hover on product")
	public void hover_on_product() {
		
		HomePage.HoverOnElement();
		System.out.println("2");
	    	}

	@Given("click on product")
	public void click_on_product() {
	System.out.println("3");   
	}

	@When("select the required product")
	public void select_the_required_product() {
		
	System.out.println("4");   
	}


	
	

}
