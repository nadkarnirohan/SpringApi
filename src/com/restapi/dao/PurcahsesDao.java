package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.PURCHASES;

@Repository("PurcahsesDao")
@Transactional
public class PurcahsesDao implements DaoInterface<PURCHASES> {

	@Autowired
	private SessionFactory sf;

	@Override
	public PURCHASES get(int id) {

		System.out.println("purchasedao : get summary " + id);
		return sf.getCurrentSession().createQuery("select a from PURCHASES a where a.PURCHASENO = :id", PURCHASES.class)
				.setParameter("id", id).getSingleResult();
	}
	
	public List<PURCHASES> getSome(int id) {

		System.out.println("purchasedao : get summary " + id);
		return sf.getCurrentSession().createQuery("select a from PURCHASES a where a.SELLERID = :id", PURCHASES.class)
				.setParameter("id", id).getResultList();
	}

	@Override
	public List<PURCHASES> getall() {
		String query = "select c from PURCHASES c";
		return sf.getCurrentSession().createQuery(query, PURCHASES.class).getResultList();
	}

	@Override
	public boolean insert(PURCHASES purchase) {
		Integer stat = (Integer) sf.getCurrentSession().save(purchase);
		// sf.getCurrentSession().get(purchase);
		if (stat > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		PURCHASES adm = get(id);
		sf.getCurrentSession().delete(adm);
		return true;
	}

	@Override
	public boolean update(PURCHASES purchase) {
		sf.getCurrentSession().update(purchase);
		return true;
	}

	@Override
	public PURCHASES get(String email, String password) {
		return null;
	}
}
