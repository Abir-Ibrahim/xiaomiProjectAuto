package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ShoppingCartPage {
	
	@FindBy (xpath="/html/body/div[3]/div[3]/div[2]/div[1]/div/div[2]/a[2]")
	WebElement verifi;
	
	public ShoppingCartPage () {
		
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public String verification () {
		
		String actualmessage=verifi.getText();
		return actualmessage;
		
	}

}
