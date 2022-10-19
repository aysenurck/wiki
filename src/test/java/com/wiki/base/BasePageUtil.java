package com.wiki.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import java.io.File;
import java.io.IOException;

public class BasePageUtil<T> {

	protected WebDriver driver;

	public BasePageUtil(WebDriver driver) {
		this.driver = driver;
	}

	protected WebElement setObjectBy(By by, String value) {
		WebElement element = getElementBy(by);
		highLightElement(element);
		while(!element.getAttribute("value").equals("")){
				element.sendKeys(Keys.CONTROL,"a");
				element.sendKeys(Keys.DELETE);
			}
		element.sendKeys(value);
		return element;
	}

	protected void highLightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"color: red; border: 1px dashed red;");
	}

	protected WebElement clickObjectBy(By by) {
		WebElement element = driver.findElement(by);
		highLightElement(element);
		element.click();
		return element;
	}

	public WebElement getElementBy(By by) {
		return driver.findElement(by);
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public WebElement scrollElementBy(By by){
		WebElement element = driver.findElement(by);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		return element;
	}

	public String captureScreen() {
		String path;
		try {
			WebDriver augmentedDriver = new Augmenter().augment(driver);
			File source = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
			path = "./target/screenshots/" + source.getName();
			FileUtils.copyFile(source, new File(path));
		}
		catch(IOException e) {
			path = "Failed to capture screenshot: " + e.getMessage();
		}
		return path;
	}

}

