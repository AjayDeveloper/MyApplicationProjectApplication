package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.RequestData;
import com.example.service.RequestDataService;

@RestController
@RequestMapping("/client")
public class Controller {

	@Autowired
	RequestDataService service;

	// createData is method to insertData into MongoDB
	@PostMapping(value = "/create", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public RequestData createData(@RequestBody RequestData requestData) {
		
		System.out.println("CreateData Method call");
		return service.insertRequestData(requestData);
		

	}

	// createData is method to log the data of requestData into console

	@PostMapping(value = "/createlog", consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.TEXT_XML_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.TEXT_XML_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public RequestData createDatalog(@RequestBody RequestData requestData) {
		System.out.println("CreateDatalog Method call" + requestData);

		return requestData;

	}

	
}
