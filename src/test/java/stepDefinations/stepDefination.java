package stepDefinations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

	 @Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	     //code to navigate to login url
		 
		System.out.println("Navigated to Login url");
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	     // code to login  
	    	System.out.println("Loggedin Successfully");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    // home page validation
	    	System.out.println("Validated home page");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	     //validating cards 
	    	System.out.println("Validated cards");
	    }
	
}
