package com.example.dto;

public class OptionalInfo {

	private CustomsFldlst customs_Fldlst;

	private String loadNbr;

	private Long keyCity;

	private String agLabel;

	private String dryIceLabel;

	private String wineLabel;

	private String wineLicNbr;

	private String militaryLabel;

	private String satDeliveryLabel;

	private String internationalLabel;

	private String greetingcardLabel;

	private Long autoManifest;

	public OptionalInfo() {

	}

	public OptionalInfo(CustomsFldlst customs_Fldlst, String loadNbr, Long keyCity, String agLabel, String dryIceLabel,
			String wineLabel, String wineLicNbr, String militaryLabel, String satDeliveryLabel,
			String internationalLabel, String greetingcardLabel, Long autoManifest) {
		super();
		this.customs_Fldlst = customs_Fldlst;
		this.loadNbr = loadNbr;
		this.keyCity = keyCity;
		this.agLabel = agLabel;
		this.dryIceLabel = dryIceLabel;
		this.wineLabel = wineLabel;
		this.wineLicNbr = wineLicNbr;
		this.militaryLabel = militaryLabel;
		this.satDeliveryLabel = satDeliveryLabel;
		this.internationalLabel = internationalLabel;
		this.greetingcardLabel = greetingcardLabel;
		this.autoManifest = autoManifest;
	}

	public CustomsFldlst getCustoms_Fldlst() {
		return customs_Fldlst;
	}

	public void setCustoms_Fldlst(CustomsFldlst customs_Fldlst) {
		this.customs_Fldlst = customs_Fldlst;
	}

	public String getLoadNbr() {
		return loadNbr;
	}

	public void setLoadNbr(String loadNbr) {
		this.loadNbr = loadNbr;
	}

	public Long getKeyCity() {
		return keyCity;
	}

	public void setKeyCity(Long keyCity) {
		this.keyCity = keyCity;
	}

	public String getAgLabel() {
		return agLabel;
	}

	public void setAgLabel(String agLabel) {
		this.agLabel = agLabel;
	}

	public String getDryIceLabel() {
		return dryIceLabel;
	}

	public void setDryIceLabel(String dryIceLabel) {
		this.dryIceLabel = dryIceLabel;
	}

	public String getWineLabel() {
		return wineLabel;
	}

	public void setWineLabel(String wineLabel) {
		this.wineLabel = wineLabel;
	}

	public String getWineLicNbr() {
		return wineLicNbr;
	}

	public void setWineLicNbr(String wineLicNbr) {
		this.wineLicNbr = wineLicNbr;
	}

	public String getMilitaryLabel() {
		return militaryLabel;
	}

	public void setMilitaryLabel(String militaryLabel) {
		this.militaryLabel = militaryLabel;
	}

	public String getSatDeliveryLabel() {
		return satDeliveryLabel;
	}

	public void setSatDeliveryLabel(String satDeliveryLabel) {
		this.satDeliveryLabel = satDeliveryLabel;
	}

	public String getInternationalLabel() {
		return internationalLabel;
	}

	public void setInternationalLabel(String internationalLabel) {
		this.internationalLabel = internationalLabel;
	}

	public String getGreetingcardLabel() {
		return greetingcardLabel;
	}

	public void setGreetingcardLabel(String greetingcardLabel) {
		this.greetingcardLabel = greetingcardLabel;
	}

	public Long getAutoManifest() {
		return autoManifest;
	}

	public void setAutoManifest(Long autoManifest) {
		this.autoManifest = autoManifest;
	}

	@Override
	public String toString() {
		return "OptionalInfo [customs_Fldlst=" + customs_Fldlst + ", loadNbr=" + loadNbr + ", keyCity=" + keyCity
				+ ", agLabel=" + agLabel + ", dryIceLabel=" + dryIceLabel + ", wineLabel=" + wineLabel + ", wineLicNbr="
				+ wineLicNbr + ", militaryLabel=" + militaryLabel + ", satDeliveryLabel=" + satDeliveryLabel
				+ ", internationalLabel=" + internationalLabel + ", greetingcardLabel=" + greetingcardLabel
				+ ", autoManifest=" + autoManifest + "]";
	}

}
