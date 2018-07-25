package com.restapi.pojo;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

import com.restapi.pojo.CUSTOMERADDRESS;

@Entity
@Table(name = "CUSTOMERS")
public class CUSTOMERS {
	//// list of customers address
	// private List<CUSTOMERADDRESS> address = new List<CUSTOMERADDRESS>();
	//// list of Customers orders
	// private List<ORDERS> orders = new List<ORDERS>();

	private int CUSTID;
	private String EMAIL;
	private String PASSWORD;
	private String FIRSTNAME;
	private String LASTNAME;
	private long PHONE;
	private List<CUSTOMERADDRESS> ADDRESS;
	private List<ORDERS> ORDERS;
	
	public CUSTOMERS() {
		// TODO Auto-generated constructor stub
	}

	public CUSTOMERS(int cUSTID, String eMAIL, String pASSWORD, String fIRSTNAME, String lASTNAME, long pHONE,
			List<CUSTOMERADDRESS> aDDRESS, List<com.restapi.pojo.ORDERS> oRDERS) {
		super();
		CUSTID = cUSTID;
		EMAIL = eMAIL;
		PASSWORD = pASSWORD;
		FIRSTNAME = fIRSTNAME;
		LASTNAME = lASTNAME;
		PHONE = pHONE;
		ADDRESS = aDDRESS;
		ORDERS = oRDERS;
	}

	public int getCUSTID() {
		return CUSTID;
	}

	public void setCUSTID(int cUSTID) {
		CUSTID = cUSTID;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}

	public long getPHONE() {
		return PHONE;
	}

	public void setPHONE(long pHONE) {
		PHONE = pHONE;
	}

	public List<CUSTOMERADDRESS> getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(List<CUSTOMERADDRESS> aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public List<ORDERS> getORDERS() {
		return ORDERS;
	}

	public void setORDERS(List<ORDERS> oRDERS) {
		ORDERS = oRDERS;
	}
	
	
}