	
package com.restapi.pojo;

import javax.persistence.*;
@Entity
@Table(name = "INVENTORY")	
	 public class INVENTORY
    {
        private int PRODUCTNO ;
        private int QUANTITY;
        private String PRODUCTNAME ;
        
        public INVENTORY() {
			// TODO Auto-generated constructor stub
		}

		public INVENTORY(int pRODUCTNO, int qUANTITY, String pRODUCTNAME) {
			super();
			PRODUCTNO = pRODUCTNO;
			QUANTITY = qUANTITY;
			PRODUCTNAME = pRODUCTNAME;
		}

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
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

		public String getPRODUCTNAME() {
			return PRODUCTNAME;
		}

		public void setPRODUCTNAME(String pRODUCTNAME) {
			PRODUCTNAME = pRODUCTNAME;
		}
        
		
    }
	