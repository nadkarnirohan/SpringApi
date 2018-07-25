package com.restapi.pojo;

import javax.persistence.*;

@Entity
@Table(name="SELLERSADDRESS")
public class SELLERSADDRESS
{
    private int ADDRESSID ;
    private int SELLERID ;
    private String STREET ;
    private String CITY ;
    private String DISTRICT ;
    private String STATE ;
    private int PINCODE ;
    
    public SELLERSADDRESS() {
		// TODO Auto-generated constructor stub
	}

	public SELLERSADDRESS(int aDDRESSID, int sELLERID, String sTREET, String cITY, String dISTRICT, String sTATE,
			int pINCODE) {
		super();
		ADDRESSID = aDDRESSID;
		SELLERID = sELLERID;
		STREET = sTREET;
		CITY = cITY;
		DISTRICT = dISTRICT;
		STATE = sTATE;
		PINCODE = pINCODE;
	}

	public int getADDRESSID() {
		return ADDRESSID;
	}

	public void setADDRESSID(int aDDRESSID) {
		ADDRESSID = aDDRESSID;
	}

	public int getSELLERID() {
		return SELLERID;
	}

	public void setSELLERID(int sELLERID) {
		SELLERID = sELLERID;
	}

	public String getSTREET() {
		return STREET;
	}

	public void setSTREET(String sTREET) {
		STREET = sTREET;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getDISTRICT() {
		return DISTRICT;
	}

	public void setDISTRICT(String dISTRICT) {
		DISTRICT = dISTRICT;
	}

	public String getSTATE() {
		return STATE;
	}

	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}

	public int getPINCODE() {
		return PINCODE;
	}

	public void setPINCODE(int pINCODE) {
		PINCODE = pINCODE;
	}
    
	

}