package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.CUSTOMERADDRESS;

@Repository("CustomerAddressDao")
@Transactional
public class CustomerAddressDao implements DaoInterface<CUSTOMERADDRESS> {

		@Autowired
		private SessionFactory sf;

		@Override
		public CUSTOMERADDRESS get(int id) {
			System.out.println("custdao : get summary " + id);
			return sf.getCurrentSession().createQuery("select addr from CUSTOMERADDRESS addr where addr.ADDRESSID = :id", CUSTOMERADDRESS.class)
					.setParameter("id", id).getSingleResult();
		}
		
		public List<CUSTOMERADDRESS> getSome(int id) {
			System.out.println("custdao : get summary " + id);
			return sf.getCurrentSession().createQuery("select addr from CUSTOMERADDRESS addr where addr.CUSTID = :id", CUSTOMERADDRESS.class)
					.setParameter("id", id).getResultList();
		}
		@Override
		public List<CUSTOMERADDRESS> getall() {
			String query = "select addr from CUSTOMERADDRESS addr";
			return sf.getCurrentSession().createQuery
					(query,CUSTOMERADDRESS.class).getResultList();
		}

		@Override
		public boolean insert(CUSTOMERADDRESS addr) {
			Integer stat = (Integer)sf.getCurrentSession().save(addr);
			//sf.getCurrentSession().get(seller);
		if(stat > 0) {
			return true;
		}
			return false;
		}

		@Override
		public boolean delete(int id) {
			CUSTOMERADDRESS addr =get(id);
			sf.getCurrentSession().delete(addr);
			return true;
		}

		@Override
		public boolean update(CUSTOMERADDRESS addr) {
			sf.getCurrentSession().update(addr);
			return true;
		}

		@Override
		public CUSTOMERADDRESS get(String email, String password) {
			return null;
			
		}
}
