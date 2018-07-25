
package com.restapi.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ORDERS {
	private int ORDERNUM;
    private int CUSTID;
    @DateTimeFormat()
    private Date OREDERDATE;
    @DateTimeFormat()
    private Date DELIVERYDATE;
    private int ORDERTOTAL;
    
    public ORDERS() {
		// TODO Auto-generated constructor stub
	}

	public ORDERS(int oRDERNUM, int cUSTID, Date oREDERDATE, Date dELIVERYDATE, int oRDERTOTAL) {
		super();
		ORDERNUM = oRDERNUM;
		CUSTID = cUSTID;
		OREDERDATE = oREDERDATE;
		DELIVERYDATE = dELIVERYDATE;
		ORDERTOTAL = oRDERTOTAL;
	}

	public int getORDERNUM() {
		return ORDERNUM;
	}

	public void setORDERNUM(int oRDERNUM) {
		ORDERNUM = oRDERNUM;
	}

	public int getCUSTID() {
		return CUSTID;
	}

	public void setCUSTID(int cUSTID) {
		CUSTID = cUSTID;
	}

	public Date getOREDERDATE() {
		return OREDERDATE;
	}

	public void setOREDERDATE(Date oREDERDATE) {
		OREDERDATE = oREDERDATE;
	}

	public Date getDELIVERYDATE() {
		return DELIVERYDATE;
	}

	public void setDELIVERYDATE(Date dELIVERYDATE) {
		DELIVERYDATE = dELIVERYDATE;
	}

	public int getORDERTOTAL() {
		return ORDERTOTAL;
	}

	public void setORDERTOTAL(int oRDERTOTAL) {
		ORDERTOTAL = oRDERTOTAL;
	}
    
	
}
