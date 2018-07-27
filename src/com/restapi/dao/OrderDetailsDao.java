package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.INVENTORY;
import com.restapi.pojo.ORDERDETAILS;

@Repository("OrderDetailsDao")
@Transactional
public class OrderDetailsDao implements DaoInterface<ORDERDETAILS> {

	@Autowired
	private SessionFactory sf;

	@Override
	public ORDERDETAILS get(int id) {

		System.out.println("ordrdetdao : get summary " + id);
		return sf.getCurrentSession()
				.createQuery("select a from ORDERDETAILS a where a.DETAILNO = :id", ORDERDETAILS.class)
				.setParameter("id", id).getSingleResult();
	}

	public List<ORDERDETAILS> getSome(int id) {

		System.out.println("ordrdetdao : get summary " + id);
		return sf.getCurrentSession()
				.createQuery("select a from ORDERDETAILS a where a.ORDERNUM = :id", ORDERDETAILS.class)
				.setParameter("id", id).getResultList();
	}
	@Override
	public List<ORDERDETAILS> getall() {
		String query = "select c from ORDERDETAILS c";
		return sf.getCurrentSession().createQuery(query, ORDERDETAILS.class).getResultList();
	}

	@Override
	public boolean insert(ORDERDETAILS ordrdet) {
		Integer stat = (Integer) sf.getCurrentSession().save(ordrdet);
		// sf.getCurrentSession().get(ordrdet);
		if (stat > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		ORDERDETAILS ordrdet = get(id);
		sf.getCurrentSession().delete(ordrdet);
		return true;
	}

	@Override
	public boolean update(ORDERDETAILS ordrdet) {
		sf.getCurrentSession().update(ordrdet);
		return true;
	}

	@Override
	public ORDERDETAILS get(String email, String password) {
		return null;
		
	}
	


}
