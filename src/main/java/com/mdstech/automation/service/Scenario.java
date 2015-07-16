package com.mdstech.automation.service;

import org.openqa.selenium.WebDriver;

import com.mdstech.automation.model.HtmlField;

public interface Scenario {
	void execute(final String url, final WebDriver webDriver, final HtmlField... fields);
}
