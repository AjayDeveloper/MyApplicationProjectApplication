package com.example.dto;

public class CustomsField {

	private String customsFld;

	public CustomsField() {
		
	}
	
	public CustomsField(String customsFld) {
		super();
		this.customsFld = customsFld;
	}

	public String getCustomsFld() {
		return customsFld;
	}

	public void setCustomsFld(String customsFld) {
		this.customsFld = customsFld;
	}

	@Override
	public String toString() {
		return "CustomsField [customsFld=" + customsFld + "]";
	}

}
