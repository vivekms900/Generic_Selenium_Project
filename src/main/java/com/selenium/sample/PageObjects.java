package com.selenium.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	@FindBy(xpath = "//*[@class=\"hm-icon nav-sprite\"]")
	private WebElement All;
	
	@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2\"]")
	private WebElement BestSellers;
	
	@FindBy(xpath="//div[contains(text(),'American Tourister Casual Backpack')]")
	private WebElement AmTour;
	
	@FindBy(xpath="//input[contains(@id,'add-to-cart-button')]")
	private WebElement addtocart;
	
	@FindBy(xpath="//input[contains(@name,'submit.buy-now')]")
	private WebElement buynow;
	
	public WebElement getAll() {
		return All;
	}

}
