package com.mdstech.automation.service.impl;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdstech.automation.model.HtmlField;
import com.mdstech.automation.model.HtmlFieldType;
import com.mdstech.automation.service.Scenario;

public class ScenarioImpl implements Scenario {

	private static final Logger _LOGGER = LoggerFactory.getLogger(ScenarioImpl.class);

	@Override
	public void execute(final String url, final WebDriver webDriver, final HtmlField... fields) {
		_LOGGER.trace("Received execute method request", (Object[])fields);
		webDriver.get(url);

		for(final HtmlField htmlField : fields) {
			if(htmlField.getHtmlFieldType() == HtmlFieldType.TYPE) {
				new TypeFieldHandler().getElement(webDriver, htmlField);
			}
			else if(htmlField.getHtmlFieldType() == HtmlFieldType.LINK) {
				new LinkFieldHandler().getElement(webDriver, htmlField);
			}
			else if(htmlField.getHtmlFieldType() == HtmlFieldType.CLICK) {
				new SubmitFieldHandler().getElement(webDriver, htmlField);
			}
		}
		_LOGGER.trace("Done execute method request", (Object[])fields);

	}

}
