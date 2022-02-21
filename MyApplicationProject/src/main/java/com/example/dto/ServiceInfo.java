package com.example.dto;

public class ServiceInfo {

	private String carrier;

	private String levelOfService;

	public ServiceInfo() {

	}

	public ServiceInfo(String carrier, String levelOfService) {
		super();
		this.carrier = carrier;
		this.levelOfService = levelOfService;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getLevelOfService() {
		return levelOfService;
	}

	public void setLevelOfService(String levelOfService) {
		this.levelOfService = levelOfService;
	}

	@Override
	public String toString() {
		return "ServiceInfo [carrier=" + carrier + ", levelOfService=" + levelOfService + "]";
	}

}
