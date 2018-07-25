package com.restapi.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERADDRESS")
public class CUSTOMERADDRESS {
	private int ADDRESSID;
	private int CUSTID;
	private String STREET;
	private String CITY;
	private String DISTRICT;
	private String STATE;
	private int PINCODE;
	
	public CUSTOMERADDRESS() {
		// TODO Auto-generated constructor stub
	}

	public CUSTOMERADDRESS(int aDDRESSID, int cUSTID, String sTREET, String cITY, String dISTRICT, String sTATE,
			int pINCODE) {
		ADDRESSID = aDDRESSID;
		CUSTID = cUSTID;
		STREET = sTREET;
		CITY = cITY;
		DISTRICT = dISTRICT;
		STATE = sTATE;
		PINCODE = pINCODE;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getADDRESSID() {
		return ADDRESSID;
	}

	public void setADDRESSID(int aDDRESSID) {
		ADDRESSID = aDDRESSID;
	}
@Column
	public int getCUSTID() {
		return CUSTID;
	}

	public void setCUSTID(int cUSTID) {
		CUSTID = cUSTID;
	}
	@Column
	public String getSTREET() {
		return STREET;
	}

	public void setSTREET(String sTREET) {
		STREET = sTREET;
	}
	@Column
	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}
	@Column
	public String getDISTRICT() {
		return DISTRICT;
	}

	public void setDISTRICT(String dISTRICT) {
		DISTRICT = dISTRICT;
	}
	@Column
	public String getSTATE() {
		return STATE;
	}

	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	@Column
	public int getPINCODE() {
		return PINCODE;
	}

	public void setPINCODE(int pINCODE) {
		PINCODE = pINCODE;
	}
	
}