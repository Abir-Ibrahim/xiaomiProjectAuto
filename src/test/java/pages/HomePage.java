package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePage {
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div")
	List<WebElement> submenus;
	
	public HomePage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void moushoverOnMenu (String menuName) throws Exception {
		Thread.sleep(6000);
		System.out.println("test2");
		try {
		for(WebElement menu:menus) {
			System.out.println(menu.getText());
			System.out.println("test");
			if(menu.getText().contains(menuName)) {
				Config.actions=new Actions (Config.driver);
				Config.actions.moveToElement(menu).perform();
			}
		}
		}catch(Exception e) {
			
		}

	
	}
	
	public void clickOnsubmenu (String subMenu) {
		for(WebElement submenu:submenus) {
			if(submenu.getText().contains(subMenu)) {
					submenu.click();
			}
		}
	}
	


}
