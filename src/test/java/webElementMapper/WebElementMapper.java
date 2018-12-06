package webElementMapper;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

public abstract class WebElementMapper {
	protected HashMap<String , WebElement> elementMap;
	
	protected WebElement mapStringToWebElement(String webElement) {
		return elementMap.get(webElement);
	}
	protected abstract HashMap<String, WebElement> init();

}
