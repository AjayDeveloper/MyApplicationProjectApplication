package com.example.dto;

public class Options {

	
	private String Label_Date;
	
	private String Saturday_Delivery;
	
	private String Dry_Ice_Wt;
	
	private String Label_Img;

	public Options() {
	
	}

	public Options(String label_Date, String saturday_Delivery, String dry_Ice_Wt, String label_Img) {
		super();
		Label_Date = label_Date;
		Saturday_Delivery = saturday_Delivery;
		Dry_Ice_Wt = dry_Ice_Wt;
		Label_Img = label_Img;
	}

	public String getLabel_Date() {
		return Label_Date;
	}

	public void setLabel_Date(String label_Date) {
		Label_Date = label_Date;
	}

	public String getSaturday_Delivery() {
		return Saturday_Delivery;
	}

	public void setSaturday_Delivery(String saturday_Delivery) {
		Saturday_Delivery = saturday_Delivery;
	}

	public String getDry_Ice_Wt() {
		return Dry_Ice_Wt;
	}

	public void setDry_Ice_Wt(String dry_Ice_Wt) {
		Dry_Ice_Wt = dry_Ice_Wt;
	}

	public String getLabel_Img() {
		return Label_Img;
	}

	public void setLabel_Img(String label_Img) {
		Label_Img = label_Img;
	}

	@Override
	public String toString() {
		return "Options [Label_Date=" + Label_Date + ", Saturday_Delivery=" + Saturday_Delivery + ", Dry_Ice_Wt="
				+ Dry_Ice_Wt + ", Label_Img=" + Label_Img + "]";
	}

	
	
	
	
	

	

	
	
	
}
