package com.flipkart.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetail {
	@FindBy(xpath = "//div[text()='My Account']")
	private WebElement Account;

	public WebElement getAccount() {
		return Account;
	}

	@FindBy(xpath = "//div[text()='My Profile']")
	private WebElement Profile;

	public WebElement getProfile() {
		return Profile;

	}

	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement edit;

	public WebElement getedit() {
		return edit;

	}

	@FindBy(name = "firstName")
	private WebElement nameFS;

	public WebElement getNamefs() {
		return nameFS;
	}

	@FindBy(name = "lastName")
	private WebElement nameLS;

	public WebElement getNamels() {
		return nameLS;
	}

	@FindBy(xpath = "//button[text()='SAVE']")
	private WebElement Savebtn;

	public WebElement getSavebtn() {
		return Savebtn;
	}

	public void personalDetail(String firstname, String lastname) {
		edit.click();
		nameFS.sendKeys(firstname);
		nameLS.sendKeys(lastname);
		Savebtn.click();

	}

}
