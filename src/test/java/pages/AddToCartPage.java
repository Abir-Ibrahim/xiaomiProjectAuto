package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class AddToCartPage {
	
	@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement addBtn;
	
	@FindBy (xpath="/html/body/div[3]/div[1]")
	WebElement shoppingCartBtn;
	
	@FindBy (xpath="/html/body/div[3]/div[3]/div[2]/div[1]/div/div[2]/a[2]")
	WebElement shoppingcartConsultBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
public void add () {
	
	addBtn.click();
	
}
	
public void shoppingcart () throws Exception {
	Thread.sleep(5000);
	shoppingCartBtn.click();
	Thread.sleep(5000);
	//shoppingcartConsultBtn.click();
	
}
	
}
