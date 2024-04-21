package testSuite;

import org.junit.Assert;

import helper.Config;
import helper.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.ShoppingCartPage;

public class AddToCartTestSuite {
	
	
	
	@Given("user is on product page")
	public void user_is_on_product_page() throws Exception {
		
		Config.chonfchrome();
		Config.maximizewindow();
		Config.driver.get(Utils.getProperty("web_portal_link3"));
	    
	}

	@When("user add the product to cart")
	public void user_add_the_product_to_cart() {
		AddToCartPage page=new AddToCartPage();
		page.add();
	   
	}

	@When("click on shopping cart")
	public void click_on_shopping_cart() throws Exception {
		AddToCartPage page=new AddToCartPage();
		page.shoppingcart();
	  
	}

	@Then("user is directed to the cart page that contains the product selected {string}")
	public void user_is_directed_to_the_cart_page_that_contains_the_product_selected(String expectedmessage) {
		
		ShoppingCartPage cart= new ShoppingCartPage();
		String actualmessage=cart.verification();
		Assert.assertEquals(expectedmessage, actualmessage);
	   
	}

}
