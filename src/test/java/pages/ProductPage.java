package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ProductPage {
	
	@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verif;
	
	public ProductPage () {
		
		PageFactory.initElements(Config.driver,this);
		
	}
	
	public String verifStatement () {
		
		String actualmessage=verif.getText();
		return actualmessage;
	}

}
