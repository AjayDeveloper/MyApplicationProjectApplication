package com.example.entity;

public class EasyPostOneList {

	private EasyPostOne easyPostOne;

	
	public EasyPostOneList() {
		
	}
	public EasyPostOneList(EasyPostOne easyPostOne) {
		super();
		this.easyPostOne = easyPostOne;
	}

	public EasyPostOne getEasyPostOne() {
		return easyPostOne;
	}

	public void setEasyPostOne(EasyPostOne easyPostOne) {
		this.easyPostOne = easyPostOne;
	}

	@Override
	public String toString() {
		return "EasyPostOneList [easyPostOne=" + easyPostOne + "]";
	}

}
