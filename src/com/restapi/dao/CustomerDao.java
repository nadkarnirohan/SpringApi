package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.CUSTOMERS;

@Repository("CustomerDao")
@Transactional
public class CustomerDao implements DaoInterface<CUSTOMERS> {
	@Autowired
	private SessionFactory sf;

	@Override
	public CUSTOMERS get(int id) {
		
		System.out.println("custdao : get summary " + id );
		return sf.getCurrentSession()
				.createQuery("select a from CUSTOMERS a where a.CUSTID = :id", CUSTOMERS.class)
				.setParameter("id",id).getSingleResult();
	}

	@Override
	public List<CUSTOMERS> getall() {
		String query = "select c from CUSTOMERS c";
		return sf.getCurrentSession().createQuery
				(query,CUSTOMERS.class).getResultList();
	}

	@Override
	public boolean insert(CUSTOMERS cust) {
		Integer stat = (Integer)sf.getCurrentSession().save(cust);
		//sf.getCurrentSession().get(cust);
	if(stat > 0) {
		return true;
	}
		return false;
	}

	@Override
	public boolean delete(int id) {
		CUSTOMERS adm =get(id);
		sf.getCurrentSession().delete(adm);
		return true;
	}

	@Override
	public boolean update(CUSTOMERS cust) {
		sf.getCurrentSession().update(cust);
		return true;
	}

	@Override
	public CUSTOMERS get(String email, String password) {
		System.out.println("dao : get summary " + email + " "+ password);
		return sf.getCurrentSession()
				.createQuery("select c from CUSTOMERS c where c.EMAIL = :email and c.PASSWORD = :password", CUSTOMERS.class)
				.setParameter("email",email).setParameter("password", password).getSingleResult();
	}

	@Override
	public List<CUSTOMERS> getSome(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
