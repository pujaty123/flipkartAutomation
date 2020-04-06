package com.flipkart.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

	public FileLibrary flib = new FileLibrary();
	public WebDriver driver;
	public static WebDriver scrnDriver;
	public WebDriverWait wait;

	@BeforeClass
	public void configBC() {
		if (flib.getPropertyKeyValue("Browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
			driver = new ChromeDriver();
			scrnDriver = driver;
		} else if (flib.getPropertyKeyValue("Browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Resource/geckodriver.exe");
			driver = new FirefoxDriver();
			scrnDriver = driver;
		}
		driver.manage().window().maximize();
		System.out.println(flib.getPropertyKeyValue("url"));
		driver.get(flib.getPropertyKeyValue("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void configAC() {
		//driver.quit();
	}
}
