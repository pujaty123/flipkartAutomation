package com.flipkart.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.genericlib.Utility;

public class HomePage {
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement cancelbtn;

	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']/../..//input")
	private WebElement usernameTextbox;

	@FindBy(xpath = "//span[text()='Enter Password']/../..//input")
	private WebElement passwordTextbox;

	@FindBy(xpath = "//span[text()='Login']/..//div/..")
	private WebElement loginButton;

	public void enterUserName(String username) {
		Utility.pageLoadWait(2);
		usernameTextbox.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordTextbox.sendKeys(password);
	}

	public void clickLogin() {
		loginButton.click();
		Utility.pageLoadWait(5);
	}

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
