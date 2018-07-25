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

	public CLAIM(String eMAIL, int cUSTID) {
		
		EMAIL = eMAIL;
		CUSTID = cUSTID;
	}
public CLAIM(String eMAIL, String pASSWORD) {
		
		EMAIL = eMAIL;
		PASSWORD = pASSWORD;
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
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getCUSTID() {
		return CUSTID;
	}

	public void setCUSTID(int cUSTID) {
		CUSTID = cUSTID;
	}
    
	
    
}