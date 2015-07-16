package com.mdstech.automation.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class HtmlField implements Serializable {

	private static final long	serialVersionUID	= -8828956748189925586L;

	private HtmlFieldType htmlFieldType;
	private String name;
	private FieldSelector fieldSelector;
	private String value;
	private String relativeURI;

	public HtmlField(final HtmlFieldType htmlFieldType, final String name,
			final FieldSelector fieldSelector, final String value, final String relativeURI) {
		super();
		this.htmlFieldType = htmlFieldType;
		this.name = name;
		this.fieldSelector = fieldSelector;
		this.value = value;
		this.relativeURI = relativeURI;
	}

	public HtmlFieldType getHtmlFieldType() {
		return htmlFieldType;
	}
	public void setHtmlFieldType(final HtmlFieldType htmlFieldType) {
		this.htmlFieldType = htmlFieldType;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public FieldSelector getFieldSelector() {
		return fieldSelector;
	}
	public void setFieldSelector(final FieldSelector fieldSelector) {
		this.fieldSelector = fieldSelector;
	}
	public String getValue() {
		return value;
	}
	public void setValue(final String value) {
		this.value = value;
	}

	public String getRelativeURI() {
		return relativeURI;
	}
	public void setRelativeURI(final String relativeURI) {
		this.relativeURI = relativeURI;
	}
	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this);
		builder.append("htmlFieldType", htmlFieldType);
		builder.append("name", name);
		builder.append("fieldSelector", fieldSelector);
		builder.append("value", value);
		builder.append("relativeURI", relativeURI);
		return builder.toString();
	}
}
