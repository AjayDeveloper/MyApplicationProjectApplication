package com.example.entity;

public class CustomsItem {

	private String description;

	private Long printedCommodityIdentifier;

	private Long quantity;

	private Long weight;

	private Long value;

	private Long hsTariffNumber;

	private String originCountry;
	
	public CustomsItem() {
		
	}


	public CustomsItem(String description, Long printedCommodityIdentifier, Long quantity, Long weight, Long value,
			Long hsTariffNumber, String originCountry) {
		super();
		this.description = description;
		this.printedCommodityIdentifier = printedCommodityIdentifier;
		this.quantity = quantity;
		this.weight = weight;
		this.value = value;
		this.hsTariffNumber = hsTariffNumber;
		this.originCountry = originCountry;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrintedCommodityIdentifier() {
		return printedCommodityIdentifier;
	}

	public void setPrintedCommodityIdentifier(Long printedCommodityIdentifier) {
		this.printedCommodityIdentifier = printedCommodityIdentifier;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public Long getHsTariffNumber() {
		return hsTariffNumber;
	}

	public void setHsTariffNumber(Long hsTariffNumber) {
		this.hsTariffNumber = hsTariffNumber;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	@Override
	public String toString() {
		return "CustomsItem [description=" + description + ", printedCommodityIdentifier=" + printedCommodityIdentifier
				+ ", quantity=" + quantity + ", weight=" + weight + ", value=" + value + ", hsTariffNumber="
				+ hsTariffNumber + ", originCountry=" + originCountry + "]";
	}

}
