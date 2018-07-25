package com.restapi.pojo;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "SELLERS")	
	public class SELLERS
    {
        private int SELLERID ;
        private String SELLERNAME ;
        private String FIRSTNAME ;
        private String LASTNAME ;
        private String EMAIL ;
        private String PASSWORD ;
        private long PHONE ;
//        private List<SELLERSADDRESS> ADDRESS ;
//        private List<PURCHASES> PURCHASES ;
        
        public SELLERS() {
			// TODO Auto-generated constructor stub
		}

		public SELLERS(int sELLERID, String sELLERNAME, String fIRSTNAME, String lASTNAME, String eMAIL,
				String pASSWORD, long pHONE) {
			super();
			SELLERID = sELLERID;
			SELLERNAME = sELLERNAME;
			FIRSTNAME = fIRSTNAME;
			LASTNAME = lASTNAME;
			EMAIL = eMAIL;
			PASSWORD = pASSWORD;
			PHONE = pHONE;
//			ADDRESS = aDDRESS;
//			PURCHASES = pURCHASES;
		}
		
		public SELLERS( String sELLERNAME, String fIRSTNAME, String lASTNAME, String eMAIL,
				String pASSWORD, long pHONE) {
			super();
			SELLERNAME = sELLERNAME;
			FIRSTNAME = fIRSTNAME;
			LASTNAME = lASTNAME;
			EMAIL = eMAIL;
			PASSWORD = pASSWORD;
			PHONE = pHONE;
//			ADDRESS = aDDRESS;
//			PURCHASES = pURCHASES;
		}
		public SELLERS(String email2, String sELLERNAME, int sellerid2) {
			SELLERID = sellerid2;
			SELLERNAME = sELLERNAME;
			EMAIL = email2;
		}

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		public int getSELLERID() {
			return SELLERID;
		}

		public void setSELLERID(int sELLERID) {
			SELLERID = sELLERID;
		}

		public String getSELLERNAME() {
			return SELLERNAME;
		}

		public void setSELLERNAME(String sELLERNAME) {
			SELLERNAME = sELLERNAME;
		}

		public String getFIRSTNAME() {
			return FIRSTNAME;
		}

		public void setFIRSTNAME(String fIRSTNAME) {
			FIRSTNAME = fIRSTNAME;
		}

		public String getLASTNAME() {
			return LASTNAME;
		}

		public void setLASTNAME(String lASTNAME) {
			LASTNAME = lASTNAME;
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

		public long getPHONE() {
			return PHONE;
		}

		public void setPHONE(long pHONE) {
			PHONE = pHONE;
		}

//		public List<SELLERSADDRESS> getADDRESS() {
//			return ADDRESS;
//		}
//
//		public void setADDRESS(List<SELLERSADDRESS> aDDRESS) {
//			ADDRESS = aDDRESS;
//		}

//		public List<PURCHASES> getPURCHASES() {
//			return PURCHASES;
//		}
//
//		public void setPURCHASES(List<PURCHASES> pURCHASES) {
//			PURCHASES = pURCHASES;
//		}
        
		
    }