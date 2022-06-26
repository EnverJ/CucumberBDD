package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("uer is on the login page")
	public void uer_is_on_the_login_page() {
		System.out.println("Inside step- User is on login page");
		throw new io.cucumber.java.PendingException();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside step- User Enter username and password");
		throw new io.cucumber.java.PendingException();
	}

	@And("clicks on loginbutton")
	public void clicks_on_loginbutton() {
		System.out.println("Inside step- User click on login button");
		throw new io.cucumber.java.PendingException();
	}

	@Then("user naviagte to the homepage")
	public void user_naviagte_to_the_homepage() {
		System.out.println("Inside step- User is on the Homepage");
		throw new io.cucumber.java.PendingException();
	}

}
