	
package com.restapi.pojo;

import javax.persistence.*;
@Entity
@Table(name = "CUSTOMERADDRESS")	
	 public class PRODUCTS
    {
        private int PRODUCTNO ;
        private String PRODUCTNAME ;
        public PRODUCTS() {
			// TODO Auto-generated constructor stub
		}
		public PRODUCTS(int pRODUCTNO, String pRODUCTNAME) {
			super();
			PRODUCTNO = pRODUCTNO;
			PRODUCTNAME = pRODUCTNAME;
		}
		public int getPRODUCTNO() {
			return PRODUCTNO;
		}
		public void setPRODUCTNO(int pRODUCTNO) {
			PRODUCTNO = pRODUCTNO;
		}
		public String getPRODUCTNAME() {
			return PRODUCTNAME;
		}
		public void setPRODUCTNAME(String pRODUCTNAME) {
			PRODUCTNAME = pRODUCTNAME;
		}
        
		
    }
	