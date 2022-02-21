package com.example.dto;

import java.io.Serializable;

public class RequestData {

	private EasyPostOneData easyPostOneData;

	
	public RequestData() {
		
	}

	public RequestData(EasyPostOneData easyPostOneData) {
		super();
		this.easyPostOneData = easyPostOneData;
	}

	public EasyPostOneData getEasyPostOneData() {
		return easyPostOneData;
	}

	public void setEasyPostOneData(EasyPostOneData easyPostOneData) {
		this.easyPostOneData = easyPostOneData;

	}

	@Override
	public String toString() {
		return "RequestData [easyPostOneData=" + easyPostOneData + "]";
	}

}
