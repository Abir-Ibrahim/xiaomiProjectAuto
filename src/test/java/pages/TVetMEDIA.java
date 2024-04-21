package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class TVetMEDIA {
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verif;
	
	public TVetMEDIA () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifMessage() {
		String actualMessage= verif.getText();
		return actualMessage;
		
	}


}
