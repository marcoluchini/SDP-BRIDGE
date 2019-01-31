package com.inmarsat.stm.urs.beans;

public class SacMapBean implements java.io.Serializable   {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer sac;
	Integer countryId;
	
	public SacMapBean() {
		sac = null;
		countryId = null;
	}
	
	public SacMapBean(int sac) {
		this.sac=sac;
		this.countryId=-1;
	}
	
	public SacMapBean(int sac, int countryId) {
		this.sac=sac;
		this.countryId=countryId;
	}
	
	
	public Integer getSac() {
		return sac;
	}
	public void setSac(Integer sac) {
		this.sac = sac;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getSacAsString() {
		return Integer.toString(sac);
	}
	
}
