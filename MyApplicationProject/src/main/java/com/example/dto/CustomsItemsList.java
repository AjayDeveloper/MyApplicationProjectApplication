package com.example.dto;

public class CustomsItemsList {

	private CustomsItem customsItem;

	public CustomsItemsList() {
		
	}

	public CustomsItemsList(CustomsItem customsItem) {
		super();
		this.customsItem = customsItem;
	}

	public CustomsItem getCustomsItem() {
		return customsItem;
	}

	public void setCustomsItem(CustomsItem customsItem) {
		this.customsItem = customsItem;
	}

	@Override
	public String toString() {
		return "CustomsItemsList [customsItem=" + customsItem + "]";
	}

	
	
}
