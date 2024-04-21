package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class MaisonConnecte {
	
	@FindBy (xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/p/span")
	WebElement sortBtn;
	
	@FindBy (xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/div/ul/li[2]/label")
	WebElement sortTypeBtn;
	
	@FindBy (xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div[11]/div/div[2]")
	WebElement product;
	
	public MaisonConnecte() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickToSort() {
		
		sortBtn.click();
		sortTypeBtn.click();
		
	}
	
	public void selectProduct() {
		
		product.click();
		
	}

}
