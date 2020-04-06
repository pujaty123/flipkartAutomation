package com.flipkart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.genericlib.Utility;

public class PersonalDetail {
	@FindBy(xpath = "//div[text()='My Account']")
	private WebElement accountbtn;
	
	@FindBy(xpath="//*[@class='_34Yjv1']")
	private WebElement accountHoverbtn;

	public WebElement getAccount() {
		return accountbtn;
	}

	@FindBy(xpath = "//div[text()='My Profile']")
	private WebElement Profile;

	public WebElement getProfile(WebDriver driver) {
		Utility.movetoelement(driver, accountHoverbtn);
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
	private WebElement savebtn;

	public WebElement getSavebtn() {
		Utility.pageLoadWait(2);
		return savebtn;
	}

	public void personalDetail(String firstname, String lastname) {
		nameFS.clear();
		nameFS.sendKeys(firstname);
		nameLS.clear();
		nameLS.sendKeys(lastname);
	}

}
