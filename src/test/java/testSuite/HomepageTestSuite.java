package testSuite;


import org.junit.Assert;

import helper.Config;
import helper.Utils;
import io.cucumber.java.en.*;

import pages.HomePage;
import pages.TVetMEDIA;

public class HomepageTestSuite {
	
	
	
	@Given("user is on homepage")
	public void user_is_on_homepage() throws Exception {
		
		Config.chonfchrome();
		Config.maximizewindow();
		Config.driver.get(Utils.getProperty("web_portal_link"));
	   
	}

	
   @When("user moushover on menu {string}")
	public void user_moushover_on_menu(String menuName) throws Exception {
	   HomePage home= new HomePage ();
	   home.moushoverOnMenu(menuName);
	   
	}

	@When("user click on submenu {string}")
	public void user_click_on_submenu(String subMenu) {
		HomePage home= new HomePage ();
		home.clickOnsubmenu(subMenu);
	   
	}

	@Then("user is directed to submenu page {string}")
	public void user_is_directed_to_submenu_page(String expectedMessage) {
		
		TVetMEDIA page= new TVetMEDIA ();
		String actualMessage=page.verifMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
	   
	}

}
