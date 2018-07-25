package com.restapi.pojo;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "SELLERS_VIEW")
@Immutable
public class SELLERS_VIEW {
	private String SELLERNAME;
	private String EMAIL;
	private String PASSWORD;

	public SELLERS_VIEW() {
		// TODO Auto-generated constructor stub
	}

	public SELLERS_VIEW(String sELLERNAME, String eMAIL, String pASSWORD) {
		super();
		SELLERNAME = sELLERNAME;
		EMAIL = eMAIL;
		PASSWORD = pASSWORD;
	}

	public SELLERS_VIEW(String eMAIL, String pASSWORD) {
		EMAIL = eMAIL;
		PASSWORD = pASSWORD;
	}

	@Id
	@Column
	public String getSELLERNAME() {
		return SELLERNAME;
	}

	public void setSELLERNAME(String sELLERNAME) {
		SELLERNAME = sELLERNAME;
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

}
