package com.inmarsat.stm.urs.beans;

import java.sql.Date;

import com.inmarsat.stm.urs.DBUtils;
import com.inmarsat.stm.urs.FREConstants;
import com.inmarsat.stm.urs.FREUtils;

public class UTInfoBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Long imsi = null;
	int sac;
	int accessnetwork = 0;
	int status = 0;
	Date date = null;
	Long capture = null;
	Double latitude = null;
	Double longitude = null;
	int beamid = 0;
	String satelliteid = null;
	
	
	public UTInfoBean(Long imsi, int sac) {
		this.imsi = imsi;
		this.sac = sac;
		this.date = FREUtils.getCurrentDate();		
	}
	
	public UTInfoBean(Long imsi, int sac, Long capture, int accessnetwork, double latitude, double longitude, Integer beamId, String satelliteId) {
		this.imsi = imsi;
		this.sac = sac;
		this.date = FREUtils.getCurrentDate();
		this.capture = capture; 
		this.accessnetwork = accessnetwork;
		this.latitude = latitude;
		this.longitude = longitude;
		this.beamid = beamId;
		this.satelliteid = satelliteId;
	}
	
	public UTInfoBean(Long imsi, int sac, Long milliSeconds) {
		this.imsi = imsi;
		this.sac = sac;
		this.date = FREUtils.getDate(milliSeconds);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Imsis: ");
		sb.append(imsi.toString());
		sb.append("; Sac:");
		sb.append(Integer.toString(sac));
		sb.append("; Date: ");
		sb.append(getDateAsSQLDateString());
		return sb.toString();
	}

	public Long getImsi() {
		return imsi;
	}

	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}

	public int getSac() {
		return sac;
	}
	
	public int getAccessnetwork() {
		return accessnetwork;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public int getBeamid() {
		return beamid;
	}

	public String getSatelliteid() {
		return satelliteid;
	}

	public void setSac(int sac) {
		this.sac = sac;
	}
	
	public String getSacAsString() {
		return Integer.toString(sac);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getImsiAsString() {
		return imsi.toString();
	}

	public String getStatusAsString() {
		return Integer.toString(status);
	}

//	public String getDateAsSQLDateString() {
//		SimpleDateFormat dateFormat = new SimpleDateFormat(FREConstants.dateFormatString_javaUtil);
//		return (dateFormat.format(date));
//	}

	public String getDateAsSQLDateString() {
		return DBUtils.toOracleDateString(capture, FREConstants.gpsMessageTimeUnit);
	}

	
	public void setDate(Long capture) {
		date = FREUtils.getDate(capture);
	}

	/**
	 * 
	 * @param capture - time in milliseconds since Jan 1 1970
	 */
	public void setCapture(Long capture, DBUtils.TimeUnits precision) {
		if(precision.equals(DBUtils.TimeUnits.MILLISECONDS))
			this.capture = capture / 1000;
		else this.capture = capture;
	}
	
	/**
	 * 
	 * @return - time in milliseconds since Jan 1 1970
	 */
	public Long getCapture() {
		return capture;
	}
	
}
