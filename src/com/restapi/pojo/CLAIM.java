package com.restapi.pojo;

import javax.persistence.Column;
import javax.persistence.*;
@Entity
@Table(name="CLAIM")
public class CLAIM
{
    public String EMAIL;
    public String PASSWORD;
    public int CUSTID;
    
    public CLAIM() {
		
	}

	public CLAIM(String eMAIL, String pASSWORD, int cUSTID) {
		
		EMAIL = eMAIL;
		PASSWORD = pASSWORD;
		CUSTID = cUSTID;
	}
	@Column
	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	@Column
	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	@Column
	public int getCUSTID() {
		return CUSTID;
	}

	public void setCUSTID(int cUSTID) {
		CUSTID = cUSTID;
	}
    
	
    
}