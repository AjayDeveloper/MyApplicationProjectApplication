package com.example.dto;

import java.util.List;

public class SkuList {
	private List<Sku> skus = null;

	public SkuList() {
		
	}


	public SkuList(List<Sku> skus) {
		super();
		this.skus = skus;
	}

	public List<Sku> getSkus() {
	return skus;
	}

	public void setSkus(List<Sku> skus) {
	this.skus = skus;
	}

	@Override
	public String toString() {
		return "SkuList [skus=" + skus + "]";
	}
	
	
}
