package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	
	@Given("^User will select products$")
	public void user_will_select_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("select product");
		
	   // throw new PendingException();
	}
	
	
	@Given("^User will add products to cart$")
	public void user_will_add_products_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("add product");
	   // throw new PendingException();
	}

	
	
	@When("^User clicks on show cart$")
	public void user_clicks_on_show_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click show cart");
		
	   // throw new PendingException();
	}

	@Then("^show the list of products to user from cart$")
	public void show_the_list_of_products_to_user_from_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("show list");
	   // throw new PendingException();
	}

}
