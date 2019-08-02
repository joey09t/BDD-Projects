package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestOutline {
	@Given("^I have a calculator$")
	public void i_have_a_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			    //throw new PendingException();
	}

	@When("^I add -(\\d+) and (\\d+)$")
	public void i_add_and1(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("added"+ arg1 +"AND" +arg2);
	    //throw new PendingException();
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be1(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("result is" + arg1);
	    //throw new PendingException();
	}

	@When("^I add (\\d+) and (\\d+)$")
	public void i_add_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("added"+ arg1 +"AND" +arg2);

	    //throw new PendingException();
	}



}
