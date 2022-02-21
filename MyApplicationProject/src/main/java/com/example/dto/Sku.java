package com.example.dto;

public class Sku {

	private Long sku;
	
	private Long qty;

	public Sku() {
		
	}

	
	public Sku(Long sku, Long qty) {
		super();
		this.sku = sku;
		this.qty = qty;
	}

	public Long getSku() {
	return sku;
	}

	public void setSku(Long sku) {
	this.sku = sku;
	}

	public Long getQty() {
	return qty;
	}

	public void setQty(Long qty) {
	this.qty = qty;
	}
	@Override
	public String toString() {
		return "Sku [sku=" + sku + ", qty=" + qty + "]";
	}

	
	
}
