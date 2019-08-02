package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	@Given("^I am not logged in as administrator$")
	public void i_am_not_logged_in_as_administrator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("^I fill in the details$")
	public void i_fill_in_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^I complete action$")
	public void i_complete_action(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    System.out.println(arg1.raw());
	}

	@When("^I press \"([^\"]*)\"$")
	public void i_press(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should be on the administrative page$")
	public void i_should_be_on_the_administrative_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@When("^I click \"([^\"]*)\"$")
	public void i_click(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}
}
