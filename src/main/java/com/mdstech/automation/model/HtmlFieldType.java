package com.mdstech.automation.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum HtmlFieldType {
	TYPE("type"), SELECT("select"), CLICK("click"), LINK("link"), SUGGEST("suggest");

	private String description;
	private static final Logger _LOGGER = LoggerFactory.getLogger(HtmlFieldType.class);
	private HtmlFieldType(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public static HtmlFieldType convertToType(final String description) {
		HtmlFieldType fieldType = null;
		for(final HtmlFieldType field : HtmlFieldType.values()) {
			if(field.getDescription().equals(description)) {
				fieldType = field;
			}
		}
		if(fieldType == null) {
			_LOGGER.error("Unsupported type: " + description);
		}
		return fieldType;
	}
}
