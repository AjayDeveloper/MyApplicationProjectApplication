package com.example.entity;

public class Parcel {

	
	private SkuList skuList;
	
	private Long length;
	
	private Long width;
	
	private Long height;
	
	private Long weight;

	public Parcel() {
		
	}


	public Parcel(SkuList skuList, Long length, Long width, Long height, Long weight) {
		super();
		this.skuList = skuList;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	public SkuList getSkuList() {
		return skuList;
	}

	public void setSkuList(SkuList skuList) {
		this.skuList = skuList;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public Long getWidth() {
		return width;
	}

	public void setWidth(Long width) {
		this.width = width;
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Parcel [skuList=" + skuList + ", length=" + length + ", width=" + width + ", height=" + height
				+ ", weight=" + weight + "]";
	}
	
	

	
}
