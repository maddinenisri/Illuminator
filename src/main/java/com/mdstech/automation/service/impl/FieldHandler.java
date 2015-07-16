package com.mdstech.automation.service.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mdstech.automation.model.HtmlField;

public interface FieldHandler {
	WebElement getElement(final WebDriver webDriver, final HtmlField htmlField);
}
