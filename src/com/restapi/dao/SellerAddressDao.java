package com.restapi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.pojo.SELLERSADDRESS;
import com.restapi.pojo.SELLERSADDRESS;

@Repository("SellerAddressDao")
@Transactional
public class SellerAddressDao implements DaoInterface<SELLERSADDRESS> {
	@Autowired
	private SessionFactory sf;

	@Override
	public SELLERSADDRESS get(int id) {

		System.out.println("selraddrdao : get summary " + id);
		return sf.getCurrentSession().createQuery("select a from SELLERSADDRESS a where a.ADDRESSID = :id", SELLERSADDRESS.class)
				.setParameter("id", id).getSingleResult();
	}

	@Override
	public List<SELLERSADDRESS> getall() {
		String query = "select c from SELLERSADDRESS c";
		return sf.getCurrentSession().createQuery(query, SELLERSADDRESS.class).getResultList();
	}

	@Override
	public boolean insert(SELLERSADDRESS selraddr) {
		Integer stat = (Integer) sf.getCurrentSession().save(selraddr);
		// sf.getCurrentSession().get(selraddr);
		if (stat > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		SELLERSADDRESS adm = get(id);
		sf.getCurrentSession().delete(adm);
		return true;
	}

	@Override
	public boolean update(SELLERSADDRESS selraddr) {
		sf.getCurrentSession().update(selraddr);
		return true;
	}

	@Override
	public SELLERSADDRESS get(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
