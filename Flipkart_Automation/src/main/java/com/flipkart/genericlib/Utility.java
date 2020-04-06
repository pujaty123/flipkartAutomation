package com.flipkart.genericlib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {
	public static FileLibrary fileLibrary = new FileLibrary();

	public static void pageLoadWait(int sec) {
		try {
			Thread.sleep((sec * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getFirstName() {
		return fileLibrary.getPropertyKeyValue("firstname");
	}

	public static String getLastName() {
		return fileLibrary.getPropertyKeyValue("lastname");
	}

	public static String getPassword() {
		return fileLibrary.getPropertyKeyValue("password");
	}

	public static String getUserName() {
		return fileLibrary.getPropertyKeyValue("username");
	}

	public static void movetoelement(WebDriver driver, WebElement webelement) {
		Actions act = new Actions(driver);
		act.moveToElement(webelement).perform();
	}

	public String switchToNewWindow(WebDriver driver) {
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		String pid = it.next();
		String cid = it.next();

		driver.switchTo().window(cid);
		return pid;
	}

}
