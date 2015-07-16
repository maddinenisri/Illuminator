package com.mdstech.automation.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mdstech.automation.model.FieldSelector;
import com.mdstech.automation.model.HtmlField;
import com.mdstech.automation.model.HtmlFieldType;
import com.mdstech.automation.service.impl.ScenarioImpl;


@RunWith(JUnit4.class)
public class ScenarioTest {

	private WebDriver webDriver;
	private Scenario scenario;

	@Before
	public void setup() {
		webDriver = new FirefoxDriver();
	}

	@Test
	public void testScenario() {
		scenario = new ScenarioImpl();
		final HtmlField[] htmlFields = new HtmlField[2];

		htmlFields[0] = new HtmlField(HtmlFieldType.TYPE, "q", FieldSelector.NAME, "Srinivasa Maddineni", null);
		htmlFields[1] =  new HtmlField(HtmlFieldType.CLICK, "gbqfba", FieldSelector.ID, "Srinivasa Maddineni", null);
		scenario.execute("http://www.google.com", webDriver, htmlFields);
	}

	@Test
	public void testScenarioInsuranceURL() {
		scenario = new ScenarioImpl();
		final HtmlField[] htmlFields = new HtmlField[3];

		htmlFields[0] = new HtmlField(HtmlFieldType.TYPE, "j_username", FieldSelector.NAME, "user", null);
		htmlFields[1] = new HtmlField(HtmlFieldType.TYPE, "j_password", FieldSelector.NAME, "demo", null);
		htmlFields[2] =  new HtmlField(HtmlFieldType.CLICK, "btn-success", FieldSelector.CSS, "Submit", null);
		scenario.execute("http://ibisistech.com/MotorProduct/", webDriver, htmlFields);
	}

	@After
	public void tearDown() {
		webDriver.quit();
	}
}
