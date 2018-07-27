package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.PURCHASEDETAILS;

@Repository("PurchaseDetailsDao")
@Transactional

public class PurchaseDetailsDao implements DaoInterface<PURCHASEDETAILS> {

	@Autowired
	private SessionFactory sf;

	@Override
	public PURCHASEDETAILS get(int id) {

		System.out.println("purdetdao : get summary " + id);
		return sf.getCurrentSession()
				.createQuery("select a from PURCHASEDETAILS a where a.DETAILNO = :id", PURCHASEDETAILS.class)
				.setParameter("id", id).getSingleResult();
	}

	public List<PURCHASEDETAILS> getSome(int id) {

		System.out.println("purdetdao : get summary " + id);
		return sf.getCurrentSession()
				.createQuery("select a from PURCHASEDETAILS a where a.PURCHASENO = :id", PURCHASEDETAILS.class)
				.setParameter("id", id).getResultList();
	}

	@Override
	public List<PURCHASEDETAILS> getall() {
		String query = "select c from PURCHASEDETAILS c";
		return sf.getCurrentSession().createQuery(query, PURCHASEDETAILS.class).getResultList();
	}

	@Override
	public boolean insert(PURCHASEDETAILS purdet) {
		Integer stat = (Integer) sf.getCurrentSession().save(purdet);
		// sf.getCurrentSession().get(purdet);
		if (stat > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		PURCHASEDETAILS adm = get(id);
		sf.getCurrentSession().delete(adm);
		return true;
	}

	@Override
	public boolean update(PURCHASEDETAILS purdet) {
		sf.getCurrentSession().update(purdet);
		return true;
	}

	@Override
	public PURCHASEDETAILS get(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
