package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.ProductPage;

public class ProductsStep {

	static ProductPage productP;
	@When("user should sort the product as {string}")
	public void user_should_sort_the_product_as(String Psort) {
		productP = new ProductPage();
		 productP.sortProductByRangeFunctionality(Psort);
	    
	}

	@When("user should select {int} products")
	public void user_should_select_products(Integer Number) {
		productP.productChoserFunctionality(Number);
	    
	}

	@Then("user should click on shopping Cart Trolly")
	public void user_should_click_on_shopping_cart_trolly() {
	    
		productP.shoppingTrollyFunctionality();
	}
}
