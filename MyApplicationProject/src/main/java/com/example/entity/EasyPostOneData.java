package com.example.entity;

public class EasyPostOneData {

	private EasyPostOneList easyPostOneList;

	

	public EasyPostOneData() {
		
	}
	
	public EasyPostOneData(EasyPostOneList easyPostOneList) {
		super();
		this.easyPostOneList = easyPostOneList;
	}

	public EasyPostOneList getEasyPostOneList() {
		return easyPostOneList;
	}

	public void setEasyPostOneList(EasyPostOneList easyPostOneList) {
		this.easyPostOneList = easyPostOneList;
	}

	@Override
	public String toString() {
		return "EasyPostOneData [easyPostOneList=" + easyPostOneList + "]";
	}

}
