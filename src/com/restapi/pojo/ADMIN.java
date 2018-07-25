package com.restapi.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
public class ADMIN {

	public int ADMINID;
	public String ADMINNAME;
	public String PASSWORD;

	public ADMIN() {
		System.out.println("INSIDE ADMIN CONSTRUCTOR");
	}

	public ADMIN(int aDMINID, String aDMINNAME, String pASSWORD) {

		System.out.println("INSIDE ADMIN PARA CONSTRUCTOR");
		ADMINID = aDMINID;
		ADMINNAME = aDMINNAME;
		PASSWORD = pASSWORD;
	}

	public ADMIN(String aDMINNAME, String pASSWORD) {

		System.out.println("INSIDE ADMIN PARA CONSTRUCTOR");
		ADMINNAME = aDMINNAME;
		PASSWORD = pASSWORD;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ADMINID")
	public int getADMINID() {
		return ADMINID;
	}

	public void setADMINID(int aDMINID) {
		ADMINID = aDMINID;
	}

	@Column(name = "ADMINNAME")
	public String getADMINNAME() {
		return ADMINNAME;
	}

	public void setADMINNAME(String aDMINNAME) {
		ADMINNAME = aDMINNAME;
	}

	@Column(name = "PASSWORD")
	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ADMINNAME + this.ADMINID + this.PASSWORD;
	}
}