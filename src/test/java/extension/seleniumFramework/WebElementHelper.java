package extension.seleniumFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementHelper {
	
	private static final int ELEMENT_WAIT_TIME=50;
	private static final int SCRIPT_WAIT_TIME=100;
	
	public static WebElement waitOnElement(WebDriver webDriver,By locator) {
		return new WebDriverWait(webDriver, ELEMENT_WAIT_TIME).pollingEvery(5,TimeUnit.MILLISECONDS)
				.withMessage(String.format("Element %s not found",locator))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

	public static void waitOnScriptedCondition(WebDriver webDriver,String condition){
		new WebDriverWait(webDriver,SCRIPT_WAIT_TIME).pollingEvery(3,TimeUnit.MILLISECONDS)
		.withMessage("test")
		.until(scriptedCondition(condition));
	
	
	}
	
	public static ExpectedCondition<Boolean> scriptedCondition(String condition) {
        return driver -> Boolean.valueOf(((JavascriptExecutor) driver).executeScript(condition).toString());
    }
}
