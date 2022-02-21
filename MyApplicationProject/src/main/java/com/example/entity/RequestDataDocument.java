package com.example.entity;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.dto.EasyPostOneData;

@Document(value = "requestdata")
public class RequestDataDocument {

	private EasyPostOneData easyPostOneData;

	public RequestDataDocument() {

	}

	public RequestDataDocument(EasyPostOneData easyPostOneData) {
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
