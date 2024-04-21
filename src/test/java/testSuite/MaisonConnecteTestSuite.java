package testSuite;

import org.junit.Assert;

import helper.Config;
import helper.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MaisonConnecte;
import pages.ProductPage;


public class MaisonConnecteTestSuite {
	
	
	
	@Given("user is on products page")
	public void user_is_on_products_page() throws Exception {
		
		Config.chonfchrome();
		Config.maximizewindow();
		Config.driver.get(Utils.getProperty("web_portal_link2"));
	    
	}

	@When("user sorts product by popularity")
	public void user_sorts_product_by_popularity() {
		MaisonConnecte page=new MaisonConnecte();
		page.clickToSort();
	  
	}

	@When("click on product {string}")
	public void click_on_product(String string) {
		MaisonConnecte page=new MaisonConnecte();
		page.selectProduct();
	    
	}

	@Then("user is directed to product page {string}")
	public void user_is_directed_to_product_page(String expectedmessage) {
	    
		ProductPage product=new ProductPage();
		String actualmessage=product.verifStatement();
		Assert.assertEquals(expectedmessage, actualmessage);
		
		
	}


}
