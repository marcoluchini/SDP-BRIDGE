package com.inmarsat.sdp.beans;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"creationDate",
"dateTime",
"iccid",
"imsi",
"level1Id",
"level1Name",
"msisdn",
"packagePlan",
"productInstanceAlternateKey",
"productInstanceName",
"productInstanceStatus",
"ratePlan"
})
@Generated("jsonschema2pojo")
public class AssetInfoBean {

@JsonProperty("creationDate")
private String creationDate;
@JsonProperty("dateTime")
private String dateTime;
@JsonProperty("iccid")
private String iccid;
@JsonProperty("imsi")
private String imsi;
@JsonProperty("level1Id")
private String level1Id;
@JsonProperty("level1Name")
private String level1Name;
@JsonProperty("msisdn")
private String msisdn;
@JsonProperty("packagePlan")
private String packagePlan;
@JsonProperty("productInstanceAlternateKey")
private String productInstanceAlternateKey;
@JsonProperty("productInstanceName")
private String productInstanceName;
@JsonProperty("productInstanceStatus")
private String productInstanceStatus;
@JsonProperty("ratePlan")
private String ratePlan;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

/**
* No arguments constructor for use in serialisation
*
*/
public AssetInfoBean() {
}

/**
*
* @param dateTime
* @param productInstanceName
* @param ratePlan
* @param iccid
* @param packagePlan
* @param productInstanceStatus
* @param level1Name
* @param level1Id
* @param imsi
* @param creationDate
* @param msisdn
* @param productInstanceAlternateKey
*/
public AssetInfoBean(String creationDate, String dateTime, String iccid, String imsi, String level1Id, String level1Name, String msisdn, String packagePlan, String productInstanceAlternateKey, String productInstanceName, String productInstanceStatus, String ratePlan) {
super();
this.creationDate = creationDate;
this.dateTime = dateTime;
this.iccid = iccid;
this.imsi = imsi;
this.level1Id = level1Id;
this.level1Name = level1Name;
this.msisdn = msisdn;
this.packagePlan = packagePlan;
this.productInstanceAlternateKey = productInstanceAlternateKey;
this.productInstanceName = productInstanceName;
this.productInstanceStatus = productInstanceStatus;
this.ratePlan = ratePlan;
}

@JsonProperty("creationDate")
public String getCreationDate() {
return creationDate;
}

@JsonProperty("creationDate")
public void setCreationDate(String creationDate) {
this.creationDate = creationDate;
}

@JsonProperty("dateTime")
public String getDateTime() {
return dateTime;
}

@JsonProperty("dateTime")
public void setDateTime(String dateTime) {
this.dateTime = dateTime;
}

@JsonProperty("iccid")
public String getIccid() {
return iccid;
}

@JsonProperty("iccid")
public void setIccid(String iccid) {
this.iccid = iccid;
}

@JsonProperty("imsi")
public String getImsi() {
return imsi;
}

@JsonProperty("imsi")
public void setImsi(String imsi) {
this.imsi = imsi;
}

@JsonProperty("level1Id")
public String getLevel1Id() {
return level1Id;
}

@JsonProperty("level1Id")
public void setLevel1Id(String level1Id) {
this.level1Id = level1Id;
}

@JsonProperty("level1Name")
public String getLevel1Name() {
return level1Name;
}

@JsonProperty("level1Name")
public void setLevel1Name(String level1Name) {
this.level1Name = level1Name;
}

@JsonProperty("msisdn")
public String getMsisdn() {
return msisdn;
}

@JsonProperty("msisdn")
public void setMsisdn(String msisdn) {
this.msisdn = msisdn;
}

@JsonProperty("packagePlan")
public String getPackagePlan() {
return packagePlan;
}

@JsonProperty("packagePlan")
public void setPackagePlan(String packagePlan) {
this.packagePlan = packagePlan;
}

@JsonProperty("productInstanceAlternateKey")
public String getProductInstanceAlternateKey() {
return productInstanceAlternateKey;
}

@JsonProperty("productInstanceAlternateKey")
public void setProductInstanceAlternateKey(String productInstanceAlternateKey) {
this.productInstanceAlternateKey = productInstanceAlternateKey;
}

@JsonProperty("productInstanceName")
public String getProductInstanceName() {
return productInstanceName;
}

@JsonProperty("productInstanceName")
public void setProductInstanceName(String productInstanceName) {
this.productInstanceName = productInstanceName;
}

@JsonProperty("productInstanceStatus")
public String getProductInstanceStatus() {
return productInstanceStatus;
}

@JsonProperty("productInstanceStatus")
public void setProductInstanceStatus(String productInstanceStatus) {
this.productInstanceStatus = productInstanceStatus;
}

@JsonProperty("ratePlan")
public String getRatePlan() {
return ratePlan;
}

@JsonProperty("ratePlan")
public void setRatePlan(String ratePlan) {
this.ratePlan = ratePlan;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
