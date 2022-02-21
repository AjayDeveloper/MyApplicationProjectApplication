package com.example.dto;

public class Options {

	
	private String label_Date;
	
	private String saturday_Delivery;
	
	private String dry_Ice_Wt;
	
	private String label_Img;

	public Options() {
	
	}

	public Options(String label_Date, String saturday_Delivery, String dry_Ice_Wt, String label_Img) {
		super();
		this.label_Date = label_Date;
		this.saturday_Delivery = saturday_Delivery;
		this.dry_Ice_Wt = dry_Ice_Wt;
		this.label_Img = label_Img;
	}

	public String getLabel_Date() {
		return label_Date;
	}

	public void setLabel_Date(String label_Date) {
		this.label_Date = label_Date;
	}

	public String getSaturday_Delivery() {
		return saturday_Delivery;
	}

	public void setSaturday_Delivery(String saturday_Delivery) {
		this.saturday_Delivery = saturday_Delivery;
	}

	public String getDry_Ice_Wt() {
		return dry_Ice_Wt;
	}

	public void setDry_Ice_Wt(String dry_Ice_Wt) {
		this.dry_Ice_Wt = dry_Ice_Wt;
	}

	public String getLabel_Img() {
		return label_Img;
	}

	public void setLabel_Img(String label_Img) {
		this.label_Img = label_Img;
	}

	@Override
	public String toString() {
		return "Options [label_Date=" + label_Date + ", saturday_Delivery=" + saturday_Delivery + ", dry_Ice_Wt="
				+ dry_Ice_Wt + ", label_Img=" + label_Img + "]";
	}

	
	

	

	
	
	
}
