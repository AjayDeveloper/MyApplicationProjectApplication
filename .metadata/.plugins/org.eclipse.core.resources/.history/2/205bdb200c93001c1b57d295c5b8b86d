package com.example.entity;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "requestdata")
public class RequestDataDocument {
	@Indexed(direction=IndexDirection.ASCENDING)
	private int id;
	private String name;

	public RequestDataDocument() {
	}

	public RequestDataDocument(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RequestData [id=" + id + ", name=" + name + "]";
	}

}
