package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.SELLERS;

@Repository("SellerDao")
@Transactional
public class SellerDao implements DaoInterface<SELLERS> {
	@Autowired
	private SessionFactory sf;

	@Override
	public SELLERS get(int id) {
		System.out.println("custdao : get summary " + id);
		return sf.getCurrentSession().createQuery("select a from SELLERS a where a.SELLERID = :id", SELLERS.class)
				.setParameter("id", id).getSingleResult();
	}
	@Override
	public List<SELLERS> getall() {
		String query = "select s from SELLERS s";
		return sf.getCurrentSession().createQuery
				(query,SELLERS.class).getResultList();
	}

	@Override
	public boolean insert(SELLERS seller) {
		Integer stat = (Integer)sf.getCurrentSession().save(seller);
		//sf.getCurrentSession().get(seller);
	if(stat > 0) {
		return true;
	}
		return false;
	}

	@Override
	public boolean delete(int id) {
		SELLERS seller =get(id);
		sf.getCurrentSession().delete(seller);
		return true;
	}

	@Override
	public boolean update(SELLERS seller) {
		sf.getCurrentSession().update(seller);
		return true;
	}

	@Override
	public SELLERS get(String email, String password) {
		System.out.println("dao : get summary " + email + " "+ password);
		return sf.getCurrentSession()
				.createQuery("select seller from SELLERS seller where seller.EMAIL = :email and seller.PASSWORD = :password", SELLERS.class)
				.setParameter("email",email).setParameter("password", password).getSingleResult();
	}

}
