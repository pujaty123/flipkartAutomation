package com.flipkart.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.genericlib.Base;
import com.flipkart.objectRepository.HomePage;
import com.flipkart.objectRepository.PersonalDetail;
import com.flipkart.objectRepository.ProductPage;

public class AddProduct extends Base {
	public HomePage hp;
	public ProductPage pp;
	public PersonalDetail pd;

	@Test
	public void addProductTest() {
		hp = PageFactory.initElements(driver, HomePage.class);
		pp = PageFactory.initElements(driver, ProductPage.class);
		pd = PageFactory.initElements(driver, PersonalDetail.class);
		hp.getcancel().click();
		hp.getwomens().click();
		pp.product(driver);
		
		String Firstname = flib.getExcelData("sheet1", 0, 1);
		String Lastname = flib.getExcelData("sheet1", 1, 1);
		pd.personalDetail(Firstname, Lastname);

	}
}