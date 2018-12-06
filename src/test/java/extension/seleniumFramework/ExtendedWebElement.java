package extension.seleniumFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class ExtendedWebElement implements WebElement {
	
	private WebDriver webDriver;
	private By locator;
	
	public ExtendedWebElement(WebDriver webDriver,By locator) {
		// TODO Auto-generated constructor stub
		this.webDriver=webDriver;
		this.locator=locator;
	}

	public WebElement fetchElement()  {
	return WebElementHelper.waitOnElement(webDriver, locator);	
	}
	
	public void waitForFrameworkToBeReady() {
	//WebElementHelper.waitOnScriptedCondition(webDriver,"return window.waitFrameworkReady()");	
	}
	
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	public void click() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		fetchElement().click();
	}

	public void submit() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		fetchElement().submit();
	}

	public void sendKeys(CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		fetchElement().sendKeys(keysToSend);
	}

	public void clear() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		fetchElement().clear();
	}

	public String getTagName() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().getTagName();
	}

	public String getAttribute(String name) {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().getAttribute(name);
	}

	public boolean isSelected() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().isSelected();
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().isEnabled();
	}

	public String getText() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().getText();
	}

	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().findElements(by);
	}

	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().findElement(by);
	}

	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().isDisplayed();
	}

	public Point getLocation() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().getLocation();
	}

	public Dimension getSize() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().getSize();
	}

	public Rectangle getRect() {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().getRect();
	}

	public String getCssValue(String propertyName) {
		// TODO Auto-generated method stub
		waitForFrameworkToBeReady();
		return fetchElement().getCssValue(propertyName);
	}

}
