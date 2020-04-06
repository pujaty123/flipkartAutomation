package com.flipkart.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.genericlib.Utility;

public class HomePage {
	@FindBy(xpath = "")
	private WebElement cancelbtn;

	public WebElement getcancel() {
		return cancelbtn;
	}

	@FindBy(xpath = "//span[text()='Women']")
	private WebElement womens;

	public WebElement getwomens() {
		if (womens.isDisplayed()) {
			return womens;
		} else {
			Utility.pageLoadWait(5);
		}
		return womens;
	}
}
