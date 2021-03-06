package com.example.entity;

public class EasyPostOne {

	private Long companyCode;

	private String facilityCode;

	private String waveNumber;

	private String orderNumber;
    
	private Long packageNumber;

	private Long packageID;

	private Long scheduleNumber;
	
	private String packageType;

	private String action;

	private String key_Id;

	private String shipViaCode;

	private String applyShipLabel;

	private ServiceInfo serviceInfo;

	private To_Address to_Address;

	private GiftMessage giftMessage;

	private Parcel parcel;

	private CustomsItemsList customsItemsList;

	private Options options;

	private OptionalInfo optionalInfo;

	public EasyPostOne() {
	
	}

	public EasyPostOne(Long companyCode, String facilityCode, String waveNumber, String orderNumber, Long packageNumber,
			Long packageID, Long scheduleNumber, String packageType, String action, String key_Id, String shipViaCode,
			String applyShipLabel, ServiceInfo serviceInfo, To_Address to_Address, GiftMessage giftMessage,
			Parcel parcel, CustomsItemsList customsItemsList, Options options, OptionalInfo optionalInfo) {
		super();
		this.companyCode = companyCode;
		this.facilityCode = facilityCode;
		this.waveNumber = waveNumber;
		this.orderNumber = orderNumber;
		this.packageNumber = packageNumber;
		this.packageID = packageID;
		this.scheduleNumber = scheduleNumber;
		this.packageType = packageType;
		this.action = action;
		this.key_Id = key_Id;
		this.shipViaCode = shipViaCode;
		this.applyShipLabel = applyShipLabel;
		this.serviceInfo = serviceInfo;
		this.to_Address = to_Address;
		this.giftMessage = giftMessage;
		this.parcel = parcel;
		this.customsItemsList = customsItemsList;
		this.options = options;
		this.optionalInfo = optionalInfo;
	}

	public Long getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}

	public String getFacilityCode() {
		return facilityCode;
	}

	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}

	public String getWaveNumber() {
		return waveNumber;
	}

	public void setWaveNumber(String waveNumber) {
		this.waveNumber = waveNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getPackageNumber() {
		return packageNumber;
	}

	public void setPackageNumber(Long packageNumber) {
		this.packageNumber = packageNumber;
	}

	public Long getPackageID() {
		return packageID;
	}

	public void setPackageID(Long packageID) {
		this.packageID = packageID;
	}

	public Long getScheduleNumber() {
		return scheduleNumber;
	}

	public void setScheduleNumber(Long scheduleNumber) {
		this.scheduleNumber = scheduleNumber;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getKey_Id() {
		return key_Id;
	}

	public void setKey_Id(String key_Id) {
		this.key_Id = key_Id;
	}

	public String getShipViaCode() {
		return shipViaCode;
	}

	public void setShipViaCode(String shipViaCode) {
		this.shipViaCode = shipViaCode;
	}

	public String getApplyShipLabel() {
		return applyShipLabel;
	}

	public void setApplyShipLabel(String applyShipLabel) {
		this.applyShipLabel = applyShipLabel;
	}

	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public To_Address getTo_Address() {
		return to_Address;
	}

	public void setTo_Address(To_Address to_Address) {
		this.to_Address = to_Address;
	}

	public GiftMessage getGiftMessage() {
		return giftMessage;
	}

	public void setGiftMessage(GiftMessage giftMessage) {
		this.giftMessage = giftMessage;
	}

	public Parcel getParcel() {
		return parcel;
	}

	public void setParcel(Parcel parcel) {
		this.parcel = parcel;
	}

	public CustomsItemsList getCustomsItemsList() {
		return customsItemsList;
	}

	public void setCustomsItemsList(CustomsItemsList customsItemsList) {
		this.customsItemsList = customsItemsList;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public OptionalInfo getOptionalInfo() {
		return optionalInfo;
	}

	public void setOptionalInfo(OptionalInfo optionalInfo) {
		this.optionalInfo = optionalInfo;
	}

	@Override
	public String toString() {
		return "EasyPostOne [companyCode=" + companyCode + ", facilityCode=" + facilityCode + ", waveNumber="
				+ waveNumber + ", orderNumber=" + orderNumber + ", packageNumber=" + packageNumber + ", packageID="
				+ packageID + ", scheduleNumber=" + scheduleNumber + ", packageType=" + packageType + ", action="
				+ action + ", key_Id=" + key_Id + ", shipViaCode=" + shipViaCode + ", applyShipLabel=" + applyShipLabel
				+ ", serviceInfo=" + serviceInfo + ", to_Address=" + to_Address + ", giftMessage=" + giftMessage
				+ ", parcel=" + parcel + ", customsItemsList=" + customsItemsList + ", options=" + options
				+ ", optionalInfo=" + optionalInfo + "]";
	}

	
	
	

}
