package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import extension.seleniumFramework.ExtendedWebElement;

public class BasePage {

	protected WebDriver webDriver;
	public BasePage(WebDriver webDriver) {
		// TODO Auto-generated constructor stub
	this.webDriver=webDriver;
	}
	
	protected WebElement getElementByCSS(String selector) {
		return getElement(By.cssSelector(selector));
	}
	
	protected WebElement getElementByXpath(String selector) {
		return getElement(By.xpath(selector));
	}
	
	protected List<WebElement> getElementListByXpath(String selector) {
		return getElements(By.xpath(selector));
	}
	
	protected WebElement getElementByName(String selector) {
		return getElement(By.name(selector));
	}
	
	protected WebElement getElementById(String selector) {
		return getElement(By.id(selector));
	}
	
	private WebElement getElement(By locator) {
		return new ExtendedWebElement(this.webDriver, locator);
	}
	
	private List<WebElement> getElements(By locator) {
		return new ExtendedWebElement(this.webDriver, locator).findElements(locator);
	}
	
	
}
