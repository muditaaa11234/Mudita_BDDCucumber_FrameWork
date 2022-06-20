package StepDefinations;

import org.testng.Assert;

import BasePage.Common;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1Step {
	
	@Before
	public void before_hook() {
		System.out.println("before");
	}
	
	@After
	public void after_hook() {
		System.out.println("after");
	} 
	@Given("user should be on home page")
	public void user_should_be_on_home_page() {
		System.out.println(LoginPage.assertt());
    
	}

	@Given("^user be able to enter the (.*)$")
	public void user_be_able_to_enter_the(String product) {
	   LoginPage.searchbar(product);
		System.out.println("2");
	}


@When("user should be search the item")
public void user_should_be_search_the_item() {
	LoginPage.searchbutton();
   System.out.println("3");
}

@Then("then user should be able to choose the required product")
public void then_user_should_be_able_to_choose_the_required_product() {
	
   System.out.println("4");   
}

	@Then("user is naigated to the home page")
	public void user_is_naigated_to_the_home_page() {
		LoginPage.LoginHomePage_Wait();
		Assert.assertEquals(LoginPage.assertt(), LoginPage.Authorized_HomePage_Title);
	}
//	@Then("window should close")
//	public void window_should_close() {
//		Common.driver_close();
//	}

	


}
