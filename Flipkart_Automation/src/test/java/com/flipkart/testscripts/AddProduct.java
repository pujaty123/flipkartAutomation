package com.flipkart.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.genericlib.Base;
import com.flipkart.genericlib.Utility;
import com.flipkart.objectRepository.HomePage;
import com.flipkart.objectRepository.PersonalDetail;
import com.flipkart.objectRepository.ProductPage;

public class AddProduct extends Base {
	public HomePage homePage;
	public ProductPage productPage;
	public PersonalDetail personalDetail;

	@Test
	public void addProductTest() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		productPage = PageFactory.initElements(driver, ProductPage.class);
		personalDetail = PageFactory.initElements(driver, PersonalDetail.class);
		homePage.enterUserName(Utility.getUserName());
		homePage.enterPassword(Utility.getPassword());
		homePage.clickLogin();
		homePage.getwomens().click();
		productPage.getProducts().click();
		productPage.getKurta().click();
		productPage.getWishlist(driver).click();
		personalDetail.getProfile(driver).click();
		personalDetail.getedit().click();
		personalDetail.personalDetail(Utility.getFirstName(), Utility.getLastName());
		personalDetail.getSavebtn().click();

	}
}