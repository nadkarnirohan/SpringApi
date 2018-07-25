
package com.restapi.pojo;

import javax.persistence.*;

@Entity
@Table(name = "ORDERDETAILS")
public class ORDERDETAILS {
	private int ORDERNUM;
	private int PRODUCTNO;
	private int QUANTITY;
	private int PRODUCTTOTAL;
	private int DETAILNO;

	public ORDERDETAILS() {
		// TODO Auto-generated constructor stub
	}

	public ORDERDETAILS(int oRDERNUM, int pRODUCTNO, int qUANTITY, int pRODUCTTOTAL, int dETAILNO) {
		super();
		ORDERNUM = oRDERNUM;
		PRODUCTNO = pRODUCTNO;
		QUANTITY = qUANTITY;
		PRODUCTTOTAL = pRODUCTTOTAL;
		DETAILNO = dETAILNO;
	}

	public ORDERDETAILS(int pRODUCTNO, int qUANTITY, int pRODUCTTOTAL, int dETAILNO) {

		PRODUCTNO = pRODUCTNO;
		QUANTITY = qUANTITY;
		PRODUCTTOTAL = pRODUCTTOTAL;
		DETAILNO = dETAILNO;
	}

	public int getORDERNUM() {
		return ORDERNUM;
	}

	public void setORDERNUM(int oRDERNUM) {
		ORDERNUM = oRDERNUM;
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

	public int getPRODUCTTOTAL() {
		return PRODUCTTOTAL;
	}

	public void setPRODUCTTOTAL(int pRODUCTTOTAL) {
		PRODUCTTOTAL = pRODUCTTOTAL;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getDETAILNO() {
		return DETAILNO;
	}

	public void setDETAILNO(int dETAILNO) {
		DETAILNO = dETAILNO;
	}

}
