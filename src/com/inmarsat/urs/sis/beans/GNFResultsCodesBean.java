package com.inmarsat.urs.sis.beans;

public class GNFResultsCodesBean {

	Integer id;
	String result;
	
	public GNFResultsCodesBean(int id, String result) {
		this.id=id;
		this.result=result;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
