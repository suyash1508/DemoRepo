package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	
	
	@Given("user is on Amazon landing page")
	public void user_is_on_amazon_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on Amazon landing page");
	    
	}

	@Given("Sign in button is present on screen")
	public void sign_in_button_is_present_on_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Sign in button is present on screen");
	}
	
	@When("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user clicks on Sign in button");
	}

	@Then("user is displayed login screen")
	public void user_is_displayed_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user is displayed login screen"); 
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("user enters " + string +" in username field");
	}

	@When("user enters {string} in password And user clicks Sign in button")
	public void user_enters_in_password_and_user_clicks_sign_in_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user enters " +string + " in password And user clicks Sign in button");
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is on home page");
	}

	@Then("title of home page is {string}")
	public void title_of_home_page_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("title of home page is: " + string);
	}

	@Then("Sign in button is not present")
	public void sign_in_button_is_not_present() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Sign in button is not present");
	}
		
	
	

}
