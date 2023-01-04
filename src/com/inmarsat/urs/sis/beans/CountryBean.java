package com.inmarsat.urs.sis.beans;

public class CountryBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int countryId;
	String countryName;
	
	CountryBean() {
		countryName = null;
	}
	
	CountryBean(int countyId, String countryName) {
		this.countryId=countyId; 
		this.countryName=countryName;
	}
		
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
