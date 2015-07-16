package com.mdstech.automation.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum FieldSelector {
	ID("id"),NAME("name"),CSS("css"),XPATH("xpath");
	private String description;
	private static final Logger _LOGGER = LoggerFactory.getLogger(FieldSelector.class);
	private FieldSelector(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public static FieldSelector convertToType(final String description) {
		FieldSelector fieldType = null;
		for(final FieldSelector field : FieldSelector.values()) {
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
