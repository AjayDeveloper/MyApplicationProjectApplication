package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.RequestData;
import com.example.entity.RequestDataDocument;
import com.example.repository.RequestDataRepo;

@Service
public class RequestDataImpl implements RequestDataService {

	@Autowired
	RequestDataRepo repo;

	
	@Override public RequestData insertRequestData(RequestData requestData) {
	  System.out.println("insertRequestData Method call");
	  RequestDataDocument requestDataDocument = new RequestDataDocument();
	  requestDataDocument.setEasyPostOneData(requestData.getEasyPostOneData());
	  requestDataDocument= repo.save(requestDataDocument);
	  
	  return convertTODTO(requestDataDocument); }

	private RequestData convertTODTO(RequestDataDocument requestDataDocument) {
		System.out.println("convertTODTO Method call");
		RequestData requestDataDto = new RequestData();
		requestDataDto.setEasyPostOneData(requestDataDocument.getEasyPostOneData());
		return requestDataDto;
	}

}
