package stepDefination;

import baseLayer.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.loginPage;
import utilityLayer.WebElementHelper;

public class LoginStep {
	loginPage login;

	@Given("user should open browser")
	public void user_should_open_browser() throws Exception {
		baseClass.initialization();

	}

	@When("user enter valid Username as {string} and Password as {string}")
	public void user_enter_valid_username_as_and_password_as(String Username, String Password) {

		login = new loginPage();
		login.loginFunctioanlity(Username, Password);
	}
	

	@Then("user click on login button")
	public void user_click_on_login_button() {

		login.loginButtonFunctionality();
	}

}
