package com.restapi.pojo;

import javax.persistence.*;
@Entity
@Table(name = "SELLERS_VIEW")	
	 public class SELLERS_VIEW
    {
        private String SELLERNAME ;
        private String EMAIL ;
        private String PASSWORD ;
        
        public SELLERS_VIEW() {
			// TODO Auto-generated constructor stub
		}

		public SELLERS_VIEW(String sELLERNAME, String eMAIL, String pASSWORD) {
			super();
			SELLERNAME = sELLERNAME;
			EMAIL = eMAIL;
			PASSWORD = pASSWORD;
		}

		public String getSELLERNAME() {
			return SELLERNAME;
		}

		public void setSELLERNAME(String sELLERNAME) {
			SELLERNAME = sELLERNAME;
		}

		public String getEMAIL() {
			return EMAIL;
		}

		public void setEMAIL(String eMAIL) {
			EMAIL = eMAIL;
		}

		public String getPASSWORD() {
			return PASSWORD;
		}

		public void setPASSWORD(String pASSWORD) {
			PASSWORD = pASSWORD;
		}
        
		
    }
	
	 
