package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App { //TODO: change name...
	
	/**
	 * Runs Selenium-powered application
	 * @param args
	 */
	public static void main(String[] args){
		
		testReserveAmerica();
//		findSeleniumOnGoogleAndWikipedia();
	}
	
	/**
	 * Opens ReserveAmerica site and clicks through various tabs
	 */
	public static void testReserveAmerica(){
		BrowserObject bo = new BrowserObject();
		WebDriver wd = bo.getWebDriver();
		bo.openWebPage(wd, "http://www.reserveamerica.com");
		bo.clickElementById(wd, "MyAccount");
		bo.clickElementById(wd, "Licenses");
		bo.clickElementById(wd, "GearStore");
		bo.clickElementById(wd, "CampgroundMap");
		bo.clickElementById(wd, "MarketingSpot");

	}
	
	/**
	 * This is a test method. It opens Google's homepage and searches for 'selenium'
	 */
	public static void findSeleniumOnGoogleAndWikipedia(){
		WebDriver google = new FirefoxDriver();	// Opens new Firefox window
		google.get("http://www.google.com");	// Opens Google
		
		WebDriver wiki = new FirefoxDriver();	// Opens new Firefox window
		wiki.get("http://en.wikipedia.com");	// Opens Wikipedia
		
		// Searches Google for "selenium"
		WebElement inputG = google.findElement(By.id("gbqfq"));
		StringBuffer bufferG = new StringBuffer("selenium");
		CharSequence csG = bufferG;
		inputG.sendKeys(csG);
		
		// Searches Wikipeida for "selenium"
		WebElement inputW = wiki.findElement(By.id("searchInput"));
		StringBuffer bufferW = new StringBuffer("selenium");
		CharSequence csW = bufferW;
		inputW.sendKeys(csW);
		
		inputG.sendKeys(Keys.RETURN);	// Simulates 'ENTER' keypress
		
		inputW.sendKeys(Keys.RETURN);	// Simulates 'ENTER' keypress
	}
	
}