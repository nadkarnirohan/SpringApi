package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.PRODUCTS;

@Repository("ProductsDao")
@Transactional
public class ProductsDao implements DaoInterface<PRODUCTS> {

	@Autowired
	private SessionFactory sf;

	@Override
	public PRODUCTS get(int id) {

		System.out.println("proddao : get summary " + id);
		return sf.getCurrentSession().createQuery("select a from PRODUCTS a where a.PRODUCTNO = :id", PRODUCTS.class)
				.setParameter("id", id).getSingleResult();
	}

	@Override
	public List<PRODUCTS> getall() {
		String query = "select c from PRODUCTS c";
		return sf.getCurrentSession().createQuery(query, PRODUCTS.class).getResultList();
	}

	@Override
	public boolean insert(PRODUCTS prod) {
		Integer stat = (Integer) sf.getCurrentSession().save(prod);
		// sf.getCurrentSession().get(prod);
		if (stat > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		PRODUCTS prod = get(id);
		sf.getCurrentSession().delete(prod);
		return true;
	}

	@Override
	public boolean update(PRODUCTS prod) {
		sf.getCurrentSession().update(prod);
		return true;
	}

	@Override
	public PRODUCTS get(String email, String password) {
		return null;
	}
}
