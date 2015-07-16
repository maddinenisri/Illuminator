package com.mdstech.automation.service.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdstech.automation.model.FieldSelector;
import com.mdstech.automation.model.HtmlField;

public class LinkFieldHandler implements FieldHandler {

	private static final Logger _LOGGER = LoggerFactory.getLogger(LinkFieldHandler.class);

	@Override
	public WebElement getElement(final WebDriver webDriver, final HtmlField htmlField) {
		WebElement webElement = null;
		if(htmlField.getFieldSelector() == FieldSelector.ID) {
			webElement = webDriver.findElement(By.id(htmlField.getName()));
		}
		else if(htmlField.getFieldSelector() == FieldSelector.NAME) {
			webElement = webDriver.findElement(By.name(htmlField.getName()));
		}
		else if(htmlField.getFieldSelector() == FieldSelector.CSS) {
			webElement = webDriver.findElement(By.cssSelector(htmlField.getName()));
		}
		else if(htmlField.getFieldSelector() == FieldSelector.XPATH) {
			webElement = webDriver.findElement(By.xpath(htmlField.getName()));
		}
		if(webElement != null) {
			webElement.click();
		}
		else {
			_LOGGER.debug("Field not found for "+htmlField);
		}
		return webElement;
	}

}
