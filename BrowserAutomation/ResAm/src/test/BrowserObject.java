package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserObject {
	private WebDriver wd = null;
	
	/**
	 * Creates a ReserveAmerica object 
	 */
	public BrowserObject(){
		wd = getWebDriver();
	}
	
	/**
	 * Opens the specified web page using the specified WebDriver
	 * 
	 * @param webDriver WebDriver to use
	 * @param url Page Url to opan
	 * @return WebDriver context
	 */
	public WebDriver openWebPage(WebDriver webDriver, String url){
		webDriver.get(url);
		return webDriver;
	}
	
	/**
	 * Finds specified element and clicks it
	 * 
	 * @param webDriver WebDriver object to use
	 * @param id Id of web element to click
	 */
	public void clickElementById(WebDriver webDriver, String id){
		WebElement input = webDriver.findElement(By.id(id));
		input.click();
	}
	
	/**
	 * @return WebDriver object context
	 */
	public WebDriver getWebDriver(){
		if(null == wd){
			wd = new FirefoxDriver();
		}
		return wd;
	}
}
