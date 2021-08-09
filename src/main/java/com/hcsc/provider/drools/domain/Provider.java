
package com.hcsc.provider.drools.domain;

import java.util.Date;

public class Provider {

  private Integer providerId;
  private String provType;
  private String providerFirstName;
  private String providerLastName;
  private String taxId;
  private String dealId;
  private String npi;
  private String ssn;
  private String ein;
  private Date licenseExpiryDate;
  private Date provEffectiveDate;
  private String licenseState;
  private String licenseNumber;
  private String addressType;
  private String addressLine1;
  private String addressLine2;
  private String state;
  private String city;
  private String region;
  private String zipCode;
  private String phoneNumber;
  private String emailId;
  private String providerSpecialityCode;
  private String providerPracticeSet;
  private String product;
  private String provEffectiveStatus;
  private Validation status = Validation.UNKNOWN;

  public Provider() {
  }

  public String getProvType() {
    return provType;
  }
  public String getProviderFirstName() {
    return providerFirstName;
  }
  public String getProviderLastName() {
    return providerLastName;
  }
  public Integer getProviderId() {
    return providerId;
  }
  public String getTaxId() {
    return taxId;
  }
  public String getDealId() {
    return dealId;
  }
  public String getNpi() { return npi;  }
  public String getSsn() {
    return ssn;
  }
  public String getEin() {
    return ein;
  }
  public Date getLicenseExpiryDate() {
    return licenseExpiryDate;
  }
  public Date getProvEffectiveDate() {
    return provEffectiveDate;
  }
  public String getState() {
    return state;
  }
  public String getCity() {
    return city;
  }
  public String getRegion() {
    return region;
  }
  public String getEmailId() {
    return emailId;
  }
  public String getAddressType() {
    return addressType;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public String getProduct() {
    return product;
  }
  public String getProvEffectiveStatus() {
    return provEffectiveStatus;
  }
  public String getProviderPracticeSet() {
    return providerPracticeSet;
  }
  public String getLicenseState() {
    return licenseState;
  }
  public String getLicenseNumber() {
    return licenseNumber;
  }
  public String getProviderSpecialityCode() {
    return providerSpecialityCode;
  }
  public String getAddressLine1() {
    return addressLine1;
  }
  public String getAddressLine2() {
    return addressLine2;
  }
  public String getZipCode() {
    return zipCode;
  }
  public Validation getStatus() {
    return status;
  }





  public void setProvType(String providerType) {
    this.provType = provType;
  }
  public void setProviderFirstName(String providerFirstName) {
    this.providerFirstName = providerFirstName;
  }
  public void setProviderLastName(String providerLastName) {
    this.providerLastName = providerLastName;
  }
  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }
  public void setDealId(String dealId) {
    this.dealId = dealId;
  }
  public void setNpi(String npi) {    this.npi = npi;  }
  public void setEin(String ein) {    this.ein = ein;  }
  public void setEmailId(String emailId) {    this.emailId = emailId;  }
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }
  public void setLicenseExpiryDate(Date licenseExpiryDate) {
    this.licenseExpiryDate = licenseExpiryDate;
  }
  public void setProvEffectiveDate(Date provEffectiveDate) {
    this.provEffectiveDate = provEffectiveDate;
  }
  public void setState(String state) {
    this.state = state;
  }
  public void setCity(String city) {this.city = city;}
  public void setRegion(String region) {
    this.region = region;
  }
  public void setProviderSpecialityCode(String providerSpecialityCode) {    this.providerSpecialityCode = providerSpecialityCode; }
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }
  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public void setProduct(String product) {
    this.product = product;
  }
  public void setProvEffectiveStatus(String provEffectiveStatus) {
    this.provEffectiveStatus = provEffectiveStatus;
  }
  public void setProviderPracticeSet(String providerPracticeSet) {
    this.providerPracticeSet = providerPracticeSet;
  }
  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }
  public void setStatus(Validation status) {this.status = status;}
}
