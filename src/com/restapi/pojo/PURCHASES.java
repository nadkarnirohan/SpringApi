
package com.restapi.pojo;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PURCHASES")

public class PURCHASES {
	private int PURCHASENO;
	private int SELLERID;
	@DateTimeFormat()
	private Date PURCHASEDATE;
	private int PURCHASEPRICE;

	public PURCHASES() {
		// TODO Auto-generated constructor stub
	}

	public PURCHASES(int pURCHASENO, int sELLERID, Date pURCHASEDATE, int pURCHASEPRICE) {
		super();
		PURCHASENO = pURCHASENO;
		SELLERID = sELLERID;
		PURCHASEDATE = pURCHASEDATE;
		PURCHASEPRICE = pURCHASEPRICE;
	}

	public int getPURCHASENO() {
		return PURCHASENO;
	}

	public void setPURCHASENO(int pURCHASENO) {
		PURCHASENO = pURCHASENO;
	}

	public int getSELLERID() {
		return SELLERID;
	}

	public void setSELLERID(int sELLERID) {
		SELLERID = sELLERID;
	}

	public Date getPURCHASEDATE() {
		return PURCHASEDATE;
	}

	public void setPURCHASEDATE(Date pURCHASEDATE) {
		PURCHASEDATE = pURCHASEDATE;
	}

	public int getPURCHASEPRICE() {
		return PURCHASEPRICE;
	}

	public void setPURCHASEPRICE(int pURCHASEPRICE) {
		PURCHASEPRICE = pURCHASEPRICE;
	}

}
