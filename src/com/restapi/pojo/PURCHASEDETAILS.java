
package com.restapi.pojo;

import javax.persistence.*;

@Entity
@Table(name = "PURCHASEDETAILS")
public class PURCHASEDETAILS {
	private int PURCHASENO;
	private int PRODUCTNO;
	private int QUANTITY;
	private int PRODUCTPRICE;
	private int DETAILNO;

	public PURCHASEDETAILS() {
		// TODO Auto-generated constructor stub
	}

	public PURCHASEDETAILS(int pURCHASENO, int pRODUCTNO, int qUANTITY, int pRODUCTPRICE, int dETAILNO) {
		super();
		PURCHASENO = pURCHASENO;
		PRODUCTNO = pRODUCTNO;
		QUANTITY = qUANTITY;
		PRODUCTPRICE = pRODUCTPRICE;
		DETAILNO = dETAILNO;
	}

	public PURCHASEDETAILS(int pRODUCTNO, int qUANTITY, int pRODUCTPRICE, int dETAILNO) {
		super();
		PRODUCTNO = pRODUCTNO;
		QUANTITY = qUANTITY;
		PRODUCTPRICE = pRODUCTPRICE;
		DETAILNO = dETAILNO;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getPURCHASENO() {
		return PURCHASENO;
	}

	public void setPURCHASENO(int pURCHASENO) {
		PURCHASENO = pURCHASENO;
	}

	public int getPRODUCTNO() {
		return PRODUCTNO;
	}

	public void setPRODUCTNO(int pRODUCTNO) {
		PRODUCTNO = pRODUCTNO;
	}

	public int getQUANTITY() {
		return QUANTITY;
	}

	public void setQUANTITY(int qUANTITY) {
		QUANTITY = qUANTITY;
	}

	public int getPRODUCTPRICE() {
		return PRODUCTPRICE;
	}

	public void setPRODUCTPRICE(int pRODUCTPRICE) {
		PRODUCTPRICE = pRODUCTPRICE;
	}

	public int getDETAILNO() {
		return DETAILNO;
	}

	public void setDETAILNO(int dETAILNO) {
		DETAILNO = dETAILNO;
	}

}
