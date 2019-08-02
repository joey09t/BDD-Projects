package stepDefiniton1;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestData {
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("given");
	    
	}

	@When("^User Navigate to Login Page$")
	public void user_Navigate_to_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("navigate");
	}

	@When("^User enters Credentials to Login$")
	public void user_enters_Credentials_to_Login(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    System.out.println(arg1.raw());
	}

	@Then("^Message displayed LOgin Successful$")
	public void message_displayed_LOgin_Successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("successful");
	}

}
