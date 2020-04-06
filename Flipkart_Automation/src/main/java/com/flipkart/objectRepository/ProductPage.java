package com.flipkart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.genericlib.Utility;

public class ProductPage {
	public Utility util = new Utility();
	@FindBy(xpath = "//a[@title='Kurtas & Kurtis']")
	private WebElement Products;

	public WebElement getProducts() {
		return Products;
	}

	@FindBy(xpath = "//img[@class='_3togXc']")
	private WebElement Kurta;

	public WebElement getKurta() {
		return Kurta;
	}

	@FindBy(xpath = "//div[@class='DsQ2eg']")
	private WebElement Wishlist;

	public WebElement getWishlist(WebDriver driver) {
		util.switchToNewWindow(driver);
		return Wishlist;
	}

	public void product(WebDriver driver) {
		Products.click();
		Kurta.click();
		Wishlist.click();
	}
}
